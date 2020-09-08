package restAssured;

import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pojoClasses.SubjectCategory;
import pojoClasses.Subjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class SubjectCategoryTest {
    private Cookies cookies;

    private String subjectCategoryId;
    SubjectCategory subjectCategory = new SubjectCategory();

    @Test

    public void loginBasqar() {
        Map<String, String> login = new HashMap<>();
        login.put("username", "daulet2030@gmail.com");
        login.put("password", "TechnoStudy123@");

        cookies = given().
                contentType(ContentType.JSON)
                .body(login)
                .log().body()
                .when()
                .post("https://test.basqar.techno.study/auth/login")
                .then()
                .log().body()
                .statusCode(200)
                .extract().response().getDetailedCookies();

    }

    @Test(priority = 0)

    public void createASubjectCategory() {

        subjectCategory.setName("MathSkill");
        subjectCategory.setCode("1234567");
        subjectCategory.setActive(true);

        subjectCategoryId = given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(subjectCategory)
                .when()
                .post("https://test.basqar.techno.study/school-service/api/subject-categories")
                .then()
                .statusCode(201)
                .log().body()
                .extract().path("id");
    }

    @Test(dependsOnMethods = "createASubjectCategory")

    public void CreateASubject() {

        Map<String, String> subjectCategoryList = new HashMap<>();
        subjectCategoryList.put("id", subjectCategoryId);
        subjectCategoryList.put("name", subjectCategory.getName());

        Map<String, String> css = new HashMap<>();
        css.put("foreground", "white");
        css.put("value", "#ff1744");


        Subjects subjects = new Subjects();
        subjects.setCode("456");
        subjects.setName("Calculus");
        subjects.setActive(true);
        subjects.setSubjectCategory(subjectCategoryList);
        subjects.setCss(css);

        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(subjects)
                .when()
                .post("https://test.basqar.techno.study/school-service/api/subjects")
                .then()
                .statusCode(201)
                .log().body()
        ;


    }
}

package restAssured;

import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import org.testng.annotations.Test;
import pojoClasses.Nationality;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class RestAssuredReview {
    /*
    -Correct url
    -Authorization
    -correct request type
    -body var mi yok mu
    -correct response
    / pathparam  "http://zippopotam.us/us/90210"
    /queryparam   //https://gorest.co.in/public-api/users?_format=json&access-token=j6XoJSutZrv-ikB-4X4_Zndi54_iqSZES-Ap



     */

    @Test

    public void BasqarTest() {
        Map<String, String> login = new HashMap<>();
        login.put("username", "daulet2030@gmail.com");
        login.put("password", "TechnoStudy123@");

        Cookies cookies = given().  //pre-condition test oncesi hazirliklar
                contentType(ContentType.JSON)
                .body(login)
                .log().body()
                .when()  // action kismi test kismi
                .post("https://test.basqar.techno.study/auth/login")
                .then()
                .statusCode(200)
//                .log().body()
                .extract().response().getDetailedCookies();
        ;  // sonuc kismi validation-verification

//        System.out.println(cookies);

        // Create a nationality
        Nationality nationality = new Nationality();
        nationality.setName("Polish");

        String nationalityId = given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .when()
                .body(nationality)
                .post("https://test.basqar.techno.study/school-service/api/nationality")
                .then()
                .log().body()
                .statusCode(201)
                .extract().response().jsonPath().getString("id");

        System.out.println(nationalityId);


        // Delete Nationality
        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .when()
                .delete("https://test.basqar.techno.study/school-service/api/nationality/" + nationalityId)
                .then()
                .statusCode(200);

    }

    @Test

    public void toDoTest() {

        List<String> list = given()
                .when()
                .get("https://jsonplaceholder.typicode.com/todos")
                .then()
                .log().body()
                .statusCode(200)
                .body("title", hasItem("ipsam aperiam voluptates qui"))
                .extract().jsonPath().getList("title");
        System.out.println(list);
        // .body("id", hasSize(200));

    }

}

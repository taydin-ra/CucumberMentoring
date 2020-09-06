package restAssured;

import cucumber.api.java.ca.I;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BasqarRestAssured {
            /*
            Checklist

            -correct url
            -authentication
            - correct request (get, put,post,delete)
            -if body is necessary or not
            -correct response

        POJO- Plain Old Java Object
            swagger documentation for api
             */


    @Test
    public void creatingUser() {
        Map<String, String> loginCredentials = new HashMap<>();
        loginCredentials.put("username", "daulet2030@gmail.com");
        loginCredentials.put("password", "TechnoStudy123@");

        Cookies cookies = given()
                .contentType(ContentType.JSON)
                .body(loginCredentials)
                .when()
                .post("https://test.basqar.techno.study/auth/login")
                .then()
                .statusCode(200)
                .extract().response().getDetailedCookies();
        ;
        ItemCategory item = new ItemCategory();
        List<String> roleList = new ArrayList<>();
        roleList.add("5b8bedceb1e0bfc07b008829");

        item.setActive(true);
        item.setName("TechnoIte213");
        item.setSchoolId("5c5aa8551ad17423a4f6ef1d");
        item.setRoles(roleList);

        List<String> itemId = given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(item)
                .when()
                .post("https://test.basqar.techno.study/school-service/api/item-category")
                .then()
                .log().body()
                .statusCode(201)
                .extract().jsonPath().getList("roles",String.class)
                ;

        // search our item

        Map<String, String> searchItem = new HashMap<>();
        searchItem.put("name", item.getName());
        searchItem.put("schoolId", item.getSchoolId());

        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(searchItem)
                .when()
                .post("https://test.basqar.techno.study/school-service/api/item-category/search")
                .then()
                .log().body()
                .statusCode(200);

        // Delete the item

        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .when()
                .delete("https://test.basqar.techno.study/school-service/api/item-category/" + itemId)
                .then()
                .statusCode(204);

    }
}

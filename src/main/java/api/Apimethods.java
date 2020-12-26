package api;
import static io.restassured.RestAssured.*;
public class Apimethods {
    public static void postmethod(String url){
        given().log().all().body("{\n \n first_name:Manasa,last_name:M \n").post(url).then().log().all();
    }
}

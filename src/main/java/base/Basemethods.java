package base;
import static io.restassured.RestAssured.*;


public class Basemethods {

        public static void getmethod(String url){
            given().log().all().get(url).then().log().all();
        }
}

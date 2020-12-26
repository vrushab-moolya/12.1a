package util;
import java.util.concurrent.TimeUnit;
import static io.restassured.RestAssured.*;

public class Utilmethods {
    public static void getresponsetime(String url) {
        System.out.println("The time taken to fetch the response is "+get(url).timeIn(TimeUnit.MILLISECONDS)+"milliseconds");

    }
}

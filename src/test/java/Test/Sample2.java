package Test;

import api.Apimethods;
import base.Basemethods;
import org.junit.Test;
import util.Utilmethods;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.*;

public class Sample2 {
    @Test
    public void testing2(){
        String url="https://www.guru99.com/";
        Basemethods.getmethod(url);
        Apimethods.postmethod(url);
        Utilmethods.getresponsetime(url);
    }

    @Test
    public void apiTest(){
        ExtentHtmlReporter reporter=new ExtentHtmlReporter("./ExtentReports/test4.html");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(reporter);
        ExtentTest logger = extent.createTest("apitest");
        logger.log(Status.INFO,"API CALL");
        logger.log(Status.PASS,"API TEST PASSED");
        extent.flush();

    }


}

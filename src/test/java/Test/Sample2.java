package Test;

import api.Apimethods;
import base.Basemethods;

import util.Utilmethods;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.Test;

public class Sample2 {
    @Test
    public void testing2(){
        //website
        String url="https://www.guru99.com/";

        //extent report
        ExtentHtmlReporter reporter=new ExtentHtmlReporter("./ExtentReports/test4.html");
        ExtentReports extent=new ExtentReports();
        extent.attachReporter(reporter);

        //base package
        ExtentTest logger1 = extent.createTest("base package");
        Basemethods.getmethod(url);
        logger1.log(Status.INFO,"API CALL");
        logger1.log(Status.PASS,"API TEST PASSED");
        extent.flush();

        //api package
        ExtentTest logger2 = extent.createTest("api package");
        Apimethods.postmethod(url);
        logger2.log(Status.INFO,"API CALL");
        logger2.log(Status.PASS,"API TEST PASSED");
        extent.flush();

        //utilpackage
        ExtentTest logger3 = extent.createTest("api package");
        Utilmethods.getresponsetime(url);
        logger3.log(Status.INFO,"API CALL");
        logger3.log(Status.PASS,"API TEST PASSED");
        extent.flush();
    }




}

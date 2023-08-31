package org.test;


import org.example.PageComponents.RoundTrip;
import org.example.PageComponents.MultiTrip;
import org.example.PageObjects.TravelHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.dataload.DataReaderClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DemoTest extends  BaseTest {

    WebDriver driver;
    TravelHomePage thObject;
    @BeforeTest
     public void setUpTest()
    {
        driver=initializeDriver();
        thObject= new TravelHomePage(driver);
    }




    @Test(dataProvider = "travelData")
    public  void flightTest(HashMap<String,String>  orgDestDetails) throws InterruptedException {





        thObject.goTo();
        System.out.println(thObject.getFooterNav().getFlightAttribute());
        System.out.println(thObject.getNavigationBar().getFlightAttribute());
        System.out.println(thObject.getFooterNav().getLinksCount());
        System.out.println(thObject.getNavigationBar().getLinksCount());

        // Strategy design pattern

       // thObject.setBookingStrategy(new MultiTrip());

//        thObject.setBookingStrategy(new RoundTrip(driver,sectionElement));
//
//        thObject.checkAvail("MAA","HYD");


        //thObject.setBookingStrategy(new MultiTrip(driver,sectionElement));

        //thObject.setBookingStrategy("multitrip");



        //thObject.checkAvail("MAA","HYD");
        thObject.setBookingStrategy("roundtrip");
        thObject.checkAvail(orgDestDetails);
    }



    @DataProvider(name = "travelData")
    public Object[][] getTravelData() throws IOException {
//        HashMap<String,String> orgDestDetails = new HashMap<>();
//        orgDestDetails.put("origin","MAA");
//        orgDestDetails.put("destination","HYD");
//        orgDestDetails.put("destination2","BLR");
//
//
//
//        HashMap<String,String> orgDestDetails2 = new HashMap<>();
//        orgDestDetails2.put("origin","HYD");
//        orgDestDetails2.put("destination","BLR");
//        orgDestDetails2.put("destination2","MAA");
        DataReaderClass dataobj = new DataReaderClass();
        List<HashMap<String, String>>  al=dataobj.getJsonData("/Users/shibahar/Desktop/work/AbnamroCucumberProject/DesignPatterns/src/test/java/org/test/dataload/travelDetails.json");
//
//            List<HashMap<String,String>> al = new ArrayList<>();
//            al.add(orgDestDetails);
//        al.add(orgDestDetails2);


        return new Object[][]
                {
                        {al.get(0)}  ,  {al.get(1)}
                };
    }


    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}

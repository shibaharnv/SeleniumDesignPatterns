package org.test;

import org.example.PageObjects.TravelHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

    WebDriver driver;
    @Test
    public  void flightTest()
    {

        WebDriver driver = new ChromeDriver();

        TravelHomePage thObject= new TravelHomePage(driver);

        thObject.goTo();
        thObject.getFooterNav().getFlightAttribute();
        thObject.getNavigationBar().getFlightAttribute();

    }
}

package org.example.PageObjects;

import org.example.AbstractComponents.SearchFlighAvail;
import org.example.AbstractComponents.StrategyFactor;
import org.example.PageComponents.FooterNav;
import org.example.PageComponents.NavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class TravelHomePage {
    WebDriver driver;
    By sectionElement=By.id("traveller-home");
    By headerSectionElement=By.id("buttons");
    SearchFlighAvail searchFlighAvailVariable;
    public TravelHomePage(WebDriver driver) {
        this.driver=driver;
    }

    public  void goTo()
    {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }
    public NavigationBar getNavigationBar()
    {
        return new NavigationBar(driver,headerSectionElement);
    }

    public FooterNav getFooterNav()
    {
        return new FooterNav(driver,sectionElement);
    }





    public void setBookingStrategy(String strategyType)
    {


        StrategyFactor sf= new StrategyFactor(driver);
        searchFlighAvailVariable=sf.createStrategy(strategyType);
        this.searchFlighAvailVariable=searchFlighAvailVariable;

    }

//    public void checkAvail(String origin,String destination) throws InterruptedException {
//        searchFlighAvailVariable.checkAvail(origin,destination);
//    }

    public void checkAvail(HashMap<String, String> orgDestDetails) throws InterruptedException{

        searchFlighAvailVariable.checkAvail(orgDestDetails);
    }
}

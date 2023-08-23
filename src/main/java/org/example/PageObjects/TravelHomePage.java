package org.example.PageObjects;

import org.example.PageComponents.FooterNav;
import org.example.PageComponents.NavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelHomePage {
    WebDriver driver;
    By sectionElement=By.id("traveller-home");
    By headerSectionElement=By.id("buttons");
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
}

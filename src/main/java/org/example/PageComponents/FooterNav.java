package org.example.PageComponents;

import org.example.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterNav extends AbstractComponent {
        WebDriver driver;
  //  By sectionElement=By.id("traveller-home");

    By flights=By.cssSelector("[title='Flights']");

    public FooterNav(WebDriver driver, By sectionElement) {
        super(driver,sectionElement);
    }

    //Methods to handle foot objects

    //When selenium executes any method in this class the scope of the selenium should be in footer only


    public void getFlightAttribute()
    {
        System.out.println(findElement(flights).getAttribute("class"));
    }
}

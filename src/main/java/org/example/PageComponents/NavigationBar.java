package org.example.PageComponents;

import org.example.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar extends AbstractComponent {

    WebDriver driver;
    By flights=By.cssSelector("[title='Flights']");
    public NavigationBar(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
    }

    public void getFlightAttribute()
    {

        System.out.println(findElement(flights).getAttribute("class"));
    }
}

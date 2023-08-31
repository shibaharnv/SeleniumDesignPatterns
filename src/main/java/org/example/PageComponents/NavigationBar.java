package org.example.PageComponents;

import org.example.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar extends AbstractComponent {

    WebDriver driver;
    By flights=By.cssSelector("[title='Flights']");
    By links=By.cssSelector("a");
    public NavigationBar(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
    }

    public String getFlightAttribute()
    {

        return findElement(flights).getAttribute("class");
    }

    public int getLinksCount()
    {

            return findElements(links).size();

    }
}

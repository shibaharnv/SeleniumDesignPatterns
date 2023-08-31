package org.example.AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class AbstractComponent {


    WebElement sectionElement;
    WebDriver driver;
    public AbstractComponent(WebDriver driver, By sectionElement) {
        //this.driver=driver;
        this.sectionElement=  driver.findElement(sectionElement);
        this.driver=driver;
    }

    // Abstract class is a class in java that cannot be instantiated and it serve as a blue print for other classes
    //Can have both abstract (unimplemented methods) and regular methods
    //{Instance Variables: Abstract classes can have instance variables just like regular classes.

    //Constructor: Abstract classes can have constructors. These constructors are typically used to initialize instance variables and perform common setup.

    //Inheritance: Subclasses of an abstract class are required to provide implementations for all the abstract methods inherited from the abstract class. Failure to do so will result in a compilation error.}

    public WebElement  findElement(By findElementBy)
    {
        return  sectionElement.findElement(findElementBy);
    }

    public List<WebElement> findElements(By findElementsBy)
    {
        return  sectionElement.findElements(findElementsBy);
    }

    public void waitForElementToDisappear(WebElement findBy)
    {
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(findBy));
    }
}

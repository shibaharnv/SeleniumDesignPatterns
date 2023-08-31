package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;
    public WebDriver initializeDriver()
    {
         driver = new ChromeDriver();
        return driver;
    }
}

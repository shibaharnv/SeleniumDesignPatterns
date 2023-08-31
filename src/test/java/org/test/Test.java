package org.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Test {

//    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        // Create a new instance of ChromeDriver
//        WebDriver driver = new ChromeDriver();
//
//       // WebDriver driver = new ChromeDriver();
//        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//    }

    @org.testng.annotations.Test(dataProvider = "giveData")
    public void testMethod(String userName,String Password)
    {
//        WebDriverManager.chromedriver().setup();
//        // Create a new instance of ChromeDriver
//        WebDriver driver = new ChromeDriver();
//
//        // WebDriver driver = new ChromeDriver();
//        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//
        System.out.println(userName);
        System.out.println(Password);


    }

    @DataProvider(name="giveData")
    public Object[][] dataProviderMethod()
    {


        Object[][] data={{"shibahar","password"},{"mano","pass"}};

        return data;
    }
}

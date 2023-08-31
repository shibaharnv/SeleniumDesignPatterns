package org.example.PageComponents;


import org.example.AbstractComponents.AbstractComponent;
import org.example.AbstractComponents.SearchFlighAvail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.function.Consumer;

public class MultiTrip extends AbstractComponent implements SearchFlighAvail {


    private By modelPopup=By.id("MultiCityModelAlert");


    private By rdo= By.id("ctl00_mainContent_rbtnl_Trip_2");

    private By from=By.id("ctl00_mainContent_ddl_originStation1_CTXT");

    private By to= By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");

    private By check_box=By.id("ctl00_mainContent_chk_IndArm");

    private  By searchButton=By.id("ctl00_mainContent_btn_FindFlights");

    private  By destination2=By.id("ctl00_mainContent_ddl_originStation2_CTXT");

    public MultiTrip(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
    }

    @Override
    public void checkAvail(HashMap<String, String> orgDestDetails)  throws InterruptedException {
//
//        System.out.println("This is from multi trip");
//        findElement(rdo).click();
//        findElement(modelPopup).click();
        makeStateReady(s-> selectOriginCity(orgDestDetails.get("origin")));
       // selectOriginCity(origin);
        selectDestinationCity(orgDestDetails.get("destination"));
        selectDestinationCity2(orgDestDetails.get("destination2"));
    }


    public void selectOriginCity(String origin)
    {
        findElement(from).click();
        findElement(By.xpath("//a[@value='"+origin+"']")).click();

    }


    public void selectDestinationCity(String destination) throws InterruptedException {
        //findElement(By.xpath("//a[@value='"+destination+"']")).click();
        Thread.sleep(2000);
        findElement(By.xpath("(//a[@value='"+destination+"'])[2]")).click();

    }


    public void selectDestinationCity2(String destination) throws InterruptedException {
        //findElement(By.xpath("//a[@value='"+destination+"']")).click();
        Thread.sleep(2000);
        findElement(By.xpath("(//a[@value='"+destination+"'])[3]")).click();

    }


    public void clickSearchButton()
    {
        findElement(searchButton).click();
    }


    public void makeStateReady(Consumer<MultiTrip>  consumer)
    {
        findElement(rdo).click();
        findElement(modelPopup).click();
        waitForElementToDisappear((WebElement) modelPopup);
        consumer.accept(this);

    }
}

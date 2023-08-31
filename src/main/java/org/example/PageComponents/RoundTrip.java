package org.example.PageComponents;


import org.example.AbstractComponents.AbstractComponent;
import org.example.AbstractComponents.SearchFlighAvail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.function.Consumer;

public class RoundTrip extends AbstractComponent implements SearchFlighAvail {

    private By rdo= By.id("ctl00_mainContent_rbtnl_Trip_1");

    private By from=By.id("ctl00_mainContent_ddl_originStation1_CTXT");
    private By to= By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");

    private By check_box=By.id("ctl00_mainContent_chk_IndArm");

    private  By searchButton=By.id("ctl00_mainContent_btn_FindFlights");

    public RoundTrip(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
    }


    @Override
    public void checkAvail(HashMap<String, String> orgDestDetails) throws InterruptedException {

//        System.out.println("I am inside Round trip");
//        findElement(rdo).click();
//        findElement(from).click();
        makeStateReady(s->selectOriginCity(orgDestDetails.get("origin")));
        //selectOriginCity(origin);
        findElement(to).click();
        selectDestinationCity(orgDestDetails.get("destination"));
        selectCheckBox();
        clickSearchButton();

    }


    public void selectOriginCity(String origin)
    {
        findElement(from).click();
        findElement(By.xpath("//a[@value='"+origin+"']")).click();

    }

    public  void  selectCheckBox()

    {
        findElement(check_box).click();

    }
    public void selectDestinationCity(String destination) throws InterruptedException {
        //findElement(By.xpath("//a[@value='"+destination+"']")).click();
        Thread.sleep(2000);
        findElement(By.xpath("(//a[@value='"+destination+"'])[2]")).click();

    }

    public void clickSearchButton()
    {
        findElement(searchButton).click();
    }


    public void makeStateReady(Consumer<RoundTrip>  consumer)
    {
        System.out.println("I am inside Round trip");
        findElement(rdo).click();
        findElement(from).click();

        consumer.accept(this);


    }


}

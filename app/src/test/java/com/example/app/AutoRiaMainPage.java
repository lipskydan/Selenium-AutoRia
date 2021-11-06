package com.example.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AutoRiaMainPage {
    public WebDriver driver;
    String baseUrl;

    public AutoRiaMainPage(){
        driver = new ChromeDriver();
        baseUrl = "https://auto.ria.com/uk/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(baseUrl);
    }

    public void openListOfRegionForAllOrBuOrOrder(){
        WebElement element = driver.findElement(By.id("brandTooltipBrandAutocomplete-region"));
        element.click();
    }

    public void selectOfRegionForNew(String regionName){
        WebElement element = driver.findElement(By.id("regionCenters"));
        Select sel = new Select(element);
        sel.selectByVisibleText(regionName);
    }

    public void chooseRegionByName(String regionName){
        WebElement element = driver.findElement(By.xpath("//ul[@class=\"unstyle scrollbar autocomplete-select\"]//li//a[contains(text(),'" + regionName + "')]"));
        element.click();
    }

    public WebElement getSearchButton(){
        return driver.findElement(By.className("button"));
    }

    public void setNewCars(){
        WebElement element = driver.findElement(By.xpath("//label[@for='naRadioType']"));
        element.click();
    }

    public void setOrderCars(){
        WebElement element = driver.findElement(By.xpath("//label[@for='orderRadioType']"));
        element.click();
    }

    public void setBuCars(){
        WebElement element = driver.findElement(By.xpath("//label[@for='buRadioType']"));
        element.click();
    }

    public void setAllCars(){
        WebElement element = driver.findElement(By.xpath("//label[@for='allRadioType']"));
        element.click();
    }

    public void selectYearFrom(String year){
        WebElement element = driver.findElement(By.id("yearFrom"));
        Select sel = new Select(element);
        sel.selectByValue(year);
    }

    public void selectYearTo(String year){
        WebElement element = driver.findElement(By.id("yearTo"));
        Select sel = new Select(element);
        sel.selectByValue(year);
    }


}

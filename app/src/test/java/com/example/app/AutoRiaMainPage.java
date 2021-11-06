package com.example.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoRiaMainPage {
    WebDriver driver;
    String baseUrl;

    public AutoRiaMainPage(){
        driver = new ChromeDriver();
        baseUrl = "https://auto.ria.com/uk/";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(baseUrl);
    }

    public void openListOfRegion(){
        WebElement element = driver.findElement(By.xpath("//label[@for='brandTooltipBrandAutocompleteInput-region' and  @class='m-label']"));
        element.click();
    }

    public void chooseRegionByName(String regionName){
        WebElement element = driver.findElement(By.linkText(regionName));
        element.click();
    }

    public WebElement getSearchButton(){
        return driver.findElement(By.className("button"));
    }

}

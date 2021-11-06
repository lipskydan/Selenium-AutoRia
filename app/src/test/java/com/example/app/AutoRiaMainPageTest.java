package com.example.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;


public class AutoRiaMainPageTest {
    AutoRiaMainPage mainPage;

    @Before
    public void setUp(){
       mainPage = new AutoRiaMainPage();
    }


    @Test
    public void testFindAnyCarFromZhytomyr() throws InterruptedException {
        mainPage.setAllCars();
        Thread.sleep(2000);
        mainPage.openListOfRegionForAllOrBuOrOrder();
        mainPage.chooseRegionByName("Житомир");
        Thread.sleep(2000);
        WebElement searchButton = mainPage.getSearchButton();
        searchButton.click();
        Thread.sleep(2000);
    }

    @Test
    public void testFindUsedCarFromKiev() throws InterruptedException {
        mainPage.setBuCars();
        Thread.sleep(2000);
        mainPage.openListOfRegionForAllOrBuOrOrder();
        mainPage.chooseRegionByName("Київ");
        Thread.sleep(2000);
        WebElement searchButton = mainPage.getSearchButton();
        searchButton.click();
        Thread.sleep(5000);
    }

    @Test
    public void testFindNewCarFromDonetskRegion() throws InterruptedException {
        mainPage.setNewCars();
        Thread.sleep(2000);
        mainPage.selectOfRegionForNew("Донецька обл.");
        Thread.sleep(2000);
        WebElement searchButton = mainPage.getSearchButton();
        searchButton.click();
        Thread.sleep(2000);
    }

    @Test
    public void testFindOrderCarFromTernopil() throws InterruptedException {
        mainPage.setOrderCars();
        Thread.sleep(2000);
        mainPage.openListOfRegionForAllOrBuOrOrder();
        mainPage.chooseRegionByName("Тернопіль");
        Thread.sleep(2000);
        WebElement searchButton = mainPage.getSearchButton();
        searchButton.click();
        Thread.sleep(5000);
    }


    @Test
    public void testFindAnyCarFrom2010Year() throws InterruptedException {
        mainPage.setAllCars();
        Thread.sleep(2000);
        mainPage.selectYearFrom("2010");
        Thread.sleep(2000);
        WebElement searchButton = mainPage.getSearchButton();
        searchButton.click();
        Thread.sleep(2000);
    }

    @Test
    public void testFindAnyCarTo2018Year() throws InterruptedException {
        mainPage.setAllCars();
        Thread.sleep(2000);
        mainPage.selectYearTo("2018");
        Thread.sleep(2000);
        WebElement searchButton = mainPage.getSearchButton();
        searchButton.click();
        Thread.sleep(2000);
    }

    @Test
    public void testFindAnyCarFrom2008YearTo2013Year() throws InterruptedException {
        mainPage.setAllCars();
        Thread.sleep(2000);
        mainPage.selectYearFrom("2008");
        Thread.sleep(2000);
        mainPage.selectYearTo("2013");
        WebElement searchButton = mainPage.getSearchButton();
        searchButton.click();
        Thread.sleep(2000);
    }

    @After
    public void tearDown(){
        mainPage.driver.quit();
    }
}

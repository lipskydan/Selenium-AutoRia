package com.example.app;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class AutoRiaMainPageTest {
    AutoRiaMainPage mainPage = new AutoRiaMainPage();

    @Test
    public void testFindAnyCarFromKiev() {
       mainPage.openListOfRegion();
       mainPage.chooseRegionByName("Київ");
       WebElement searchButton = mainPage.getSearchButton();
       searchButton.click();
    }

}

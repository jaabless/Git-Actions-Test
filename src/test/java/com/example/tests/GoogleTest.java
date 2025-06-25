package com.example.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.testng.Assert.*;

import java.net.URL;



public class GoogleTest {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
//        ChromeOptions options = new ChromeOptions();
//        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://the-internet.herokuapp.com/");
        assertTrue(driver.getTitle().contains("Internet"));
//        driver.findElement(By.name("q")).sendKeys("GitHub Actions\n");
//        assertTrue(driver.getPageSource().contains("GitHub"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

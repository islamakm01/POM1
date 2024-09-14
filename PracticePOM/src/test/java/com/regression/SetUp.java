package com.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SetUp {
    WebDriver driver;
    Properties prop;

    @BeforeClass
    public void Initialization() throws InterruptedException, IOException {
        driver = new ChromeDriver();

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Properties\\Config.properties");

        prop = new Properties();
        prop.load(fis);

        driver.get(prop.getProperty("QA_Url"));

        driver.manage().window().maximize(); // nested concept
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
    }

@AfterClass
    public void cleanUp() {
        driver.quit();
    }

}

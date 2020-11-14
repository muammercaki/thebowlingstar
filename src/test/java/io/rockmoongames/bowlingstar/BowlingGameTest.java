package io.rockmoongames.bowlingstar;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BowlingGameTest {
    private static WebDriver driver;
    private static String baseUrl="https://testautomationu.applitools.com/git-tutorial/chapter3.2.html";
    @Test
    public void jessicaTestOne() {
        driver=new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void tearDown(){
        driver.quit();
    }
}

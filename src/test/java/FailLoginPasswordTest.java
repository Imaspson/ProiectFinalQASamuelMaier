import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;

public class FailLoginPasswordTest {

    String url = "https://ultimateqa.com/automation";
    WebDriver driver;

    @BeforeTest
    public void openPage(){
        driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void incorrectEmailAttempt() throws InterruptedException{

        String email = "samimaier99@gmail.com";
        String password = "!Albina";

        WebElement loginAutomationLink = driver.findElement(By.cssSelector("#post-507 > div > div > div > div.et_pb_section.et_pb_section_1.et_pb_with_background.et_section_specialty > div > div.et_pb_column.et_pb_column_3_4.et_pb_column_1.et_pb_specialty_column.et_pb_css_mix_blend_mode_passthrough > div > div > div > div > ul > li:nth-child(6) > a"));
        loginAutomationLink.click();

        Sleep(500);

        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys(password);

        WebElement signInButton = driver.findElement(By.cssSelector(".button-primary"));
        signInButton.click();

        Sleep(1000);

        String expected = "https://courses.ultimateqa.com/collections";
        String actual = driver.getCurrentUrl();

        assertFalse(expected.contains(actual));
    }

    public void Sleep(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }

    @AfterTest
    public void closePage(){
        if (driver != null){
            driver.close();
        }
    }


}

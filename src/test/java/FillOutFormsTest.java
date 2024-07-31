import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FillOutFormsTest {

    String url = "https://ultimateqa.com/automation";
    WebDriver driver;

    @BeforeTest
    public void openPage(){
        driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void accesFillOutFirstFormPage() throws InterruptedException {

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String name = "John";
        String message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do";

        WebElement fillOutFormsLink = driver.findElement(By.cssSelector("#post-507 > div > div > div > div.et_pb_section.et_pb_section_1.et_pb_with_background.et_section_specialty > div > div.et_pb_column.et_pb_column_3_4.et_pb_column_1.et_pb_specialty_column.et_pb_css_mix_blend_mode_passthrough > div > div > div > div > ul > li:nth-child(4) > a"));
        fillOutFormsLink.click();

        Sleep(500);

        WebElement nameField1 = driver.findElement(By.cssSelector("#et_pb_contact_name_0"));
        nameField1.sendKeys(name);

        WebElement messageField1 = driver.findElement(By.cssSelector("#et_pb_contact_message_0"));
        messageField1.sendKeys(message);

        WebElement submitButton1 = driver.findElement(By.cssSelector("#et_pb_contact_form_0 > div.et_pb_contact > form > div > button"));
        submitButton1.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#et_pb_contact_form_0 > div > p")));

        WebElement nameField2 = driver.findElement(By.cssSelector("#et_pb_contact_name_1"));
        nameField2.sendKeys(name);

        WebElement messageField2= driver.findElement(By.cssSelector("#et_pb_contact_message_1"));
        messageField2.sendKeys(message);

        String result = "15";

        WebElement resultField = driver.findElement(By.cssSelector("#et_pb_contact_form_1 > div.et_pb_contact > form > div > div > p > input"));
        resultField.sendKeys(result);

        WebElement submitButton2 = driver.findElement(By.cssSelector("#et_pb_contact_form_1 > div.et_pb_contact > form > div > button"));
        submitButton2.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#et_pb_contact_form_1 > div > p")));
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

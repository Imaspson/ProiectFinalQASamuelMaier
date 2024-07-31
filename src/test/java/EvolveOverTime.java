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

public class EvolveOverTime {

    String url = "https://ultimateqa.com/automation";
    WebDriver driver;

    @BeforeTest
    public void openPage(){
        driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void accesEvolvingPage(){

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement evolvingPageLink = driver.findElement(By.cssSelector("#post-507 > div > div > div > div.et_pb_section.et_pb_section_1.et_pb_with_background.et_section_specialty > div > div.et_pb_column.et_pb_column_3_4.et_pb_column_1.et_pb_specialty_column.et_pb_css_mix_blend_mode_passthrough > div > div > div > div > ul > li:nth-child(5) > a"));
        evolvingPageLink.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#post-927 > div > h2:nth-child(1)")));

        String firstName = "John";
        WebElement firstNameField = driver.findElement(By.cssSelector("#post-927 > div > form > input[type=text]:nth-child(2)"));
        firstNameField.sendKeys(firstName);
        WebElement nextSprintLink = driver.findElement(By.cssSelector("#post-927 > div > form > a"));
        nextSprintLink.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#post-932 > div > h2")));

        firstNameField = driver.findElement(By.cssSelector("#post-932 > div > form > input[type=text]:nth-child(2)"));
        firstNameField.sendKeys(firstName);
        String lastName = "Doe";
        WebElement lastNameField = driver.findElement(By.cssSelector("#post-932 > div > form > input[type=text]:nth-child(5)"));
        lastNameField.sendKeys(lastName);
        nextSprintLink = driver.findElement(By.cssSelector("#post-932 > div > form > p:nth-child(9) > a"));
        nextSprintLink.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#post-934 > div > h2")));

        WebElement otherCheck = driver.findElement(By.cssSelector("#post-934 > div > form > input[type=radio]:nth-child(5)"));
        otherCheck.click();
        firstNameField = driver.findElement(By.cssSelector("#post-934 > div > form > input[type=text]:nth-child(8)"));
        firstNameField.sendKeys(firstName);
        lastNameField = driver.findElement(By.cssSelector("#post-934 > div > form > input[type=text]:nth-child(11)"));
        lastNameField.sendKeys(lastName);
        nextSprintLink = driver.findElement(By.cssSelector("#post-934 > div > form > p:nth-child(16) > a"));
        nextSprintLink.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#post-936 > div > h2")));

        otherCheck = driver.findElement(By.cssSelector("#radio1-0"));
        otherCheck.click();
        firstNameField = driver.findElement(By.cssSelector("#f1"));
        firstNameField.sendKeys(firstName);
        lastNameField = driver.findElement(By.cssSelector("#l1"));
        lastNameField.sendKeys(lastName);

        String firstName1 = "Jane";
        String lastName1 = "Doe";

        WebElement otherCheck1 = driver.findElement(By.cssSelector("#radio2-0"));
        otherCheck1.click();
        WebElement firstNameField1 = driver.findElement(By.cssSelector("#f2"));
        firstNameField1.sendKeys(firstName1);
        WebElement lastNameField1 = driver.findElement(By.cssSelector("#l2"));
        lastNameField1.sendKeys(lastName1);
        nextSprintLink = driver.findElement(By.cssSelector("#post-936 > div > form > p:nth-child(18) > a"));
        nextSprintLink.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#post-945 > div > h2")));

        otherCheck = driver.findElement(By.cssSelector("#radio1-m"));
        otherCheck.click();
        firstNameField = driver.findElement(By.cssSelector("#f1"));
        firstNameField.sendKeys(firstName);
        lastNameField = driver.findElement(By.cssSelector("#l1"));
        lastNameField.sendKeys(lastName);

        otherCheck1 = driver.findElement(By.cssSelector("#radio2-f"));
        otherCheck1.click();
        firstNameField1 = driver.findElement(By.cssSelector("#f2"));
        firstNameField1.sendKeys(firstName1);
        lastNameField1 = driver.findElement(By.cssSelector("#l2"));
        lastNameField1.sendKeys(lastName1);
        WebElement submitButton = driver.findElement(By.cssSelector("#submit2"));
        submitButton.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#post-948 > div > h2")));

        otherCheck = driver.findElement(By.cssSelector("#post-948 > div > form > input[type=radio]:nth-child(3)"));
        otherCheck.click();
        submitButton = driver.findElement(By.cssSelector("#post-948 > div > form > input[type=submit]:nth-child(7)"));
        submitButton.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#post-217913 > div > div > div > div.et_pb_section.et_pb_section_0.et_pb_with_background.et_section_regular > div.et_pb_row.et_pb_row_0.et_pb_gutters1 > div.et_pb_column.et_pb_column_1_2.et_pb_column_0.et_pb_css_mix_blend_mode_passthrough > div.et_pb_module.et_pb_heading.et_pb_heading_0.et_pb_bg_layout_ > div > h1")));

    }

    @AfterTest
    public void closePage(){
        if (driver != null){
            driver.close();
        }
    }
}

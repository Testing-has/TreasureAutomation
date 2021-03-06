package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;


public class LoginLogoutStepdefinition extends BaseStep {


    @Given("^the user is on Treasure landing page$")
    public void the_user_is_on_landing_page() {

        System.setProperty("webdriver.chrome.driver", "D:\\Project\\TreasureAutomation\\resources\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("disable-infobars");
//        options.addArguments("--disable-web-security");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);

        driver.get("https://tcloud.dev.anqlave.io/auth/signin");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @When("^the user logs into application using username and password$")
    public void the_user_logs_into_application_using_username_and_password() {

        driver.findElement(xpath("//input[@id='mat-input-0']")).sendKeys("abc@def.com");
        driver.findElement(xpath("//input[@id='mat-input-1']")).sendKeys("P@ssw0rd");

    }

    @And("^user clicks on Sign in button$")
    public void user_clicks_login() {

        driver.findElement(xpath("//button[@id='signin-button']")).click();

        setTimeout(2);
    }

    @Then("^treasure homepage is displayed and user clicks on logout button$")
    public void user_is_on_homepage() {

        String title = driver.getTitle();
        System.out.println("Home Page title ::" + title);

        setTimeout(2);

        driver.findElement(By.cssSelector("div[class='ng-star-inserted']")).click();
        setTimeout(2);
        driver.findElement(By.xpath("//span[normalize-space()='Logout']")).click();
        setTimeout(2);
    }
}

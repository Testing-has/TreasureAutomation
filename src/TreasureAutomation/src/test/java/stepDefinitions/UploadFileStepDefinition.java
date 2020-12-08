package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UploadFileStepDefinition extends BaseStep {

    LoginLogoutStepdefinition loginLogoutStepdefinition = new LoginLogoutStepdefinition();

    @Given("^the user is on Treasure Homepage$")
    public void the_user_is_on_treasure_homepage() {

        loginLogoutStepdefinition.the_user_is_on_landing_page();
        loginLogoutStepdefinition.the_user_logs_into_application_using_username_and_password();
        loginLogoutStepdefinition.user_clicks_login();
    }

    @When("^The user clicks on plus sign on top right corner and select upload files option$")
    public void the_user_clicks_on_sign_on_top_right_corner_and_select_upload_files_option() {

        driver.findElement(By.xpath("//button[@aria-label='Add files or folders']")).click();
        setTimeout(2);

       new Actions(driver)
               .moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Upload files')]")))
               .pause(Duration.ofSeconds(2))
               .sendKeys("D:\\Project\\TreasureAutomation\\Upload\\0.pdf").build().perform();
    }

    @Then("^the file gets uploaded$")
    public void windows_dialogue_box_with_files_gets_open_select_the_file_to_upload() {

        Assert.assertTrue("File not found", driver.findElements(By.xpath("//a[contains(@class,'file-name')]")).size()>0);
        System.out.println("File uploaded successfully");
    }
}


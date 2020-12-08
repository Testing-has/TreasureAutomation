package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class DownloadFileStepDefinition extends  BaseStep {

    LoginLogoutStepdefinition loginLogoutStepdefinition = new LoginLogoutStepdefinition();

    @Given("^the user is on Treasure Homepage$")
    public void the_user_is_on_treasure_homepage() {

        loginLogoutStepdefinition.the_user_is_on_landing_page();
        loginLogoutStepdefinition.the_user_logs_into_application_using_username_and_password();
        loginLogoutStepdefinition.user_clicks_login();
    }

    @When("^the user selects the already uploaded file and Click on download link$")

    public void user_selects_file(){
        driver.findElement(By.xpath("//label[@for='mat-checkbox-2-input']//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();
        setTimeout(2);
        driver.findElement(By.xpath("//span[contains(text(),'Download')]")).click();
        setTimeout(2);
    }
    @Then("^the file gets downloaded$")
    public void file_gets_downloaded(){

        assert driver.findElement(By.xpath("//div[@class='main']")).isDisplayed();
    }

}

package stepDefinitions;

import org.openqa.selenium.WebDriver;

public class BaseStep {

    public static WebDriver driver;


    public void setTimeout(int i) {


        try {
            Thread.sleep(i * 1000);
        } catch (Exception e) {

        }

    }

}

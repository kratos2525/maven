package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LogoutSteps {
    WebDriver driver;

    @Given("the user is logged in to Orange HRM")
    public void the_user_is_logged_in_to_Orange_HRM() throws InterruptedException {
        driver = new EdgeDriver();
        Thread.sleep(2000);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // Code to login
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        Thread.sleep(2000);
        System.out.println("User logs in successfully.");
    }

    @When("he clicks on the logout button")
    public void he_clicks_on_the_logout_button() throws InterruptedException {
    	Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
        Thread.sleep(2000);
        System.out.println("User clicks on logout button.");
        Thread.sleep(2000);
    }

    @Then("the user is redirected to the login page")
    public void the_user_is_redirected_to_the_login_page() {
        // Check that we are back on login page
        System.out.println("User is redirected to login page.");
        driver.quit();
    }
}

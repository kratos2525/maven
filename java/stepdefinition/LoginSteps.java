package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginSteps {
    WebDriver driver;

    @Given("the user is on the Orange HRM login page")
    public void the_user_is_on_the_Orange_HRM_login_page() {
        driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("Navigated to Orange HRM login page.");
    }

    @When("he enters valid credentials")
    public void he_enters_valid_credentials() throws InterruptedException {
        // Example locators for the new OrangeHRM UI:
        // If placeholders differ, adjust accordingly
    	Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        System.out.println("User enters valid credentials and logs in.");
        Thread.sleep(2000);
    }

    @Then("he should see the dashboard")
    public void he_should_see_the_dashboard() {
        // Verify some element on the dashboard
        // e.g., boolean isDashboard = driver.getPageSource().contains("PIM");
        // Assert.assertTrue(isDashboard, "Dashboard not found, login may have failed");
        System.out.println("User sees the dashboard.");
        driver.quit();
    }
}

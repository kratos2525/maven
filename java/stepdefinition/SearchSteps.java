package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SearchSteps {
    WebDriver driver;

    @Given("the user is on the Admin page")
    public void the_user_is_on_the_Admin_page() throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        
        System.out.println("User logs in and navigates to Admin page.");
    }

    @When("he enters {string} in the search field")
    public void he_enters_in_the_search_field(String text) throws InterruptedException {
    	Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input")).sendKeys(text);
        Thread.sleep(2000);
        System.out.println("User enters " + text + " in the search field.");
        Thread.sleep(2000);
    }

    @When("clicks search")
    public void clicks_search() throws InterruptedException {
    	Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span")).click();
        Thread.sleep(2000);
        System.out.println("User clicks search.");
        Thread.sleep(2000);
    }

    @Then("the system displays admin users")
    public void the_system_displays_admin_users() {
        
        System.out.println("System displays admin users in the table.");
        driver.quit();
    }
}

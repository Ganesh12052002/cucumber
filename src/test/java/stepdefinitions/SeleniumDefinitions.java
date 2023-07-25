package stepdefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumDefinitions {
	WebDriver driver;
	@Given("user is on the home page")
	public void user_is_on_the_home_page() throws InterruptedException {
	// Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\day 1\\chromedriver.exe");
	driver=new ChromeDriver();
	Thread.sleep(3000);
	driver.navigate().to("https://www.makemytrip.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
	@When("user enters mobile number {string}")
	public void user_enters_mobile_number(String string) throws InterruptedException {
	// Write code here that turns the phrase above into concrete actions
		WebElement name=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		name.sendKeys(string);
	Thread.sleep(3000);
	}
	@When("user clicks on continue")
	public void user_clicks_on_continue() throws InterruptedException {
	// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button")).click();
	Thread.sleep(3000);
	}
	@Then("otp is sent {string}")
	public void otp_is_sent(String string) throws InterruptedException {
	// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[1]/div/input")).sendKeys(string);
		 Thread.sleep(3000);
	Thread.sleep(3000);
	}
	@Then("user is able to login")
	public void user_is_able_to_login() throws InterruptedException {
	// Write code here that turns the phrase above into concrete actions
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[2]/button")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.elementFromPoint(0,0).click()");
	}
}

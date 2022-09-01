package stepDefinitions;

import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class stepDefinition extends HomePage{
	Long test1 = 300l;
	HomePage onHomePage = new HomePage();

	@Before
	public void setUp() {
		init();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

	
	@Given("I am on the w3 school home page")
	public void i_am_on_the_w3_school_home_page() {
		navigateToHomePage();
	}
	
	@And("I accept the privacy policy")
	public void i_accept_the_privacy_policy() {
		onHomePage.verifyPrivacyModalDisplayed();
		onHomePage.acceptPrivacyPolicy();
	}

	@And("I set input to {string}")
	public void i_set_input_to(String string) {
		onHomePage.setSearchinput(string);
	}

	@When("I select the first option")
	public void i_select_the_first_option() {
		onHomePage.selectFirstOption();
	}

	@Then("I am navigated to JavaScript tutorial")
	public void i_am_navigated_to_java_script_tutorial() {
		onHomePage.verifyLeftMenuLoaded();
	}
	
	@And("I assert that header is set to {string}")
	public void i_assert_that_header_is_set_to(String value) {
		onHomePage.verifyTutorialPageLoaded(value);
	}
	
}

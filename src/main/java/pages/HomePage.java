package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends Base{
	
	public By privacy_modal = By.cssSelector(".sn-inner");
	public By privacy_accept_button = By.cssSelector("#accept-choices");
	public By homePageLogo = By.cssSelector(".fa-logo");
	public By search_input = By.cssSelector("#search2");
	public By search_result_option_list = By.cssSelector("#listofsearchresults a");
	public By tutorial_header = By.cssSelector("h1");
	public By left_menu = By.cssSelector("#leftmenuinnerinner");
	
	
	

	public void verifyHomePageLoaded() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(homePageLogo));
	}
	
	public void setSearchinput(String value) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(search_input)).sendKeys(value);
	}

	public void verifyPrivacyModalDisplayed() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(privacy_modal));
	}
	
	public void acceptPrivacyPolicy() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(privacy_accept_button)).click();
	}
	
	public List<WebElement> getSearchResultList() {
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(search_result_option_list));
	}
	
	public void selectFirstOption() {
		List<WebElement> optionList = getSearchResultList();
		optionList.get(0).click();
	}
	public void selectOptionByID(int ID) {
		List<WebElement> optionList = getSearchResultList();
		optionList.get(ID).click();
	}
	public void verifyLeftMenuLoaded() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(left_menu));
	}
	
	public void verifyTutorialPageLoaded(String expected_subject) {
		WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(tutorial_header));
		String actual_subject = header.getAttribute("innerText");
		//Assert.assertEquals(actual_subject, expected_subject);
		
	}
}

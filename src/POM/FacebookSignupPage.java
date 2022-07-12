package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupPage {
	@FindBy (xpath = "//a[@data-testid='open-registration-form-button']") private WebElement createAccount;
	@FindBy (xpath = "//input[@name='firstname']") private WebElement firstName;
	@FindBy (xpath = "//input[@name='lastname']") private WebElement lastName;
	@FindBy (xpath = "//input[@name='reg_email__']") private WebElement emailID;
	@FindBy (xpath = "//input[@name='reg_email_confirmation__']") private WebElement reEmailID;
	@FindBy (xpath = "//input[@name='reg_passwd__']") private WebElement password;
	@FindBy (xpath = "//select[@id='day']") private WebElement birthDay;
	@FindBy (xpath = "//select[@id='month']") private WebElement birthMonth;
	@FindBy (xpath = "//select[@id='year']") private WebElement birthYear;
	@FindBy (xpath = "//label[text()='Female']") private WebElement genderFemale;
	@FindBy (xpath = "//label[text()='Male']") private WebElement genderMale;
	@FindBy (xpath = "//label[text()='Custom']") private WebElement genderCustom;
	@FindBy (xpath = "//button[@name='websubmit']") private WebElement submit;
	
	public FacebookSignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCreateAccount() {
		createAccount.click();
	}
	public void enterFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	public void enterLastName(String lName) {
		lastName.sendKeys(lName);
	}
	public void enterEmailID(String email) {
		emailID.sendKeys(email);
	}
	public void reEnterEmailID(String reEmail) {
		reEmailID.sendKeys(reEmail);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void enterBirthDate(String date) {
		Select birthDate =new Select(birthDay);
		birthDate.selectByVisibleText(date);
	}
	public void enterBirthMonth(String month) {
		Select birthMon =new Select(birthMonth);
		birthMon.selectByValue(month);
	}
	public void enterBirthYear(String year) {
		Select birthYr =new Select(birthYear);
		birthYr.selectByValue(year);
	}
	public void clickOnFemaleGender() {
		genderFemale.click();
	}
	public void clickOnMaleGender() {
		genderMale.click();
	}
	public void clickOnCustomGender() {
		genderCustom.click();
	}
	public void clickOnSubmit() {
		submit.click();
	}

}


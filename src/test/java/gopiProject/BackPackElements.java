package gopiProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackPackElements {
	@FindBy(className  = "form-control")
	private WebElement userNameEdt;
	
	@FindBy(id = "Password")
	private WebElement passwordEdt;
	
	@FindBy(name = "button")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//span[text()='logout']")
	private WebElement logOutLnk;
	
	@FindBy(xpath = "//a[text()='Designer']")
	private WebElement designerLnk;
	
	
	
	public BackPackElements(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	//Business Library
	/**
	 * this method will helps to login the application
	 * @param userName
	 * @param password
	 */
	public void login(String userName,String password)
	{
		userNameEdt.sendKeys(userName);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}
	/**
	 * this will click on designer link
	 */
	public void designerClick()
	{
		designerLnk.click();
	}
	
	public void addStudents()
	{
		
	}
	/**
	 * this method will helps to LogOut the App
	 */
	public void logOut()
	{
		logOutLnk.click();
	}
}

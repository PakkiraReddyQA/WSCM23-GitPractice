package objectRepo;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeElements {
//	Intialization
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameEdt;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordEdt;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement logginBtn;
	
	@FindBy(xpath = "//div[@id='container_tasks']")
	private WebElement taskLnk;
	
	@FindBy(xpath = "//div[@class='addNewButton']/div[3]")
	private WebElement addNewBtn;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement createNewCustomerLnk;
	
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement customerNameEdt;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement descrptionEdt;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(id="logoutLink")
	private WebElement logOutLnk;
	
	
	//Declaration
	public ActitimeElements(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLogginBtn() {
		return logginBtn;
	}

	public WebElement getTaskLnk() {
		return taskLnk;
	}

	public WebElement getLogOutLnk() {
		return logOutLnk;
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getCreateNewCustomerLnk() {
		return createNewCustomerLnk;
	}

	public WebElement getCustomerNameEdt() {
		return customerNameEdt;
	}

	public WebElement getDescrptionEdt() {
		return descrptionEdt;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	//Business Library
	/**
	 * With help of this method we can login to Acttime Application
	 * @param userName
	 * @param password
	 */
	public void lgoinActiTime(String userName,String password)
	{
		usernameEdt.sendKeys(userName);
		passwordEdt.sendKeys(password);
		logginBtn.click();
	}
	
	/**
	 * this method helps to create New customer
	 * @param customerName
	 * @param description
	 */
	public void createCustomer(String customerName,String description)
	{
		Random r=new Random();
		int random = r.nextInt();
		String customer = customerName+random;
		taskLnk.click();
		addNewBtn.click();
		createNewCustomerLnk.click();
		customerNameEdt.sendKeys(customer);
		descrptionEdt.sendKeys(description);
		createCustomerBtn.click();
		
	}
	public void LogOutApp()
	{
		logOutLnk.click();
	}


	
	

}

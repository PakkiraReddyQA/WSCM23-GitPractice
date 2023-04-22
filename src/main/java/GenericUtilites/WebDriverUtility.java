package GenericUtilites;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/**
	 * This method will maximize the webPage
	 * @param driver
	 */
	public void maximization(WebDriver driver)
	{
		driver.manage().window().maximize();	
	}
	/**
	 * This method will minimize the webpage
	 * @param driver
	 */
	public void miniMization(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	/**
	 * This method will wait for webpage load
	 * @param driver
	 */
	public void waitforpage(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	/**
	 * This method will wait until element should be click able
	 * @param driver
	 * @param element
	 */
	public void waitelementToBeClickble(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * This method will wait until element to visibilty
	 * @param driver
	 * @param element
	 */
	public void waitelementToBeVisibility(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method will handle the DropDown Based On Index
	 * @param element
	 * @param IndexNo
	 */
	public void handleDropdown(WebElement element,int IndexNo)
	{
		Select s=new Select(element);
		s.selectByIndex(IndexNo);
	}
	/**
	 * This method will handle the DropDown Based On Value
	 * @param value
	 * @param element
	 */
	public void handleDropdown(String value,WebElement element)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
      /**
      * This method will handle the DropDown Based On Index
      * @param element
      * @param text
     */
	public void handleDropdown(WebElement element,String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	/**
	 * This method will perform RightClick Action in Any where in webpage
	 * @param driver
	 */
	public void rightClickAction(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}
	/**
	 * This method will perform RightClick Action Based on Element
	 * @param driver
	 * @param element
	 */
	public void rightClickAction(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	/**
	 * This method will perform RightClick Action  anywhere webpage
	 * @param driver
	 */
	public void doubleClickAction(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	/**
	 * THis method will perform Double click action based on Element
	 * @param driver
	 * @param element
	 */
	public void doubleClickAction(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	/**
	 * This method will peefrom Drag and drop Actions
	 * @param driver
	 * @param src
	 * @param dest
	 */
	public void dragAndDropAction(WebDriver driver,WebElement src,WebElement dest)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest);
	}
	/**
	 * This method will pefrom Drag and drop Actions Based on X axis and Y axis
	 * @param driver
	 * @param src
	 * @param xOffSet
	 * @param YoffSet
	 */
	public void dragAndDropAction(WebDriver driver,WebElement src,int xOffSet,int YoffSet)
	{
		Actions act=new Actions(driver);
		act.dragAndDropBy(src, xOffSet, YoffSet);
	}
	/**
	 * This method will Accept the Alert
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * This method will cancel the Alert
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * This method will get the text of Alert
	 * @param driver
	 */
	public void getTextAlert(WebDriver driver)
	{
		driver.switchTo().alert().getText();
	}
	/**
	 * This method will switch to the frame based on Index
	 * @param driver
	 * @param frameIndex
	 */
	public void handleFrames(WebDriver driver,int frameIndex )
	{
		driver.switchTo().frame(frameIndex);
	}
	/**
	 * This method will switch Based on frameIdorName
	 * @param driver
	 * @param FrameIdorName
	 */
	public void handleFrames(WebDriver driver,String FrameIdorName)
	{
		driver.switchTo().frame(FrameIdorName);
	}
	/**
	 * This method will switch Based Element
	 * @param driver
	 * @param element
	 */
	public void handleFrames(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}
	/**
	 * This method will switch to parent frame
	 * @param driver
	 */
	public void handleFrames(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	/**
	 * This method switch to BaseFrame
	 * @param driver
	 */
	public void switchTodefaultFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	/**
	 * This method will scroll By Randmoly
	 * @param driver
	 */
	public void scrollActions(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("Window.scroolBy(0,500)","");
	}
	/**
	 * This method will switch to window based on Partial windowid
	 * @param driver
	 * @param parentId
	 */
	public void switchTowindow(WebDriver driver,String parentId)
	{
		Set<String> childId = driver.getWindowHandles();
		for(String all:childId)
		{
			if(!parentId.contains(all))
			{
				driver.switchTo().window(all);
			}
		}
	}
	/**
	 * This method will switch to window based on Partial windowid
	 * @param parentId
	 * @param driver
	 */
	public void switchTowindow(String parentId,WebDriver driver)
	{
		Set<String> windowIds = driver.getWindowHandles();
		for(String windowId:windowIds)
		{
			String currentId = driver.switchTo().window(windowId).getTitle();
			if(parentId.contains(currentId))
			{
				break;
			}
		}
	}
	/**
	 * This method will take screenshot
	 * @param driver
	 * @param screenShotName
	 * @return
	 * @throws IOException
	 */
	public String takeScreenShot(WebDriver driver,String screenShotName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\ScreenShots"+screenShotName+".png");
		FileUtils.copyFile(src, dest);
		return dest.getAbsolutePath();
	}
}

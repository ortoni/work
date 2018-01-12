package leaf.Lead;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class UploadUsingFF  {
	@Test
	public void sma() throws InterruptedException, FindFailed {
		System.setProperty("webdriver.gecko.driver", "./driver/gecko.exe");
		//System.out.println("UploadUsingFF.sma()");
		FirefoxDriver driver = new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://qa.smacar.com/studio"); 
		driver.findElementById("lmail").sendKeys("test007@gmail.com");
		driver.findElementById("lpwd").sendKeys("leaf@123");
		driver.findElementById("login_submit").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//div[text()='NEW CAMPAIGN']").click();
		driver.findElementById("pjtName").sendKeys("trial1",Keys.TAB,Keys.DOWN,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='CREATE']").click();
		driver.findElementByXPath("(//p[@class='text_flow'])[1]").click();

		driver.findElementByXPath("(//div[@class='card small']//div)[1]").click();
		//driver.findElementById("newTargetName").sendKeys("Marker");
		//Thread.sleep(3000);	
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementsByClassName('dz-hidden-input')[0].style.visibility='visible';");
		System.out.println(js.executeScript("return document.getElementsByClassName('dz-hidden-input')[0].style.visibility;"));
		driver.findElementByXPath("//input[@type='file']")
		.sendKeys("E:\\Koushik\\Opentaps\\snap\\snap.png");
		driver.findElementById("submit-all").click();
		
		
		
		
		
		
		
		/*Screen screen = new Screen();

		Pattern fileNameInput = new Pattern("E:\\FileName.PNG");
		Pattern openButton = new Pattern("E:\\Open.PNG");
		screen.wait(fileNameInput);
		screen.type(fileNameInput, "E:\\Koushik\\Opentaps\\snap\\snap.png");
		screen.click(openButton);*/
		}
}
	
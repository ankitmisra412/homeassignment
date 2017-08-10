package homeassignment;

public class Selenium {

	public static void main(String args[])
	{
		String exePath= "C:\\Users\\chrome.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		Webdriver driver= new chromeDriver();
		driver.get("http://www.practiceselenium.com/practice-form.html");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Ankit");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Ankit");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("teal")).click();
		driver.findElement(By.id("tool-0")).click();
		driver.findElement(By.id("selenium_commands")).click();
		driver.findElement(By.id("submit")).click();	
		WebElement homePageLink= driver.findElement(By.cssSelector("span > a"));
		boolean homePageLinkDisplay= homePageLink.isDisplayed();
		assertEquals(homePageLinkDisplay, true);
		
	}
	
}
 
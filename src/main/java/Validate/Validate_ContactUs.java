package Validate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Validate_ContactUs {

	
	@Test
	public void validateAboutPage()

	{
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puneripattern.com/contact-us/");
		driver.close();
			}
}


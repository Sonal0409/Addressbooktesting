package com.addressbook.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {
	
	
	@Test
	public void HomePageTest()
	{
		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.get("http://18.189.30.178:49153/addressbook/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}

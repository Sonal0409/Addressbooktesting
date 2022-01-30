package com.addressbook.Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewContact {
	
	@Test
	public void newContactTest() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://18.189.30.178:49153/addressbook/");
		Thread.sleep(7000); //static waittime
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/div[1]/div/div/div[2]/div")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[3]/input")).sendKeys("sonal");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/input")).sendKeys("Mittal");
		driver.close();
	}

}

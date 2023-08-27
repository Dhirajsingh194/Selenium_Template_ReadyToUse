package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Navigation nav=driver.navigate();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("India");
		
		WebElement web=driver.findElement(By.name("btnK"));
		web.sendKeys("India");
		web.sendKeys(Keys.ENTER);
		 
		driver.findElement(By.name("btnk")).click();

	   }
}

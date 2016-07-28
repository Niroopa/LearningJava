/*package learningArrays;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class windowHandler {

	public static void main(String args[])
	{
		
			
		WebDriver driver=new FirefoxDriver();
		driver.get("http//whiteboxqa.com");
		driver.manag().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
					
		String mainWin=driver.getWindlowHandle();
		System.out.println("get title:"+driver.getTitle()+"printing url:"+driver.getcurrentUrl());
		driver.findElement(By.xpath("#headerfblogin")).click();
		
		
		Set<String> windows=driver.getWindowHandles();
		for(String child:windows)
		{
			driver.switchTo().window(child);
			String title=driver.getTitle();
			if(title.equalsIgnoreCase("Facebook"))
			{
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("pmsapcrm@gmail.com");
				driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("training");
				driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
			}
		}
		driver.close();

	}
		
		}*/



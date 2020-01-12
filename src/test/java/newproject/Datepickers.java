package newproject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;



public class Datepickers {
	

	public static void main(String[] args) throws Exception
	{
	    
	   //  ChromeOptions options= new ChromeOptions();
	  //    options.addArguments();
        
		
		WebDriver driver;
	     driver= new FirefoxDriver();
    //   WebDriverWait wait=new WebDriverWait(driver, 20);

		driver.get("https://www.cleartrip.com/trains");
 //  }
   /*   catch (Exception e) 
   {
		System.out.println(e);
	}
		*/
		driver.manage().window().maximize();
		//identify the date picker
		WebElement dpdate;
	 dpdate=	driver.findElement(By.id("dpt_date"));
	 dpdate.click();
	 Thread.sleep(2000);
	//date picker
	 WebElement date_picker;
	 date_picker=driver.findElement(By.xpath("//div[@id='datePickerWrapper']"));
	//list of the date to be clickable
	 List<WebElement>Clickable;
	Clickable=date_picker.findElements(By.tagName("a"));
	
	
		//iterating 
	for (int i = 0; i <Clickable.size(); i++) {
		WebElement each_link=Clickable.get(i);
		each_link.click();
		Thread.sleep(1000);
		 dpdate.click();
		 Thread.sleep(2000);
		//Restore all identifications
		 
		 date_picker=driver.findElement(By.xpath("//div[@id='datePickerWrapper']"));
		 Clickable=date_picker.findElements(By.tagName("a"));
	}
		
		
		
		
	}

}

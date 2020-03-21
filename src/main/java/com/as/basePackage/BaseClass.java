package com.as.basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.as.util.Testutil;

public class BaseClass {
public static WebDriver driver;
 public static Properties prop;

         public BaseClass() 
                     {
	try {
	    prop=new Properties();
	
		FileInputStream ip= new FileInputStream("C:\\Coding\\HtmlExtentReport\\src\\main\\java\\com\\as\\config\\config.properties");
	
			
				prop.load(ip);}
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}	 
	@BeforeMethod
	protected static void setUp() 			
    {		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chrome\\79\\chromedriver_win32\\chromedriver.exe");
			 // step1: Create the driver
			  driver = new ChromeDriver();

     }else
     {
		System.out.println("other browser");
       }
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
		
      
    }
	@AfterMethod
	protected void Cleanup() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	 
}
	
    
 
		

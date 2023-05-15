package Netmeds_Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Netmeds_Testbase {
	//Creating WebDriver and Properties objects
		public static WebDriver driver;
		public static Properties prop;
		//Driver setup
		public void initialize() throws IOException{
			try {
				//path to the configuration file
				FileInputStream file=new FileInputStream("D:\\workspace\\Netmeds\\src\\test\\java\\Netmeds_Config\\Config.properties");
				prop=new Properties();
				prop.load(file);
				
				WebDriverManager.chromedriver().setup();
				ChromeOptions chromeOptions= new ChromeOptions();
				chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
				
				driver=new ChromeDriver(chromeOptions);
				driver.manage().window().maximize();
				driver.get(prop.getProperty("url"));
			}
			catch(FileNotFoundException e) {
				System.out.println("File Is Not Available");
			}	
		}
		//Closing the window
		public void close() {
			driver.quit();
		}
}
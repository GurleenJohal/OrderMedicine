package Netmeds_Test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Netmeds_PageClass.Netmeds_Page1;
import Netmeds_Testbase.Netmeds_Testbase;

public class Netmeds_Test_1 extends Netmeds_Testbase{
	//Object of Page Class
	Netmeds_Page1 netmeds_page1;
	public ExtentTest test;
	public ExtentReports extent;
	
	//Invoking Browser
	@BeforeClass
	public void launchWebsite() throws IOException {
		initialize();
		netmeds_page1 =  new Netmeds_Page1();
	}
	
	@BeforeTest
	public void x() {
		extent=new ExtentReports("C:\\Users\\gukaur\\.jenkins\\workspace\\HomePage\\ExtentReport.html",true);	
	}

	@AfterTest
	public void y() {
		extent.endTest(test);
		extent.flush();
	}
	
	//Visibility of logo
  @Test(priority=1)
  public void Logo_Visibility() throws InterruptedException {
	  test=extent.startTest("Verify whether Netmeds Logo is displayed Successfully");
	  test.log(LogStatus.INFO, "Netmeds Home Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Home Page Loads Successfully");
	  
	  Thread.sleep(2000);
	  System.out.println("--The logo is visible--");
	  Assert.assertEquals(netmeds_page1.Logo().isDisplayed(),true);
  }
  
  @Test(priority=2, enabled=false)
  public void Sign_In() throws InterruptedException {
	  Thread.sleep(2000);
	  netmeds_page1.Sign_In().click();
	  Thread.sleep(3000);
	  netmeds_page1.Phone().sendKeys("6284403095");
	  Thread.sleep(2000);
	  netmeds_page1.Use_OTP().click();
	  Thread.sleep(5000);
	  //driver.navigate().refresh();
	  //Enter OTP manually
	  netmeds_page1.Verify().click();
	  Thread.sleep(20000);
	  WebElement Username = driver.findElement(By.xpath("//a[@id='logged_user']"));
	  Thread.sleep(2000);
	  System.out.println("---Logged in username:---"+Username.getText());
  }
  @Test(priority=3)
  public void Search() throws InterruptedException {
	  Thread.sleep(2000);
	  netmeds_page1.Search().sendKeys("Disprin");
	  netmeds_page1.Search().sendKeys(Keys.ENTER);
	  Thread.sleep(3000);	  
	  WebElement search = driver.findElement(By.xpath("//span[@id='search_kwrd']"));
	  System.out.println("--Showing results for--"+search.getText());
	  Assert.assertEquals(search.getText(), "Disprin");
	  driver.navigate().back();
  }
  @Test(priority=4)
  public void Medicine() throws InterruptedException {
	  Thread.sleep(5000);
	  Actions act = new Actions(driver);
	  WebElement Medicine = driver.findElement(By.xpath("//a[text()=' Medicine']"));
	  act.moveToElement(Medicine);
	  act.perform();
	  WebElement All_Medicine = driver.findElement(By.xpath("//a[text()='All Medicines']"));
	  act.moveToElement(All_Medicine);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  WebElement Med = driver.findElement(By.xpath("//div[@class='innercontent']"));
	  System.out.println(Med.getText());
	  Assert.assertEquals(Med.getText(), "Find Your Prescription Medicines\n"
	  		+ "Shop by Drug Category");
	  Thread.sleep(2000);
	  driver.navigate().back();
  }
  @Test(priority=5,enabled=false)
  public void Buy_Again() throws InterruptedException {
	  Thread.sleep(5000);
	  Actions act = new Actions(driver);
	  WebElement Medicine = driver.findElement(By.xpath("//a[text()=' Medicine']"));
	  act.moveToElement(Medicine);
	  act.perform();
	  WebElement Buy_Again = driver.findElement(By.xpath("//a[text()='Buy Again']"));
	  act.moveToElement(Buy_Again);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  driver.navigate().back();
  }
  @Test(priority=6)
  public void Wellness_Ayush() throws InterruptedException {
	  Thread.sleep(5000);
	  Actions act = new Actions(driver);
	  WebElement Wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  act.moveToElement(Wellness);
	  act.perform();
	  WebElement Ayush = driver.findElement(By.xpath("(//a[text()='Ayush'])[1]"));
	  act.moveToElement(Ayush);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("------\n"+netmeds_page1.Ayush().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/ayush");
  }
  @Test(priority=7)
  public void Wellness_CovidEssentials() {
	  Actions act = new Actions(driver);
	  WebElement Wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  act.moveToElement(Wellness);
	  act.perform();
	  WebElement Wellness_Covid_Essentials = driver.findElement(By.xpath("//a[text()='Covid Essentials']"));
	  act.moveToElement(Wellness_Covid_Essentials);
	  act.click().build().perform();
	  System.out.println("------\n"+netmeds_page1.Wellness_Covid_Essentials().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/covid-essentials");
  }
  @Test(priority=8)
  public void Wellness_Devices() throws InterruptedException {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  WebElement Wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  act.moveToElement(Wellness);
	  act.perform();
	  WebElement Devices = driver.findElement(By.xpath("(//a[text()='Devices'])[1]"));
	  act.moveToElement(Devices);
	  act.click().build().perform();
	  System.out.println("------\n"+netmeds_page1.Wellness_Devices().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/devices");
	  driver.navigate().back();
  }
  @Test(priority=9)
  public void Wellness_Diabetes_Support() throws InterruptedException {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  WebElement Wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  act.moveToElement(Wellness);
	  act.perform();
	  WebElement Diabetes_Support = driver.findElement(By.xpath("(//a[text()='Diabetes Support'])[1]"));
	  act.moveToElement(Diabetes_Support);
	  act.click().build().perform();
	  System.out.println("------\n"+netmeds_page1.Diabetes_Support().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/diabetes-support");
	  driver.navigate().back();
  }
  @Test(priority=10)
  public void Wellness_Eyewear() throws InterruptedException {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  WebElement Wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  act.moveToElement(Wellness);
	  act.perform();
	  WebElement Eyewear = driver.findElement(By.xpath("(//a[text()='Eyewear'])[1]"));
	  act.moveToElement(Eyewear);
	  act.click().build().perform();
	  System.out.println("------\n"+netmeds_page1.Eyewear().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/eyewear");
	  driver.navigate().back();
  }
  @Test(priority=11)
  public void Wellness_Fitness() throws InterruptedException {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  WebElement Wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  act.moveToElement(Wellness);
	  act.perform();
	  WebElement Fitness = driver.findElement(By.xpath("(//a[text()='Fitness'])[1]"));
	  act.moveToElement(Fitness);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("------\n"+netmeds_page1.Fitness().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/fitness");
	  driver.navigate().back();
  }
  @Test(priority=12)
  public void Wellness_Health_Conditions() throws InterruptedException {
	  Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  WebElement Wellness = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  act.moveToElement(Wellness);
	  act.perform();
	  WebElement Health_Conditions = driver.findElement(By.xpath(" (//a[text()='Health Conditions'])[1]"));
	  act.moveToElement(Health_Conditions);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("------\n"+netmeds_page1.Health_Conditions().getText());
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/health-conditions");
	  driver.navigate().back();
  } 
  
  @Test(priority=13)
  public void Navigation_Section() {
	  Assert.assertEquals(netmeds_page1.Navigation_Section().isDisplayed(),true);
	  System.out.println(netmeds_page1.Navigation_Section().getText());
  }
 
  @Test(priority=14)
  public void COVID_Essentials() throws InterruptedException {
	  netmeds_page1.COVID_Essentials().click();
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/covid-essentials");
	  driver.navigate().back();
  }
  
  @Test(priority=15)
  public void Diabetes() throws InterruptedException {
	  netmeds_page1.Diabetes().click();
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/diabetes-support");
	  driver.navigate().back();
  }
  
  @Test(priority=16)
  public void Veterinary() throws InterruptedException {
	  netmeds_page1.Veterinary().click();
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/veterinary");
	  driver.navigate().back();
  }
  
  @Test(priority=17)
  public void Homeopathy() throws InterruptedException {
	  netmeds_page1.Homeopathy().click();
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/ayush/homeopathy");
	  driver.navigate().back();
  }
  
  @Test(priority=18)
  public void Devices() throws InterruptedException {
	  netmeds_page1.Devices().click();
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/devices");
	  driver.navigate().back();
  }
  
  @Test(priority=19)
  public void Next_Slider_Ad() {
	  Assert.assertEquals(netmeds_page1.Next_Slider().isDisplayed(), true);
	  netmeds_page1.Next_Slider().click();
  }
  
  @Test(priority=20)
  public void Previous_Slider_Ad() throws InterruptedException {
	  Thread.sleep(2000);
	  Assert.assertEquals(netmeds_page1.Previous_Slider().isDisplayed(), true);
	  netmeds_page1.Previous_Slider().click();
	  Thread.sleep(1000);
  }
  
  @Test(priority=21)
  public void Payment_Partner_Offers() throws InterruptedException {
	  Thread.sleep(2000);
	  Assert.assertEquals(netmeds_page1.Payment_Partner_Offers().isDisplayed(), true);
	  System.out.println("----------\n"+netmeds_page1.Payment_Partner_Offers().getText());
  }
  
  @Test(priority=22)
  public void Netmeds_Stores() throws InterruptedException {
	  Thread.sleep(2000);
	  Assert.assertEquals(netmeds_page1.Netmeds_Store().isDisplayed(), true);
	  netmeds_page1.Netmeds_Store().click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=23, dependsOnMethods="Netmeds_Stores")
  public void Stores_Map() throws InterruptedException {
	  Thread.sleep(2000);
	  Assert.assertEquals(netmeds_page1.Store_Map().isDisplayed(), true);
	  System.out.println("\n-----Map is visible.-----\n");
  }
  
  @Test(priority=24, dependsOnMethods="Netmeds_Stores")
  public void Change_Pincode() throws InterruptedException {
	  Assert.assertEquals(netmeds_page1.Pincode().isDisplayed(), true);
	  netmeds_page1.Pincode().clear();
	  netmeds_page1.Pincode().sendKeys("141101");
	  netmeds_page1.Pin_Chng().click();
	  Thread.sleep(2000);
  }
 
  
  @Test(priority=25, dependsOnMethods="Netmeds_Stores")
  public void Location_Info() {
	  Assert.assertEquals(netmeds_page1.Location().isDisplayed(), true);
	  System.out.println("----Location of store----\n"+netmeds_page1.Location().getText()+"\n");
  }
  
  @Test(priority=26, dependsOnMethods="Netmeds_Stores")
  public void Stores_Count() {
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/storelocator");
	  System.out.println("----Number of nearby stores:-----\n"+netmeds_page1.Store_Count().getText());
  }
  
  @Test(priority=27, dependsOnMethods="Netmeds_Stores")
  public void Stores_List() {
	  Assert.assertEquals(netmeds_page1.Stores_List().isDisplayed(),true);
	  System.out.println("-----Nearby Stores-----\n"+netmeds_page1.Stores_List().getText());
  }
  
  @Test(priority=28, dependsOnMethods="Netmeds_Stores")
  public void Bottom_Footer() {
	  Assert.assertEquals(netmeds_page1.Btm_Footer().isDisplayed(), true);
	  System.out.println("----Bottom Footer items are displayed.-----\n"+netmeds_page1.Btm_Footer().getText());
  }
  
  	//Closing the browser
	@AfterClass
	public void terminate() {
	  	close();
	} 
}

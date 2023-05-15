package Netmeds_Test;

import 	static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.util.List;
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
import Netmeds_PageClass.Netmeds_Page2;
import Netmeds_Testbase.Netmeds_Testbase;

public class Netmeds_Test_2 extends Netmeds_Testbase{
	//Object of Page Class
	Netmeds_Page2 netmeds_page2;
	public ExtentTest test;
	public ExtentReports extent;
			
	//Invoking Browser
	@BeforeClass
	public void launchWebsite() throws IOException {
		initialize();
		netmeds_page2 =  new Netmeds_Page2();
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
  @Test(priority=1)
  public void Lab_Tests() throws InterruptedException {
	  
	  test=extent.startTest("Verify whether Netmeds Lab Tests Page Loads Successfully");
	  test.log(LogStatus.INFO, "Netmeds Lab Tests Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Lab Tests Page Loads Successfully");
	
	  Thread.sleep(2000);
	  netmeds_page2.Lab_Tests().click();
	  System.out.println("---Netmeds Lab Tests Page is invoked----\n");
	 
	  String actual=driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/health-packages";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "health-packages page loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "health-packages page is not loaded properly");
		}
		
		assertEquals(actual,expected);
  }
  
  @Test(priority=2, dependsOnMethods="Lab_Tests")
  public void Health_packages1() throws InterruptedException {
	  Thread.sleep(2000);
	  test=extent.startTest("Verify whether user can enter the details Successfully");
	  test.log(LogStatus.INFO, "Netmeds Lab Tests Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds health-packages Page Loads Successfully");

	  netmeds_page2.Name().sendKeys("Gurleen Kaur");
	  netmeds_page2.Mobile().sendKeys("6284403095");
	  netmeds_page2.Pincode().sendKeys("141101");
	  Thread.sleep(2000);  
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/health-packages";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "user can enter the details Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "user cannot enter the details Successfully");
		}
		
		assertEquals(actual,expected);
 }
  
  @Test(priority=2, dependsOnMethods="Health_packages1")
  public void Health_packages2() throws InterruptedException {
	  test=extent.startTest("Verify whether user can select the package Successfully");
	  test.log(LogStatus.INFO, "Netmeds Lab Tests Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds health-packages Page Loads Successfully");
	  
	  netmeds_page2.Sel_Package().click();
	  netmeds_page2.Option1().click();
	  Thread.sleep(2000);  
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/health-packages";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "user can select the package Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "user cannot select the package Successfully");
		}
		
		assertEquals(actual,expected);
 }
  
  @Test(priority=2, dependsOnMethods="Health_packages2")
  public void Health_packages3() throws InterruptedException {
	  test=extent.startTest("Verify whether user can select the test Successfully");
	  test.log(LogStatus.INFO, "Netmeds Lab Tests Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds health-packages Page Loads Successfully");
	  
	  netmeds_page2.Sel_Test().click();
	  netmeds_page2.Option2().click();
	  netmeds_page2.Checkbox().click();
	  System.out.println("---Test is booked---\n");
	  Thread.sleep(2000);  
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/health-packages";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "user can select the test Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "user cannot select the test Successfully");
		}
		
		assertEquals(actual,expected);
 }
  
  @Test(priority=3)
  public void Beauty_Fragrances() throws InterruptedException {
	  test=extent.startTest("Verify whether Fragrances page is invoked Successfully");
	  test.log(LogStatus.INFO, "Netmeds Beauty Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Fragrances Page Loads Successfully");
	  
	  Thread.sleep(2000);
	  WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Beauty);
	  act.perform();
	  WebElement Fragrances = driver.findElement(By.xpath("//a[text()='Fragrances']"));
	  act.moveToElement(Fragrances);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("---Fragrances page is invoked---\n");
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/non-prescriptions/fragrances";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Fragrances page is invoked Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Fragrances page is not invoked Successfully");
		}
		
		assertEquals(actual,expected);
	  
  }
  
  @Test(priority=4)
  public void Beauty_Hair() throws InterruptedException {
	  test=extent.startTest("Verify whether Hair page of beauty module is invoked Successfully");
	  test.log(LogStatus.INFO, "Netmeds Beauty Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Hair Page Loads Successfully");
	  
	  Thread.sleep(2000);
	  WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Beauty);
	  act.perform();
	  WebElement Hair = driver.findElement(By.xpath("(//a[text()='Hair'])[1]"));
	  act.moveToElement(Hair);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("---Hair page of beauty module is invoked---\n");
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/non-prescriptions/hair";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Hair page of beauty module is invoked Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Hair page of beauty module is not invoked Successfully");
		}
		
		assertEquals(actual,expected);
  }
  
  @Test(priority=5)
  public void Beauty_Makeup() throws InterruptedException {
	  test=extent.startTest("Verify whether Makeup page of beauty module is invoked Successfully");
	  test.log(LogStatus.INFO, "Netmeds Beauty Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Makeup Page Loads Successfully");
	  
	  Thread.sleep(2000);
	  WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Beauty);
	  act.perform();
	  WebElement Makeup = driver.findElement(By.xpath("(//a[text()='Make-Up'])[1]"));
	  act.moveToElement(Makeup);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("---Makeup page of beauty module is invoked---\n");
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/non-prescriptions/make-up";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Makeup page of beauty module is invoked Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Makeup page of beauty module is not invoked Successfully");
		}
		
		assertEquals(actual,expected);
  }
  
  @Test(priority=6)
  public void Beauty_MomBaby() throws InterruptedException {
	  test=extent.startTest("Verify whether Mom & Baby page of beauty module is invoked Successfully");
	  test.log(LogStatus.INFO, "Netmeds Beauty Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Mom & Baby Page Loads Successfully");
	  
	  Thread.sleep(2000);
	  WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Beauty);
	  act.perform();
	  WebElement MomBaby = driver.findElement(By.xpath("(//a[text()='Mom & Baby'])[2]"));
	  act.moveToElement(MomBaby);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("---Mom & Baby page of beauty module is invoked---\n");
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/non-prescriptions/mom-baby";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Mom & Baby page of beauty module is invoked Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Mom & Baby page of beauty module is not invoked Successfully");
		}
		
		assertEquals(actual,expected);
  }
  
  @Test(priority=7)
  public void Beauty_PersonalCare() throws InterruptedException {
	  test=extent.startTest("Verify whether Personal Care page of beauty module is invoked Successfully");
	  test.log(LogStatus.INFO, "Netmeds Beauty Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Personal Care Page Loads Successfully");
	  
	  Thread.sleep(2000);
	  WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Beauty);
	  act.perform();
	  WebElement PersonalCare = driver.findElement(By.xpath("(//a[text()='Personal Care'])[2]"));
	  act.moveToElement(PersonalCare);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("---Personal Care page of beauty module is invoked---\n");
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/non-prescriptions/personal-care";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Personal Care page of beauty module is invoked Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Personal Care page of beauty module is not invoked Successfully");
		}
		
		assertEquals(actual,expected);
  }
  
  @Test(priority=8)
  public void Beauty_SkinCare() throws InterruptedException {
	  test=extent.startTest("Verify whether Skin Care page of beauty module is invoked Successfully");
	  test.log(LogStatus.INFO, "Netmeds Beauty Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Skin Care Page Loads Successfully");
	  
	  Thread.sleep(2000);
	  WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Beauty);
	  act.perform();
	  WebElement SkinCare = driver.findElement(By.xpath("(//a[text()='Skin Care'])[1]"));
	  act.moveToElement(SkinCare);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("---Skin Care page of beauty module is invoked---\n");
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/non-prescriptions/skin-care";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Skin Care page of beauty module is invoked Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Skin Care page of beauty module is not invoked Successfully");
		}
		
		assertEquals(actual,expected);
  }
  
  @Test(priority=9)
  public void Beauty_Tools() throws InterruptedException {
	  test=extent.startTest("Verify whether Tools & Appliances page of beauty module is invoked Successfully");
	  test.log(LogStatus.INFO, "Netmeds Beauty Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Tools & Appliances Page Loads Successfully");
	  
	  Thread.sleep(2000);
	  WebElement Beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Beauty);
	  act.perform();
	  WebElement Tools = driver.findElement(By.xpath("(//a[text()='Tools & Appliances'])[1]"));
	  act.moveToElement(Tools);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  System.out.println("---Tools & Appliances page of beauty module is invoked---\n");
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/non-prescriptions/tools-appliances";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Tools & Appliances page of beauty module is invoked Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Tools & Appliances page of beauty module is not invoked Successfully");
		}
		
		assertEquals(actual,expected);
  } 
  
  @Test(priority=10)
  public void Health_Corner_HealthLibrary() throws InterruptedException {
	  test=extent.startTest("Verify whether Health Library page of Health Corner module is invoked Successfully");
	  test.log(LogStatus.INFO, "Netmeds Health Corner Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Health Library Page Loads Successfully");
	  
	  Thread.sleep(2000);
	  WebElement Health_Corner = driver.findElement(By.xpath("(//a[text()=' Health Corner'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Health_Corner);
	  act.perform();
	  WebElement Health_Library = driver.findElement(By.xpath("//a[text()='Health Library']"));
	  act.moveToElement(Health_Library);
	  act.click().build().perform();
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/health-library";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Health library page of health corner module is invoked Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Health library page of health corner module is not invoked Successfully");
		}
		
		assertEquals(actual,expected);
  }
  
  @Test(priority=11, dependsOnMethods="Health_Corner_HealthLibrary")
  public void Health_Library() { 
	  test=extent.startTest("Verify whether user can read the content of Health Library page Successfully");
	  test.log(LogStatus.INFO, "Netmeds Health Library Content Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Health Library Content Page Loads Successfully");
	  
	  System.out.println("------\n"+netmeds_page2.HL_Content().getText());
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/health-library";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Health library content page is readable by the user Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Health library content page is not readable by the user Successfully");
		}
		
		assertEquals(actual,expected);
  }
  
  @Test(priority=12)
  public void Patients_alike() throws InterruptedException {
	  test=extent.startTest("Verify whether Patients Alike page of Health Corner module is invoked Successfully");
	  test.log(LogStatus.INFO, "Netmeds Health Corner Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Patients Alike Page Loads Successfully");
	  
	  WebElement Health_Corner = driver.findElement(By.xpath("(//a[text()=' Health Corner'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Health_Corner);
	  act.perform();
	  WebElement PatientsAlike = driver.findElement(By.xpath("//a[text()='PatientsAlike']"));
	  act.moveToElement(PatientsAlike);
	  act.click().build().perform();
	  Thread.sleep(2000);
	  
	  String winHandleBefore = driver.getWindowHandle();
	  for(String winHandle : driver.getWindowHandles()){
	      driver.switchTo().window(winHandle);
	  }
	  String winHandleAfter = driver.getWindowHandle();
	  driver.close();
	  driver.switchTo().window(winHandleBefore);
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/health-library";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Patients Alike page is invoked Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Patients Alike page is not invoked Successfully");
		}
		
		assertEquals(actual,expected);
	  
  }
  
  @Test(priority=13, dependsOnMethods="Patients_alike")
  public void CoronaAwarenes() {
	  test=extent.startTest("Verify whether Corona Awareness page of Health Corner module is invoked Successfully");
	  test.log(LogStatus.INFO, "Netmeds Health Corner Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Corona Awareness Page Loads Successfully");
	  
	  WebElement Health_Corner = driver.findElement(By.xpath("(//a[text()=' Health Corner'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(Health_Corner);
	  act.perform();
	  WebElement CoronaAwarenes = driver.findElement(By.xpath("//a[text()='Corona Awareness']"));
	  act.moveToElement(CoronaAwarenes);
	  act.click().build().perform();
	  Assert.assertEquals(netmeds_page2.CovidInfo().isDisplayed(),true);
	  System.out.println("---Corona Awareness page is invoked---\n");
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/corona-awareness";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Corona Awareness page is invoked Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Corona Awareness page is not invoked Successfully");
		}
		
		assertEquals(actual,expected);
  }
  
  @Test(priority=14)
  public void Offers() {
	  test=extent.startTest("Verify whether User can click on Offers Successfully");
	  test.log(LogStatus.INFO, "Netmeds Offers Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Offers Page Loads Successfully");
	  
	  netmeds_page2.Offers().click();
	  System.out.println("---Offer_Title---\n"+netmeds_page2.Offer_Title().getText());
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/offers";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Offers page is invoked Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "Offers page is not invoked Successfully");
		}
		
		assertEquals(actual,expected);
  }
  
  @Test(priority=15, dependsOnMethods="Offers")
  public void Select_Offer() throws InterruptedException {
	  test=extent.startTest("Verify whether User can select the Offers Successfully");
	  test.log(LogStatus.INFO, "Netmeds Offers Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Offers Page Loads Successfully");
	  
	  Assert.assertEquals(netmeds_page2.View_Offer().isDisplayed(), true);
	  Thread.sleep(2000);
	  netmeds_page2.Med_Checkbox().click();
	  System.out.println("\n--------\n"+driver.findElement(By.xpath("(//div[@class='offer-top'])[1]")).getText());
	  netmeds_page2.View_Offer().click();  
	
  }
  
  @Test(priority=16, dependsOnMethods="Select_Offer")
  public void View_Offer() {
	  test=extent.startTest("Verify whether User can view all offer on Offers module Successfully");
	  test.log(LogStatus.INFO, "Netmeds Offers Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Offers Page Loads Successfully");
	  
	  Actions act = new Actions(driver);               
	  act.sendKeys(Keys.PAGE_DOWN).build().perform();
	  Assert.assertEquals(netmeds_page2.Terms_Conditions().isDisplayed(), true);
	  netmeds_page2.Terms_Conditions().click();
	  System.out.println("\n-----Terms & Conditions-----\n"+driver.findElement(By.xpath("//div[@class='info']")).getText());	  
	 
  }
  
  @Test(priority=17, dependsOnMethods="View_Offer")
  public void Count_Offers() throws InterruptedException {
	  test=extent.startTest("Verify whether User can count the Offers Successfully");
	  test.log(LogStatus.INFO, "Netmeds Offers Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Offers Page Loads Successfully");
	  
	  driver.navigate().back();
	  Thread.sleep(2000);
	  List<WebElement> Offers = driver.findElements(By.xpath("//div[@class='offer-section medicine odd']"));
	  int Offers_Count = Offers.size();
	  System.out.println("----Total number of Offers are: "+Offers_Count+"-----\n");
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/offers";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "User can count the Offers Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "User cannot count the Offers Successfully");
		}
		
		assertEquals(actual,expected);
  }
  
  @Test(priority=18)
  public void Add_to_Cart() throws InterruptedException {
	  test=extent.startTest("Verify whether User can search the item in the search box Successfully");
	  test.log(LogStatus.INFO, "Netmeds home Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds home Page Loads Successfully");
	  
	  Thread.sleep(2000);
	  netmeds_page2.Search().sendKeys("Combiflam");
	  netmeds_page2.Search().sendKeys(Keys.ENTER);
	  System.out.println("---Item Searched---\n");
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/catalogsearch/result/combiflam/all";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "User can search the item in the search box");
		}
		else {
			test.log(LogStatus.FAIL, "User cannot search the item in the search box");
		}
		
		assertEquals(actual,expected);
  }
  
  @Test(priority=19, dependsOnMethods="Add_to_Cart")
  public void Count_Items() throws InterruptedException {
	  test=extent.startTest("Verify whether User can count the total number of items after search Successfully");
	  test.log(LogStatus.INFO, "Netmeds Home Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Home Page Loads Successfully");
	  
	  Thread.sleep(2000);
	  List<WebElement> Items = driver.findElements(By.xpath("//li[@class='ais-InfiniteHits-item']"));
	  int Total_items = Items.size();
	  System.out.println("----Total number of Items are: "+Total_items+"-----\n");
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/catalogsearch/result/combiflam/all";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "User can count the total number of items after search Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "User cannot count the total number of items after search Successfully");
		}
		
		assertEquals(actual,expected);
  }
  
  @Test(priority=20, dependsOnMethods="Count_Items")
  public void Item_Info() throws InterruptedException {
	  test=extent.startTest("Verify whether User can get the item information Successfully");
	  test.log(LogStatus.INFO, "Netmeds Searched Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Searched Page Loads Successfully");
	  
	  Thread.sleep(2000);
	  System.out.println("----Item Information----\n"+netmeds_page2.Item_info().getText());
	  
	  String actual= driver.getCurrentUrl();
	  String expected="https://www.netmeds.com/catalogsearch/result/combiflam/all";
	  if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "User can get the item information Successfully");
		}
		else {
			test.log(LogStatus.FAIL, "User cannot get the item information Successfully");
		}
		
		assertEquals(actual,expected);
  }
  
  @Test(priority=21, dependsOnMethods="Item_Info")
  public void Add_Item() throws InterruptedException {
	  test=extent.startTest("Verify whether User can add the item in the cart Successfully");
	  test.log(LogStatus.INFO, "Netmeds Cart Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Cart Page Loads Successfully");
	  
	  Thread.sleep(2000);
	  netmeds_page2.Add_To_Cart_Button1().click();
	  Assert.assertEquals(netmeds_page2.Order_Count().isDisplayed(), true);
	  
  }
  
  @Test(priority=22, dependsOnMethods="Add_Item")
  public void Order_Count() {
	  test=extent.startTest("Verify whether User can Count the total number of items order Successfully");
	  test.log(LogStatus.INFO, "Netmeds Home Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Home Page Loads Successfully");
	  
	  netmeds_page2.Add_To_Cart_Button2().click();
	  Assert.assertEquals(netmeds_page2.Order_Count().isDisplayed(), true);
	  System.out.println("----Total number of Items are:----\n"+netmeds_page2.Order_Count().getText());	 
	  
  }
  
  @Test(priority=23, dependsOnMethods="Order_Count")
  public void Order_Summary() {
	  test=extent.startTest("Verify whether Order summary is displayed after adding the items to the cart Successfully");
	  test.log(LogStatus.INFO, "Netmeds Home Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Home Page Loads Successfully");
	  
	  Assert.assertEquals(netmeds_page2.Order_Summary().isDisplayed(), true);
	  System.out.println("----Order Summary----\n"+netmeds_page2.Order_Summary().getText());
	  
  }
  
  @Test(priority=24)
  public void Cart() throws InterruptedException {
	  test=extent.startTest("Verify whether User can click on Cart Successfully");
	  test.log(LogStatus.INFO, "Netmeds Cart Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Cart Page Loads Successfully");
	  
	  Assert.assertEquals(netmeds_page2.Cart().isDisplayed(),true);
	  netmeds_page2.Cart().click();
	  Thread.sleep(2000);
	  
  }
  
  @Test(priority=25, dependsOnMethods="Cart")
  public void Cart_Product() {
	  test=extent.startTest("Verify whether products in the cart are displayed Successfully");
	  test.log(LogStatus.INFO, "Netmeds Cart Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Cart Page Loads Successfully");
	  
	  Assert.assertEquals(netmeds_page2.Cart_Product().isDisplayed(), true);
	  System.out.println("Products in the cart:----\n"+netmeds_page2.Cart_Product().getText());
	  
  }
  
  @Test(priority=26, dependsOnMethods="Cart")
  public void Apply_PromoCode() {
	  test=extent.startTest("Verify whether Apply promo code is displayed Successfully");
	  test.log(LogStatus.INFO, "Netmeds Cart Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Cart Page Loads Successfully");
	  
	  netmeds_page2.Apply_Promo_Code().click();
	  System.out.println("\n----PromoCode displayed---\n");
	  Assert.assertEquals(netmeds_page2.Coupon_List().isDisplayed(), true);

  }
  
  @Test(priority=27, dependsOnMethods="Apply_PromoCode")
  public void Coupon_List() {
	  test=extent.startTest("Verify whether Coupon list is displayed Successfully");
	  test.log(LogStatus.INFO, "Netmeds Cart Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Cart Page Loads Successfully");
	  
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/checkout/cart");
	  System.out.println("----Total number of coupons available are:----"+netmeds_page2.Coupon_List().getSize());
	  System.out.println("\n"+netmeds_page2.Coupon_List().getText());

  }
  
  @Test(priority=28, dependsOnMethods="Apply_PromoCode")
  public void Sel_Coupon() {
	  test=extent.startTest("Verify whether User can Select coupon Successfully");
	  test.log(LogStatus.INFO, "Netmeds Cart Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Cart Page Loads Successfully");
	  
	  Assert.assertEquals(netmeds_page2.Coupon_1().isDisplayed(), true);
	  netmeds_page2.Coupon_1().click();
	  System.out.println("----Coupon selected----\n");
	  
  }
  
  @Test(priority=29, dependsOnMethods="Sel_Coupon")
  public void Payment_Details() {
	  test=extent.startTest("Verify whether Payment details are visible to the user Successfully");
	  test.log(LogStatus.INFO, "Netmeds Cart Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Cart Page Loads Successfully");
	  
	  //close the apply coupon drop-down
	  netmeds_page2.Apply_Promo_Code().click();
	  Assert.assertEquals(netmeds_page2.Payment_details().isDisplayed(),true);
	  System.out.println("------Payment Details-------\n"+netmeds_page2.Payment_details().getText());
	  
  }
  
  @Test(priority=30, dependsOnMethods="Payment_Details")
  public void Proceed() {
	  test=extent.startTest("Verify whether Proceed button is working Successfully");
	  test.log(LogStatus.INFO, "Netmeds Cart Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Cart Page Loads Successfully");
	  
	  Assert.assertEquals(netmeds_page2.Proceed_Button().isDisplayed(), true);
	  netmeds_page2.Proceed_Button().click();
	  driver.navigate().back();
	  
  }
  
  @Test(priority=31, dependsOnMethods="Proceed")
  public void Delivery_Status() throws InterruptedException {
	  test=extent.startTest("Verify whether Delivery status is displayed Successfully");
	  test.log(LogStatus.INFO, "Netmeds Cart Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Cart Page Loads Successfully");
	  
	  Thread.sleep(2000);
	  Assert.assertEquals(netmeds_page2.Delivery_Status().isDisplayed(), true);
	  System.out.println("---------\n"+netmeds_page2.Delivery_Status().getText());
	  
  }
  
  @Test(priority=32, dependsOnMethods="Cart_Product")
  public void Remove_Product() throws InterruptedException {
	  test=extent.startTest("Verify whether User can remove an item from the cart Successfully");
	  test.log(LogStatus.INFO, "Netmeds Cart Page Test is intiated");
	  test.log(LogStatus.INFO,"Verify Netmeds Cart Page Loads Successfully");
	  
	  WebElement Cart_Count = driver.findElement(By.xpath("//span[@class='counter-number']"));
	  System.out.println("---Number of products in the cart:---"+Cart_Count.getText());
	  netmeds_page2.Remove_Product2().click();
	  Thread.sleep(1000);
	  Assert.assertEquals(netmeds_page2.Remove_Button().isDisplayed(), true);
	  netmeds_page2.Remove_Button().click();
	  Thread.sleep(2000);
	  System.out.println("---Number of products remained in the cart:---"+Cart_Count.getText());

  }
  
  
  //Closing the browser
  @AfterClass
  public void terminate() {
	  close();
  }
}

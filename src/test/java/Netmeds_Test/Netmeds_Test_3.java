package Netmeds_Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Netmeds_PageClass.Netmeds_Page3;
import Netmeds_Testbase.Netmeds_Testbase;

public class Netmeds_Test_3 extends Netmeds_Testbase{
	//Object of Page Class
		Netmeds_Page3 netmeds_page3;
		public ExtentTest test;
		public ExtentReports extent;
		
		//Invoking Browser
		@BeforeClass
		public void launchWebsite() throws IOException {
			initialize();
			netmeds_page3 =  new Netmeds_Page3();
		}
		
		@BeforeTest
		public void x() {
			extent=new ExtentReports("D:\\workspace\\Netmeds\\ExtentReport1\\Ordermedicine.html",true);	
		}

		@AfterTest
		public void y() {
			extent.endTest(test);
			extent.flush();
		}
		
	  @Test(priority=1)
	  public void Order_Medicine() {
		  test=extent.startTest("Verify whether User can click on Order Medicine Successfully");
		  test.log(LogStatus.INFO, "Netmeds Order Medicine is clickable.");
		  
		  Assert.assertEquals(netmeds_page3.Order_Medicine().isDisplayed(), true);
		  netmeds_page3.Order_Medicine().click();
	  }
	  
	  @Test(priority=2)
	  public void Upload_Now() {
		  test=extent.startTest("Verify whether Upload now section is visible Successfully");
		  test.log(LogStatus.INFO, "Upload Now is visible.");
		  
		  netmeds_page3.Upload_now().isDisplayed();
		  Assert.assertEquals(netmeds_page3.Upload_now().isDisplayed(), true);
	  }
	  
	  @Test(priority=3)
	  public void Consult_Doctor() {
		  test=extent.startTest("Verify whether Consult Doctor section is visible Successfully");
		  test.log(LogStatus.INFO, "Consult Doctor section is visible.");
		  
		  netmeds_page3.Consult_Doctor().isDisplayed();
		  Assert.assertEquals(netmeds_page3.Consult_Doctor().isDisplayed(), true);
	  }
	  
	  @Test(priority=4)
	  public void Shop_by_Category() {
		  test=extent.startTest("Verify whether Shop By Category section is visible Successfully");
		  test.log(LogStatus.INFO, "Shop By Category section is visible.");
		  
		  netmeds_page3.Shop_by_Category().isDisplayed();
		  Assert.assertEquals(netmeds_page3.Shop_by_Category().isDisplayed(), true);
	  }
	  
	  @Test(priority=5)
	  public void Petcare() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Petcare Successfully");
		  test.log(LogStatus.INFO, "Petcare is clickable.");
		  
		  Thread.sleep(2000);
		  netmeds_page3.Petcare().click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/veterinary/petcare");
		  driver.navigate().back();
	  }
	  
	  @Test(priority=6)
	  public void Vitamins_Supplements() throws InterruptedException{
		  test=extent.startTest("Verify whether User can click on Vitamins & Supplements Successfully");
		  test.log(LogStatus.INFO, "Vitamins & Supplements is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Vitamins_Supplements().click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/fitness/vitamins-and-supplements");
		  driver.navigate().back();
	  }
	  
	  @Test(priority=7)
	  public void Orthopaedics() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Orthopaedics Successfully");
		  test.log(LogStatus.INFO, "Orthopaedics is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Orthopaedics().click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/devices/orthopaedics");
		  driver.navigate().back();
	  }
	  
	  @Test(priority=8)
	  public void Measurements() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Measurements Successfully");
		  test.log(LogStatus.INFO, "Measurements is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Measurements().click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/devices/measurements");
		  driver.navigate().back();
	  }
	  
	  @Test(priority=9)
	  public void Dilutions() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Dilutions Successfully");
		  test.log(LogStatus.INFO, "Dilutions is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Dilutions().click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/ayush/homeopathy/dilutions");
		  driver.navigate().back();
	  }
	  
	  @Test(priority=10)
	  public void Health_Concerns() throws InterruptedException {
		  test=extent.startTest("Verify whether Health Concerns section is visible Successfully");
		  test.log(LogStatus.INFO, "Health Concerns section is visible.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Health_Concerns().isDisplayed();
		  Assert.assertEquals(netmeds_page3.Health_Concerns().isDisplayed(), true);
	  }
	  
	  @Test(priority=11)
	  public void Lung_Care() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Lung Care Successfully");
		  test.log(LogStatus.INFO, "Lung Care is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Lung_Care().click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/health-conditions/lung-care");
		  driver.navigate().back();
	  }
	  
	  @Test(priority=12)
	  public void Weight_Care() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Weight Care Successfully");
		  test.log(LogStatus.INFO, "Weight Care is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Weight_Care().click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/health-conditions/weight-care");
		  driver.navigate().back();
	  }
	  
	  @Test(priority=13)
	  public void Bone_JointPain() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Bone & Joint Pain Successfully");
		  test.log(LogStatus.INFO, "Bone & Joint pain is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Bone_JointPain().click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/health-conditions/bone-and-joint-pain");
		  driver.navigate().back();
	  }
	  
	  @Test(priority=14)
	  public void Cold_fever() throws InterruptedException {
		  test=extent.startTest("Verify whether User can click on Cold and Fever Successfully");
		  test.log(LogStatus.INFO, "Cold and Fever is clickable.");
		  Thread.sleep(2000);
		  
		  netmeds_page3.Cold_fever().click();
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.netmeds.com/non-prescriptions/health-conditions/cold-and-fever");
		  driver.navigate().back();
	  }
	  //Closing the browser
	  @AfterClass
	  public void terminate() {
		  close();
	  }
}

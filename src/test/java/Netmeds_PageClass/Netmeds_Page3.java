package Netmeds_PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Netmeds_Testbase.Netmeds_Testbase;

public class Netmeds_Page3 extends Netmeds_Testbase{
		//Constructor
		public Netmeds_Page3() {
			PageFactory.initElements(driver, this);
		}
		 
		//Locating elements
		//Order Medicine
		@FindBy(xpath="//span[text()='Order Medicine']")
		WebElement Order_Medicine;
		//Upload Now
		@FindBy(xpath="//label[text()=' Upload now ']")
		WebElement Upload_now;
		//Consult Doctor
		@FindBy(xpath="//span[text()='Consult Doctor ']")
		WebElement Consult_Doctor;
		//Shop by Category
		@FindBy(xpath="//section[@id='shop_by_category_145']")
		WebElement Shop_by_Category;
		//Petcare
		@FindBy(xpath="//img[@alt='Petcare']")
		WebElement Petcare;
		//Vitamins and supplements
		@FindBy(xpath="//img[@alt='Vitamins And Supplements']")
		WebElement Vitamins_Supplements;
		//Orthopaedics
		@FindBy(xpath="(//img[@alt='Orthopaedics'])[1]")
		WebElement Orthopaedics;
		//Measurements
		@FindBy(xpath="//img[@alt='Measurements']")
		WebElement Measurements;
		//Dilutions
		@FindBy(xpath="//img[@alt='Dilutions']")
		WebElement Dilutions;
		//Health Concerns
		@FindBy(xpath="//h2[text()=' Health Concerns ']")
		WebElement Health_Concerns;
		//Lung Care
		@FindBy(xpath="//img[@alt='Lung Care']")
		WebElement Lung_Care;
		//Weight Care
		@FindBy(xpath="//img[@alt='Weight Care']")
		WebElement Weight_Care;
		//Bone & Joint Care
		@FindBy(xpath="//img[@alt='Bone And Joint Pain']")
		WebElement Bone_JointPain;
		//Cold and Fever
		@FindBy(xpath="//img[@alt='Cold And Fever']")
		WebElement Cold_fever;
		
		//Methods
		public WebElement Cold_fever() {
			return Cold_fever;
		}
		public WebElement Bone_JointPain() {
			return Bone_JointPain;
		}
		public WebElement Weight_Care() {
			return Weight_Care;
		}
		public WebElement Lung_Care() {
			return Lung_Care;
		}
		public WebElement Health_Concerns() {
			return Health_Concerns;
		}
		public WebElement Dilutions() {
			return Dilutions;
		}
		public WebElement Measurements() {
			return Measurements;
		}
		public WebElement Orthopaedics() {
			return Orthopaedics;
		}
		public WebElement Vitamins_Supplements() {
			return Vitamins_Supplements;
		}
		public WebElement Petcare() {
			return Petcare;
		}
		public WebElement Shop_by_Category() {
			return Shop_by_Category;
		}
		public WebElement Consult_Doctor() {
			return Consult_Doctor;
		}
		public WebElement Upload_now() {
			return Upload_now;
		}
		public WebElement Order_Medicine() {
			return Order_Medicine;
		}
}

package Netmeds_PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Netmeds_Testbase.Netmeds_Testbase;

public class Netmeds_Page1 extends Netmeds_Testbase{
	//Constructor
	public Netmeds_Page1() {
		PageFactory.initElements(driver, this);
	}
	//Locating Elements
	//LOGO
	@FindBy(xpath="//div[@class='logo']")
	WebElement logo;
	//SIGN-UP/IN
	@FindBy(xpath="//a[text()=' Sign in / Sign up ']")
	WebElement Sign_in;
	//PHONE
	@FindBy(xpath="//input[@id='loginfirst_mobileno']")
	WebElement Phone;
	//USE OTP BUTTON
	@FindBy(xpath="//button[text()='USE OTP']")
	WebElement Use_OTP;
	//EMAIL
	@FindBy(xpath="//input[@id='reg_email']")
	WebElement Email;
	//FIRST NAME
	@FindBy(xpath="//input[@id='reg_firstname']")
	WebElement First_name;
	//LAST NAME
	@FindBy(xpath="//input[@id='reg_firstname']")
	WebElement Last_name;
	//VERIFY BUTTON
	@FindBy(xpath="//button[text()='verify']")
	WebElement Verify;
	//SEARCH 
	@FindBy(xpath="//input[@id='search']")
	WebElement Search;
	//AYUSH
	@FindBy(xpath="(//a[text()='Ayush'])[3]")
	WebElement Ayush;
	//COVID ESSENTIALS
	@FindBy(xpath="(//a[text()='Covid Essentials'])[2]")
	WebElement Wellness_Covid_Essentials;
	//DEVICES
	@FindBy(xpath="(//a[text()='Devices'])[3]")
	WebElement Wellness_Devices;
	//DIABETES SUPPORT
	@FindBy(xpath="(//a[text()='Diabetes Support'])[2]")
	WebElement Diabetes_Support;
	//EYEWEAR
	@FindBy(xpath="(//a[text()='Eyewear'])[3]")
	WebElement Eyewear;
	//FITNESS
	@FindBy(xpath="(//a[text()='Fitness'])[3]")
	WebElement Fitness;
	//HEALTH CONDITIONS
	@FindBy(xpath="(//a[text()='Health Conditions'])[2]")
	WebElement Health_Conditions;
	//NAVIGATION SECTION
	@FindBy(xpath="//div[@class='nav-sections']")
	WebElement Navigation_Section;
	//COVID Essentials
	@FindBy(xpath="//a[text()='COVID Essentials']")
	WebElement COVID_Essentials;
	//DIABETES
	@FindBy(xpath="//a[text()='Diabetes']")
	WebElement Diabetes;
	//VETERINARY
	@FindBy(xpath="(//a[text()='Veterinary'])[2]")
	WebElement Veterinary;
	//HOMEOPATHY
	@FindBy(xpath="(//a[text()='Homeopathy'])[2]")
	WebElement Homeopathy;
	//DEVICES
	@FindBy(xpath="(//a[text()='Devices'])[2]")
	WebElement Devices;
	//NEXT SLIDER
	@FindBy(xpath="(//div[@aria-label='Next slide'])[1]")
	WebElement Next_Slider;
	//PREVIOUS SLIDER
	@FindBy(xpath="(//div[@aria-label='Previous slide'])[1]")
	WebElement Previous_Slider;
	//PAYMENT PARTNER OFFERS
	@FindBy(xpath="//div[@class='home-payment-offer']")
	WebElement Payment_Partner_Offers;
	//NETMEDS STORE
	@FindBy(xpath="//div[text()='Netmeds Stores ']")
	WebElement Netmeds_Store;
	//STORE MAP
	@FindBy(xpath="//div[@aria-label='Map']")
	WebElement Store_Map;
	//LOCATION INFORMATION
	@FindBy(xpath="//div[@class='loc-pin-main']")
	WebElement Location;
	//NUMBER OF NEARBY STORE
	@FindBy(xpath="(//div[@class='store-count'])[2]")
	WebElement Store_Count;
	//PINCODE
	@FindBy(xpath="//input[@class='pincode']")
	WebElement Pincode;
	//ARROW
	@FindBy(xpath="//div[@class='btn-loc']")
	WebElement Pin_Chng;
	//STORES LIST
	@FindBy(xpath="//div[@class='store-list']")
	WebElement Stores_List;
	//BOTTOM FOOTER
	@FindBy(xpath="//div[@class='footer-btm']")
	WebElement Btm_Footer;
	//ORDER MEDICINE
	@FindBy(xpath="//span[text()='Order Medicine']")
	WebElement Order_Medicine;
	//
//	@FindBy(xpath="")
//	WebElement TP_Content;
	
	//Methods
	public WebElement Order_Medicine() {
		return Order_Medicine;
	}
	public WebElement Btm_Footer() {
		return Btm_Footer;
	}
	public WebElement Stores_List() {
		return Stores_List;
	}
	public WebElement Pin_Chng() {
		return Pin_Chng;
	}
	public WebElement Pincode() {
		return Pincode;
	}
	public WebElement Store_Count() {
		return Store_Count;
	}
	public WebElement Location() {
		return Location;
	}
	public WebElement Store_Map() {
		return Store_Map;
	}
	public WebElement Netmeds_Store() {
		return Netmeds_Store;
	}
	public WebElement Payment_Partner_Offers() {
		return Payment_Partner_Offers;
	}
	public WebElement Previous_Slider() {
		return Previous_Slider;
	}
	public WebElement Next_Slider() {
		return Next_Slider;
	}
	public WebElement Devices() {
		return Devices;
	}
	public WebElement Homeopathy() {
		return Homeopathy;
	}
	public WebElement Veterinary() {
		return Veterinary;
	}
	public WebElement Diabetes() {
		return Diabetes;
	}
	public WebElement COVID_Essentials() {
		return COVID_Essentials;
	}
	public WebElement Navigation_Section() {
		return Navigation_Section;
	}
	public WebElement Logo() {
		return logo;
	}
	public WebElement Sign_In() {
		return Sign_in;
	}
	public WebElement Phone() {
		return Phone;
	}
	public WebElement Use_OTP() {
		return Use_OTP;
	}
	public WebElement Email() {
		return Email;
	}
	public WebElement First_name() {
		return First_name;
	}
	public WebElement Last_name() {
		return Last_name;
	}
	public WebElement Verify() {
		return Verify;
	}
	public WebElement Search() {
		return Search;
	}
	public WebElement Ayush() {
		return Ayush;
	}
	public WebElement Wellness_Covid_Essentials() {
		return Wellness_Covid_Essentials;
	}
	public WebElement Wellness_Devices() {
		return Wellness_Devices;
	}
	public WebElement Diabetes_Support() {
		return Diabetes_Support;
	}
	public WebElement Eyewear() {
		return Eyewear;
	}
	public WebElement Fitness() {
		return Fitness;
	}
	public WebElement Health_Conditions() {
		return Health_Conditions;
	}
}
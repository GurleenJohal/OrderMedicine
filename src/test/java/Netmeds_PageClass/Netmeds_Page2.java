package Netmeds_PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Netmeds_Testbase.Netmeds_Testbase;

public class Netmeds_Page2 extends Netmeds_Testbase{
	//Constructor
	public Netmeds_Page2() {
		PageFactory.initElements(driver, this);
	}
	//Locating Elements
	//LAB TESTS
	@FindBy(xpath="(//a[text()='Lab Tests'])[1]")
	WebElement Lab_tests;
	//NAME
	@FindBy(xpath="//input[@id='fname-input']")
	WebElement Name;
	//MOBILE
	@FindBy(xpath="(//input[@type='tel'])[2]")
	WebElement Mobile;
	//PINCODE
	@FindBy(xpath="//input[@name='diagnosis_pincode']")
	WebElement Pin;
	//SELECT PACKAGE 1
	@FindBy(xpath="//select[@id='diagnosis_states']")
	WebElement Sel_Package;
	//AAROGYAM C
	@FindBy(xpath="//option[text()='Aarogyam C']")
	WebElement Option1;
	//SELECT PACKAGE 2
	@FindBy(xpath="//*[@id=\"diagnosis_form\"]/div[4]/div[2]/div[1]/span/span[1]/span/span/textarea")
	WebElement Sel_Test;
	//COMPLETE HEMOGRAM
	@FindBy(xpath="//option[text()='Complete Hemogram']")
	WebElement Option2;
	//CHECKBOX
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement Checkbox;
	//HEALTH LIBRARY CONTENT
	@FindBy(xpath="//div[@class='left-block']")
	WebElement HL_Content;
	//PATIENTS ALIKE LOGO
	@FindBy(xpath="//h1[text()='Learn More About Coronavirus']")
	WebElement CovidInfo;
	//OFFERS
	@FindBy(xpath="//a[text()='Offers']")
	WebElement Offers;
	//OFFER TITLE
	@FindBy(xpath="//h1[@class='offer-title']")
	WebElement Offer_Title;
	//VIEW OFFER DETAILS
	@FindBy(xpath="(//a[text()='View Details'])[1]")
	WebElement View_Offer;
	//TERMS & CONDITIONS
	@FindBy(xpath="//h5[text()='Terms and Conditions']")
	WebElement Terms_Conditions;
	//MEDICINE CHECKBOX
	@FindBy(xpath="//input[@value='medicine']")
	WebElement Med_Checkbox;
	//SEARCH 
	@FindBy(xpath="//input[@id='search']")
	WebElement Search;
	//ITEM INFO
	@FindBy(xpath="(//div[@class='cat-item '])[1]")
	WebElement Item_info;
	//ADD TO CART BUTTON 1
	@FindBy(xpath="(//button[@title='ADD TO CART'])[1]")
	WebElement Add_To_Cart_Button1;
	//ADD TO CART BUTTON 2
	@FindBy(xpath="(//button[@title='ADD TO CART'])[2]")
	WebElement Add_To_Cart_Button2;
	//ORDER COUNT
	@FindBy(xpath="//span[@class='items']")
	WebElement Order_Count;
	//ORDER SUMMARY
	@FindBy(xpath="//div[@class='mc_content']")
	WebElement Order_Summary;
	//CART
	@FindBy(xpath="//div[text()=' Cart ']")
	WebElement Cart;
	//CART PRODUCT
	@FindBy(xpath="//div[@class='cart-product']")
	WebElement Cart_Product;
	//APPLY PROMO CODE
	@FindBy(xpath="(//span[text()='Apply Promo Code'])[2]")
	WebElement Apply_Promo_Code;
	//COUPON LIST
	@FindBy(xpath="(//ul[@class='coupon-list-popup'])[1]")
	WebElement Coupon_List;
	//FIRST COUPON
	@FindBy(xpath="(//li[@id='coupon_popup_1'])[1]")
	WebElement Coupon_1;
	//PAYMENT DETAILS
	@FindBy(xpath="//div[@class='totalamt-col']")
	WebElement Payment_details;
	//PROCEED BUTTON
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement Proceed_Button;
	//DELIVERY STATUS
	@FindBy(xpath="(//div[@class='deliverystatus'])[1]")
	WebElement Delivery_Status;
	//REMOVE PRODUCT
	@FindBy(xpath="(//a[text()='Remove'])[2]")
	WebElement Remove_Product2;
	//REMOVE BUTTON
	@FindBy(xpath="//button[text()='REMOVE']")
	WebElement Remove_Button;
	
	//Methods
	public WebElement Remove_Button() {
		return Remove_Button;
	}
	public WebElement Remove_Product2() {
		return Remove_Product2;
	}
	public WebElement Delivery_Status() {
		return Delivery_Status;
	}
	public WebElement Proceed_Button() {
		return Proceed_Button;
	}
	public WebElement Payment_details() {
		return Payment_details;
	}
	public WebElement Coupon_1() {
		return Coupon_1;
	}
	public WebElement Coupon_List() {
		return Coupon_List;
	}
	public WebElement Lab_Tests() {
		return Lab_tests;
	}
	public WebElement Name() {
		return Name;
	}
	public WebElement Mobile() {
		return Mobile;
	}
	public WebElement Pincode() {
		return Pin;
	}
	public WebElement Sel_Package() {
		return Sel_Package;
	}
	public WebElement Option1() {
		return Option1;
	}
	public WebElement Sel_Test() {
		return Sel_Test;
	}
	public WebElement Option2() {
		return Option2;
	}
	public WebElement Checkbox() {
		return Checkbox;
	}
	public WebElement HL_Content() {
		return HL_Content;
	}
	public WebElement CovidInfo() {
		return CovidInfo;
	}
	public WebElement Offers() {
		return Offers;
	}
	public WebElement Offer_Title() {
		return Offer_Title;
	}
	public WebElement Med_Checkbox() {
		return Med_Checkbox;
	}
	public WebElement View_Offer() {
		return View_Offer;
	}
	public WebElement Terms_Conditions() {
		return Terms_Conditions;
	}
	public WebElement Search() {
		return Search;
	}
	public WebElement Item_info() {
		return Item_info;
	}
	public WebElement Add_To_Cart_Button1() {
		return Add_To_Cart_Button1;
	}
	public WebElement Add_To_Cart_Button2() {
		return Add_To_Cart_Button2;
	}
	public WebElement Order_Count() {
		return Order_Count;
	}
	public WebElement Order_Summary() {
		return Order_Summary;
	}
	public WebElement Cart() {
		return Cart;
	}
	public WebElement Cart_Product() {
		return Cart_Product;
	}
	public WebElement Apply_Promo_Code() {
		return Apply_Promo_Code;
	}
}

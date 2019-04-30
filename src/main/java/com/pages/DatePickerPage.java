package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DatePickerPage {
	WebDriver driver;
	@FindBy(how=How.XPATH, using="//a[text()='Date pickers']")
	public WebElement datePicker;
	
	@FindBy(how= How.XPATH, using="//li[@style='display: list-item;']//a[text()='Bootstrap Date Picker']")
	 public WebElement bootstrapDatePicker;
	@FindBy(how=How.XPATH, using="//div[@class='input-group date']/input")
	public WebElement datefield;
	
	@FindBy(xpath="//span[@class='month focused active']")
	public WebElement selectedMonth;

	@FindBy(xpath="//span[@class='year active focused']")
	public WebElement selectedYear;

	@FindBy(xpath="//td[@class='active day']")
	public WebElement selectedDay;
	
	public boolean verifyEnteredDate(String year, String month, String day) {
		return true;
	}
	

}

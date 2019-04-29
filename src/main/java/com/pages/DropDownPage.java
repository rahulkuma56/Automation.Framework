package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
	public WebDriver driver;
	public DropDownPage(WebDriver driver) {
        this.driver=driver;
    }
	
	@ FindBy(how=How.XPATH, using="//a[text()='Input Forms']")
	public WebElement inputForm;
	
	@FindBy(how= How.PARTIAL_LINK_TEXT, using="Select Dropdown")
	 public WebElement selectDropdownList;
	
	@FindBy(how=How.ID,using="select-demo")
	public WebElement val1drpdwn;
	
	@FindBy(how=How.CLASS_NAME,using="selected-value")
	public WebElement valSelected;
	
	@FindBy(how= How.ID,using="multi-select")
	public WebElement multiVAldrpdwn;
	
	@FindBy(how = How.CLASS_NAME,using="getall-selected")
	public WebElement mulSelected;
	
	public Select  selectDrpdwn( WebElement dropdown) {
		return new Select(val1drpdwn) ;
		
	}
	
}

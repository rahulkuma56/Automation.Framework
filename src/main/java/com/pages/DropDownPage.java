package com.pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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
	@FindBy(xpath="//option[@value='California']")
	WebElement option1;
	@FindBy(xpath="//option[@value='Florida']")
	WebElement option2;

	@FindBy(id="printAll")
	public WebElement getAllSelected;
	
	
	public Select  selectDrpdwn( WebElement dropdown) {
		return new Select(val1drpdwn) ;
		
	}
	public void selectMultiOptions() {
		
		Actions builder = new Actions(driver);

		builder.keyDown(Keys.CONTROL)
		   .click(option1)
		   .click(option2)
		   .keyUp(Keys.CONTROL);

		// Then get the action:
		Action selectMultiple = builder.build();

		// And execute it:
		selectMultiple.perform();   
	}
	
}

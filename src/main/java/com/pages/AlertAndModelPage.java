package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlertAndModelPage {
	@ FindBy(how=How.XPATH, using="//a[text()='Alerts & Modals']")
	public WebElement alertsModals;
	
	@FindBy(how= How.XPATH, using="//li[@style='display: list-item;']//a[text()='Window Popup Modal']")
	 public WebElement windowPopupModal;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Twitter")
	public WebElement twitter;
	
	@FindBy(how=How.XPATH, using="//div[@class='two-windows']/a")
	public WebElement twoPopUp;

}

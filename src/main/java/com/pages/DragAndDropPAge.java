package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DragAndDropPAge {
	WebDriver driver;
	@FindBy(how=How.XPATH, using="//a[text()='Others']")
	public WebElement other;
	
	@FindBy(how= How.XPATH, using="//li[@style='display: list-item;']//a[text()='Drag and Drop']")
	 public WebElement dragandDrop;
	
	@FindBy(xpath="//div[@id='mydropzone']")
	 public WebElement destination;
	
	@FindBy(xpath="//div[@id='todrag']/span[1]")
	 public WebElement source;
	public DragAndDropPAge(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void dragAndDrop(WebElement source, WebElement destination) {
		
	}
	public void performDragDrop() throws Exception {
		
		Actions act=new Actions(driver);
		
//	int x=	 destination.getLocation().getX();
//	int y = destination.getLocation().getY();
//	WebElement drag=driver.findElement(By.xpath("//div[@id='todrag']/span[4]"));
//	WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	 
			
//	act.dragAndDropBy(source, x, y+120).build().perform();
		// find element which we ned to drag
		/*WebElement drag=driver.findElement(By.xpath("//div[@id='todrag']/span[4]"));
		 
		// find element which we need to drop
		WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		 */
		// this will drag element to destination
			Thread.sleep(5000);
		act.dragAndDrop(source, destination).build().perform();
		System.out.println("Drag and drop peromed");
		System.out.println("abcd");
//	Action dragAndDrop = act.clickAndHold(drag)
//			   .moveToElement(drop)
//			   .release(drop)
//			   .build();
//
//			dragAndDrop.perform();
//	System.out.println("Drag and drop successfully");
	}

}

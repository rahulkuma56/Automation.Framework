package com.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import static org.testng.Assert.assertTrue;


public class TablePage {
	@ FindBy(how=How.XPATH, using="//a[text()='Table']")
	public WebElement table;
	
	@FindBy(how= How.XPATH, using="//li[@style='display: list-item;']//a[text()='Table Sort & Search']")
	 public WebElement tableSortSearch;
	
	@FindBy(how=How.XPATH,using="//table//tr/td[6]")
	public List<WebElement> salary;
	@FindBy(how=How.XPATH,using="//th[text()='Salary']")
	public WebElement salarySort;
	
	
	public  boolean sortTableAndVerify(List<WebElement> columnName) {
		
		System.out.println(columnName.size());
		
		for (int i = 0; i < columnName.size(); i++) {
			String value =columnName.get(i).getText();
			int val= Integer.parseInt(value.replaceAll("[^0-9]", ""));
			System.out.println(val);
			int temp=0;
			if(temp>val) {
				return false;
			}
			//Assert.assertTrue(temp<=val);
			temp=val;
			
		}
		return true;
		/*List<String> obtainList= new ArrayList<String>();
		List<String> sortedList= null;
		
		for (WebElement colName : columnName) {
			obtainList.add(colName.getText());				
		}
		sortedList= new ArrayList<String>(obtainList);
		Collections.sort(sortedList);
		System.out.println(obtainList+"equal"+sortedList);
		return sortedList.equals(obtainList);	*/
		//List< WebElement> salary= driver.findElements(By.xpath("//table//tr/td[6]"));
	}

}

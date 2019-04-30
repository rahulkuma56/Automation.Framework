package com.datepicker.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DatePickerPage;
import com.tests.BaseTest;

public class DatePickerTest extends BaseTest {
	@Test
	public  void datePicker() {
		try {
			test = extent.createTest("datePicker", "datePicker PASSED test case");
			DatePickerPage datePickerPage = PageFactory.initElements(driver, DatePickerPage.class);
			datePickerPage.datePicker.click();
			datePickerPage.bootstrapDatePicker.click();
			datePickerPage.datefield.sendKeys("28/08/1995");
			datePickerPage.datefield.sendKeys(Keys.ENTER);
			
		
		/*	assertTrue(datePickerPage.selectedDay.getText().equals("26"));
			assertTrue(datePickerPage.selectedMonth.getText().equals("Aug"));
			assertTrue(datePickerPage.selectedYear.getText().equals("1995"));*/
			//System.out.println("DatePicker is successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}

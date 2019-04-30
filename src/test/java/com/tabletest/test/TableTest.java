package com.tabletest.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.TablePage;
import com.tests.BaseTest;

public class TableTest extends BaseTest {
	@Test
	private void tableSortAndVerify() {
		// TODO Auto-generated method stub
		List obtainList = new ArrayList<String>();
		try {
			test = extent.createTest("datePicker", "datePicker PASSED test case");
			TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
			tablePage.table.click();
			tablePage.tableSortSearch.click();
			tablePage.salarySort.click();
			Assert.assertTrue(tablePage.sortTableAndVerify(tablePage.salary));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}

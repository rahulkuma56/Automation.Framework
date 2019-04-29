package com.dropdown.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.DragAndDropPAge;
import com.pages.DropDownPage;
import com.tests.BaseTest;

public class DropDownTest extends BaseTest {
	
	@Test(priority=1, enabled = true)
	public void selectOptionDropdown() {
		try {
			test = extent.createTest("selectOptionDropdown", "selectOptionDropdown PASSED test case");
			DropDownPage drpdwnpage = PageFactory.initElements(driver, DropDownPage.class);
			drpdwnpage.inputForm.click();
			drpdwnpage.selectDropdownList.click();
			drpdwnpage.selectDrpdwn(drpdwnpage.val1drpdwn).selectByValue("Monday");
			Assert.assertTrue(drpdwnpage.valSelected.getText().contains("Monday"));
			
			Select mulValdrpdwn=drpdwnpage.selectDrpdwn(drpdwnpage.multiVAldrpdwn);
			mulValdrpdwn.selectByValue("Texas");
			mulValdrpdwn.selectByValue("Florida");	
			assertTrue(drpdwnpage.mulSelected.getText().contains("Texas,Florida"), "Muliselect Assertion Values does not match");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
	}
	@Test(priority=1, enabled = true)
	public void selectMultiOptionDropdown() {
		try {
			test = extent.createTest("selectMultiOptionDropdown", "selectMultiOptionDropdown PASSED test case");
			DropDownPage drpdwnpage = PageFactory.initElements(driver, DropDownPage.class);
			drpdwnpage.inputForm.click();
			drpdwnpage.selectDropdownList.click();
			/*drpdwnpage.selectDrpdwn(drpdwnpage.val1drpdwn).selectByValue("Monday");
			Assert.assertTrue(drpdwnpage.valSelected.getText().contains("Monday"));
			*/
			Select mulValdrpdwn=drpdwnpage.selectDrpdwn(drpdwnpage.multiVAldrpdwn);
			mulValdrpdwn.selectByValue("Texas");
			mulValdrpdwn.selectByValue("Florida");	
			assertTrue(drpdwnpage.mulSelected.getText().contains("Texas,Florida"), "Muliselect Assertion Values does not match");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
	}
	

}

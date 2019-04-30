package com.AlertAndModel.test;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.AlertAndModelPage;
import com.pages.DatePickerPage;
import com.pages.DropDownPage;
import com.tests.BaseTest;

public class AlertAndModelTest extends BaseTest {

	@Test(priority = 5, enabled = true)
	public void windowPopUP() {
		try {
			test = extent.createTest("windowPopUP", "Windows Popup PASSED test case");
			AlertAndModelPage alertAndModelPage = PageFactory.initElements(driver, AlertAndModelPage.class);
			alertAndModelPage.alertsModals.click();
			alertAndModelPage.windowPopupModal.click();
			alertAndModelPage.twitter.click();
			System.out.println("Click on Window pop up Model");
			String parentWindow = driver.getWindowHandle();
			Set<String> allWindowHandles = driver.getWindowHandles();
			for (String Handle : allWindowHandles) {
				driver.switchTo().window(Handle);
				driver.manage().window().maximize();
				driver.getCurrentUrl();
				System.out.println("Switch to: " + Handle + driver.getCurrentUrl() + driver.getTitle());
				//System.out.println(driver.getPageSource());
				driver.close();
			}

		 driver.switchTo().window(parentWindow);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Test(priority=6)
	public void multipleWindowPopUps() throws Exception {
		try {
			test = extent.createTest("multipleWindowPopUps", "PASSED test case");
			AlertAndModelPage alertAndModelPage = PageFactory.initElements(driver, AlertAndModelPage.class);
			alertAndModelPage.alertsModals.click();
			alertAndModelPage.windowPopupModal.click();
			alertAndModelPage.alertsModals.click();
			alertAndModelPage.windowPopupModal.click();
			alertAndModelPage.twoPopUp.click();
			driver.findElement(By.xpath("//div[@class='two-windows']/a")).click();
			String parentWindow = driver.getWindowHandle();
			Set<String> allWindowHandles = driver.getWindowHandles();
			for (String Handle : allWindowHandles) {
				driver.switchTo().window(Handle);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.getCurrentUrl();
				System.out.println("Switch to:" + Handle + driver.getCurrentUrl() + driver.getTitle());
				//System.out.println(driver.getPageSource());
				driver.close();
			}

			driver.switchTo().window(parentWindow);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	
}

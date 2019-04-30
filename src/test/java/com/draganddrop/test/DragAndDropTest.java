package com.draganddrop.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.DragAndDropPAge;
import com.tests.BaseTest;

public class DragAndDropTest extends BaseTest {
	@Test(priority=10)
	public  void DragAndDrop() {
		try {
			test = extent.createTest("DragAndDrop", "DragAndDrop PASSED test case");
			DragAndDropPAge dragAndDropPAge = PageFactory.initElements(driver, DragAndDropPAge.class);
			dragAndDropPAge.other.click();
			
			dragAndDropPAge.dragandDrop.click();
			dragAndDropPAge.source.click();
			dragAndDropPAge.destination.click();
			dragAndDropPAge.performDragDrop();
			System.out.println("Darg and drop successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}


}

package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Expressage extends BaseTest{
	@Test
    public void expressage() throws InterruptedException {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'�̳�')]");
		webtest.click("xpath=//a[@href='/chanzhi/www/admin.php?m=product&f=setting']");
		webtest.click("xpath=//a[contains(.,'���')]");
	    webtest.type("xpath=//input[@name='children[1]']", "���1");
	    webtest.click("id=submit");
	}
}

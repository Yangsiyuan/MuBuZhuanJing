package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddSecuritycode extends BaseTest{
	@Test
    public void addscode() throws InterruptedException {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'��ȫ')]");
		webtest.click("xpath=//a[contains(.,'��֤������')]");
        webtest.type("id=question[]", "����1");
        webtest.type("id=answer[]", "��1");
        webtest.click("id=submit");
	}
}

package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddBlacklist extends BaseTest{
    @Test
    public void addblist() throws InterruptedException {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'��ȫ')]");
		webtest.click("xpath=//a[contains(.,'����������')]");
		webtest.click("xpath=//a[contains(.,'��Ӻ�����')]");
		Thread.sleep(1000);
		webtest.type("xpath=//input[@id='identity']","����Ա1");
		webtest.type("xpath=//input[@id='reason']", "ԭ��1");
		webtest.click("xpath=//select[@id='expired']");
		webtest.selectByIndex("id=expired", 2);
		webtest.enterClick();
		webtest.click("id=submit");
    }
}

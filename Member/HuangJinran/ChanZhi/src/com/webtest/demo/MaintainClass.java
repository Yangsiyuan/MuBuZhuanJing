package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class MaintainClass extends BaseTest{
    @Test
    public void maintanClass() throws InterruptedException {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'��Ʒ')]");
		webtest.click("xpath=//a[contains(.,'ά����Ŀ')]");
		webtest.type("xpath=//input[@name='children[1]']", "��Ŀ1");
		webtest.type("xpath=//input[@name='alias[1]']", "����1");
		webtest.type("xpath=//input[@name='children[2]']", "��Ŀ2");
		webtest.type("xpath=//input[@name='alias[2]']", "����2");
		webtest.click("id=submit");
		
    }
}

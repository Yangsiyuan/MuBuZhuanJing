package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddSetting extends BaseTest{
	int n=0;
    @Test
    public void addset() throws InterruptedException {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.click("xpath=//a[contains(.,'�ֲ�')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(@href,'/chanzhi/www/admin.php?m=book&f=setting')]");
		webtest.selectByIndex("xpath=//select[@id='index']",0);
		webtest.enterClick();
		if(n==0) {
			webtest.click("xpath=//input[contains(.,'��')]");
		}else if(n==1) {
			webtest.click("xpath=//input[contains(.,'��')]");
		}
		webtest.selectByIndex("xpath=//select[@id='chapter']", 0);
		webtest.click("id=submit");
    }
}

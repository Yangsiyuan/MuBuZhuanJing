package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class DataSettings extends BaseTest{
	@Test
	public void datasettings() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'�ƹ�')]");
		webtest.click("xpath=//a[contains(.,'ͳ��')]");
		webtest.click("xpath=//html/body/div/div/div/ul/li/a[contains(.,'����')]");
		webtest.typeAndClear("id=saveDays","30");
		webtest.typeAndClear("id=maxDays","60");
		webtest.click("id=submit");
		}

}

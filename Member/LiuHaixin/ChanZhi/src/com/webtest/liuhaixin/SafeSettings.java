package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SafeSettings extends BaseTest{
	@Test
	public void safeblack() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'վ��')]");
		webtest.click("xpath=//a[contains(.,'��ȫ')]");
		webtest.click("xpath=//a[contains(.,'����������')]");
		webtest.click("xpath=//a[contains(.,'��Ӻ�����')]");
		webtest.type("id=identity","���д�");
		webtest.type("id=reason","�������д�");
		webtest.click("//select[@id='expired']/option[@value='0']");
		
		webtest.click("id=submit");
		
		
		
	}
}

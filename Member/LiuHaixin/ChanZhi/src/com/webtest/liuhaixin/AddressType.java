package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddressType extends BaseTest{
	@Test
	public void addresstype() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.click("xpath=//a[contains(.,'��ַ����')]");
		webtest.click("id=requestType1");
		webtest.click("id=submit");
		/*����ԱȨ��*/
		}
}

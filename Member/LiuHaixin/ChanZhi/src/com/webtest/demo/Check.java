package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Check extends BaseTest{
	@Test
	public void check() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'վ��')]");
		webtest.click("xpath=//a[contains(.,'��ȫ')]");
		webtest.click("xpath=//a[contains(.,'��֤������')]");
		webtest.type("id=question[]","����˭");
		webtest.type("id=answer[]","������");
		webtest.click("id=submit");
		
		
		}

}

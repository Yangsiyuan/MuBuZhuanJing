package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Upload extends BaseTest{
	@Test
	public void upload() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'վ��')]");
		webtest.click("xpath=//a[contains(.,'��ȫ')]");
		webtest.click("xpath=//a[contains(.,'�����ϴ�')]");
		webtest.click("name=allowUpload");
		webtest.type("id=allowFiles","");
		webtest.click("id=submit");
		
		}

}

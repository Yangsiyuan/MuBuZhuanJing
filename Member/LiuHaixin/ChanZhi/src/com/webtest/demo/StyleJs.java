package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class StyleJs extends BaseTest{
	@Test
	public void stylejs() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'���')]");
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.click("class=panel-actions");
		webtest.click("xpath=//a[contains(.,'Javascript')]");
		webtest.type("class=ace_text-input","");
		webtest.click("id=submit");
		}

}

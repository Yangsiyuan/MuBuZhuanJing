package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddCompanyMessage extends BaseTest {
	@Test
	public void addMessage() throws InterruptedException {
		Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'վ��')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		webtest.click("xpath=//a[contains(.,'��˾')]");
		webtest.type("xpath=//*[@id=\"name\"]","����1");
		webtest.enterFrame(0);
		webtest.type("xpath=//html[@spellcheck='false']", "����1�ļ��");
		webtest.leaveFrame();
		webtest.enterFrame(1);
		webtest.type("xpath=//html[@spellcheck='false']", "����1������");
		webtest.leaveFrame();
		webtest.click("xpath=//*[@id=\"submit\"]");
	}
}

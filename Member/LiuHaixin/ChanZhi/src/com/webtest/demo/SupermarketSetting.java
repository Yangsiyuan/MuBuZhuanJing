package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SupermarketSetting extends BaseTest{
	@Test
	public void supermarketsetting() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'�̳�')]");
		webtest.click("xpath=//html/body/nav/div/ul/li/a[contains(.,'����')]");
		webtest.click("xpath=//a[contains(.,'���')]");
		webtest.type("name=children[1]","˳����");
		webtest.type("name=children[2]","Բͨ���");
		webtest.type("name=children[3]","��ͨ���");
		webtest.type("name=children[4]","�ϴ���");
		webtest.type("name=children[5]","������");
		webtest.click("id=submit");
		}
}

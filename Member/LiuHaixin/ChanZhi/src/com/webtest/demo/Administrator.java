package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Administrator extends BaseTest{
	@Test
	public void administrator() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.click("xpath=//a[contains(.,'��ȫ')]");
		webtest.click("xpath=//a[contains(.,'����Ȩ��')]");
		webtest.click("xpath=//a[contains(.,'�༭')]");
		webtest.typeAndClear("id=name","����Ա");
		webtest.typeAndClear("id=desc","ӵ�к�̨����Ȩ��");
		webtest.click("id=submit");
		}

}

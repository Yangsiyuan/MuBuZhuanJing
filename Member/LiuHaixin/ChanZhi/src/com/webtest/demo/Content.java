package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Content extends BaseTest{
	@Test
	public void content() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.click("xpath=//a[contains(.,'�ֲ�')]");
		webtest.type("id=author","");
		webtest.type("id=title", "�Զ�������");
		webtest.type("id=alias","www.hao123.com");
		webtest.type("id=keywords", "java�Զ�������");
		webtest.type("id=summary","Java�Զ���������Ҫ��������Java�����÷�");
		webtest.type("class=ke-edit-iframe","Java�Զ���������Ҫ��������Java�����÷�");
		webtest.click("id=submit");
	}
	
}

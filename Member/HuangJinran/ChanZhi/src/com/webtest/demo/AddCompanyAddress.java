package com.webtest.demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddCompanyAddress extends BaseTest{
	@Test
    public void addAddress() throws InterruptedException {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'վ��')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		webtest.click("xpath=//a[contains(.,'��˾')]");
		webtest.click("xpath=//a[contains(.,'��ϵ��ʽ')]");
		webtest.type("xpath=//*[@id=\"contacts\"]", "����Ա1");
		webtest.type("xpath=//*[@id=\"phone\"]", "123456");
		webtest.type("xpath=//*[@id=\"fax\"]", "chuanzhen");
		webtest.type("xpath=//*[@id=\"email\"]", "123456@qq.com");
		webtest.type("xpath=//*[@id=\"qq\"]", "123456");
		webtest.type("xpath=//*[@id=\"skype\"]", "skype");
		webtest.type("xpath=//*[@id=\"weixin\"]", "weixin");
		webtest.type("xpath=//*[@id=\"weibo\"]", "weibo");
		webtest.type("xpath=//*[@id=\"wangwang\"]", "wangwang");
		webtest.type("xpath=//*[@id=\"site\"]", "wangzhi");
		webtest.type("xpath=//*[@id=\"address\"]", "dizhi");
		webtest.click("xpath=//*[@id=\"submit\"]");
		Reporter.log("�����ϵ��ʽ");
    }
}

package com.webtest.htmlunit_demo;
import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;
import com.webtest.core.HtmlUnit;
import com.webtest.utils.Common;
import com.webtest.utils.ReadPro;

import net.sf.json.JSONObject;
public class Scene3 {
	@Test(priority=0)
	public void address_list() throws IOException, Exception{
	Set<Cookie> cookie = Common.getLoginCookie();
	String result = HtmlUnit.doGetByCookie(ReadPro.getProValue("url")+"/fgadmin/address/list",cookie);
	System.out.println(result);
}
	@Test(priority=1)
	public void addAdress() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		
		address.element("receiverName", "����");
		address.element("cellPhone", "20000000004");
		address.element("addressDetail", "�Ͼ���ѧ");
		address.element("province", "����ʡ");
		address.element("city", "�Ͼ���");
		address.element("area", "��¥��");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test(priority=2)
	public void transportfee() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/getTransportFee?id=1&addressDetail=����ʡ_�Ͼ���_��¥��");
		System.out.println(result);
	}
	@Test(priority=3)
	public void submit() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "1");
		submit.element("receiverName","����");
		submit.element("cellPhone","20000000004");
		submit.element("addressDetail", "�Ͼ���ѧ");	
		submit.element("transportFee","7.0");
		submit.element("province", "����ʡ");
		submit.element("city", "�Ͼ���");
		submit.element("area", "��¥��");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
}

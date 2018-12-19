package com.webtest.htmlunit_demo;

import java.util.Set;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;
import com.webtest.core.HtmlUnit;
import com.webtest.utils.Common;

import net.sf.json.JSONObject;
/*���ߣ����*/
public class Post_Address_new {
	@Test
	public void addAdress_success1() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail0() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
	
		address.element("receiverName", 123);
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail1() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", 123);
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail2() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", 123);
		address.element("province", "�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail3() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", 123456);
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province","�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail4() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail",123);
		address.element("province","�㽭ʡ");
		address.element("city", "������");
		address.element("area","������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail5() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province",571);
		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail6() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province","�㽭ʡ");
		address.element("city", 571);
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail7() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
	
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province","�㽭ʡ");
		address.element("city", "������");
		address.element("area", 571);
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail8() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
	

		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province","�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail9() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
	
		address.element("receiverName", "����");

		address.element("addressDetail", "�㽭��ѧ");
		address.element("province","�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail10() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
	
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		
		address.element("province","�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail11() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");

		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail12() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province","�㽭ʡ");

		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail13() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province","�㽭ʡ");
		address.element("city", "������");

		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_success2() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		
		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "������ѧ");
		address.element("province","�Ϻ���");
		address.element("city", "�Ϻ���");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail14() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�Ͼ���ѧ");
		address.element("province","����ʡ");
		address.element("city", "�Ͼ���");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail15() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�Ͼ���ѧ");
		address.element("province","�㽭ʡ");
		address.element("city", "�Ͼ���");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail16() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�Ͼ���ѧ");
		address.element("province","����ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail17() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�Ͼ���ѧ");
		address.element("province","����ʡ");
		address.element("city", "�Ͼ���");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail18() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province","�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail19() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "����");
		address.element("cellPhone", "12345678902");
		address.element("addressDetail", "�㽭��ҵ��ѧ");
		address.element("province","�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail20() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "�㽭��ѧ");
		address.element("province","�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail21() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
	
		address.element("receiverName", "����");
		address.element("cellPhone", "null");
		address.element("addressDetail", "�㽭��ҵ��ѧ");
		address.element("province","�㽭ʡ");
		address.element("city", "������");
		address.element("area", "������");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
}

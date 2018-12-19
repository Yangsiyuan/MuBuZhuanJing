package com.edu.interfacetest;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.edu.core.HttpDriver;

import net.sf.json.JSONObject;

public class AddressTest { 
	String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
	String result=null;
	String phoneArea=null; 
	String phoneNumber=null;
	String password=null;
    public String addAdsTest(String id,String receiverName,String cellPhone,String province,String city,String area,String addressDetail) throws Exception {
    	JSONObject para=new JSONObject();
    	para.element("id",id);
    	para.element("receiverName", receiverName);
    	para.element("cellPhone", cellPhone);
    	para.element("province",province);
    	para.element("city", city);
    	para.element("area", area);
    	para.element("addressDetail", addressDetail);

    	result=HttpDriver.doPost(url, para);
    	System.out.println(result);
		return result;
    	
    }
	@Test(priority=1)
	public void addAdress_fail() throws Exception {
		CookieStore cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";

		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "����");
		address.element("cellPhone", "18788990011");
		address.element("province", "������");
		address.element("city", "������");
		address.element("area", "");
		address.element("addressDetail", "��ɽ·125��");
		String result = HttpDriver.doPost(url, address, cookie);
		System.out.println(result);

	}
}

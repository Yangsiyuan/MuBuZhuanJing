package com.edu.interfacetest;

import org.apache.http.client.CookieStore;

import com.edu.core.HttpDriver;

import net.sf.json.JSONObject;

public class DeleteAddress {
public void addAdress() throws Exception {
		
		CookieStore cookie = Common.getLoginCookie();

		String url = "http://study-perf.qa.netease.com/fgadmin/address/delete";

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

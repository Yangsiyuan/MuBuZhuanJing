package com.webtest.htmlunit_demo;
import java.io.IOException;
import java.net.URL;


import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.HttpMethod;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.WebResponse;

import com.webtest.utils.ReadPro;
public class Scene5 {
	@Test(priority=0)
	public void login() throws IOException, Exception {
		WebClient lgin=new WebClient();
		String url=ReadPro.getProValue("url") + "/common/fgadmin/login";
		WebRequest request=new WebRequest(new URL(url),HttpMethod.POST);
		lgin.addRequestHeader("Content-Type", "application/json");
		request.setRequestBody("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}");
		Page l_gin=lgin.getPage(request);
		WebResponse response=l_gin.getWebResponse();
		String result=response.getContentAsString();
		System.out.println(result);
		
	}
	@Test(priority=1)
	public void address_list() throws IOException, Exception{
	WebClient addresslist=new WebClient();
	String url=ReadPro.getProValue("url")+"/fgadmin/address/list";
	WebRequest request=new WebRequest(new URL(url),HttpMethod.GET);
	addresslist.addRequestHeader("Content-Type", "application/json");
	Page a_list=addresslist.getPage(request);
	WebResponse response=a_list.getWebResponse();
	String result=response.getContentAsString();
	System.out.println(result);
	}
	@Test(priority=2)
	public void addressnew() throws IOException, Exception {
		WebClient addnew=new WebClient();
		String url=ReadPro.getProValue("url") + "/common/fgadmin/login";
		WebRequest request=new WebRequest(new URL(url),HttpMethod.POST);
		addnew.addRequestHeader("Content-Type", "application/json");
		request.setRequestBody("{\"receiverName\":\"����\",\"cellPhone\":\"20000000004\",\"addressDetail\":\"�Ͼ���ѧ\"},\"province\":\"����ʡ\",\"city\":\"�Ͼ���\",\"area\":\"��¥��\"");
		Page add_new=addnew.getPage(request);
		WebResponse response=add_new.getWebResponse();
		String result=response.getContentAsString();
		System.out.println(result);
		
	}
	@Test(priority=3)
	public void transportfee() throws Exception {
		WebClient tsfee=new WebClient();
		String url=ReadPro.getProValue("url")+"/common/getTransportFee?id=1&addressDetail=����ʡ_�Ͼ���_��¥��";
		WebRequest request=new WebRequest(new URL(url),HttpMethod.GET);
		tsfee.addRequestHeader("Content-Type", "application/json");
		Page ts_fee=tsfee.getPage(request);
		WebResponse response=ts_fee.getWebResponse();
		String result=response.getContentAsString();
		System.out.println(result);
		
	}
	@Test(priority=4)
	public void submit() throws Exception {
		WebClient smit=new WebClient();
		String url=ReadPro.getProValue("url")+"/common/getTransportFee?id=1&addressDetail=�㽭ʡ_������_������";
		WebRequest request=new WebRequest(new URL(url),HttpMethod.POST);
		smit.addRequestHeader("Content-Type", "application/json");
		request.setRequestBody("{\"skulds\":\"1\",\"receiverName\":\"����\",\"cellPhone\":\"20000000004\",\"addressDetail\":\"�Ͼ���ѧ\",\"province\":\"����ʡ\",\"city\":\"�Ͼ���\",\"area\":\"��¥��\",\"transportFee\":\"7.0\"}");
		Page s_mit=smit.getPage(request);
		WebResponse response=s_mit.getWebResponse();
		String result=response.getContentAsString();
		System.out.println(result);
	}
}
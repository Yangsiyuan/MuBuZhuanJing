package com.webtest.htmlunit_demo;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.HttpMethod;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.webtest.utils.ReadPro;

public class Scene2 {
	@Test(priority=0)
	//登陆成功
	public void login() throws IOException, Exception {
		WebClient login = new WebClient();
		String url = ReadPro.getProValue("url")+"/common/fgadmin/login";
		WebRequest request = new WebRequest(new URL(url),HttpMethod.POST);
		login.addRequestHeader("Content-Type", "application/json");
		request.setRequestBody("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\",\"password\":\"netease123\"}");
		Page lo_gin=login.getPage(request);
		WebResponse response=lo_gin.getWebResponse();
		String result=response.getContentAsString();
		System.out.println(result);
	}
	@Test(priority=1)
	//查询收货地址
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
	//计算运费
	public void transportfee() throws Exception {
		WebClient tsfee=new WebClient();
		String url=ReadPro.getProValue("url")+"/common/getTransportFee?id=1&addressDetail=浙江省_杭州市_西湖区";
		WebRequest request=new WebRequest(new URL(url),HttpMethod.GET);
		tsfee.addRequestHeader("Content-Type", "application/json");
		Page ts_fee=tsfee.getPage(request);
		WebResponse response=ts_fee.getWebResponse();
		String result=response.getContentAsString();
		System.out.println(result);
		
	}
	@Test(priority=3)
	//提交订单
	public void submit() throws Exception {
		WebClient smit=new WebClient();
		String url=ReadPro.getProValue("url")+"/common/getTransportFee?id=1&addressDetail=浙江省_杭州市_西湖区";
		WebRequest request=new WebRequest(new URL(url),HttpMethod.POST);
		smit.addRequestHeader("Content-Type", "application/json");
		request.setRequestBody("{\"skulds\":\"1\",\"receiverName\":\"张三\",\"cellPhone\":\"20000000000\",\"addressDetail\":\"浙江大学\",\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":\"西湖区\",\"transportFee\":\"6.0\"}");
		Page s_mit=smit.getPage(request);
		WebResponse response=s_mit.getWebResponse();
		String result=response.getContentAsString();
		System.out.println(result);
	}
}

package com.webtest.httpclient_demo;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

/*
 * ���ߣ�������
 * */

public class SkuList extends BaseTest{
	CloseableHttpClient httpclient;
	CloseableHttpResponse response;

	//��ȡ������Ʒ��sku�б�ɹ�
	@Test
	public void TestSkuList1() throws Exception {
		try {
			httpclient=HttpClients.createDefault();
			HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/common/skuList");
			response = httpclient.execute(httpGet);
			System.out.println(response.getStatusLine());
			httpGet.setHeader("Content-Type", "application/json");
			HttpEntity entity=response.getEntity();
			if(entity !=null) {
				System.out.println(EntityUtils.toString(entity,"UTF-8"));
			}
			EntityUtils.consume(entity);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			response.close();
			httpclient.close();
		}	
	}

	//��ȡgoodsId=1����Ʒsku��Ϣ�ɹ�
	@Test
	public void TestSkuList2() throws Exception {
		try {
			httpclient=HttpClients.createDefault();
			HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/common/skuList?goodsId=1");
			response = httpclient.execute(httpGet);
			System.out.println(response.getStatusLine());
			httpGet.setHeader("Content-Type", "application/json");
			HttpEntity entity=response.getEntity();
			if(entity !=null) {
				System.out.println(EntityUtils.toString(entity,"UTF-8"));
			}
			EntityUtils.consume(entity);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			response.close();
			httpclient.close();
		}	
	}

	//��ȡgoodsId=2147483648����Ʒsku��Ϣʧ��(����int���ȡֵ��Χ)
	@Test
	public void TestSkuList3() throws Exception {
		try {
			httpclient=HttpClients.createDefault();
			HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/common/skuList?goodsId=2147483648");
			response = httpclient.execute(httpGet);
			System.out.println(response.getStatusLine());
			httpGet.setHeader("Content-Type", "application/json");
			HttpEntity entity=response.getEntity();
			if(entity !=null) {
				System.out.println(EntityUtils.toString(entity,"UTF-8"));
			}
			EntityUtils.consume(entity);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			response.close();
			httpclient.close();
		}	
	}

	//��ȡgoodsId�����ڵ���Ʒʧ��
	@Test
	public void TestSkuList4() throws Exception {
		try {
			httpclient=HttpClients.createDefault();
			HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/common/skuList?goodsId=9999");
			response = httpclient.execute(httpGet);
			System.out.println(response.getStatusLine());
			httpGet.setHeader("Content-Type", "application/json");
			HttpEntity entity=response.getEntity();
			if(entity !=null) {
				System.out.println(EntityUtils.toString(entity,"UTF-8"));
			}
			EntityUtils.consume(entity);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			response.close();
			httpclient.close();
		}	
	}
	
	//goodsId���Ͳ���ȷ
	@Test
	public void TestSkuList5() throws Exception {
		try {
			httpclient=HttpClients.createDefault();
			HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/common/skuList?goodsId='1'");
			response = httpclient.execute(httpGet);
			System.out.println(response.getStatusLine());
			httpGet.setHeader("Content-Type", "application/json");
			HttpEntity entity=response.getEntity();
			if(entity !=null) {
				System.out.println(EntityUtils.toString(entity,"UTF-8"));
			}
			EntityUtils.consume(entity);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			response.close();
			httpclient.close();
		}	
	}

}


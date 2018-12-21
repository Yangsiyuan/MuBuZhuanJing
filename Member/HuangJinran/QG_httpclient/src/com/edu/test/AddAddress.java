package com.edu.test;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

/*
 * ���ߣ����Ȼ
 * */

public class AddAddress extends BaseTest{
	CloseableHttpClient httpclient;
	CloseableHttpResponse response;

	//����ջ���ַ�ɹ�
	@Test
	public void TestAdd1() throws Exception {
		try {
			httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
			
    		//httpclient=HttpClients.createDefault();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"�㽭��ѧ\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\":\"������\"}","utf-8");
    		httpPost.setEntity(entity);
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		System.out.println(EntityUtils.toString(httpEntity));
    		EntityUtils.consume(httpEntity);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//����ջ���ַʧ�ܣ�receiveName�������Ͳ���ȷ
	@Test
	public void TestAdd2() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":123,\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"�㽭��ѧ\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\":\"������\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	   	}catch(Exception e) {
	   		e.printStackTrace();
	   	}
	}
	
	//����ջ���ַʧ�ܣ�cellPhone�������Ͳ���ȷ
	@Test
	public void TestAdd3() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":12345678901,"+"\"addressDetail\":\"�㽭��ѧ\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\":\"������\"}","utf-8");
    		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
	   	}
	}
		
	//����ջ���ַʧ�ܣ�addressDetail�������Ͳ���ȷ
	@Test
	public void TestAdd4() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":123,\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\":\"������\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	   	}catch(Exception e) {
	   		e.printStackTrace();
	   	}
	}
	
	//����ջ���ַʧ�ܣ�province�������Ͳ���ȷ
	@Test
	public void TestAdd5() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"�㽭��ѧ\",\"province\":571,\"city\":\"������\",\"area\":\"������\"}","utf-8");
    		httpPost.setEntity(entity);
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		System.out.println(EntityUtils.toString(httpEntity));
    		EntityUtils.consume(httpEntity);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
		
	//����ջ���ַʧ�ܣ�city�������Ͳ���ȷ
	@Test
	public void TestAdd6() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"�㽭��ѧ\",\"province\":\"�㽭ʡ\",\"city\":571,\"area\":\"������\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	   	}catch(Exception e) {
	   		e.printStackTrace();
	   	}
	}
		
	//����ջ���ַʧ�ܣ�area�������Ͳ���ȷ
	@Test
	public void TestAdd7() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"�㽭��ѧ\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\":571}","utf-8");
    		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
	   	}
	}
			
	//����ջ���ַʧ�ܣ�ȱ��receiverName����
	@Test
	public void TestAdd8() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"�㽭��ѧ\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\":\"������\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	   	}catch(Exception e) {
	   		e.printStackTrace();
	   	}
	}
	
	//����ջ���ַʧ�ܣ�ȱ��cellPhone����
	@Test
	public void TestAdd9() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"����\","+"\"addressDetail\":\"�㽭��ѧ\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\":\"������\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	   	}catch(Exception e) {
	   		e.printStackTrace();
	   	}
	}

	//����ջ���ַʧ�ܣ�ȱ��addressDetail����
	@Test
	public void TestAdd10() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"province\":\"�㽭ʡ\""+",\"city\":\"������\",\"area\":\"������\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//����ջ���ַʧ�ܣ�ȱ��province����
	@Test
	public void TestAdd11() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"�㽭��ѧ\""+",\"city\":\"������\",\"area\":\"������\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}	
	
	//����ջ���ַʧ�ܣ�ȱ��city����
	@Test
	public void TestAdd12() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"�㽭��ѧ\""+",\"province\":\"�㽭ʡ\",\"area\":\"������\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//����ջ���ַʧ�ܣ�ȱ��area����
	@Test
	public void TestAdd13() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"�㽭��ѧ\""+",\"province\":\"�㽭ʡ\",\"city\":\"������\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}	
	
	//����ջ���ַ�ɹ�,ֱϽ��
	@Test
	public void TestAdd14() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"������ѧ\""+",\"province\":\"�Ϻ���\",\"city\":\"�Ϻ���\",\"area\":\"������\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}	
	
	//����ջ���ַʧ�ܣ�����ƥ��
	@Test
	public void TestAdd15() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"�Ͼ���ѧ\""+",\"province\":\"����ʡ\",\"city\":\"�Ͼ���\",\"area\":\"������\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}	
	
	//����ջ���ַʧ�ܣ��в�ƥ��
	@Test
	public void TestAdd16() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"�Ͼ���ѧ\""+",\"province\":\"�㽭ʡ\",\"city\":\"�Ͼ���\",\"area\":\"������\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}	

	//����ջ���ַʧ�ܣ��С�����ƥ��
	@Test
	public void TestAdd17() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"�Ͼ���ѧ\""+",\"province\":\"����ʡ\",\"city\":\"������\",\"area\":\"������\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}		

	//����ջ���ַʧ�ܣ�ʡ������ƥ��
	@Test
	public void TestAdd18() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"�Ͼ���ѧ\""+",\"province\":\"����ʡ\",\"city\":\"�Ͼ���\",\"area\":\"������\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}	
	
	//����ջ���ַʧ�ܣ�����Ѵ��ڵ��ջ���ַ
	@Test
	public void TestAdd19() throws Exception {
		try {
	    	httpclient=HttpClients.createDefault();
	    	HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	    	HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	    	httpPost.setHeader("Content-Type", "application/json");
	    	StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"�㽭��ѧ\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\":\"������\"}","utf-8");
	    	httpPost.setEntity(entity);
	    	response=httpclient.execute(httpPost);
	    	httpclient=HttpClients.createDefault();
	    	HttpPost httpPost2=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	    	httpPost2.setHeader("Content-Type", "application/json");
	    	StringEntity entity2=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"�㽭��ѧ\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\":\"������\"}","utf-8");
	    	httpPost2.setEntity(entity2);
	    	response=httpclient.execute(httpPost2);
	    	HttpEntity httpEntity=response.getEntity();
	    	System.out.println(EntityUtils.toString(httpEntity));
	    	EntityUtils.consume(httpEntity);
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
		
	//����ջ���ַʧ�ܣ���ӳ���6���ջ���ַ
	@Test
	public void TestAdd20() throws Exception {
		try {
		   	httpclient=HttpClients.createDefault();
		   	HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
		   	HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
		   	httpPost.setHeader("Content-Type", "application/json");
		   	StringEntity entity=new StringEntity("{\"receiverName\":\"�Ŵ�\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"�Ͼ���ѧ\""+",\"province\":\"����ʡ\",\"city\":\"�Ͼ���\",\"area\":\"������\"}","utf-8");
		   	httpPost.setEntity(entity);
		   	httpclient=HttpClients.createDefault();
		   	HttpPost httpPost2=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
		   	httpPost2.setHeader("Content-Type", "application/json");
		   	StringEntity entity2=new StringEntity("{\"receiverName\":\"�Ŷ�\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"�Ͼ���ѧ\""+",\"province\":\"����ʡ\",\"city\":\"�Ͼ���\",\"area\":\"������\"}","utf-8");
		   	httpPost.setEntity(entity2);
		   	httpclient=HttpClients.createDefault();
		   	HttpPost httpPost3=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
		   	httpPost3.setHeader("Content-Type", "application/json");
		   	StringEntity entity3=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"�Ͼ���ѧ\""+",\"province\":\"����ʡ\",\"city\":\"�Ͼ���\",\"area\":\"������\"}","utf-8");
		   	httpPost.setEntity(entity3);
		   	httpclient=HttpClients.createDefault();
		   	HttpPost httpPost4=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
		   	httpPost4.setHeader("Content-Type", "application/json");
		   	StringEntity entity4=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"�Ͼ���ѧ\""+",\"province\":\"����ʡ\",\"city\":\"�Ͼ���\",\"area\":\"������\"}","utf-8");
		   	httpPost.setEntity(entity4);
		   	httpclient=HttpClients.createDefault();
		   	HttpPost httpPost5=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
		   	httpPost5.setHeader("Content-Type", "application/json");
		   	StringEntity entity5=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"�Ͼ���ѧ\""+",\"province\":\"����ʡ\",\"city\":\"�Ͼ���\",\"area\":\"������\"}","utf-8");
		   	httpPost.setEntity(entity5);
		   	httpclient=HttpClients.createDefault();
		   	HttpPost httpPost6=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
		   	httpPost6.setHeader("Content-Type", "application/json");
		   	StringEntity entity6=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"�Ͼ���ѧ\""+",\"province\":\"����ʡ\",\"city\":\"�Ͼ���\",\"area\":\"������\"}","utf-8");
		   	httpPost.setEntity(entity6);
		   	response=httpclient.execute(httpPost6);
		   	HttpEntity httpEntity=response.getEntity();
		   	System.out.println(EntityUtils.toString(httpEntity));
		   	EntityUtils.consume(httpEntity);
	     }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
	
	//δ��¼ʱ����ջ���ַ
	@Test
	public void TestAdd21() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"�㽭��ѧ\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\":\"������\"}","utf-8");
    		httpPost.setEntity(entity);
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		System.out.println(EntityUtils.toString(httpEntity));
    		EntityUtils.consume(httpEntity);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//����ջ���ַʧ�ܣ�receiverName����Ϊ����
	@Test
	public void TestAdd22() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"�㽭��ѧ\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\":\"������\"}","utf-8");
    		httpPost.setEntity(entity);
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		System.out.println(EntityUtils.toString(httpEntity));
    		EntityUtils.consume(httpEntity);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//����ջ���ַʧ�ܣ�cellPhone����Ϊnull
	@Test
	public void TestAdd23() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"����\",\"cellPhone\":,"+"\"addressDetail\":\"�㽭��ѧ\",\"province\":\"�㽭ʡ\",\"city\":\"������\",\"area\":\"������\"}","utf-8");
    		httpPost.setEntity(entity);
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		System.out.println(EntityUtils.toString(httpEntity));
    		EntityUtils.consume(httpEntity);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
}

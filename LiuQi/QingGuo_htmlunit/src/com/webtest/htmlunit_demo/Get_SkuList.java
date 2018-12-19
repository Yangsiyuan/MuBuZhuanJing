package com.webtest.htmlunit_demo;
/*
 * ���ߣ�����
 * �������ݣ���ȡָ����Ʒ��sku��Ϣ���ڿ���̨�ɹ���ӡsku��Ϣ 
 * */

import org.testng.annotations.Test;

import com.webtest.core.HtmlUnit;
import com.webtest.utils.ReadPro;

public class Get_SkuList {
	@Test
	public void skulist_success1() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/skuList");
		System.out.println(result);
	}
	@Test
	public void skulist_success2() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/skuList","goodsId=1");
		System.out.println(result);
	}
	@Test
	public void skulist_fail1() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/skuList","goodsId=2147483648");
		System.out.println(result);
	}
	@Test
	public void skulist_fail2() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/skuList","goodsId=9999");
		System.out.println(result);
	}
	@Test
	public void skulist_fail3() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/skuList","goodsId=\'1\'");
		System.out.println(result);
	}
}

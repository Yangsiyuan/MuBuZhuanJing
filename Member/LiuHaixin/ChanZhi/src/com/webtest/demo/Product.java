package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Product extends BaseTest{
	@Test
	public void product() throws Exception{
		/*��½ϵͳ��̨*/
		Back_Login.backLogin();
		/*ѡ��Ŀ��*/
		webtest.click("xpath=//a[contains(.,'�̳�')]");
		webtest.click("xpath=//a[contains(.,'��Ʒ')]");
		webtest.click("class=icon-plus");
		
		/*�����Ŀ*/
		webtest.type("class=children[1]", "��");
		webtest.type("class=alias[1]", "��");
		webtest.type("class=children[2]", "ʳ");
		webtest.type("class=alias[2]", "��");
		webtest.type("class=children[3]", "ס");
		webtest.type("class=alias[3]", "˯");
		webtest.type("class=children[4]", "��");
		webtest.type("class=alias[4]", "��");
		webtest.click("id=submit");
		
		/*������Ӳ�Ʒ*/
		webtest.click("class=icon icon-reply");
		webtest.click("class=icon-plus");
		
		/*��Ӳ�Ʒ����*/
		webtest.type("class=default","ʳ");
		webtest.type("id=name","����");
		webtest.type("id=titleColor","#000000");
		webtest.type("id=order","");
		webtest.type("id=alias","noodles");
		webtest.type("id=mall","www.taobao.com");
		webtest.type("id=keywords","����");
		webtest.type("class=article-content","����");
		webtest.type("class=ke-edit-iframe","ȫ��������������");
		webtest.type("id=brand","��ʦ��");
		webtest.type("id=model","����");
		webtest.type("id=color","��ɫ");
		webtest.type("id=amount","10000");
		webtest.type("id=origin","�ӱ�");
		webtest.type("id=uint","ʦ����ѧ");
		webtest.type("id=price","100");
		webtest.type("id=promotion","60");
		webtest.type("id=label[0]","��ɫ");
		webtest.type("id=value[0]","�غ�ɫ");
		webtest.click("class=icon-plus");
		webtest.type("id=lobel[1]","�۸�");
		webtest.type("id=value[1]","86");
		webtest.click("id=submit");
		
		}
}

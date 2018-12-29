package com.tydk.crm.dubboTest.provider;

import com.tydk.crm.dubboTest.DemoService;
public class DemoServiceImpl implements DemoService{

	@Override
	public String sayHello(String name) {
		
		return "Hello" + name;
	}

}

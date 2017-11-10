package cn.tiny77.provider.service;

import com.alibaba.dubbo.config.annotation.Service;

import cn.tiny77.provider.api.DemoService;

@Service(version = "1.0", group = "gb")
public class DemoServiceImpl2 implements DemoService {
	public String sayHello(String name) {
		return "Hello " + name + "g(b)";
	}
}
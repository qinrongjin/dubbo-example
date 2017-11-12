package cn.tiny77.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.tiny77.provider.api.AsyncService;
import cn.tiny77.provider.api.AttachMentService;
import cn.tiny77.provider.api.CacheService;
import cn.tiny77.provider.api.DemoService;
import cn.tiny77.provider.api.ValidateService;

@Component
public class App {
	
	@Reference(version = "1.0", group = "ga")
	DemoService demoService;
	
	@Reference(version = "1.0", group = "gb")
	DemoService demoService2;
	
	@Reference(validation = "true")
	ValidateService validateService;
	
	@Reference(cache = "lru")
	CacheService cacheService;
	
	@Reference
	AttachMentService attachMentService;
	
	@Reference(async = true, timeout = 10000)
	AsyncService asyncService;
	
	
	
	public static void main(String[] args) throws Throwable{
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        App app = (App) context.getBean("app");
        System.out.println(app.demoService.sayHello("dsds"));
	}
}

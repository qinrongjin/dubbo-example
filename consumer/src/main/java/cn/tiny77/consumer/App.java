package cn.tiny77.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.tiny77.provider.api.CacheService;
import cn.tiny77.provider.api.DemoService;
import cn.tiny77.provider.api.ValidateService;

@Component
public class App {
	
	@Reference(version = "1.0", group = "ga")
	private DemoService demoService;
	
	@Reference(version = "1.0", group = "gb")
	private DemoService demoService2;
	
	@Reference(validation = "true")
	private ValidateService validateService;
	
	@Reference(cache = "lru")
	private CacheService cacheService;
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        App app = (App) context.getBean("app");
        System.out.println(app.cacheService.getUserName(2));
        System.out.println(app.cacheService.getUserName(2));
        System.out.println(app.cacheService.getUserName(3));
	}
}

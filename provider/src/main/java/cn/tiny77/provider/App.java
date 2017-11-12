package cn.tiny77.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
        context.start();
        System.out.println("run ning");
        System.in.read(); // 按任意键退出
	}

}

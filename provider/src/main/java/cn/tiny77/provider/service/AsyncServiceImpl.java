package cn.tiny77.provider.service;

import com.alibaba.dubbo.config.annotation.Service;

import cn.tiny77.provider.api.AsyncService;

@Service
public class AsyncServiceImpl implements AsyncService{

	@Override
	public String justRun() {
		try {
			Thread.sleep(5000);
			return "is running";
		} catch (Exception e) {
			throw new RuntimeException("sleep fail");
		}
	}

}

package cn.tiny77.provider.service;

import com.alibaba.dubbo.config.annotation.Service;

import cn.tiny77.provider.api.StubService;

@Service
public class StubServiceImpl implements StubService {

	@Override
	public String exe() {
		System.out.println("stub running in server");
		return "run it";
	}

}

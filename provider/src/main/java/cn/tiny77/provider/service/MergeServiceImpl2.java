package cn.tiny77.provider.service;

import com.alibaba.dubbo.config.annotation.Service;

import cn.tiny77.provider.api.MergeService;

@Service(group = "n2")
public class MergeServiceImpl2 implements MergeService {

	@Override
	public String sayHi() {
		return "hi two";
	}

}
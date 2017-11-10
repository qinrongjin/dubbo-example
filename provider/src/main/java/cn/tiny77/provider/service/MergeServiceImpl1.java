package cn.tiny77.provider.service;

import com.alibaba.dubbo.config.annotation.Service;

import cn.tiny77.provider.api.MergeService;

@Service(group = "n1")
public class MergeServiceImpl1 implements MergeService {

	@Override
	public String sayHi() {
		return "hi one";
	}

}

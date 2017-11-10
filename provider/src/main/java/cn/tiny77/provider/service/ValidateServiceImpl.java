package cn.tiny77.provider.service;

import javax.validation.Valid;

import com.alibaba.dubbo.config.annotation.Service;

import cn.tiny77.provider.api.ValidateService;
import cn.tiny77.provider.vo.Person;

@Service
public class ValidateServiceImpl implements ValidateService {

	@Override
	public String getToString(@Valid Person person) {
		return person.toString();
	}

	
	
}

package cn.tiny77.provider.api;

import javax.validation.Valid;

import cn.tiny77.provider.vo.Person;

public interface ValidateService {

	String getToString(@Valid Person person);
	
}

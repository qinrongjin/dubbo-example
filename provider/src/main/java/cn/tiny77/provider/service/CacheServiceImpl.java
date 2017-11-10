package cn.tiny77.provider.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.dubbo.config.annotation.Service;

import cn.tiny77.provider.api.CacheService;

@Service
public class CacheServiceImpl implements CacheService{

	Log logger = LogFactory.getLog(CacheServiceImpl.class);
	
	@Override
	public String getUserName(Integer uid) {
		logger.info("用户请求:" + uid);
		return uid + "haha";
	}

}

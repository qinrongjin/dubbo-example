package cn.tiny77.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;

import cn.tiny77.provider.api.AttachMentService;

@Service
public class AttachMentServiceImpl implements AttachMentService{
	
	@Override
	public String getAttachMent() {
		String att = RpcContext.getContext().getAttachment("att");
		return att;
	}

}

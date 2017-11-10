package cn.tiny77.consumer.merger;

import com.alibaba.dubbo.rpc.cluster.Merger;

public class StringMerger implements Merger<String>{

	@Override
	public String merge(String... items) {
		StringBuilder stringBuilder = new StringBuilder();
		for (String string: items) {
			stringBuilder.append(string).append(" ");
		}
		return stringBuilder.toString();
	}

}

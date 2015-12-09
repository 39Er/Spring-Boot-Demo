package com.liuwm.boot.my_app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisExample {
	private StringRedisTemplate template;
	@Autowired
	public RedisExample(StringRedisTemplate template) {
	this.template = template;
	}
	// ...
}

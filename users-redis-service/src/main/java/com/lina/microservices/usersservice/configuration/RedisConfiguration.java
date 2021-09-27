package com.lina.microservices.usersservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
//@EnableRedisRepositories
public class RedisConfiguration {

	@Bean
	LettuceConnectionFactory getConnectionFactory() {
		LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory("redis", 6379);
		return lettuceConnectionFactory;
	}

	@Bean
	RedisTemplate<String, Object> redisTemplate() {
	    RedisTemplate<String, Object> template = new RedisTemplate<>();
	    template.setConnectionFactory(getConnectionFactory());
	    return template;
	}
	
}

package com.lukeshannon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@Configuration
@Profile("dev")
public class RedisDevConfig {
	
	private static final Logger log = LoggerFactory.getLogger(RedisDevConfig.class);
	
	@Bean
	RedisConnectionFactory connectionFactory(@Value("${installed.redis.port}") final int redisPort,@Value("${installed.redis.host}") String host) {
		log.info("Connecting to the the Installed Redis on ports: " + redisPort);
		JedisConnectionFactory connectionFactory = new JedisConnectionFactory();
		connectionFactory.setHostName(host);
		connectionFactory.setPort(redisPort);
		return connectionFactory;
	}

}

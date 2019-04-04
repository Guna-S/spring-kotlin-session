package com.rmurugaian.spring.springkotlinsession

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisStandaloneConfiguration
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.session.data.redis.config.annotation.web.server.EnableRedisWebSession

@Configuration
@EnableRedisWebSession
class RedisConfig {

    @Value("\${REDIS_HOST}")
    var host: String = "localhost"

    @Value("\${REDIS_PORT}")
    var port: Int = 6379

    @Bean
    fun redisConnectionFactory(): LettuceConnectionFactory {

        println("******************** $host ******************* $port")

        return LettuceConnectionFactory(RedisStandaloneConfiguration(host, port))
    }
}
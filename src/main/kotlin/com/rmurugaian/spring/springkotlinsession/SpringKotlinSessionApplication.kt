package com.rmurugaian.spring.springkotlinsession

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.session.config.annotation.web.server.EnableSpringWebSession

@SpringBootApplication
@EnableSpringWebSession
class SpringKotlinSessionApplication

fun main(args: Array<String>) {
    runApplication<SpringKotlinSessionApplication>(*args)
}

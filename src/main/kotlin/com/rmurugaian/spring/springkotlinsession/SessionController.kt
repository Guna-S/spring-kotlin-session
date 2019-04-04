package com.rmurugaian.spring.springkotlinsession

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ServerWebExchange
import reactor.core.publisher.Mono

@RestController
class SessionController {

    @GetMapping("/session")
    fun get(session: ServerWebExchange): Mono<String> {

        return session.session.map { it.getAttribute<String>("name") }
    }

    @PutMapping("/session")
    fun add(session: ServerWebExchange): Mono<String> {


        return session.session.map { it.attributes }
                .map { it.put("name", "vijay");"vijay" }

    }
}
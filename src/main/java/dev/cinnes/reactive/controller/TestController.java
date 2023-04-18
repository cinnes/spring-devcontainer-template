package dev.cinnes.reactive.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

import dev.cinnes.api.TestApi;

@RestController
public class TestController implements TestApi {

    @Override
    public Mono<String> hello(final ServerWebExchange exchange) {
        return Mono.just("Hello world!");
    }
}

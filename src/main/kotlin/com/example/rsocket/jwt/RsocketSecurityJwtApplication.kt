package com.example.rsocket.jwt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.rsocket.EnableRSocketSecurity

@SpringBootApplication
@EnableRSocketSecurity
class RsocketSecurityJwtApplication {

	@Configuration
	class AppSecurityConfiguration: RSocketSecurityJwtConfiguration()
}

fun main(args: Array<String>) {
	runApplication<RsocketSecurityJwtApplication>(*args)
}

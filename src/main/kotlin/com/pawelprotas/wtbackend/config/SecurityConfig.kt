package com.pawelprotas.wtbackend.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        // Allow all requests for now
        return http.requestMatchers { it.antMatchers("/static/**") }
            .authorizeHttpRequests { it.anyRequest().permitAll() }
            .requestCache().disable()
            .securityContext().disable()
            .sessionManagement().disable()
            .build()
    }
}

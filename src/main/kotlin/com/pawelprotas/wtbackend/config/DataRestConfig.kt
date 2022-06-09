package com.pawelprotas.wtbackend.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer
import org.springframework.web.servlet.config.annotation.CorsRegistry
import javax.persistence.EntityManager

@Configuration
class DataRestConfig(private val entityManager: EntityManager) : RepositoryRestConfigurer {
    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration, cors: CorsRegistry?) {
        config.exposeIdsFor(
            *entityManager
                .metamodel
                .entities
                .map { it.javaType }
                .toTypedArray())

    }


}

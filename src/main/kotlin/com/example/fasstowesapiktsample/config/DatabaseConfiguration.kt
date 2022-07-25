package com.example.fasstowesapiktsample.config

import io.r2dbc.spi.ConnectionFactories
import io.r2dbc.spi.ConnectionFactory
import io.r2dbc.spi.ConnectionFactoryOptions.*
import io.r2dbc.spi.Option
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@Configuration
@EnableR2dbcRepositories
class DatabaseConfiguration: AbstractR2dbcConfiguration() {
    @Bean
    override fun connectionFactory(): ConnectionFactory =
        ConnectionFactories.get(
            builder()
                .option(DRIVER, "pool")
                .option(PROTOCOL, "mysql")
                .option(HOST, "localhost")
                .option(PORT, 3306)
                .option(USER, "root")
                .option(PASSWORD, "fasstowes")
                .option(DATABASE, "test")
                .option(Option.valueOf("initialSize"), 5)
                .option(Option.valueOf("maxSize"), 20)
                .option(Option.valueOf("validationQuery"), "SELECT 1")
                .build()
        )
}
package com.example.fasstowesapiktsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@SpringBootApplication
@EnableR2dbcRepositories(basePackages = ["com.example.fasstowesapiktsample.repository.reactive"])
@EnableJpaRepositories(basePackages = ["com.example.fasstowesapiktsample.repository.jpa"])
class FasstoWesApiKtSampleApplication

fun main(args: Array<String>) {
    runApplication<FasstoWesApiKtSampleApplication>(*args)
}

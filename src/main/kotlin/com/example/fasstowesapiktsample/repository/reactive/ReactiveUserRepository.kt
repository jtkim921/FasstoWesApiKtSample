package com.example.fasstowesapiktsample.repository.reactive

import com.example.fasstowesapiktsample.domain.User
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import reactor.core.publisher.Mono

interface ReactiveUserRepository : R2dbcRepository<User, Int> {
    @Query("SELECT * from user where user_pid = :userPid")
    fun findByPidRx(userPid: Int): Mono<User>
}
package com.example.fasstowesapiktsample.service

import com.example.fasstowesapiktsample.domain.User
import com.example.fasstowesapiktsample.repository.jpa.UserRepository
import com.example.fasstowesapiktsample.repository.reactive.ReactiveUserRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.util.*

@Service
class UserService(val userRepository: UserRepository, private val reactiveUserRepository: ReactiveUserRepository) {

    fun findByPid(userPid: Int): Optional<User>{
        return userRepository.findByUserPid(userPid)
    }

    fun findByPidRx(userPid: Int): Mono<User>{
        return reactiveUserRepository.findByPidRx(userPid)
    }
}
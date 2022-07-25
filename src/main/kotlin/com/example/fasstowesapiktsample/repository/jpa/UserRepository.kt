package com.example.fasstowesapiktsample.repository.jpa

import com.example.fasstowesapiktsample.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : JpaRepository<User, Int> {
    //@Query(nativeQuery = true, value = "SELECT * from user where user_pid = :userPid")
    fun findByUserPid(userPid: Int): Optional<User>
}
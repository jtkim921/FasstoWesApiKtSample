package com.example.fasstowesapiktsample.controller

import com.example.fasstowesapiktsample.domain.User
import com.example.fasstowesapiktsample.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import reactor.core.publisher.Mono

@Controller
@RequestMapping("/api/users")
class UserController @Autowired constructor(private val userService: UserService) {

    @GetMapping("/{user_pid}")
    fun  show(@PathVariable("user_pid") userPid: Int): ResponseEntity<User>{
        val user = userService.findByPid(userPid).get()
        return ResponseEntity.ok(user)
    }

    @GetMapping("/reactive/{user_pid}")
    @ResponseBody
    fun  showReactve(@PathVariable("user_pid") userPid: Int): ResponseEntity<Mono<User>>{
        val user = userService.findByPidRx(userPid)
        return ResponseEntity.ok(user)
    }
}
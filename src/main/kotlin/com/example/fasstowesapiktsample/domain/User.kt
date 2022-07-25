package com.example.fasstowesapiktsample.domain

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "user")
class User (
    @Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var userPid: Int? = null,
    var id: String? = null,
    var name: String = "",
    var useYn: String = "",
        ){
    @CreationTimestamp
    var regTime: LocalDateTime = LocalDateTime.now()
    @UpdateTimestamp
    var updTime: LocalDateTime = LocalDateTime.now()
}
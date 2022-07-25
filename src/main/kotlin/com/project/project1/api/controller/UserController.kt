package com.project.project1.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.project.project1.config.ConfigInfo
import com.project.project1.data.Entity.users
import com.project.project1.data.Repository.usersRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/api")
class UserController(
    private val configInfo: ConfigInfo
) {

    @Autowired
    private lateinit var usersRepository: usersRepository

//    @Autowired
//    private lateinit var configInfo: ConfigInfo

//
//    @Value("\${helloMessage}")
//    private  var helloMessage = ""
    @PostMapping("/adduser")
    fun addUser(@RequestBody a:users): users {
        return usersRepository.save(a);
    }
    @GetMapping("/allUsers")
    fun test() : List<users>{
        return usersRepository.findAll();
    }
    @GetMapping("/getConfig")
    fun configTest(): String{
        return configInfo.hello;
    }
}
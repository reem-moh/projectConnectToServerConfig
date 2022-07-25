package com.project.project1

import com.project.project1.config.ConfigInfo
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
@EnableConfigurationProperties(ConfigInfo::class)
class Project1Application

fun main(args: Array<String>) {
	runApplication<Project1Application>(*args)
}

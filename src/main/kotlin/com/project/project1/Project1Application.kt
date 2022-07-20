package com.project.project1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class Project1Application{
	@GetMapping("/")
	fun test() : String{
		return "hi";
	}
}

fun main(args: Array<String>) {
	runApplication<Project1Application>(*args)
}

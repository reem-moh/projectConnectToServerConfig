package com.project.project1.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.project.project1.config.ConfigInfo
import com.project.project1.data.Entity.Book
import com.project.project1.data.Entity.Student
import com.project.project1.data.Repository.BookRepository
import com.project.project1.data.Repository.StudentsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/api")
class UserController(
    private val configInfo: ConfigInfo
) {

    @Autowired
    private lateinit var studentsRepository: StudentsRepository

    @Autowired
    private lateinit var bookRepository: BookRepository

    @PostMapping("/addStudent")
    fun addStudent(@RequestBody student:Student): Student {
        return studentsRepository.save(student);
    }

    @PostMapping("/addBook")
    fun addBook(@RequestBody book:Book): Book {
        return bookRepository.save(book);
    }

    @GetMapping("/allStudents")
//    MutableSet
    fun getAllStudents() : List<Student>{
        return studentsRepository.findAll();
//        return studentsRepository.findAllByBookIsNull()
    }

    @GetMapping("/allBooks")
    fun getAllBooks() : List<Book>{
        return bookRepository.findAll();
//        return studentsRepository.findAllByBookIsNull()
    }

    @GetMapping("/configInfo")
    fun getConfig(): String{
        return configInfo.hello;
    }


}
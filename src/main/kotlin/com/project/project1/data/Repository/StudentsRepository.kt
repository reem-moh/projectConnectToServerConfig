package com.project.project1.data.Repository

import com.project.project1.data.Entity.Book
import com.project.project1.data.Entity.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentsRepository : JpaRepository<Student, String> {

    fun findAllByBookIsNull():MutableSet<Student>

//    fun updateStudent(student: Student?): Boolean
}
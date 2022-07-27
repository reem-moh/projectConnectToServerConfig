package com.project.project1.data.Repository

import com.project.project1.data.Entity.Book
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository: JpaRepository<Book,String> {
}
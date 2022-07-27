package com.project.project1.infra

import com.project.project1.data.Entity.Book
import com.project.project1.data.Entity.Student
import com.project.project1.data.Repository.BookRepository
import com.project.project1.data.Repository.StudentsRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.util.concurrent.TimeUnit

@Component
class AssignBook(
    val studentsRepository: StudentsRepository,
    val bookRepository: BookRepository
) {

    companion object {
        //        private val log = LoggerFactory.getLogger(AssignBook::class.java)
        private var log: Logger = LoggerFactory.getLogger(AssignBook::class.java)
    }

    @Scheduled(
        initialDelayString = "\${timers.initial}",
        fixedDelayString = "\${timers.assign}",
        timeUnit = TimeUnit.SECONDS
    )
    fun assignBook() {
        log.info("assign book every 10m started ")

        assign()

        log.info("assign book every 10m ended")
    }

    @Scheduled(
        cron = "\${timers.cron}",
    )
    fun assignBookDaily() {
        log.info("assign book daily started")

        assign()

        log.info("assign book daily ended")
    }

    fun assign() {
        val books = bookRepository.findAll()
        val set = mutableSetOf<Book>()
        set.add(books.first())
        log.info("books size:"+books.size+"\n set size: "+set.size)
        val students = studentsRepository.findAllByBookIsNull()
            .map {
            student: Student ->
            student.book = set
            studentsRepository.save(student)
        }

    }
}
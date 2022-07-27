package com.project.project1.data.Entity

import javax.persistence.*

@Entity
class Student(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @Column(nullable = false)
    var name: String,

    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.REMOVE, CascadeType.REFRESH])
    var book: MutableSet<Book> = mutableSetOf(),
) {
}
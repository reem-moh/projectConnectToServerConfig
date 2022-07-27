package com.project.project1.data.Entity

import javax.persistence.*

@Entity
class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    @Column(nullable = false)
    var name: String,

) {


}

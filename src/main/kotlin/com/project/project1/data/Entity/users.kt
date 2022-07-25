package com.project.project1.data.Entity

import javax.persistence.*

@Entity
class users(
    @Id
    var id: String,

    @Column(nullable = false)
    var name: String,
) {
}
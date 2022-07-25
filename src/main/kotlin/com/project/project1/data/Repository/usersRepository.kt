package com.project.project1.data.Repository

import com.project.project1.data.Entity.users
import org.springframework.data.jpa.repository.JpaRepository

interface usersRepository : JpaRepository<users, String> {
}
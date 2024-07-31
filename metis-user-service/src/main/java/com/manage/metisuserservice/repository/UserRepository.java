package com.manage.metisuserservice.repository;

import com.manage.metisuserservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

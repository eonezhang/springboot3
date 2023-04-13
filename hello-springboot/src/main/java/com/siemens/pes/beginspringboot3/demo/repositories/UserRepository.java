package com.siemens.pes.beginspringboot3.demo.repositories;

import com.siemens.pes.beginspringboot3.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

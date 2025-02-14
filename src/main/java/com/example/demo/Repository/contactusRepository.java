package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.contactus;

import java.util.Optional;

public interface contactusRepository extends JpaRepository<contactus, Long> {
    Optional<contactus> findByUserName(String userName);
}

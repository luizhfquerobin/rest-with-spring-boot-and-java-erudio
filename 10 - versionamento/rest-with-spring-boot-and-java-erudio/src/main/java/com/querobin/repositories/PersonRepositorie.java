package com.querobin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.querobin.model.Person;

public interface PersonRepositorie extends JpaRepository<Person, Long> {
}

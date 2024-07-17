package com.querobin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.querobin.model.Person;

public interface PersonRepositories extends JpaRepository<Person, Long> {
}

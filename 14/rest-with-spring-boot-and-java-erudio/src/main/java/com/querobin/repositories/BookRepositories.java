package com.querobin.repositories;

import com.querobin.model.Book;
import com.querobin.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepositories extends JpaRepository<Book, Long> {
}

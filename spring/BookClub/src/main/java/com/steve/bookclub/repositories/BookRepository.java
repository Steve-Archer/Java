package com.steve.bookclub.repositories;

import org.springframework.data.repository.CrudRepository;

import com.steve.bookclub.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	
}

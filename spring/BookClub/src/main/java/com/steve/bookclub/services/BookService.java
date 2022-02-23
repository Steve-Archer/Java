package com.steve.bookclub.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.steve.bookclub.models.Book;
import com.steve.bookclub.repositories.BookRepository;

@Service
public class BookService {
	
	
	private BookRepository bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public Book newBook(Book book) {
		return this.bookRepo.save(book);
	}
	
	public List<Book> getAllBooks(){
		return (List<Book>)this.bookRepo.findAll();
	}
	public Book getBook(Long id) {
		return this.bookRepo.findById(id).orElse(null);
	}
	public Book updateBook(Book book) {
		return this.bookRepo.save(book);
	}
	public void deleteBook(Long id) {
		this.bookRepo.deleteById(id);
	}
}
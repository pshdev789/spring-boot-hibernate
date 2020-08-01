package com.pkg.springboothibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkg.springboothibernate.model.Book;
import com.pkg.springboothibernate.repository.BookRepository;

/**
 * The Class BookService.
 */
@Service	
public class BookService {

	/** The book repository. */
	@Autowired
	private BookRepository bookRepository;
	
	/**
	 * List.
	 *
	 * @return the list
	 */
	public List<Book> list(){
		return bookRepository.findAll();	
	}	
	
}

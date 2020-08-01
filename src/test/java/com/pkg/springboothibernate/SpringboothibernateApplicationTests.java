package com.pkg.springboothibernate;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

import com.pkg.springboothibernate.model.Book;
import com.pkg.springboothibernate.service.BookService;

@SpringBootTest
class SpringboothibernateApplicationTests {

	@Autowired
	private BookService bookService;
	
	@Test
	void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
		
		List<Book> books = bookService.list();
		Assert.assertEquals(books.size(),3);
		
	}

}

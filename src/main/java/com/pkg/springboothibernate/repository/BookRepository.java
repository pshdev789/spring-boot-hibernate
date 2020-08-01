package com.pkg.springboothibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pkg.springboothibernate.model.Book;

/**
 * The Interface BookRepository.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}

package com.pkg.springboothibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * The Class Book.
 */
@Entity
public class Book {

	/** The id. */

	@Id
	@GeneratedValue
	private Long id;

	/** The name. */
	private String name;

	/**
	 * Instantiates a new book.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 */
	public Book(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}

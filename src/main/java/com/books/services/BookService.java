package com.books.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.models.Book;
import com.books.repositories.BookInterface;

@Service
public class BookService {
		
	@Autowired
	private BookInterface bookInterface;

	public ArrayList<Book> listBooks() {
		return (ArrayList<Book>) bookInterface.findAll();
	}

}
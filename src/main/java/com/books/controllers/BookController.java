package com.books.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.books.models.Book;
import com.books.services.BookService;

@Controller
public class BookController {

	@Autowired 
	private BookService bookService;
	
@RequestMapping(value = "/showBooks", method = RequestMethod.GET)
	
	public String getBooks(Model b)
	{
		ArrayList<Book> books = bookService.listBooks();
		
		b.addAttribute("book", books);
		
		return "showBooks";
	}
	
}
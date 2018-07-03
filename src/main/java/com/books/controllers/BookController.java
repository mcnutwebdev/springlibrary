package com.books.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.books.models.Book;
import com.books.services.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/showBooks", method = RequestMethod.GET)

	public String getBooks(Model b) {
		ArrayList<Book> books = bookService.listBooks();

		b.addAttribute("book", books);

		return "showBooks";
	}

	@RequestMapping(value = "/addBook", method = RequestMethod.GET)

	public String addBookGET(Model b) {
		
		Book book = new Book();
		b.addAttribute("book", book);

		return "addBook";

	}
	
	@RequestMapping(value = "/addBook", method=RequestMethod.POST)
	public String addBookPOST(@ModelAttribute("book") Book book, Model b) {
		
		bookService.save(book);
		
		return "redirect:showBooks";
 	}

}
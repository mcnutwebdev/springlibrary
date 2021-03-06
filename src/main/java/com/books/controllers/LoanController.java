package com.books.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.books.models.Customer;
import com.books.models.Loan;
import com.books.services.LoanService;

@Controller
public class LoanController {

	@Autowired
	private LoanService loanService;
	
	@RequestMapping(value = "/showLoans", method = RequestMethod.GET)
	public String getLoans(Model l) {

		ArrayList<Loan> loan = loanService.listLoans();
		l.addAttribute("loan", loan);

		return "showLoans";
	}
	
	@RequestMapping(value = "/newLoan", method = RequestMethod.GET)
	public String newLoan(Model l) {
		Loan loan = new Loan();
		l.addAttribute("loan", loan);
		return "newLoan";
	}
	
	@RequestMapping(value = "/deleteLoan", method = RequestMethod.GET)
	public String deleteLoan(Model l) {

		return "deleteLoan";
	}

}
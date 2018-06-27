package com.books.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.models.Loan;
import com.books.repositories.LoanInterface;

@Service
public class LoanService {
	
	

		@Autowired
		private LoanInterface loanInterface;

		public ArrayList<Loan> listLoans() {
			return (ArrayList<Loan>) loanInterface.findAll();
		}
	}


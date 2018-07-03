package com.books.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.books.models.Book;
import com.books.models.Customer;
import com.books.services.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/showCustomers", method = RequestMethod.GET)
	public String getCustomers(Model m) {

		ArrayList<Customer> customer = customerService.listCustomers();
		m.addAttribute("customer", customer);

		return "showCustomers";
	}
	
	@RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
	public String addCustomer(Model c) {
		
		Customer customer = new Customer();
		c.addAttribute("customer", customer);

		return "addCustomer";
	}
	
	@RequestMapping(value = "/addCustomer", method=RequestMethod.POST)
	public String addCustomerPOST(@ModelAttribute("customer") Customer customer, Model c) {
		
		customerService.save(customer);
		
		return "redirect:showCustomers";
 	}

}
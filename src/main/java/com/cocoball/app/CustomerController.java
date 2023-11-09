package com.cocoball.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cocoball.app.accessingdatajpa.Customer;
import com.cocoball.app.accessingdatajpa.CustomerRepository;

@RestController //Controller + ResponseBody
public class CustomerController {
	
	@Autowired
	CustomerRepository repo;
	
	@GetMapping("/")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("greet", "<b>안</b>녕하세요");
		return mv;
	}
	
	@GetMapping("/customer")
	public Iterable<Customer> findall(){
		return repo.findAll();
	}
}

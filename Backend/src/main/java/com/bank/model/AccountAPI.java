package com.bank.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= "http://localhost:4200/view")
@RestController
public class AccountAPI {
	
	@Autowired
	private AccountRepository accrepo;
	
	@GetMapping("/acco")
	public List<Accounts> getAll(){
		return accrepo.findAll();
	}
}

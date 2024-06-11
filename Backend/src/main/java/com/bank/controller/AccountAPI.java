package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.Accounts;
import com.bank.repository.AccountRepository;

@RestController
public class AccountAPI {
	
	@Autowired
	private AccountRepository repo;
	
	@GetMapping("/acc")
	public List<Accounts> getAll() {
		return repo.findAll();
	}
}

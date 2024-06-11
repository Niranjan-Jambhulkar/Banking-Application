package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.controller.AccountAPI;

@Service
public class AccountService {
	
	@Autowired
	private AccountAPI api;
	
	public void display(){
		api.getAll();
	}
}

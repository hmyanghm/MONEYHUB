package com.moneyhub.web.cus.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneyhub.web.cus.domains.Account;
import com.moneyhub.web.cus.domains.Customer;
import com.moneyhub.web.cus.mappers.AccountMapper;

@Service
public class AccountService {
	
	@Autowired Account account;
	@Autowired AccountMapper accountMapper;
	
	public ArrayList<String> createAccount(Customer cus){
		System.out.println(cus+":::::최종");
		System.out.println(cus.getCno().toString()+":::::최종2");
		return null;
	}
	
}

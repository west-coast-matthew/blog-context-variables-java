package com.matthewdalby.example.context_variables.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matthewdalby.example.context_variables.util.TransactionUtils;

@Service("Service1")
public class Service1 {
	
	@Autowired
	private Service2 service2;

	public void handleRequest() {
		
		System.out.println("Service1: transaction id=>"+ TransactionUtils.getCurrentTransactionId());
		service2.handleRequest();
	}
}

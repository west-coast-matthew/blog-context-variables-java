package com.matthewdalby.example.context_variables.service;

import org.springframework.stereotype.Service;

import com.matthewdalby.example.context_variables.util.TransactionUtils;

@Service("Service3")
public class Service3 {

	public void handleRequest() {
		System.out.println("Service3 transaction id=>"+ TransactionUtils.getCurrentTransactionId());
	}
	
}

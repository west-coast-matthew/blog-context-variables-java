package com.matthewdalby.example.context_variables.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matthewdalby.example.context_variables.util.TransactionUtils;

@Service("Service2")
public class Service2 {

	@Autowired
	private Service3 service3;
	
	public void handleRequest() {
		System.out.println("Service2 transaction id=>"+ TransactionUtils.getCurrentTransactionId());
		service3.handleRequest();
	}
}

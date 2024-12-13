package com.matthewdalby.example.context_variables.util;

import java.util.UUID;

import com.matthewdalby.example.context_variables.filter.RequestContext;

public class TransactionUtils {
	
	public static String getNewTransactionID() {
		return UUID.randomUUID().toString();
	}
	
	public static String getCurrentTransactionId() {
		return RequestContext.getCurrentTransactionId();
	}
	
}

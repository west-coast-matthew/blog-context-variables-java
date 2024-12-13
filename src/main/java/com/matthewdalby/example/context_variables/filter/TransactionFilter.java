package com.matthewdalby.example.context_variables.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.matthewdalby.example.context_variables.util.TransactionUtils;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
@WebFilter("/*")
public class TransactionFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        String transactionId = TransactionUtils.getNewTransactionID();
        
        RequestContext.setCurrentTransactionId(transactionId);
        
        chain.doFilter(request, response);	
	}
	
}

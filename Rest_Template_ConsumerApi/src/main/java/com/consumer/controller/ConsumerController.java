package com.consumer.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.consumer.model.ConsumerAccount;
import com.consumer.service.ConsumerService;

@RestController
public class ConsumerController {

	@Autowired
	ConsumerService consumerService;
	
	@GetMapping("/consumerAccounts/{id}")
	public ConsumerAccount callGetAccountById(@PathVariable("id")int id) throws RestClientException, URISyntaxException
	{
		
		return consumerService.callGetAccountById(id);
	}
	
	
	
}

package com.consumer.service;

import java.net.URISyntaxException;

import org.springframework.web.client.RestClientException;

import com.consumer.model.ConsumerAccount;

public interface ConsumerService {

	ConsumerAccount callGetAccountById(int id) throws RestClientException, URISyntaxException;

}

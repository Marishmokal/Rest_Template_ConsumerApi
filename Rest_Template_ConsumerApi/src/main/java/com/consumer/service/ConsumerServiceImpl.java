package com.consumer.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.consumer.model.ConsumerAccount;

@Service
public class ConsumerServiceImpl implements ConsumerService {


@Autowired
RestTemplate template;
	
	@Value("${base.url}")
	String url;
	
	
	
@Override
	public ConsumerAccount callGetAccountById(int id) throws RestClientException, URISyntaxException {
		
	String uri=url+id;
		
	return template.getForObject(new URI(uri),ConsumerAccount.class) ;

}


	
}

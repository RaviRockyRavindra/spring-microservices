package com.example.demo;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;

@RefreshScope
@RestController
@RequestMapping("/resource")
public class controller {

	@Value("$(msg:not working)")
	private String msg;
	
	List<String> list= new ArrayList<String>();
	
	@GetMapping(value="/states")
	private List<String> done()
	{
		
		return Stream.of("india","pakistan","nellore").collect(Collectors.toList());
	}
	
	@GetMapping("/value")
	private String value()
	{
		return "hai";
	}
	
	@GetMapping("/valueex")
	private String valueex()
	{
		return this.msg;
	}
	
}

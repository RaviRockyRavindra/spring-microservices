package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controller {

	List<String> list= new ArrayList<String>();
	
	@GetMapping("/countries")
	private List<String> done()
	{
		
		list.add("india");
		list.add("canada");
		list.add("australia");
		
		return list;
		
	}
	
}

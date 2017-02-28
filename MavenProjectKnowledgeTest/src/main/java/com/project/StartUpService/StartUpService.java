package com.project.StartUpService;
import org.springframework.stereotype.Service;

@Service("StartUpService")
public class StartUpService {
	private String name;
	 
	public void setName(String name) {
		this.name = name;
	}
 
	public String sayHello() {
		return "Hello! " + name;
	}

}

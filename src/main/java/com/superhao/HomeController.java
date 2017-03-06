package com.superhao;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/hello", method = { RequestMethod.GET }, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public String sayHello(@RequestParam(defaultValue = "Docker") String name) {
		return String.format("Hello %s!", name);
	}

}

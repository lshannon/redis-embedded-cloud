package com.lukeshannon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class SwaggerConfiguration {
	
	@GetMapping("/")
	public String home() {
		return "redirect:/swagger-ui.html";
	}

}

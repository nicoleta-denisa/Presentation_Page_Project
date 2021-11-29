package com.gallery.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")  
	public String index() {
		return "Welcome to the art gallery!";
	}

	@PostMapping("/paintings")	
	public Paintings buildPaintings(@RequestBody Paintings paintings) {
		System.out.println(paintings);
		return paintings;
	}
	
	@PostMapping("/sculptures")	
	public Sculptures buildSculptures(@RequestBody Sculptures sculptures) {
		System.out.println(sculptures);
		return sculptures;
	}
	
	@PostMapping("/contactform")	
	public ContactForm buildContactForm(@RequestBody ContactForm contactform) {
		System.out.println(contactform);
		return contactform;
	}
}

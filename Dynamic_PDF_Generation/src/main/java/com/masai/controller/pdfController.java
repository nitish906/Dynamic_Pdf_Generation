package com.masai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pdf")
public class pdfController {
	
	@PostMapping("/createPdf")
	public void createPdf() {
		
	}
	

}

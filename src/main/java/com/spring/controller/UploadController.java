package com.spring.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;



	@Controller
	public class UploadController {

		  @GetMapping("/")
		    public String home() {
		        return "index";
		    }
		  
	    @PostMapping("/upload")
	    public String uploadFile(@RequestParam("file") MultipartFile file,Model m)
	            throws IllegalStateException, IOException {
String fileName=file.getOriginalFilename();

	        String path = "C:\\Users\\USER\\Desktop\\Upl\\";
//String path = "D:/upload/";
	        //String path="C:\\Users\\USER\\Desktop\\";
	        file.transferTo(new File(path + file.getOriginalFilename()));
	        m.addAttribute("fname",fileName);
	        return "success";
	    }
	}
	

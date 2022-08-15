package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Student;

@Controller
public class ComplexFormController {
	
	@RequestMapping("/")
	public String showForm() {
		return "form" ;
	}
	
	//THis is the file clone from github to local PC
	
/*Not good way , because of multiple parameters inside the form
 * we have to use multiple time @RequestMapping
 * so we will create entity class
 * */
//	@RequestMapping(path="/handleForm" , method=RequestMethod.POST)
//	public String formHandler(@RequestParam("name") String name, @RequestParam("id") Long id) {
//		System.out.println(name +"" + id);
//		return "success" ;
//	}
	
	@RequestMapping(path="/handleForm" , method=RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student student,BindingResult result) {
		
		if(result.hasErrors()) {
			return "form" ;
		}
		System.out.println(student);
		System.out.println(student.getDate());
		

		return "success" ;
	}

}

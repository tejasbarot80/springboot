package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@Autowired
	EmployeeService es;
	
	@RequestMapping("/")
    public String one()
    {
    	return "index";
    }
	
	@PostMapping("/kites")
	public String getdata(@ModelAttribute("e1") Employee e1)
	{
		es.register(e1);
		return "redirect:/welcome";
	}
	
	@RequestMapping("/welcome")
    public String welcome()
    {
    	return "welcome";
    }
}

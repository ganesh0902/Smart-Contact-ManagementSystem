package com.smart.homecontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.smart.entities.*;
import com.smart.repository.UserRepository;


@Controller
public class HomeController {

	@Autowired
	private UserRepository repo;
	
	@GetMapping("/test")
	@ResponseBody
	public String test()
	{
		User user=new User();
		user.setName("Ganesh");
		user.setRole("admin");
		user.setEmail("ganesh44d9srrs87@gmail.com");
		user.setPassword("ganeshsss@123gmail.com");
		user.setAbout("i am ganesh");
		
		System.out.println("User is "+user);
		repo.save(user);
					
		return "Record Save";
	}
}
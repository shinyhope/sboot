package net.sboot.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	private List<User> users = new ArrayList<User>();
	
//	@GetMapping("/create")	
//	public String create(String userId, String password, String name, String email ) {
//	public String create(String userId, String password, String name, String email ) {
	
	
	@PostMapping("/create")
	public String create(User user) {	
	
//		System.out.println("userId:" + userId + ", name:" + name + ", email: " + email);		
//		return "index";
		
		System.out.println("user: " + user);
		users.add(user);
		  
		return "redirect:/list";
	}

	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("users", users);
		return "list";

	}
}

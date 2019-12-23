package net.sboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	/*
	 * 메서드 이름은 중요하지 않다. 
	 * return 옆에 문자열이 중요하다.
	 * getmapping : url 지정 역할
	 * return 옆은 template 이름 
	 * 
	 */
	@GetMapping("/helloworld")
	public String welcome(String name, int age, Model model) {
		System.out.println("name:" + name);
		model.addAttribute("name",  name);
		model.addAttribute("age",  age);
		return "welcome";

	}

}

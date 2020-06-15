package com.my.bbs;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostGetController {

	@RequestMapping("/uinput")
	public String gopp() {
		return "postget/inputForm"; // view 이름 지정
	}
	@RequestMapping(value="person", method = RequestMethod.POST)
	public String getperson(HttpServletRequest request,Model model) {
		model.addAttribute("name",request.getParameter("name"));
		model.addAttribute("id",request.getParameter("id"));
		return "postget/userinfo";
	}
	@RequestMapping(value="person1", method = RequestMethod.POST)
	public String getperson1(@RequestParam String name,@RequestParam String id,Model model) {
		model.addAttribute("name",name);
		model.addAttribute("id",id);
		return "postget/userinfo";
	}
	
}

package com.my.bbs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/input")
	public String gopp() {
		return "inputForm"; // view 이름 지정
	}

	@RequestMapping("input2")
	public String gopp1(Model model) {

		String uname = "kkk";
		model.addAttribute("uuu", uname);
		return "inputForm";
	}

	@RequestMapping("/input3")
	public ModelAndView gopp2() {
		ModelAndView mv = new ModelAndView();
		String uname = "kkk";
		mv.addObject("uuu", uname);
		mv.setViewName("/inputForm");
		return mv;
	}

	@RequestMapping("/input4/{aa}")
	public ModelAndView goopp3(@PathVariable String aa) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("uuu", aa);
		
		if(aa.equals("user")) {
		mv.setViewName("/inputForm");
		}else if(aa.equals("admin")) {
			mv.setViewName("/inputFormAdmin");
		}
		return mv;
	}
}

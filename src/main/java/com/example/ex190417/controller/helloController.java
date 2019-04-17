package com.example.ex190417.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloController {

	@RequestMapping("/")
	public ModelAndView hello(ModelAndView mv) {
		HashMap map = new HashMap(); 
		mv.setViewName("hello");
		mv.addObject("msg", "ㅎㅎㅎㅎㅎㅎㅎ");
		
		//map = null;
		if(map.get("a1") != null && !"".equals(map.get("a1"))) {
			System.out.println("test");
		}
		
		String a = String.valueOf(map.get("a1"));

		map.put("a1","aa1");
		map.put("a2","");
		map.put("a3", null);
		System.out.println(map);
		map.remove("a2");
		map.put("a2","4444");
		
		System.out.println(map);
		return mv;
	}
}

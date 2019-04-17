package com.example.ex190417.controller;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.ex190417.model.dto.GuestbookDTO;
import com.example.ex190417.service.GuestbookService;

@Controller
public class GuestbookController {

	@Inject
	GuestbookService guestbookService;
	
	@RequestMapping("list.do")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("list"); //view(jsp) 이름
		List<GuestbookDTO> list = guestbookService.list();
		mv.addObject("list",list);
		
		return mv;
	}	
}

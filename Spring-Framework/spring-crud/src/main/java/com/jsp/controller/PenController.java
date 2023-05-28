package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Pen;
import com.jsp.service.PenService;

@Controller
public class PenController {
	
	@Autowired
	PenService penService;
	
	@RequestMapping("/savepen")
	public ModelAndView testMethod() {
		
		ModelAndView modelAndView = new ModelAndView("createPen.jsp");
		modelAndView.addObject("pen1", new Pen());
		return modelAndView;
		
	}
	@RequestMapping("/pensave")
	public ModelAndView savePen(@ModelAttribute Pen pen) {
		System.out.println("reching");
		if(pen!=null) {
			penService.savePen(pen);
		}
		ModelAndView modelAndView = new ModelAndView("home.jsp");
		modelAndView.addObject("save", pen.getName() + " saved succesfully");
		return modelAndView;
		
	}
	
	@RequestMapping("/viewallpen")
	public ModelAndView viewAllPens() {
		List<Pen> pens = penService.getAllPen();
		ModelAndView modelAndView = new ModelAndView("viewallPens.jsp");
		modelAndView.addObject("pens", pens);
		return modelAndView;
		
	}
	@RequestMapping("/delete")
	public ModelAndView deletePen(@RequestParam(name="id") int id) {
		boolean res=false;
		ModelAndView modelAndView=null;
		if(id>0) {
			 res =penService.deletePen(id);
		}
		if(res==true) {
		  modelAndView = new ModelAndView("delete.jsp");
		  modelAndView.addObject("pen", "Pen deleted successfully");
		}
		
		return modelAndView;
		
	}
	@RequestMapping("/update")
	public ModelAndView updateData() {
		ModelAndView modelAndView = new ModelAndView("update.jsp");
		modelAndView.addObject("pen", new Pen());
		return modelAndView;
	}

}

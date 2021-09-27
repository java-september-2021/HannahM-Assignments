package com.hannahm.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hannahm.dojosurvey.survey.models.Survey;

@Controller
public class DojoSurveyControllers {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("location", getLocation());
		model.addAttribute("language", getLanguage());
		return "index.jsp";
	}
	@RequestMapping(value="/survey" ,  method=RequestMethod.POST)
	public String survey(@RequestParam("name") String name, @RequestParam("Location") String location, @RequestParam("langauge") String language, @RequestParam("comment") String comment, Model viewModel) {
		viewModel.addAttribute("name",name);
		viewModel.addAttribute("location",location);
		viewModel.addAttribute("langauage",language);
		viewModel.addAttribute("comment",comment);
		return "results.jsp";
	}
}


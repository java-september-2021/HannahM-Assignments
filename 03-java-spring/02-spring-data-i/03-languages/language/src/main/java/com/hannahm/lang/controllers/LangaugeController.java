package com.hannahm.lang.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.hannahm.lang.models.Language;
import com.hannahm.lang.services.LanguageService;


@Controller
public class LangaugeController {
	private final LanguageService lService;
	public LangaugeController(LanguageService service) {
		this.lService = service;
	}
	
	@GetMapping("/")
	public String index(Model model, @ModelAttribute("language") Language language) {
		model.addAttribute("allLanguage", this.lService.allLanguage());
		return "index.jsp";
	}
	
	@PostMapping("/")
	public String addLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allLanguage", this.lService.allLanguage());
			return "index.jsp";
		}
		this.lService.createLanguage(language);
		return "redirect/";
	}
	@GetMapping("/show/{id}")
	public String showLang(Model model, @PathVariable("id") Long id) {
		model.addAttribute("thisLang", this.lService.findLanguage(id));
		return "show.jsp";
	}
	@GetMapping("/edit/{id}")
	public String editLang(Model model, @PathVariable("id") Long id) {
		model.addAttribute("lang", this.lService.findLanguage(id));
		return "edit.jsp";
	}

		
	@PutMapping("/edit/{id}")
	public String editLang(@Valid @ModelAttribute("language") Language lang, BindingResult result, Model model, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			model.addAttribute("language", this.lService.findLanguage(id));
		}
		this.lService.updateLanguage(lang);
		return "redirect:/show/id";
	}
	@DeleteMapping("/delete/{id}")
	public String deleteLang(@PathVariable("id") Long id) {
		this.lService.deleteLanguage(id);
		return "redirect:/";
	}
	
}
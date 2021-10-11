package com.hannahm.lang.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hannahm.lang.models.Language;
import com.hannahm.lang.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	public List<Language> allLanguage(){
		return this.lRepo.findAll();
	}
	public Language findLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	public Language createLanguage(Language newLanguage) {
		return this.lRepo.save(newLanguage);
	}
	
	public Language updateLanguage(Language updatedLanguage) {
		return this.lRepo.save(updatedLanguage);
	}
	
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
}

package com.architecture.tp.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.architecture.tp.analyzer.AnalyseurChaineDefaultImp;
import com.architecture.tp.analyzer.AnalyzeurChaine;
import com.architecture.tp.langage_factory.LanguageFactory;
import com.architecture.tp.language.Language;

@RestController
@RequestMapping("analyzeur")
public class Controller {

	private LanguageFactory langageFactory;
	
	public Controller(LanguageFactory languageFactory) {
		this.langageFactory  = languageFactory;
	}
	
	@GetMapping
	public ResponseEntity<String> analyserChaine(
			@RequestHeader(HttpHeaders.ACCEPT_LANGUAGE) String langage
			,@RequestParam("chaine")String chaine){
		Language languageBean = this.langageFactory.getLanguage(langage);
		AnalyzeurChaine analyzeurChaine = new AnalyseurChaineDefaultImp(languageBean);
		return ResponseEntity.status(HttpStatus.OK).body(analyzeurChaine.AnalyserChaine(chaine));
	}
	
}

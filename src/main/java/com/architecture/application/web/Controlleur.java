package com.architecture.application.web;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.architecture.domaine.AnalyseurDeChaineSimple;
import com.architecture.domaine.AnalyzeurDeChaine;
import com.architecture.domaine.FournisseurHeure;
import com.architecture.domaine.Langage;
import com.architecture.tp.langues.LangageFactory;

@RestController
@RequestMapping("analyseur")
public class Controlleur {

	private LangageFactory langageFactory;
	private FournisseurHeure fournisseurHeure;
	public Controlleur(LangageFactory languageFactory, FournisseurHeure fournisseurHeure) {
		this.langageFactory  = languageFactory;
		this.fournisseurHeure = fournisseurHeure;
	}
	
	@GetMapping
	public ResponseEntity<String> analyserChaine(
			@RequestHeader(HttpHeaders.ACCEPT_LANGUAGE) String langage
			,@RequestParam("chaine")String chaine){
		Langage langageChoisi= this.langageFactory.RecupererLanguage(langage);
		AnalyzeurDeChaine analyzeurChaine = new AnalyseurDeChaineSimple(langageChoisi,fournisseurHeure);
		return ResponseEntity.status(HttpStatus.OK).body(analyzeurChaine.AnalyserChaine(chaine));
	}
	
}

package com.architecture.tp.analyzer;

import org.springframework.stereotype.Service;

import com.architecture.tp.language.Language;

@Service
public class AnalyseurChaineDefaultImp implements AnalyzeurChaine{

	private Language language;
	
	public AnalyseurChaineDefaultImp(Language language) {
		this.language = language;
	}
	 
	@Override
	public String AnalyserChaine(String chaine) {
		String mirroir = new StringBuilder(chaine).reverse().toString();
		return mirroir.equals(chaine)?language.saluer()+"\n"+mirroir+" "+language.feliciter()+"\n"+language.acquitter()
				:language.saluer()+"\n"+mirroir+"\n"+language.acquitter();
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
	
	
	
	

}

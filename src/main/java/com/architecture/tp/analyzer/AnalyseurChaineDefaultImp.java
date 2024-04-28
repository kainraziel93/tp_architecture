package com.architecture.tp.analyzer;

import org.springframework.stereotype.Service;

@Service
public class AnalyseurChaineDefaultImp implements AnalyzeurChaine{

	 
	@Override
	public String AnalyserChaine(String chaine) {
		String mirroir = new StringBuilder(chaine).reverse().toString();
		return mirroir.equals(chaine)?"Bonjour\n"+mirroir+" bien dit\nau revoir ":"Bonjour\n"+mirroir+"\nau revoir";
	}

}

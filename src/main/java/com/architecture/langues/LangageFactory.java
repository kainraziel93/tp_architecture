package com.architecture.langues;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.architecture.domaine.FournisseurHeure;
import com.architecture.domaine.Langage;
@Component
public class LangageFactory {

	
	public LangageFactory() {
		
	}
	
	public Langage RecupererLanguage(String language) {
		
		if(language.equals("fr")) {
			return new Francais();
		}
		else if(language.equals("en")) {
			return new Anglais();
		}
		return null;
	}
}

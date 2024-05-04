package com.architecture.tp.langage_factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.architecture.tp.horloge.HeureActuel;
import com.architecture.tp.language.Anglais;
import com.architecture.tp.language.Francais;
import com.architecture.tp.language.Language;
@Component
public class LanguageFactory {

	@Autowired
	private HeureActuel heureActuel;
	
	public LanguageFactory() {
		
	}
	
	public Language getLanguage(String language) {
		
		if(language.equals("fr")) {
			return new Francais(heureActuel);
		}
		else if(language.equals("en")) {
			return new Anglais(heureActuel);
		}
		return null;
	}
}

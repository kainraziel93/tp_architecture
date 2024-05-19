package com.architecture.tp.langues;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.architecture.domaine.FournisseurHeure;
import com.architecture.domaine.Langage;

 @Service
 @Primary
public class Francais implements Langage{
	
	
	public Francais() {
		
	}
	
	@Override
	public String saluer(FournisseurHeure heureActuel) {
		if(heureActuel.heure() >= 18 ||heureActuel.heure() <=3 ) {
			return "Bonjour";
		}
		return "Bonsoir";
	}

	@Override
	public String feliciter(FournisseurHeure heureActuel) {
		return "Bien dit";
	}

	@Override
	public String acquitter(FournisseurHeure heureActuel) {
		String message = "Bonne";
		if(heureActuel.heure() >= 5 && heureActuel.heure() <=12 ) {
			System.out.println(heureActuel.heure());
			return message+" journée";
		}
		if(heureActuel.heure() >12 &&  heureActuel.heure()<=18) {
			return message+" après-midi";
		}
		if(heureActuel.heure() >18 && heureActuel.heure()<22 ) {
			return message+" soirée";
		}
		return message+" nuit";
	}

}

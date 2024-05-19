package com.architecture.tp.langues;

import org.springframework.stereotype.Service;

import com.architecture.domaine.FournisseurHeure;
import com.architecture.domaine.Langage;

@Service
public class Anglais implements Langage{

	
	public Anglais() {

	}
	@Override
	public String saluer(FournisseurHeure heureActuel) {
		String message = "Good";
		if(heureActuel.heure() >= 5 && heureActuel.heure() <=12 ) {
			System.out.println(heureActuel.heure());
			return message+" Morning";
		}
		if(heureActuel.heure() >12 &&  heureActuel.heure()<=18) {
			return message+" Afternoon";
		}
		if(heureActuel.heure() >18 && heureActuel.heure()<22 ) {
			return message+" Evening";
		}
		return message+" Night";
	}

	

	@Override
	public String feliciter(FournisseurHeure heureActuel) {
		return "well done";
	}

	@Override
	public String acquitter(FournisseurHeure heureActuel) {
		return "goodbye";
	}

}

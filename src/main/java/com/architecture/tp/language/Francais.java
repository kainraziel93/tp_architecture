package com.architecture.tp.language;

import com.architecture.tp.horloge.HeureActuel;

public class Francais implements Language{
	
	private HeureActuel heureActuel;
	
	public Francais(HeureActuel heureActuel) {
		this.heureActuel = heureActuel;
	}
	
	@Override
	public String saluer() {
		if(heureActuel.heure() >= 18 ||heureActuel.heure() <=3 ) {
			return "Bonjour";
		}
		return "Bonsoir";
	}

	@Override
	public String feliciter() {
		return "Bien dit";
	}

	@Override
	public String acquitter() {
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

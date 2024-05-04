package com.architecture.tp.language;

import org.springframework.stereotype.Service;

import com.architecture.tp.horloge.HeureActuel;

@Service
public class Anglais implements Language{

	private HeureActuel heureActuel;
	
	public Anglais(HeureActuel heureActuel) {
		this.heureActuel = heureActuel;
	}
	@Override
	public String saluer() {
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
	public String feliciter() {
		return "well done";
	}

	@Override
	public String acquitter() {
		return "goodbye";
	}

}

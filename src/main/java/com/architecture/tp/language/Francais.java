package com.architecture.tp.language;

import com.architecture.tp.horloge.HeureActuel;

public class Francais implements Language{
	
	private HeureActuel heureActuel;
	
	public Francais(HeureActuel heureActuel) {
		this.heureActuel = heureActuel;
	}
	@Override
	public String saluer() {
		return "Bonjour";
	}

	@Override
	public String feliciter() {
		return "Bien dit";
	}

	@Override
	public String acquitter() {
		return "au revoir";
	}

}

package com.architecture.tp.language;

import com.architecture.tp.horloge.HeureActuel;

public class Anglais implements Language{

	private HeureActuel heureActuel;
	
	public Anglais(HeureActuel heureActuel) {
		this.heureActuel = heureActuel;
	}
	@Override
	public String saluer() {
		return "good morning";
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

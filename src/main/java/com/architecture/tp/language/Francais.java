package com.architecture.tp.language;

public class Francais implements Language{

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

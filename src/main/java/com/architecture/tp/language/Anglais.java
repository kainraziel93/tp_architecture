package com.architecture.tp.language;

public class Anglais implements Language{

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

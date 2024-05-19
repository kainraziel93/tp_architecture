package com.architecture.domaine;

public interface Langage {

	public String saluer(FournisseurHeure heureActuel);
	public String feliciter(FournisseurHeure heureActuel);
	public String acquitter(FournisseurHeure heureActuel);
}

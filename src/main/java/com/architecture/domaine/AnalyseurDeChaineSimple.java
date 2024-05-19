package com.architecture.domaine;

import org.springframework.stereotype.Service;

@Service
public class AnalyseurDeChaineSimple implements AnalyzeurDeChaine{

	private Langage langage;
	private FournisseurHeure fournisseurHeure;
	public AnalyseurDeChaineSimple(Langage language,FournisseurHeure fournisseurHeure) {
		this.langage = language;
		this.fournisseurHeure = fournisseurHeure;
	}
	 
	@Override
	public String AnalyserChaine(String chaine) {
		String mirroir = new StringBuilder(chaine).reverse().toString();
		return mirroir.equals(chaine)?langage.saluer(fournisseurHeure)+"\n"+mirroir+" "+langage.feliciter(fournisseurHeure)+"\n"+langage.acquitter(fournisseurHeure)
				:langage.saluer(fournisseurHeure)+"\n"+mirroir+"\n"+langage.acquitter(fournisseurHeure);
	}

}

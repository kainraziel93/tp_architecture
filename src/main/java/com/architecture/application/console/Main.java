package com.architecture.application.console;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.architecture.domaine.AnalyseurDeChaineSimple;
import com.architecture.domaine.AnalyzeurDeChaine;
import com.architecture.domaine.FournisseurHeure;
import com.architecture.domaine.Langage;
import com.architecture.tp.horloge.FournisseurHeureSysteme;
import com.architecture.tp.langues.Anglais;
import com.architecture.tp.langues.Francais;

@Component
public class Main {

	
	private AnalyzeurDeChaine analyzeurChaine;
	
	public Main(AnalyzeurDeChaine  analyzeurChaine) {
		this.analyzeurChaine = analyzeurChaine;
	}
	public void AnalyzerChaine(String chaine) {
		System.out.println(this.analyzeurChaine.AnalyserChaine(chaine));
	}

	public AnalyzeurDeChaine getAnalyzeurChaine() {
		return analyzeurChaine;
	}

	public void setAnalyzeurChaine(AnalyzeurDeChaine analyzeurChaine) {
		this.analyzeurChaine = analyzeurChaine;
	}
	
	
	public static void main(String[] args) {
		Scanner languageScanner = new Scanner(System.in);
		Scanner chaineScanner = new Scanner(System.in);
		String langage;
		String chaine;
		FournisseurHeure heureActuel = new FournisseurHeureSysteme();
		AnalyzeurDeChaine analyzeurChaine;
		Langage choixLangage;
		Main program;
		do {
			System.out.println("selectioner une langage/choose a language\n1-Francais\n2-english");
			langage =languageScanner.next();
			
		}while(langage.equals("1")==false && langage.equals("2")==false);
		if(langage.equals("1")) choixLangage = new Francais();
		else choixLangage = new Anglais();
		analyzeurChaine = new AnalyseurDeChaineSimple(choixLangage,heureActuel);
		program = new Main(analyzeurChaine);
		System.out.println(langage.equals("1")?"veuiller saisir une chaine ":"type a string2");
		chaine = chaineScanner.next();
		program.AnalyzerChaine(chaine);
		
		
	}

}

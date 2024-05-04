package com.architecture.tp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.architecture.tp.analyzer.AnalyseurChaineDefaultImp;
import com.architecture.tp.analyzer.AnalyzeurChaine;
import com.architecture.tp.horloge.HeureActualDefaultImp;
import com.architecture.tp.horloge.HeureActuel;
import com.architecture.tp.language.Anglais;
import com.architecture.tp.language.Francais;
import com.architecture.tp.language.Language;

@Component
public class Main {

	
	private AnalyzeurChaine analyzeurChaine;
	
	public Main(AnalyzeurChaine  analyzeurChaine) {
		this.analyzeurChaine = analyzeurChaine;
	}
	public void AnalyzerChaine(String chaine) {
		System.out.println(this.analyzeurChaine.AnalyserChaine(chaine));
	}

	public AnalyzeurChaine getAnalyzeurChaine() {
		return analyzeurChaine;
	}

	public void setAnalyzeurChaine(AnalyzeurChaine analyzeurChaine) {
		this.analyzeurChaine = analyzeurChaine;
	}
	
	
	public static void main(String[] args) {
		Scanner languageScanner = new Scanner(System.in);
		Scanner chaineScanner = new Scanner(System.in);
		String langage;
		String chaine;
		HeureActuel heureActuel = new HeureActualDefaultImp();
		AnalyzeurChaine analyzeurChaine;
		Language choixLangage;
		Main program;
		do {
			System.out.println("selectioner une langage/choose a language\n1-Francais\n2-english");
			langage =languageScanner.next();
			
		}while(langage.equals("1")==false && langage.equals("2")==false);
		if(langage.equals("1")) choixLangage = new Francais(heureActuel);
		else choixLangage = new Anglais(heureActuel);
		analyzeurChaine = new AnalyseurChaineDefaultImp(choixLangage);
		program = new Main(analyzeurChaine);
		System.out.println(langage.equals("1")?"veuiller saisir une chaine ":"type a string2");
		chaine = chaineScanner.next();
		program.AnalyzerChaine(chaine);
		
	}

}

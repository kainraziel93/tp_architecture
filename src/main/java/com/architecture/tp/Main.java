package com.architecture.tp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.architecture.tp.analyzer.AnalyseurChaineDefaultImp;
import com.architecture.tp.analyzer.AnalyzeurChaine;
import com.architecture.tp.language.Anglais;
import com.architecture.tp.language.Francais;
import com.architecture.tp.language.Language;

@Component
public class Main {

	
	private AnalyzeurChaine analyzeurChaine;
	
	public Main(AnalyzeurChaine  analyzeurChaine) {
		this.analyzeurChaine = analyzeurChaine;
	}
	public void AnalyzerChaine() {
		System.out.println(this.analyzeurChaine.AnalyserChaine("ada"));
	}

	public AnalyzeurChaine getAnalyzeurChaine() {
		return analyzeurChaine;
	}

	public void setAnalyzeurChaine(AnalyzeurChaine analyzeurChaine) {
		this.analyzeurChaine = analyzeurChaine;
	}
	
	public static void main(String[] args) {
		Language anglais = new Anglais();
		Language francais = new Francais();
		Main programmeFrancais =  new Main(new AnalyseurChaineDefaultImp(anglais));
		Main progammeAnglais = new Main(new AnalyseurChaineDefaultImp(francais));
		progammeAnglais.AnalyzerChaine();
		programmeFrancais.AnalyzerChaine();
		
	}

}

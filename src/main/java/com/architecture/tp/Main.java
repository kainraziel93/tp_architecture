package com.architecture.tp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.architecture.tp.analyzer.AnalyseurChaineDefaultImp;
import com.architecture.tp.analyzer.AnalyzeurChaine;

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
		new Main(new AnalyseurChaineDefaultImp()).AnalyzerChaine();
		
	}

}

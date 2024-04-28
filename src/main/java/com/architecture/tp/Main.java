package com.architecture.tp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Main {

	private String[] langue = {
			"Bonjour","Bonsoir","bien dit"
	};
	public Main(String[] langue) {
		this.langue = langue;
	}
	
	
	public String[] getLangue() {
		return langue;
	}


	public void setLangue(String[] langue) {
		this.langue = langue;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String[] francais = {
				"Bonjour","Bonsoir","bien dit","au revoir"
		};
		 String[] anglais = {
				"good morning","good night","well  done","later"
		};
		Scanner choixLangue = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		String saluer;
		String aquiter;
		System.out.println("choixir une langue : \n1-francais \n2-anglais");
		Main langage = scanner.next().equals("1")?new Main(francais):new Main(anglais);
		LocalTime time = LocalTime.now();
		if(time.isAfter(LocalTime.of(17, 0)) || time.isBefore(LocalTime.of(00,0))) {
			saluer = langage.getLangue()[1];
		}
		else {
			saluer = langage.getLangue()[0];
		}
		System.out.println(saluer);
		System.out.println("saisir une chaine");
		String chaineSaisie = scanner.next();
		StringBuilder chaineALinverse = new StringBuilder(chaineSaisie).reverse();
		String feliciter = chaineSaisie.equals(chaineALinverse.toString())?langage.getLangue()[2]:"";	
		System.out.println(feliciter+"\n"+langage.getLangue()[3]);
		
	}

}

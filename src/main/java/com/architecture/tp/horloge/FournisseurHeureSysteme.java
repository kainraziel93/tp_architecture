package com.architecture.tp.horloge;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

import com.architecture.domaine.FournisseurHeure;

@Service
public class FournisseurHeureSysteme implements FournisseurHeure {

	@Override
	public int heure() {
		
		return LocalTime.now().getHour();
	}

	
}

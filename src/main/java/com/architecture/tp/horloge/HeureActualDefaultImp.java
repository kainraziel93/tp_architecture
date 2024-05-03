package com.architecture.tp.horloge;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class HeureActualDefaultImp implements HeureActuel {

	@Override
	public int heure() {
		
		return LocalTime.now().getHour();
	}

	
}

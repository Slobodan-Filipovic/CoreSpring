package com.springinaction.knights;

public class DamselRescuingKnight implements Knight{

	RescueDamselQuest quest;
	
	public DamselRescuingKnight(RescueDamselQuest quest) {		 
		this.quest = quest;
	}

	@Override
	public void embarkOnQuest() {
		
		System.out.println("This is a damsel rescuing knight!");
	}

}

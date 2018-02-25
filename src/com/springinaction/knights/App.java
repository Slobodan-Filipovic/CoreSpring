package com.springinaction.knights;

public class App {
	public static void main(String [] args)
	{
		RescueDamselQuest quest = new RescueDamselQuest();
		DamselRescuingKnight knight1 = new DamselRescuingKnight(quest);
		
		knight1.embarkOnQuest();
		
	}

}

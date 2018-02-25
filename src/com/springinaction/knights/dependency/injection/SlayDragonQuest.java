package com.springinaction.knights.dependency.injection;

import java.io.PrintStream;

import com.springinaction.knights.Quest;

public class SlayDragonQuest implements Quest{
	
	private PrintStream stream;

	public SlayDragonQuest(PrintStream stream) {
		this.stream = stream;
	}

	@Override
	public void embark() {
		 stream.println("Dragon slaying quest!");
		
	}
	
	

}

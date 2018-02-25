package com.springinaction.knights.dependency.injection;

import com.springinaction.knights.Knight;
import com.springinaction.knights.Quest;

public class BraveKnight  implements Knight{

	Quest quest;
	
	
	public BraveKnight(Quest quest) {		 
		this.quest = quest;
	}


	@Override
	public void embarkOnQuest() {
		 quest.embark();		
	}

}

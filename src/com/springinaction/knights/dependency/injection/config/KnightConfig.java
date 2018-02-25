package com.springinaction.knights.dependency.injection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springinaction.knights.Knight;
import com.springinaction.knights.Quest;
import com.springinaction.knights.dependency.injection.BraveKnight;
import com.springinaction.knights.dependency.injection.SlayDragonQuest;

@Configuration
public class KnightConfig {
	
	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}

}

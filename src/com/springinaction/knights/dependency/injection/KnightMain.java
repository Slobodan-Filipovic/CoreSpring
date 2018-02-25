package com.springinaction.knights.dependency.injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springinaction.knights.Knight;
import com.springinaction.knights.dependency.injection.config.KnightConfig;

public class KnightMain {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getBean(KnightConfig.class);
		context.refresh();
		
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		
		context.close();
	}
}

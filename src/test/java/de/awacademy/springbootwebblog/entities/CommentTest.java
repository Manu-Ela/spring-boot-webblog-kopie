package de.awacademy.springbootwebblog.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommentTest {
    @Test
	public void name() {
		
		// 1. Testdaten vorbereiten
		Comment comment = new Comment("TestText", "TestName"); 
		
		// 2. Logik ausfuehren
		String name = comment.getName();
		
		// 3. Erwartungswerte pruefen
		assertEquals("TestName", name);
		
	}

}
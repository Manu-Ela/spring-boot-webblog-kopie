package de.awacademy.springbootwebblog.services;


public class CommentTest {
    @Test
	public void name() {
		
		// 1. Testdaten vorbereiten
		Comment comment = new Comment(1); // id = 1
		comment.setName("Test"); 
		
		// 2. Logik ausfuehren
		String name = comment.name();
		
		// 3. Erwartungswerte pruefen
		Assert.assertEquals("Test", name);
		
	}

}
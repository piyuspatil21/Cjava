package com.edu;

public class TextEditor {
	private SpellChecker spellChecker;
	
	public void spellCheck() {
		spellChecker.checkSpelling();
		
	}
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker");
		this.spellChecker = spellChecker;
	}

}

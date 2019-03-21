package it.polito.tdp.spellchecker.model;

public class RichWord {
	
	private String parolainput;
	private boolean corretta;
	
	public RichWord(String parolainput,boolean corretta){ //costruttore
		this.parolainput=parolainput;
		this.corretta=corretta;
	}

	public boolean isCorretta() {
		return corretta;
	}

	public String getParolainput() {
		return parolainput;
	}
	

}

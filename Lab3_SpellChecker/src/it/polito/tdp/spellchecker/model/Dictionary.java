package it.polito.tdp.spellchecker.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Dictionary {

	private List<String> dizionarioIta = new LinkedList<String>();
	private List<String> dizionarioIng = new LinkedList<String>();
	
	public void Dictionay() { //controller
		
	}
	
	/**
	 * Questo metodo permette di caricare in memoria il dizionario della lingua desiderata
	 * @param language
	 */
	public void loadDictionary(String language) {
		
		try {
			FileReader fr = new FileReader( "rsc/English.txt" );
			BufferedReader br = new BufferedReader(fr);
			String word ;
			while (( word = br .readLine()) != null ) {
			// Aggiungere parola alla struttura dati
				dizionarioIng.add(word);
			}
			br .close();
			} catch (IOException e ){
			System. out .println( "Errore nella lettura del file" );
			}
	
	
	try {
		FileReader fr = new FileReader( "rsc/Italian.txt" );
		BufferedReader br = new BufferedReader(fr);
		String word ;
		while (( word = br .readLine()) != null ) {
		// Aggiungere parola alla struttura dati
			dizionarioIta.add(word);
		}
		br .close();
		} catch (IOException e ){
		System. out .println( "Errore nella lettura del file" );
		}
	}
	


	
	/**
	 * Questo metodo esegue il controllo ortografico sul testo in input (rappresentato da una lista di parole)
	e restituisce una lista di RichWord . Per ogni elemento di inputTextList , spellCheckText controlla se
	la parola è presente nel dizionario. In caso affermativo, la RichWord corrispondente sarà corretta,
	altrimenti sarà errata.
	 * @param inputTextList
	 * @return  La lista delle RichWord viene restituita in output.
	 */
	
	public List<RichWord> spellCheckText(List<String> inputTextList ){
		
	}
}





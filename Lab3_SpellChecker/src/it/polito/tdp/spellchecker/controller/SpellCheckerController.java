package it.polito.tdp.spellchecker.controller;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.Dictionary;
import it.polito.tdp.spellchecker.model.RichWord;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class SpellCheckerController {
	
	private Dictionary model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> menu;

    @FXML
    private TextArea txtTesto;

    @FXML
    private Button btnCheck;

    @FXML
    private TextArea txtwrong;

    @FXML
    private Text txterror;

    @FXML
    private Button btnClear;

    @FXML
    private Text txttempo;

    @FXML
    void doClearText(ActionEvent event) {
    	txtTesto.clear();
    	txtwrong.clear();
    	txterror.setText(null);
    	txttempo.setText(null);

    }

    @FXML
    void doSpellCheck(ActionEvent event) { //solo questo metodo può interagire
    										//con l'interfaccia a prendere le parole inserite dall'utente
    	
    	long tempoinizio=System.nanoTime();
    	
    	//PULISCO L'INPUT PRESO DALL'INTERFACCIA
    	String[] input = txtTesto.getText()
    	.replaceAll("[.,\\/#!$%\\^&\\*;:{}=\\-_`~()\\[\\]\"]", "")
    	.toLowerCase()
    	.split(" ");
    	
    	//SALVO L'INPUT IN UNA STRINGA
    	List<String> inputlist = new LinkedList<String>(); 
//    	int i=0;
//    	for(i=0; i<input.length; i++) {
//    		inputlist.add(input[i]);
//    	}
    	for (String s : input) {
    		inputlist.add(s);
    	}
    	
    	Dictionary d = new Dictionary();
    	d.loadDictionary(menu.getValue());
    	List<RichWord> listaRW = d.spellCheckText(inputlist);
    	
    	int i=0;
    	for(RichWord tmp: listaRW) {
    		if(!tmp.isCorretta()) {
    			txtwrong.appendText(tmp.getParolainput()+"\n");
    			i++;
    		}
    	}
    	txterror.setText("The text contains "+ i + " errors");
    	long tempofine=System.nanoTime();
    	double t=(double) (tempofine-tempoinizio)/Math.pow(10, 9);
    	txttempo.setText(null);
    	txttempo.setText( "Tempo esecuzione: " + t+ " seconds");
    	
    }

    @FXML
    void initialize() {
        assert menu != null : "fx:id=\"menu\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtTesto != null : "fx:id=\"txtTesto\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert btnCheck != null : "fx:id=\"btnCheck\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txtwrong != null : "fx:id=\"txtwrong\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txterror != null : "fx:id=\"txterror\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert txttempo != null : "fx:id=\"txttempo\" was not injected: check your FXML file 'SpellChecker.fxml'.";

    }
    
    
    public void setModel (Dictionary m) {
    	this.model = m;
    	menu.getItems().addAll("English", "Italian");
    	menu.getValue();
    	
    	}
   
    
}

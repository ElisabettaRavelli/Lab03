package it.polito.tdp.spellchecker.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.spellchecker.model.Dictionary;
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

    }

    @FXML
    void doSpellCheck(ActionEvent event) {

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

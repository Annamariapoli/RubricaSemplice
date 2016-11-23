package it.polito.tdp.rubricaSemplice;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.rubricaModel.Model;
import it.polito.tdp.rubricaModel.Voce;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RubricaSempliceController {
	
	private Model model = new Model();


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNome;

    @FXML
    private Button btnCerca;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtTel;

    @FXML
    private Button btnInserisci;

    @FXML
    private Label labelStato;

    @FXML
    void doCerca(ActionEvent event) {                  //funziona
    	String nome = txtNome.getText();
    	String email = txtEmail.getText();
    	String telefono = txtTel.getText();
    	
    	Voce v = null;
    	model.cerca(nome, email, telefono);
    	if(model.cerca(nome, email, telefono)!=null){      
    		v = model.cerca(nome, email, telefono);
    	    txtNome.setText(v.getNome());
    	    txtEmail.setText(v.getEmail());
    	    txtTel.setText(v.getTelefono());
    	    labelStato.setText("Trovato");
    	
    	}
    	else {
    		    labelStato.setText("Non Trovato");
    	}
    }

    @FXML
    void doInserisci(ActionEvent event) {        //funziona
    	String nome = txtNome.getText();
    	String email = txtEmail.getText();
    	String telefono = txtTel.getText();
   
    	if(nome.isEmpty() || email.isEmpty() || telefono.isEmpty()) {
    		String stato= "Inserire tutti i campi ";                       //alternativa:      labelStato.setText("Inserire tutti i campi ");                                         
    		labelStato.setText(stato);
    	}
    	else {
    	Voce voce = new Voce(nome, email,telefono);
    	model.addVoce(voce);
    	labelStato.setText("Voce inserita");
    	}

    }

    @FXML
    void initialize() {
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'RubricaSemplice.fxml'.";
        assert btnCerca != null : "fx:id=\"btnCerca\" was not injected: check your FXML file 'RubricaSemplice.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'RubricaSemplice.fxml'.";
        assert txtTel != null : "fx:id=\"txtTel\" was not injected: check your FXML file 'RubricaSemplice.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'RubricaSemplice.fxml'.";
        assert labelStato != null : "fx:id=\"labelStato\" was not injected: check your FXML file 'RubricaSemplice.fxml'.";

    }
}


package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Library;

public class AddPatronController extends Controller<Library>{
    
    public Library getPatron(){ return model;}
    @FXML private TextField idTf;
    @FXML private TextField nameTf;
    @FXML private Text PatronT;
    private int getId(){return Integer.parseInt(idTf.getText());}
    private String getName(){ return nameTf.getText();}
    @FXML private void handleAdd(ActionEvent event){
        if(getPatron().getPatron(getId())== null){
        getPatron().addPatron(getId(),getName());
        PatronT.setText("Patron added.");}
        else
        PatronT.setText("Patron already exists!");
    }
}

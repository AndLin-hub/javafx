package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Library;
import model.Patron;

public class RemovePatronController extends Controller<Library> {
    
    public final Library getLibrary(){ return model; }
    
    @FXML private ListView<Patron> patronsLv;
    
    private Patron getSelectedPatron(){
        return patronsLv.getSelectionModel().getSelectedItem();}
    
    @FXML private void handleRemovePatron(ActionEvent event){
        getLibrary().removePatron(getSelectedPatron());
    }
   
}
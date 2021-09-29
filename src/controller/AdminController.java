package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import model.Library;

public class AdminController extends Controller<Library>{
    
    public final Library getLibrary() {
        return model;
    }
    
    
    @FXML private void handleAddBook(ActionEvent event) throws Exception {    
        ViewLoader.showStage(getLibrary().getCatalogue(), "/view/addBook.fxml", "Add Book",new Stage());
    }
    
    @FXML private void handleAddPatron(ActionEvent event) throws Exception {
        ViewLoader.showStage(getLibrary(),"/view/addPatron.fxml","Add Patron",new Stage());
    }
    
    @FXML private void handleRemoveBook(ActionEvent event) throws Exception {
        ViewLoader.showStage(getLibrary().getCatalogue(),"/view/removeBook.fxml","Remove Book",new Stage());
    }
    
    @FXML private void handleRemovePatron(ActionEvent event) throws Exception {
       ViewLoader.showStage(getLibrary(),"/view/removePatron.fxml","Remove Patron",new Stage());
    }
}

package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import model.Library;

public class LibraryController extends Controller<Library> {
    @FXML
    public void initialize() {
        
    }

    public final Library getLibrary() {
        return model;
    }
    @FXML private void handleCatalogue(ActionEvent event) throws Exception{
        
         ViewLoader.showStage(getLibrary().getCatalogue(), "/view/catalogue.fxml" , "Catalogue", new Stage());
    }
    @FXML private void handleAdmin(ActionEvent event) throws Exception{
        
         ViewLoader.showStage(getLibrary(),"/view/admin.fxml","Administration Menu" ,new Stage());
    
    }
     
    @FXML private void handleFavourites(ActionEvent event) throws Exception{
        ViewLoader.showStage(getLibrary(), "/view/favourites.fxml", "Favourites",new Stage());
    }
    
    @FXML private void handleRecord(ActionEvent event) throws Exception{
        ViewLoader.showStage(getLibrary(),"/view/record.fxml","Records",new Stage());
    }
    
    @FXML private void handleCloseAll(ActionEvent event) throws Exception{
        Platform.exit();
}
}

package controller;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import model.Catalogue;
import model.Library;

public class CatalogueController extends Controller<Catalogue>{

     public final Catalogue getCatalogue() {
        return model;
    }
     
     @FXML private void handleAllBooks(ActionEvent event) throws Exception{
        ViewLoader.showStage(getCatalogue(),"/view/showAllBooks.fxml","Complete Catalogue",new Stage());
    }
     
     @FXML private void handleAvailableBooks(ActionEvent event) throws Exception{
        ViewLoader.showStage(getCatalogue(),"/view/showAvailableBooks.fxml", "Available Books",new Stage());
     }
     
     @FXML private void handleGenre(ActionEvent event) throws Exception{
         ViewLoader.showStage(getCatalogue(),"/view/showBooksByGenre.fxml","Browse by Genre",new Stage());
     }
     
     @FXML private void handleAuthor(ActionEvent event) throws Exception{
         ViewLoader.showStage(getCatalogue(), "/view/showBooksByAuthor.fxml", "Broswe by Author", new Stage());
     }
     
     @FXML private void handleBorrow(ActionEvent event) throws Exception{
         ViewLoader.showStage(getCatalogue(),"/view/borrow.fxml", "Borrow a Book", new Stage());
     }
     
     @FXML private void handleReturn(ActionEvent event) throws Exception{
         ViewLoader.showStage(getCatalogue(), "/view/return.fxml", "Return a Book", new Stage());
     }
     
     @FXML private void handlePlace(ActionEvent event) throws Exception{
         ViewLoader.showStage(getCatalogue(),"/view/placeHold.fxml","Place a Hold", new Stage());
     }
}

package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Book;
import model.Catalogue;
import model.Library;

public class RemoveBookController extends Controller<Catalogue>{
    
   public final Catalogue getCatalogue(){ return model;}
    
   @FXML private ListView<Book> booksLv;

   private Book getSelectedBook(){
       return booksLv.getSelectionModel().getSelectedItem();
   }
   
   @FXML private void handleRemoveBook(ActionEvent event){
       getCatalogue().removeBook(getSelectedBook());
   }
}

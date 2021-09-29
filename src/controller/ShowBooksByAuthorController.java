package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Author;
import model.Book;
import model.Catalogue;

public class ShowBooksByAuthorController extends Controller<Catalogue>{
    @FXML private ListView<Author> authorLv;
    @FXML private ListView<Book> bookLv;
  
    
    public final Catalogue getShowByAuthor(){return model;}
    
    private Author getSelectedAuthor(){
        return authorLv.getSelectionModel().getSelectedItem();
    }
    
    @FXML private void handleDisplay(){
        bookLv.setItems(getShowByAuthor().getBooksByAuthor(getSelectedAuthor()));
    }
}
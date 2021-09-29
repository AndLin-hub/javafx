package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Book;
import model.Catalogue;
import model.Genre;

public class ShowBooksByGenreController extends Controller<Catalogue>{
    @FXML ListView<Genre> genreLv;
    @FXML ListView<Book> bookLv;
    public final Catalogue getGenre(){return model;}
    
    @FXML private Genre getSelectedGenre(){
        return genreLv.getSelectionModel().getSelectedItem();}
    
    @FXML private void handleDisplay(ActionEvent event){
        bookLv.setItems(getGenre().getBooksInGenre(getSelectedGenre()));
    }
}

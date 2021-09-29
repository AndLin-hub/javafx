package controller;

import au.edu.uts.ap.javafx.Controller;
import static java.lang.Integer.parseInt;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Book;
import model.Catalogue;
import model.Patron;

public class ReturnController extends Controller<Catalogue>{
    public final Catalogue getReturn(){return model;}
    @FXML private TextField patronTf;
    @FXML private ListView<Book> returnLv;
    @FXML private Button selectBtn;
    @FXML private Button returnBtn;
    private Patron patron;
    
    @FXML private void initialize(){
        patronTf.textProperty().addListener((o,oldText,newText) -> selectBtn.setDisable(patronTf.getText().isEmpty()));
        returnLv.getSelectionModel().selectedItemProperty().addListener((o,oldBook,newBook)-> returnBtn.setDisable(getSelectedBook()==null));
    }
    
    
    private Patron getPatron(){
        return patron = getReturn().getPatron(parseInt(patronTf.getText()));
    }
    @FXML private Book getSelectedBook(){
        return returnLv.getSelectionModel().getSelectedItem();
    }
    @FXML private void handleSelect(ActionEvent event){
        returnLv.setItems(getPatron().currentlyBorrowed());
    }
    
    @FXML private void handleReturn(ActionEvent event){
       getReturn().returnBookFromPatron(getSelectedBook(),patron);
       handleSelect(event);
    }
}

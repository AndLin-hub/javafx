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

public class BorrowController extends Controller<Catalogue>{
    @FXML private TextField patronTf;
    @FXML private ListView<Book> borrowLv;
    @FXML private Button selectBtn;
    @FXML private Button borrowBtn;
    private Patron Patron;
    public final Catalogue getBorrow(){ return model; }
    
    @FXML private void initialize(){
        patronTf.textProperty().addListener((o,oldText,newText)-> selectBtn.setDisable(patronTf.getText().isEmpty()));
        borrowLv.getSelectionModel().selectedItemProperty().addListener((o,oldBook, newBook) -> borrowBtn.setDisable(getPatron()==null));
    }
    private Patron getPatron(){
        return Patron = getBorrow().getPatron(parseInt(patronTf.getText()));
    }
    private Book getSelectedBook(){
       return borrowLv.getSelectionModel().getSelectedItem();
   } 
    @FXML private void handleSelect(ActionEvent event){
        borrowLv.setItems(getBorrow().getBorrowableBooks(getPatron()));
    }
    
    @FXML private void handleBorrow(ActionEvent event){
        getBorrow().loanBookToPatron(getSelectedBook(),Patron);
        handleSelect(event);
    }
}

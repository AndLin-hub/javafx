package controller;

import au.edu.uts.ap.javafx.Controller;
import static java.lang.Integer.parseInt;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Book;
import model.Catalogue;
import model.Patron;

public class PlaceHoldController extends Controller<Catalogue>{
    @FXML private TextField patronTf;
    @FXML private ListView<Book> holdLv;
    @FXML private Button selectBtn;
    @FXML private Button holdBtn;
    private Patron patron;
    @FXML private Text holdT;
    public final Catalogue getPlaceHold(){ return model;}
    
    @FXML private void initialize(){
        patronTf.textProperty().addListener((o,oldText,newText)->selectBtn.setDisable(patronTf.getText().isEmpty()));
        holdLv.getSelectionModel().selectedItemProperty().addListener((o,oldBook,newBook) -> holdBtn.setDisable(getSelectedBook()==null));
    }
    @FXML private void handleSelect(ActionEvent event){
        getPatron();
        if(getPatron() == null)
              holdT.setText("No Patron Selected");

    }
    @FXML private Patron getPatron(){
        return patron = getPlaceHold().getPatron(parseInt(patronTf.getText()));
    }
    @FXML private Book getSelectedBook(){
        return holdLv.getSelectionModel().getSelectedItem();
    }
    @FXML private void handleHold(ActionEvent event){
        if(!getSelectedBook().isHeldBy(patron)){
        getSelectedBook().addHold(patron);
        holdT.setText("Hold placed on " +getSelectedBook().getTitle() + " for " + getPatron().getName());}
        else
        holdT.setText(getPatron().getName() + " has already placed a hold on " + getSelectedBook().getTitle());
        
}
    
    
}

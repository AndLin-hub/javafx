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
import model.Library;
import model.Patron;

public class RecordController extends Controller<Library> {
    @FXML private ListView<Book> currentlyLv;
    @FXML private ListView<Book> historyLv;
    @FXML private TextField patronTf;
    @FXML private Text recordT;
    @FXML private Button recordBtn;
    private Patron patron;
    public final Library getRecord(){return model;}
    @FXML private void initialize(){
    patronTf.textProperty().addListener((o,oldText,newText)-> recordBtn.setDisable(patronTf.getText().isEmpty()) );
    }
    private Patron getPatron(){
        return patron = getRecord().getPatron(parseInt(patronTf.getText()));
    }
    
    @FXML private void handleRecord(ActionEvent event){
        recordT.setText(getPatron().toString());
        currentlyLv.setItems(patron.currentlyBorrowed());
        historyLv.setItems(patron.borrowingHistory());
    }
    
}

package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Catalogue;

public class AddBookController extends Controller<Catalogue>{
    @FXML private TextField titleTf;
    @FXML private TextField authorTf;
    @FXML private TextField genreTf;
    @FXML private Text AddT;
    public final Catalogue getAddBook() { return model;}
    
    @FXML private void initalize(){
        
    }
        
    @FXML private String getAuthor(){
        return authorTf.getText();
    }
    @FXML private String getTitle(){
        return titleTf.getText();
    }
    @FXML private String getGenre(){
        return genreTf.getText();
    }
    @FXML private final void handleAdd(ActionEvent event) throws Exception{
        if(!getAddBook().hasBook(getTitle(),getAuthor())){
            getAddBook().addBook(getTitle(), getAuthor(), getGenre());
            AddT.setText("Book added to Catalogue.");
        }
        else
            AddT.setText("That book is already in the Catalogue.");
    }
    
}

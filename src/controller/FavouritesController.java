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

public class FavouritesController extends Controller<Library>{
    @FXML private TextField PatronTf;
    @FXML private ListView<Book> favouritesLv; 
    @FXML private Text favouriteT;
    @FXML private Button favouriteBtn;
    public final Library getFavourite(){ return model;}
       
   @FXML private void initialize(){
    PatronTf.textProperty().addListener((o,oldText,newText)-> favouriteBtn.setDisable(PatronTf.getText().isEmpty()) );}
    private Patron getPatron(){
        return getFavourite().getPatron(parseInt(PatronTf.getText()));
    }
    
    @FXML private void handleFavourites(ActionEvent event){
        favouritesLv.setItems(getPatron().favourites());
        if(getFavourite().getPatron(parseInt(PatronTf.getText())) == getPatron() )
        favouriteT.setText(getPatron().getName()+ "'s favourite books:");
        else
        favouriteT.setText("Invalid Patron.");
    }

       

}
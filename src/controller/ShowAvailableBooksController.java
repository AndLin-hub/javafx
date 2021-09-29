package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Book;
import model.Catalogue;
import model.Patron;

public class ShowAvailableBooksController extends Controller<Catalogue> {

       public final Catalogue getCatalogue(){ return model; }
      
}   

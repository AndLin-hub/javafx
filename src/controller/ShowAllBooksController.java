package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import model.Book;
import model.Catalogue;

public class ShowAllBooksController extends Controller<Catalogue>{
   public final Catalogue getCatalogue(){return model;}

}


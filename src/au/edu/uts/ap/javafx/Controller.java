package au.edu.uts.ap.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.*;

public abstract class Controller<M> {
    protected M model;
    protected Stage stage;
    
    @FXML private void handleExit(ActionEvent event){
        stage.close();}
}

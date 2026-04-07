package mvcViews;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class mainController {


    @FXML
    void onClickCash(ActionEvent event) {
    	System.out.println("Cash clicked");

    }

    @FXML
    void onClickGrocery(ActionEvent event) {
    	System.out.println("Grocery clicked");
    }



}

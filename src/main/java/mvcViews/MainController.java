package mvcViews;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import mvcModel.ViewTransitionModelInterface;


public class MainController {
	
	ViewTransitionModelInterface model;

	public void setModel(ViewTransitionModelInterface model) {
		this.model = model;
	}
	

    @FXML
    void onClickCash(ActionEvent event) {
    	model.showCash();
    	System.out.println("Cash clicked");

    }

    @FXML
    void onClickGrocery(ActionEvent event) {
    	model.showGroceries();
    	System.out.println("Grocery clicked");
    }



}

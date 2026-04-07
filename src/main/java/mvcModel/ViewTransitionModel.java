package mvcModel;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import mvcViews.CashController;

public class ViewTransitionModel implements ViewTransitionModelInterface {

	BorderPane mainview;
	StoreModel model;
	
	public ViewTransitionModel(BorderPane view, StoreModel model) {
		this.mainview = view;
		this.model = model;
	}
	
	@Override
	public void showCash() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class.getResource("../mvcViews/cashView.fxml"));
		
		try {
			BorderPane view = loader.load();
			mainview.setCenter(view);
			CashController cont = loader.getController();
			cont.setModel(model);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void showGroceries() {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionModel.class.getResource("../mvcViews/groceryView.fxml"));
		
		try {
			Node view = loader.load();
			mainview.setCenter(view);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

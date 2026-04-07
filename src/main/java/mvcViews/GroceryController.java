package mvcViews;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import mvcModel.GroceryItem;
import mvcModel.StoreModel;

public class GroceryController {

	StoreModel model;
	
	public void setModel(StoreModel newModel) {
		this.model = newModel;
		grocView.setItems(model.getGroceries());
	}
	
    @FXML
    private ListView<GroceryItem> grocView;

    @FXML
    private TextField itemCostLabel;

    @FXML
    private TextField itemNameLabel;

    private double getAmt() {
    	String val = itemCostLabel.textProperty().get();
		double amt = 0;
		
		try {
			amt = Double.parseDouble(val);
		}
		catch(NumberFormatException e) {
			itemCostLabel.textProperty().set("");
		}
		
		return amt;
    }
    
    @FXML
    void onAddItem(ActionEvent event) {

    	GroceryItem gi = new GroceryItem(itemNameLabel.textProperty().get(), 
    			getAmt());
    	
    	model.getGroceries().add(gi);
    	
    }
    
	
}

package mvcViews;

import javafx.beans.binding.Bindings;
import javafx.css.converter.StringConverter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;
import mvcModel.StoreModel;

public class CashController {
	
	StoreModel model;

	@FXML
	private Label cashBalanceLabel;

	@FXML
	private TextField deltaCashTextField;
	 
	public void setModel(StoreModel newModel) {
		this.model = newModel;
		
		// bind label
		NumberStringConverter fmt = new NumberStringConverter();
	
		Bindings.bindBidirectional(cashBalanceLabel.textProperty(),
				model.getMoney(), fmt);
	
	}
	
	private double getAmt() {
		String val = deltaCashTextField.textProperty().get();
		double amt = 0;
		
		try {
			amt = Double.parseDouble(val);
		}
		catch(NumberFormatException e) {
			deltaCashTextField.textProperty().set("");
		}
		
		return amt;
	}

	    @FXML
	    void onAddCash(ActionEvent event) {
	    	double value = getAmt();
	    	model.deltaMoney(value);
	    	
	    }

	    @FXML
	    void onRemoveCash(ActionEvent event) {
	    	double value = getAmt();
	    	model.deltaMoney(-1 * value);

	    }
}

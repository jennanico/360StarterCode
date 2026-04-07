package mvcModel;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StoreModel {

	DoubleProperty money = new SimpleDoubleProperty();
	ObservableList<GroceryItem> groceries = FXCollections.observableArrayList();
	
	public StoreModel() {
		
		
	}
	
	/**
	 * @return the money
	 */
	public DoubleProperty getMoney() {
		return money;
	}

	/**
	 * @return the groceries
	 */
	public ObservableList<GroceryItem> getGroceries() {
		return groceries;
	}

	
	public void deltaMoney(double amt) {
		money.set(money.get()+amt);
	}
	
}

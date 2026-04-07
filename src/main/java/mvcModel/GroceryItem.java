package mvcModel;

import java.util.Objects;

public class GroceryItem {
	
	String name;
	Double cost;
	
	/**
	 * @param name
	 * @param cost
	 */
	public GroceryItem(String name, Double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return name + " : " + cost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryItem other = (GroceryItem) obj;
		return Objects.equals(cost, other.cost) && Objects.equals(name, other.name);
	}
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the cost
	 */
	public Double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(Double cost) {
		this.cost = cost;
	}

}

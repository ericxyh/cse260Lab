
public class RecipeIngredient extends Ingredient {
	
	private float quantity;
	
	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit,float quantity) {
		super(name, measuringUnit, caloriesPerUnit);
		this.quantity = quantity;
	}
	
	public float getQuantity() {
		return quantity;
	}
	
	public void setQuantity(float quant) {
		quantity = quant;
	}
	
	public String toString() {
		return super.toString() + "quantity="+ getQuantity();
	}
	/*
	public boolean equals(Object o) {
		return super.equals(o) && getQuantity() == ((RecipeIngredient)o).getQuantity();
	}*/
	
}

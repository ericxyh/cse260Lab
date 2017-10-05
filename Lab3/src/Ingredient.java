
public class Ingredient {
	
	private String name;
	private String unit;
	private int calorie;
	
	public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
		this.name = name;
		this.unit = measuringUnit;
		this.calorie = caloriesPerUnit;
	}
	
	public String toString() {
		return "Ingredient\n"+ "name=" + name + "\n" +"measuringUnit=" +
				unit + "\n" + "caloriesPerUnit="+ calorie;
	}
	
	public boolean equals(Object o) {
		return getName().equals(((Ingredient)o).getName()) 
				&& getUnit().equals(((Ingredient)o).getUnit()) 
				&& getCal() == ((Ingredient)o).getCal();
	}
	
	public String getName() {
		return name;
	}
	
	public String getUnit() {
		return unit;
	}
	
	public int getCal() {
		return calorie;
	}
}

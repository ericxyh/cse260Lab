import java.util.ArrayList;
public class CookingRecipe {
	
	private String name;
	private ArrayList<RecipeIngredient> list;
	
	public CookingRecipe(String name) {
		this.name = name;
		list = new ArrayList<RecipeIngredient>();
	}
	
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(ingredient)) {
				RecipeIngredient newIngredient = list.get(i);
				newIngredient.setQuantity(quantity);
				list.set(i, newIngredient);
				return;
			}
		}
		list.add(new RecipeIngredient(ingredient.getName(),
				ingredient.getUnit(), ingredient.getCal(), quantity));
	}
	

	public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
		return getRecipeIngredient(ingredient.getName());
	}
	
	public RecipeIngredient getRecipeIngredient(String ingredientName) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(ingredientName))
				return list.get(i);
		}
		return null;
	}
	

	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
		return removeRecipeIngredient(ingredient.getName());
	}
	
	public RecipeIngredient removeRecipeIngredient(String ingredientName) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(ingredientName))
				return list.remove(i);
		}
		return null;
	}

	public float calculateCalories() {
		float answer = 0;
		for (RecipeIngredient recipeIngredient : list) {
			answer += recipeIngredient.getQuantity();
		}
		return answer;
	}

	public int getNumberOfIngredients() {
		return list.size();
	}

	public String toString(){
		String result = name + "\n";
		for (RecipeIngredient recipeIngredient : list) {
			result += recipeIngredient.toString();
		}
		return result;
	}
}

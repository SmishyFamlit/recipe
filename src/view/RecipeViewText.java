package view;


import model.RecipeModelState;

import java.util.Map;

/**
 * Represents an implementation of the RecipeView interface that can show elements of your recipe in text.
 */
public class RecipeViewText implements RecipeView {
    private RecipeModelState recipeState;

    public RecipeViewText(RecipeModelState recipeState) {
        this.recipeState = recipeState;
    }


    @Override
    public String showIngredients() {
        String output = "";

        for(Map.Entry<String, String> entry : this.recipeState.getIngredientList().entrySet()) {
            output += entry.getKey() + " : " + entry.getValue() + "\n";
        }

        return output;
    }
}

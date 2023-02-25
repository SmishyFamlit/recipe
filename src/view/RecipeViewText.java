package view;


import model.RecipeModelState;

import java.util.ArrayList;
import java.util.Map;

import static model.RecipeModel.Units.Nothing;

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

        for(Map.Entry<String, ArrayList> entry : this.recipeState.getIngredientList().entrySet()) {

            Object amount = entry.getValue().get(0);

            Object units = "";
            if (entry.getValue().get(1) == Nothing) {

            } else {
                units = entry.getValue().get(1);
            }

            output += entry.getKey() + " : " + amount + " " +  units + "\n";
        }

        return output;
    }
}

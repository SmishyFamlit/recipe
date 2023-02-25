package model;

import java.util.HashMap;
import java.util.Map;

/**
 * This interface represents the commands needed to check out the state of the recipe.
 */
public interface RecipeModelState {

    Map<String, String> getIngredientList();

}

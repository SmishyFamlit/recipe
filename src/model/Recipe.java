package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static model.RecipeModel.Units.Cups;

/**
 * Represents a recipe. This recipe is an implementaton of the RecipeModel. The reciepe consists of a name,
 * serving size, list of ingredients.
 */
public class Recipe implements  RecipeModel{
    private final String recipeName;
    private int servings;
    private Map<String, String> ingredients = new HashMap<String, String>();


    /**
     * Constructor for making a recipe.
     * @param recipeName the name of the recipe.
     * @param servings how many servings will the recipe produce.
     */
    public Recipe(String recipeName, int servings) {
        this.recipeName = recipeName;
        this.servings = servings;
    }


    public void add(String ingredient, double amount) {

        this.ingredients.put(ingredient, String.valueOf(amount));
    }


    @Override
    public void add(String ingredient, double amount, Units units) {

        String printedUnits = "";
        switch (units) {
            case Cups: printedUnits = "CUPS";
                    break;
            case Teaspoons: printedUnits = "TSP";
                    break;
            case Tablespoons: printedUnits = "TBSP";
                    break;
            default: printedUnits = "INVALID UNITS";
                    break;
        }
        this.ingredients.put(ingredient, String.valueOf(amount) + " " + printedUnits);
    }

    @Override
    public void increaseServings(double amount) {

    }

    /**
     * Gets the ingredients list.
     * @return the Map of the ingredient list.
     */
    @Override
    public Map<String, String> getIngredientList() {
        return ingredients;
    }
}

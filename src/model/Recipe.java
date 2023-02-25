package model;

import java.lang.reflect.Array;
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
    private Map<String, ArrayList> ingredients = new HashMap<String, ArrayList>();


    /**
     * Constructor for making a recipe.
     * @param recipeName the name of the recipe.
     * @param servings how many servings will the recipe produce.
     */
    public Recipe(String recipeName, int servings) {
        this.recipeName = recipeName;
        this.servings = servings;
    }


    public void add(String ingredient, ArrayList amountUnit) {

        this.ingredients.put(ingredient, amountUnit);
    }


//    @Override
//    public void add(String ingredient, double amount, Units units) {
//
//        String printedUnits = "";
//        switch (units) {
//            case Cups: printedUnits = "CUPS";
//                    break;
//            case Teaspoons: printedUnits = "TSP";
//                    break;
//            case Tablespoons: printedUnits = "TBSP";
//                    break;
//            default: printedUnits = "INVALID UNITS";
//                    break;
//        }
//
//        ArrayList amountUnits = new ArrayList();
//        amountUnits.add(amount);
//        amountUnits.add(units);
//        this.ingredients.put(ingredient, amountUnits);
//    }

    @Override
    public void changeServings(int newServing) {


    }

    /**
     * Gets the ingredients list.
     * @return the Map of the ingredient list.
     */
    @Override
    public Map<String, ArrayList> getIngredientList() {
        return ingredients;
    }
}

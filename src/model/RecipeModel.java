package model;

/**
This interface represents the methods offered by a recipe implementation
 */
public interface RecipeModel extends  RecipeModelState{

    enum Units {
        Cups, Teaspoons, Tablespoons
    }

    /**
     * Add an ingredient to a recipe without its units
     * @param ingredient the item that is being added to the recipe.
     * @param amount how much ingredient is being added.
     */
    void add(String ingredient, double amount);

    /**
     * Adds an ingredient to a recipe with its units
     * @param ingredient the item that is being added to the recipe.
     * @param amount how much ingredient is being added.
     */
    void add(String ingredient, double amount, Units units);


    /**
     * Increases the serving amounts of a recipe.
     * @param amount is the serving size that you want in the recipe.
     */
    void increaseServings(double amount);
}



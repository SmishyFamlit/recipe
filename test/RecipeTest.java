import model.Recipe;
import model.RecipeModel;
import model.RecipeModelState;
import org.junit.Before;
import org.junit.Test;
import view.RecipeView;
import view.RecipeViewText;

import static junit.framework.TestCase.assertEquals;

public class RecipeTest {

    RecipeModel chickenRecipe;
    RecipeView recipeView;
    @Before
    public void init() {
        this.chickenRecipe = new Recipe("Chipotle Chicken", 6);
        this.recipeView = new RecipeViewText(chickenRecipe);
    }

    @Test
    public void testAdd() {
        chickenRecipe.add("Boneless Chicken Thighs", 6);
        assertEquals("Boneless Chicken Thighs : 6.0\n", recipeView.showIngredients());
        chickenRecipe.add("Salt", 2.5, RecipeModel.Units.Teaspoons);
        assertEquals("Boneless Chicken Thighs : 6.0\n" +
                "Salt : 2.5 TSP\n", recipeView.showIngredients());




    }
}

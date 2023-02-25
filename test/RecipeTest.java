import model.Recipe;
import model.RecipeModel;
import model.RecipeModelState;
import org.junit.Before;
import org.junit.Test;
import view.RecipeView;
import view.RecipeViewText;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static model.RecipeModel.Units.*;

public class RecipeTest {

    RecipeModel chickenRecipe;
    RecipeView recipeView;
    @Before
    public void init() {
        this.chickenRecipe = new Recipe("Chipotle Chicken", 6);
        this.recipeView = new RecipeViewText(chickenRecipe);
    }

    /**
     * Test the add method for recipes.
     */
    @Test
    public void testAdd() {
        chickenRecipe.add("Boneless Chicken Thighs", new ArrayList(List.of(6, Nothing)));
        assertEquals("Boneless Chicken Thighs : 6 \n", recipeView.showIngredients());
        chickenRecipe.add("Salt", new ArrayList(List.of(3, Tablespoons)));
        chickenRecipe.add("Can of Chipotle peppers in adobe", new ArrayList(List.of(1, Nothing)));
        chickenRecipe.add("Cloves of garlic grated", new ArrayList(List.of(4, Tablespoons)));
        assertEquals("Boneless Chicken Thighs : 6 \n" +
                "Salt : 3 Tablespoons\n" +
                "Cloves of garlic grated : 4 Tablespoons\n" +
                "Can of Chipotle peppers in adobe : 1 \n", recipeView.showIngredients());




    }
}

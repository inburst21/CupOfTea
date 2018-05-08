package iskills.com.cupOfT.models;

import java.util.ArrayList;

import iskills.com.cupOfT.liquids.Liquid;

/**
 * lennyhicks
 * 5/7/18
 */
public class Cup {
    private ArrayList ingredients = new ArrayList<>();
    private Liquid liquid;

    public void fillWith(Liquid liq){
        this.liquid = liq;
    }

    //TODO Step 6 Change Object to Box
    public void add(Object ingredient) {
        ingredients.add(ingredient);
    }

    public ArrayList getIngredients() {
        return ingredients;
    }
}

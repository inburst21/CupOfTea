package iskills.com.cupOfT.models;

import java.util.ArrayList;

/**
 * lennyhicks
 * 5/7/18
 */
public class Cup<T> {
    private ArrayList<T> ingredients = new ArrayList<T>();

    public void fillWith(T liq){
        add(liq);
    }

    public void empty(){
        ingredients = new ArrayList<>();
    }

    //TODO Step 2 Change Object to Box
    public void add(T ingredient) {
        ingredients.add(ingredient);
    }

    public ArrayList<T> getIngredients() {
        return ingredients;
    }
}
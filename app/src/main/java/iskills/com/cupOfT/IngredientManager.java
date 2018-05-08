package iskills.com.cupOfT;
import java.util.ArrayList;
import java.util.LinkedList;
import iskills.com.cupOfT.liquids.Liquid;
import iskills.com.cupOfT.liquids.Milk;
import iskills.com.cupOfT.liquids.Tea;
import iskills.com.cupOfT.models.Empty;

/**
 * lennyhicks
 * 5/7/18
 */
class IngredientManager{

    //TODO Step 7 change to a list of the new Box class
    private LinkedList<Liquid> ingredientList = new LinkedList<>();

    //TODO Step 8 Use the addSelection method with the same arguments
    IngredientManager(){
        ingredientList.add(new Empty()); //  This would be the point a developer would come across trying to extend everything
        ingredientList.add(new Milk());
        ingredientList.add(new Tea());
    }

    //TODO Step 9 - For steps 9-12 update arguments to use Box
    private LinkedList<Liquid> getIngredientList() {
        return ingredientList;
    }

    //TODO Step 10
    public ArrayList<String> getIngredientNames() {
            ArrayList<String> ingredientNames = new ArrayList<>();
            for (Liquid ingredient : getIngredientList()) {
                ingredientNames.add(ingredient.getName());
            }
            return ingredientNames;

    }

    //TODO Step 11
    public Liquid getIngredient(int position){
        return ingredientList.get(position);
    }

    //TODO Step 12
    private void addSelection(Liquid ingredient){
        ingredientList.add(ingredient);
    }
}

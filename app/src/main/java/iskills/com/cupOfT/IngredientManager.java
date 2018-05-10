package iskills.com.cupOfT;

import java.util.ArrayList;
import java.util.LinkedList;

import iskills.com.cupOfT.liquids.Coffee;
import iskills.com.cupOfT.liquids.Tea;
import iskills.com.cupOfT.models.Box;
import iskills.com.cupOfT.models.Empty;

/**
 * lennyhicks
 * 5/7/18
 */
class IngredientManager{

    //TODO Step 7 change to a list of the new Box class
    private LinkedList<Box> ingredientList = new LinkedList<>();

    //TODO Step 8 Use the addSelection method with the same arguments
    IngredientManager(){
        //BELOW

        addSelection(new Box<>(new Empty()));
        addSelection(new Box<>(new Coffee()));
        addSelection(new Box<>(new Tea()));

        //Maybe show two ways

        Box<Coffee> coffeeBox = new Box<>(new Coffee());
        Box teaBox = new Box<>(new Tea());
        addSelection(coffeeBox);
        addSelection(teaBox);
        addSelection(new Box<>(new Reminder()));
        //TODO REMOVE_LATER ABOVE && UNCOMMENT BELOW
//        ingredientList.add(new Remove());  -  This would be the point a developer would come across trying to extend everything
//        ingredientList.add(new Coffee());
//        ingredientList.add(new Tea());
    }

    //TODO Step 9 - For steps 9-12 update arguments to use Box
    private LinkedList<Box> getIngredientList() {
        return ingredientList;
    }

    //TODO Step 10
    public ArrayList<String> getIngredientNames() {
            ArrayList<String> ingredientNames = new ArrayList<>();
            for (Box ingredient : getIngredientList()) {
                ingredientNames.add(ingredient.getName());
            }
            return ingredientNames;

    }

    //TODO Step 11
    public Box getIngredient(int position){
        return ingredientList.get(position);
    }

    //TODO Step 12
    private void addSelection(Box ingredient){
        ingredientList.add(ingredient);
    }
}

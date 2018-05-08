package iskills.com.cupOfT;

import java.util.ArrayList;

import iskills.com.cupOfT.liquids.Liquid;
import iskills.com.cupOfT.models.Cup;

/** lennyhicks 5/7/18 */
class MainPresenter {

  private MainView mainView;
  private Cup cup = new Cup();
  private IngredientManager ingredientManager = new IngredientManager();

  MainPresenter() {}

  protected void init(MainView mainView) {
    this.mainView = mainView;
    this.mainView.renderView(getIngredients());
  }

  private void addLiquid(Liquid liquid) {
    cup.fillWith(liquid);
    updateCupState(liquid);
  }

  private void updateCupState(Liquid liquid) {
    mainView.updateLiquidColor(liquid.color());
  }

  private ArrayList<String> getIngredients() {
    return ingredientManager.getIngredientNames();
  }

  // TODO Step 13 add support for CupState to account for Empty
  public void selectIngredient(int ingredientPosition) {

    if (ingredientManager.getIngredient(ingredientPosition) instanceof Liquid) {
      addLiquid(ingredientManager.getIngredient(ingredientPosition));
    } else {
      cup.add(ingredientManager.getIngredient(ingredientPosition));

    }
  }
}

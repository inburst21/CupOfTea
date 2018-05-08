package iskills.com.cupOfT.models;

import iskills.com.cupOfT.R;
import iskills.com.cupOfT.liquids.Liquid;

/** lennyhicks 5/7/18 */
// TODO Step 2 extend CupState
public class Empty extends Liquid {
  @Override
  public Integer color() {
    return R.color.black;
  }
}

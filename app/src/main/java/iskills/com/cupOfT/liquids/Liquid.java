package iskills.com.cupOfT.liquids;

/**
 * lennyhicks
 * 5/7/18
 */

//TODO Step 3 have liquid extend CupState
public abstract class Liquid {

    public abstract Integer color();

    //TODO Step 9 this should no longer be used
    public String getName() {
        return getClass().getSimpleName();
    }
}

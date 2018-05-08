package iskills.com.cupOfT.models;

/**
 * lennyhicks
 * 5/7/18
 */
//TODO 4 make a generic holder T update arguments of all methods
public class Box {

    private Object object;

    public Box(Object t){
        this.object = t;
    }

    public void setContent(Object content){
        this.object = content;
    }

    public Object getContent() {
        if(object == null) {
            try {
                throw new IllegalAccessException();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return object;
    }


    //TODO 5 make a getName method that returns the generic class simple name
}

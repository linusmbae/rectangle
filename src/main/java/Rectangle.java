import java.util.ArrayList;

/**
 * Created by staff on 7/10/17.
 */
public class Rectangle {
    private int mheight;
    private int mwidth;
    private static ArrayList<Rectangle> mInstances = new ArrayList<>();
    private Boolean shape;

    public Rectangle(int height, int width) {
        this.mheight = height;
        this.mwidth = width;
        this.shape = isRectSquare();
        mInstances.add(this);
    }

    public int getHeight() {
        return mheight;
    }

    public int getWidth() {
        return mwidth;
    }
    public static ArrayList<Rectangle> getAll() {
        return mInstances;
    }

    public boolean getShape(){
        return shape;
    }

    public boolean isRectSquare(){
        if (mheight == mwidth){
         return true;
        }
        else {
            return false;
        }
    }

    public int area() {
        return mheight*mwidth;
    }
}

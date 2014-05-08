package skillcreator;

/**
 *
 * @author Peixoto
 */
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author Peixoto
 */

public enum SpriteInterpreter {
    NONE(0, 0, null, null, null, null);

    private SpriteInterpreter(int id, int numberOfLanes, SkillType[] lanes, int[] maxIndex, int[] width, int[] heigth) {
        this.id = id;
        this.numberOfLanes = numberOfLanes;
        this.maxIndex = maxIndex;
        this.width = width;
        this.heigth = heigth;
    }        
    
    private final int id,
                      numberOfLanes,  
                      maxIndex[],
                      width[],
                      heigth[];
    
    private ArrayList<SkillType> lanes;

    public int getId() {
        return id;
    }
    
    public Image getImage(SpriteInterpreter imageOf, Direction facingTo) {
        switch(imageOf) {   
            case NONE:
                return null;
            default:
                return null;
        }
    }

    public int getMaxIndex(int onPosition) {
        return maxIndex[onPosition];
    }

    public int getWidth(int onPosition) {
        return width[onPosition];
    }

    public int getHeigth(int onPosition) {
        return heigth[onPosition];
    }    
    
}

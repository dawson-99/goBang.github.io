package checkBoardService;


//this interface is used to find the direction, and the goal is check if it is the real Forbidden
public interface DirectionService {

    //if we find one direction may be forbidden, and we set a signal for the twice check
    int getLeft();
    void setLeft();
    int getRight();
    void setRight();
    int getUp();
    void setUp();
    int getDown();
    void setDown();
    int getLeftUp();
    void setLeftUp();
    int getRightUp();
    void setRightUp();
    int getLeftDown();
    void setLeftDown();
    int getRightDown();
    void setRightDown();
    void zero();
}

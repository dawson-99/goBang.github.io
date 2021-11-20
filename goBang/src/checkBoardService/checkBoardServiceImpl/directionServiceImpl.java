package checkBoardService.checkBoardServiceImpl;

import checkBoardService.DirectionService;

public class directionServiceImpl implements DirectionService {
   int left;
   int right;
   int up;
   int down;
   int leftUp;
   int rightUp;
   int leftDown;
   int rightDown;

   directionServiceImpl() {
       left = 0;
       right = 0;
       up = 0;
       down = 0;
       leftUp = 0;
       rightUp = 0;
       leftDown = 0;
       rightDown = 0;
   }

    public int getDown() {
        return down;
    }

    public int getLeft() {
        return left;
    }

    public int getLeftDown() {
        return leftDown;
    }

    public int getLeftUp() {
        return leftUp;
    }

    public int getRight() {
        return right;
    }

    public int getRightDown() {
        return rightDown;
    }

    public int getRightUp() {
        return rightUp;
    }

    public int getUp() {
        return up;
    }

    public void setRightUp() {
        this.rightUp = 1;
    }


    public void setDown() {
        this.down = 1;
    }

    public void setRightDown() {
        this.rightDown = 1;
    }

    public void setLeftUp() {
        this.leftUp = 1;
    }

    public void setLeft() {
        this.left = 1;
    }

    public void setLeftDown() {
        this.left = 1;
    }

    public void setRight() {
        this.right = 1;
    }

    public void setUp() {
        this.up = 1;
    }

    public void zero() {
        left = 0;
        right = 0;
        up = 0;
        down = 0;
        leftUp = 0;
        rightUp = 0;
        leftDown = 0;
        rightDown = 0;
    }
}

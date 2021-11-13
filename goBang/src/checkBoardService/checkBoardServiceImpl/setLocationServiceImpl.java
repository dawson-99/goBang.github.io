package checkBoardService.checkBoardServiceImpl;

import checkBoardService.setLocationService;
import com.goBang.model.Board;

public class setLocationServiceImpl implements setLocationService {

    //这个函数用于设置棋盘里面的一个棋子
    //0代表此处空,player中1代表黑棋、2代表白棋

    public void setInboard(Board board, int x, int y, char player) {
        board.isolation[x][y] = player;
    }

}

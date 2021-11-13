package checkBoardService;

import com.goBang.model.Board;

public interface setLocationService {
    //这个函数用于设置棋盘里面的一个棋子
    void setInboard(Board board, int x, int y, char player);//0代表此处空,player中1代表黑棋、2代表白棋
}

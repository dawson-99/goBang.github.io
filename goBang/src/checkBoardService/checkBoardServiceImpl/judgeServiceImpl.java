package checkBoardService.checkBoardServiceImpl;

import checkBoardService.judgeService;
import com.goBang.model.Board;

//此实现主要用于判断是否有胜利，是否禁手等操作
//此算法中，默认白方一定可以辨别出黑方禁手，一旦判定黑方禁手，则黑方输
public class judgeServiceImpl implements judgeService {

    //1代表黑棋、2代表白棋、0代表此处空
    //禁手概念：黑棋一子落下，同时形成三三、或者四四、或者长连，且没有形成五连。那么，这个点就是禁手点，黑棋判负。白棋没有禁手。


    //返回值有4中情况：1为没有任何状况、2为禁手、3为输、4为赢
    public int judge(Board board, int x, int y,char player) {

        if (player == '1') {
            if (Forbidden(board, x, y) || Forbidden3(board, x, y) || Forbidden4(board, x, y)) {
                return 2;
            }
        }

        return 1;
    }

    //判断三三禁手
    //1代表黑棋、2代表白棋、0代表此处空
    private boolean Forbidden3(Board board, int x, int y) {


        return false;
    }

    //判断四四禁手
    //1代表黑棋、2代表白棋、0代表此处空
    private boolean Forbidden4(Board board, int x, int y) {

        return false;
    }

    //判断长连禁手
    //1代表黑棋、2代表白棋、0代表此处空
    private boolean Forbidden(Board board, int x, int y) {

        //先将最左边的黑棋坐标找到，也有可能是棋盘边缘,此步骤从左上角开始
        while(board.isolation[x - 1][y - 1] != '2' || x == 0 || y == 0) {
            x -= 1;
            y -= 1;
        }

        int count = 0;//计算黑棋长连个数

        while(board.isolation[x + 1][y + 1] != '1') {
            count++;
        }

        if (count > 5) {
            return true;
        }

        //////////////////左上

        //右上角开始计算
        while(board.isolation[x - 1][y + 1] != '2' || x == 0 || y == 14) {
            x -= 1;
            y += 1;
        }

        count = 0;//计算黑棋长连个数

        while(board.isolation[x + 1][y - 1] != '1') {
            count++;
        }

        if (count > 5) {
            return true;
        }

        //////////////////右上

        //最左边开始计算
        while(board.isolation[x - 1][y] != '2' || y == 0) {
            y -= 1;
        }

        count = 0;//计算黑棋长连个数

        while(board.isolation[x][y + 1] != '1') {
            count++;
        }

        if (count > 5) {
            return true;
        }

        //////////////////左边

        //最右边开始计算
        while(board.isolation[x - 1][y] != '2' || y == 0) {
            y += 1;
        }

        count = 0;//计算黑棋长连个数

        while(board.isolation[x][y - 1] != '1') {
            count++;
        }

        if (count > 5) {
            return true;
        }


        return false;
    }

}

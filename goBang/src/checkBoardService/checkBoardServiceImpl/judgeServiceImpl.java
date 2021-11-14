package checkBoardService.checkBoardServiceImpl;

import checkBoardService.judgeService;
import com.goBang.model.Board;

import java.util.regex.Pattern;

//此实现主要用于判断是否有胜利，是否禁手等操作
//此算法中，默认白方一定可以辨别出黑方禁手，一旦判定黑方禁手，则黑方输
public class judgeServiceImpl implements judgeService {

    //1代表黑棋、2代表白棋、0代表此处空
    //禁手概念：黑棋一子落下，同时形成三三、或者四四、或者长连，且没有形成五连。那么，这个点就是禁手点，黑棋判负。白棋没有禁手。


    //返回值有4中情况：1为没有任何状况、2为禁手、3为输、4为赢
    public int judge(Board board, int x, int y,char player) {

        if (player == '1' ) {
            if (Forbidden(board, x, y) || Forbidden3(board, x, y) || Forbidden4(board, x, y)) {
                return 2;
            }
        }

       Win(board, x,  y, player);

        return 1;
    }

    //判断三三禁手
    //1代表黑棋、2代表白棋、0代表此处空
    private boolean Forbidden3(Board board, int x, int y) {

        //活三有x011和0110两种组合，只要八个方向任意两个方向搭配成功，即可，此种方法可以检查出大部分双活三

        //左边和左上方
        if ((dirLeft(board,x,y).equals("0011")  || dirLeft(board,x,y).equals("0110")  || dirLeft(board, x, y).equals("1011")  || dirLeft(board, x, y).equals("2011") )
                && (dirLeftup(board,x,y).equals("0011")  || dirLeftup(board,x,y).equals("0110" ) || dirLeftup(board, x, y).equals("1011" ) || dirLeftup(board, x, y).equals("2011") ) ) {
            return true;
        }

        //左边和上方
        if ((dirLeft(board,x,y).equals("0011")  || dirLeft(board,x,y).equals("0110")  || dirLeft(board, x, y).equals("1011")  || dirLeft(board, x, y).equals("2011") )
                && (dirup(board,x,y).equals("0011")  || dirup(board,x,y).equals("0110")  || dirup(board, x, y).equals("1011")  || dirup(board, x, y).equals("2011") ) ) {
            return true;
        }

        //左边和右上方
        if ((dirLeft(board,x,y).equals("0011")  || dirLeft(board,x,y).equals("0110")  || dirLeft(board, x, y).equals("1011")  || dirLeft(board, x, y).equals("2011") )
                && (dirRightUP(board,x,y).equals("0011")  || dirRightUP(board,x,y).equals("0110")  || dirRightUP(board, x, y).equals("1011")  || dirRightUP(board, x, y).equals("2011") ) ) {
            return true;
        }

        //左边和右边，不存在双活三可能性？ 目前来看是这样的，暂时没有深入查询 11月14日15：46分，备注！

        //左边和右下
        if ((dirLeft(board,x,y).equals("0011")  || dirLeft(board,x,y).equals("0110")  || dirLeft(board, x, y).equals("1011")  || dirLeft(board, x, y).equals("2011") )
                && (dirRightDown(board,x,y).equals("0011")  || dirRightDown(board,x,y).equals("0110")  || dirRightDown(board, x, y).equals("1011")  || dirRightDown(board, x, y).equals("2011") ) ) {
            return true;
        }

        //左边和下边
        if ((dirLeft(board,x,y).equals("0011")  || dirLeft(board,x,y).equals("0110")  || dirLeft(board, x, y).equals("1011")  || dirLeft(board, x, y).equals("2011") )
                && (dirDown(board,x,y).equals("0011")  || dirDown(board,x,y).equals("0110")  || dirDown(board, x, y).equals("1011")  || dirDown(board, x, y).equals("2011") ) ) {
            return true;
        }

        //左边和左下边
        if ((dirLeft(board,x,y).equals("0011")  || dirLeft(board,x,y).equals("0110")  || dirLeft(board, x, y).equals("1011")  || dirLeft(board, x, y).equals("2011") )
                && (dirLeftDown(board,x,y).equals("0011")  || dirLeftDown(board,x,y).equals("0110")  || dirLeftDown(board, x, y).equals("1011")  || dirLeftDown(board, x, y).equals("2011") ) ) {
            return true;
        }

        //左上和上方
        if ((dirLeftup(board,x,y).equals("0011")  || dirLeftup(board,x,y).equals("0110")  || dirLeftup(board, x, y).equals("1011")  || dirLeftup(board, x, y).equals("2011") )
                && (dirup(board,x,y).equals("0011")  || dirup(board,x,y).equals("0110")  || dirup(board, x, y).equals("1011")  || dirup(board, x, y).equals("2011") ) ) {
            return true;
        }

        //左上和右上
        if ((dirLeftup(board,x,y).equals("0011")  || dirLeftup(board,x,y).equals("0110")  || dirLeftup(board, x, y).equals("1011")  || dirLeftup(board, x, y).equals("2011") )
                && (dirRightUP(board,x,y).equals("0011")  || dirRightUP(board,x,y).equals("0110")  || dirRightUP(board, x, y).equals("1011")  || dirRightUP(board, x, y).equals("2011") ) ) {
            return true;
        }

        //左上和右
        if ((dirLeftup(board,x,y).equals("0011")  || dirLeftup(board,x,y).equals("0110")  || dirLeftup(board, x, y).equals("1011")  || dirLeftup(board, x, y).equals("2011") )
                && (dirRight(board,x,y).equals("0011")  || dirRight(board,x,y).equals("0110")  || dirRight(board, x, y).equals("1011")  || dirRight(board, x, y).equals("2011") ) ) {
            return true;
        }

        //左上和右下，不存在双活三

        //左上和下方
        if ((dirLeftup(board,x,y).equals("0011")  || dirLeftup(board,x,y).equals("0110")  || dirLeftup(board, x, y).equals("1011")  || dirLeftup(board, x, y).equals("2011") )
                && (dirDown(board,x,y).equals("0011")  || dirDown(board,x,y).equals("0110")  || dirDown(board, x, y).equals("1011")  || dirDown(board, x, y).equals("2011") ) ) {
            return true;
        }

        //左上和左下
        if ((dirLeftup(board,x,y).equals("0011")  || dirLeftup(board,x,y).equals("0110")  || dirLeftup(board, x, y).equals("1011")  || dirLeftup(board, x, y).equals("2011") )
                && (dirLeftDown(board,x,y).equals("0011")  || dirLeftDown(board,x,y).equals("0110")  || dirLeftDown(board, x, y).equals("1011")  || dirLeftDown(board, x, y).equals("2011") ) ) {
            return true;
        }

        //上方和右上
        if ((dirup(board,x,y).equals("0011")  || dirup(board,x,y).equals("0110")  || dirup(board, x, y).equals("1011")  || dirup(board, x, y).equals("2011") )
                && (dirRightUP(board,x,y).equals("0011")  || dirRightUP(board,x,y).equals("0110")  || dirRightUP(board, x, y).equals("1011")  || dirRightUP(board, x, y).equals("2011") ) ) {
            return true;
        }

        //上方和右方
        if ((dirup(board,x,y).equals("0011")  || dirup(board,x,y).equals("0110")  || dirup(board, x, y).equals("1011")  || dirup(board, x, y).equals("2011") )
                && (dirRight(board,x,y).equals("0011")  || dirRight(board,x,y).equals("0110")  || dirRight(board, x, y).equals("1011")  || dirRight(board, x, y).equals("2011") ) ) {
            return true;
        }

        //上方和右下
        if ((dirup(board,x,y).equals("0011")  || dirup(board,x,y).equals("0110")  || dirup(board, x, y).equals("1011")  || dirup(board, x, y).equals("2011") )
                && (dirRightDown(board,x,y).equals("0011")  || dirRightDown(board,x,y).equals("0110")  || dirRightDown(board, x, y).equals("1011")  || dirRightDown(board, x, y).equals("2011") ) ) {
            return true;
        }


        //上方和下方不存在双活三

        //上方和左下
        if ((dirup(board,x,y).equals("0011")  || dirup(board,x,y).equals("0110")  || dirup(board, x, y).equals("1011")  || dirup(board, x, y).equals("2011") )
                && (dirLeftDown(board,x,y).equals("0011")  || dirLeftDown(board,x,y).equals("0110")  || dirLeftDown(board, x, y).equals("1011")  || dirRightDown(board, x, y).equals("2011") ) ) {
            return true;
        }

        //右上和右
        if ((dirRightUP(board,x,y).equals("0011")  || dirRightUP(board,x,y).equals("0110")  || dirRightUP(board, x, y).equals("1011")  || dirRightUP(board, x, y).equals("2011") )
                && (dirRight(board,x,y).equals("0011")  || dirRight(board,x,y).equals("0110")  || dirRight(board, x, y).equals("1011")  || dirRight(board, x, y).equals("2011") ) ) {
            return true;
        }

        //右上和右下
        if ((dirRightUP(board,x,y).equals("0011")  || dirRightUP(board,x,y).equals("0110")  || dirRightUP(board, x, y).equals("1011")  || dirRightUP(board, x, y).equals("2011") )
                && (dirRightDown(board,x,y).equals("0011")  || dirRightDown(board,x,y).equals("0110")  || dirRightDown(board, x, y).equals("1011")  || dirRightDown(board, x, y).equals("2011") ) ) {
            return true;
        }

        //右上和下
        if ((dirRightUP(board,x,y).equals("0011")  || dirRightUP(board,x,y).equals("0110")  || dirRightUP(board, x, y).equals("1011")  || dirRightUP(board, x, y).equals("2011") )
                && (dirDown(board,x,y).equals("0011")  || dirDown(board,x,y).equals("0110")  || dirDown(board, x, y).equals("1011")  || dirDown(board, x, y).equals("2011") ) ) {
            return true;
        }

        //右上左下不存在双活三

        //右和右下
        if ((dirRight(board,x,y).equals("0011")  || dirRight(board,x,y).equals("0110")  || dirRight(board, x, y).equals("1011")  || dirRight(board, x, y).equals("2011") )
                && (dirRightDown(board,x,y).equals("0011")  || dirRightDown(board,x,y).equals("0110")  || dirRightDown(board, x, y).equals("1011")  || dirRightDown(board, x, y).equals("2011") ) ) {
            return true;
        }

        //右和下
        if ((dirRight(board,x,y).equals("0011")  || dirRight(board,x,y).equals("0110")  || dirRight(board, x, y).equals("1011")  || dirRight(board, x, y).equals("2011") )
                && (dirDown(board,x,y).equals("0011")  || dirDown(board,x,y).equals("0110")  || dirDown(board, x, y).equals("1011")  || dirDown(board, x, y).equals("2011") ) ) {
            return true;
        }

        //右和左下
        if ((dirRight(board,x,y).equals("0011")  || dirRight(board,x,y).equals("0110")  || dirRight(board, x, y).equals("1011")  || dirRight(board, x, y).equals("2011") )
                && (dirLeftDown(board,x,y).equals("0011")  || dirLeftDown(board,x,y).equals("0110")  || dirLeftDown(board, x, y).equals("1011")  || dirLeftDown(board, x, y).equals("2011") ) ) {
            return true;
        }

        //右下和下
        if ((dirRightDown(board,x,y).equals("0011")  || dirRightDown(board,x,y).equals("0110")  || dirRightDown(board, x, y).equals("1011")  || dirRightDown(board, x, y).equals("2011") )
                && (dirDown(board,x,y).equals("0011")  || dirDown(board,x,y).equals("0110")  || dirDown(board, x, y).equals("1011")  || dirDown(board, x, y).equals("2011") ) ) {
            return true;
        }

        //右下和左下
        if ((dirRightDown(board,x,y).equals("0011")  || dirRightDown(board,x,y).equals("0110")  || dirRightDown(board, x, y).equals("1011")  || dirRightDown(board, x, y).equals("2011") )
                && (dirLeftDown(board,x,y).equals("0011")  || dirLeftDown(board,x,y).equals("0110")  || dirLeftDown(board, x, y).equals("1011")  || dirLeftDown(board, x, y).equals("2011") ) ) {
            return true;
        }

        //下和左下
        if ((dirDown(board,x,y).equals("0011")  || dirDown(board,x,y).equals("0110")  || dirDown(board, x, y).equals("1011")  || dirDown(board, x, y).equals("2011") )
                && (dirLeftDown(board,x,y).equals("0011")  || dirLeftDown(board,x,y).equals("0110")  || dirLeftDown(board, x, y).equals("1011")  || dirLeftDown(board, x, y).equals("2011") ) ) {
            return true;
        }

        //三三禁手的特殊情况
        if ((dirDown(board,x,y).equals(""))) {}









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
        while(board.isolation[x - 1][y - 1] ==  '1') {
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
        while(board.isolation[x - 1][y + 1] == '1' ) {
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
        while(board.isolation[x - 1][y] == '1') {
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
        while(board.isolation[x - 1][y] == '1') {
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

    private boolean Win(Board board, int x, int y,char player) {

        String pattern = "";
        pattern = pattern + player + player + player + player + player;

        if ((dirDown(board,x,y) + player).equals(pattern)) {
            return true;
        }

        if ((dirup(board,x,y) + player).equals(pattern)) {
            return true;
        }

        if ((dirRight(board,x,y) + player).equals(pattern)) {
            return true;
        }

        if ((dirLeft(board,x,y) + player).equals(pattern)) {
            return true;
        }

        if ((dirLeftDown(board,x,y) + player).equals(pattern)) {
            return true;
        }

        if ((dirLeftup(board,x,y) + player).equals(pattern)) {
            return true;
        }

        if ((dirRightDown(board,x,y) + player).equals(pattern)) {
            return true;
        }

        if ((dirRightUP(board,x,y) + player).equals(pattern)) {
            return true;
        }

        return false;

    }


    //1代表黑棋、2代表白棋、0代表此处空
    //返回左边的四个棋子的序列
    //假设返回1是活三、返回2是活四或冲四
    private String dirLeft(Board board, int x, int y) {
        String result = "";
        int n = 4;//记录次数
        x -= 4;//x的位置从左边第四个开始计算
        while(n > 0) {
            if (x < 0 || x > 14 || y < 0 || y > 14) {
                result = result + '2';//如果遇到边界，则按照四三或死四处理
            } else {
                result = result + board.isolation[x][y];
            }

            n--;
            x++;
        }//while

       return result;
    }

    //返回右边的四个棋子的序列
    private String dirRight(Board board, int x, int y) {
        String result = "";
        int n = 4;//记录次数
        x += 1;//从右边第一个开始计算
        while(n > 0) {
            if (x < 0 || x > 14 || y < 0 || y > 14) {
                result = result + '2';
            } else {
                result = result + board.isolation[x][y];
            }

            n--;
            x++;
        }//while

        return  result;
    }

    //返回左上的四个棋子的序列
    private String dirLeftup(Board board, int x, int y) {
        String result = "";
        int n = 4;//记录次数
        x -= 4;//从左上边第四个开始计算
        y -= 4;

        while(n > 0) {
            if (x < 0 || x > 14 || y < 0 || y > 14) {
                result = result + '2';
            } else {
                result = result + board.isolation[x][y];
            }

            n--;
            x++;
            y++;
        }//while

        return  result;
    }

    //返回向上的四个棋子的序列
    private String dirup(Board board, int x, int y) {
        String result = "";
        int n = 4;//记录次数
        x -= 4;//从上边第四个开始计算

        while(n > 0) {
            if (x < 0 || x > 14 || y < 0 || y > 14) {
                result = result + '2';
            } else {
                result = result + board.isolation[x][y];
            }

            n--;
            x++;
        }//while

        return  result;
    }

    //返回右上的四个棋子的序列
    private String dirRightUP(Board board, int x, int y) {

        String result = "";
        int n = 4;//记录次数
        x -= 4;//从右上边第四个开始计算
        y += 4;

        while(n > 0) {
            if (x < 0 || x > 14 || y < 0 || y > 14) {
                result = result + '2';
            } else {
                result = result + board.isolation[x][y];
            }

            n--;
            x++;
            y--;
        }//while

        return  result;

    }

    //返回右下的四个棋子的序列
    private String dirRightDown(Board board, int x, int y) {

        String result = "";
        int n = 4;//记录次数
        x += 4;//从右下边第四个开始计算
        y += 4;

        while(n > 0) {
            if (x < 0 || x > 14 || y < 0 || y > 14) {
                result = result + '2';
            } else {
                result = result + board.isolation[x][y];
            }

            n--;
            x--;
            y--;
        }//while

        return  result;

    }

    //返回向下棋子的序列
    private String dirDown(Board board, int x, int y) {

        String result = "";
        int n = 4;//记录次数

        x -= 4;//从向下边第四个开始计算

        while(n > 0) {
            if (x < 0 || x > 14 || y < 0 || y > 14) {
                result = result + '2';
            } else {
                result = result + board.isolation[x][y];
            }

            n--;
            x++;
        }//while

        return  result;

    }

    //返回左下的四个棋子的序列
    private String dirLeftDown(Board board, int x, int y) {

        String result = "";
        int n = 4;//记录次数

        x += 4;//从向左下边第四个开始计算
        y -= 4;

        while(n > 0) {
            if (x < 0 || x > 14 || y < 0 || y > 14) {
                result = result + '2';
            } else {
                result = result + board.isolation[x][y];
            }

            n--;
            x--;
            y++;
        }//while

        return  result;

    }



}

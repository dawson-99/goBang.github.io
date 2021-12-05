package checkBoardService.checkBoardServiceImpl;

import checkBoardService.ForbbidenLongService;
import checkBoardService.Forbbiden4Service;
import checkBoardService.Forbidden3Service;
import checkBoardService.judgeService;
import com.goBang.model.Board;

//此实现主要用于判断是否有胜利，是否禁手等操作
//此算法中，默认白方一定可以辨别出黑方禁手，一旦判定黑方禁手，则黑方输
public class judgeServiceImpl implements judgeService {

    //1代表黑棋、2代表白棋、0代表此处空
    //禁手概念：黑棋一子落下，同时形成三三、或者四四、或者长连，且没有形成五连。那么，这个点就是禁手点，黑棋判负。白棋没有禁手。

    ForbbidenLongService longJudge = new ForbbidenLongServiceImpl();
    Forbidden3Service forbidden3Judge = new Forbidden3ServiceImpl();
    Forbbiden4Service forbidden4Judge = new Forbbiden4ServiceImpl();

    //返回值有4中情况：1为没有任何状况、2为禁手、3为输、4为赢
    public int judge(Board board, int x, int y, char player) {

//        if (player == '1' ) {
//            if (Forbidden(board, x, y)) {
//                return 2;
//            }
//        }

//        if (player == '1' ) {
//            if (Forbidden3(board, x, y)) {
//                System.out.println("-------2----------");
//                return 2;
//            }
//        }

        if (player == '1' ) {
            if (forbidden4Judge.Forbidden4(board,x,y)) {
                System.out.println("-------2----------");
                return 2;
            }
        }


//        if(Win(board, x,  y, player)){
//            System.out.println("----4-------");
//            return 4;
//        }
        System.out.println("----1-------");
        return 1;
    }




    private boolean Win(Board board, int x, int y,char player) {

        String pattern = "";
        pattern = pattern + player + player + player + player + player;
//        System.out.println(pattern);
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
    private String dirLeft(Board board, int x, int y) {
        String result = "";
        int n = 4;//记录次数
        y -= 4;//x的位置从左边第四个开始计算
        while(n > 0) {
            if (x < 0 || x > 14 || y < 0 || y > 14) {
                result = result + '2';//如果遇到边界，则按照死三或死四处理
            } else {
                result = result + board.isolation[x][y];
            }

            n--;
            y++;
        }//while

        return result;
    }

    //返回右边的四个棋子的序列
    private String dirRight(Board board, int x, int y) {
        String result = "";
        int n = 4;//记录次数
        y += 4;//从右边第一个开始计算
        while(n > 0) {
            if (x < 0 || x > 14 || y < 0 || y > 14) {
                result = result + '2';
            } else {
                result = result + board.isolation[x][y];
            }

            n--;
            y--;
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

        x += 4;//从向下边第四个开始计算

        while(n > 0) {
            if (x < 0 || x > 14 || y < 0 || y > 14) {
                result = result + '2';
            } else {
                result = result + board.isolation[x][y];
            }

            n--;
            x--;
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

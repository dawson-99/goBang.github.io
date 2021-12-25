package checkBoardService.checkBoardServiceImpl;

import checkBoardService.ForbbidenLongService;
import checkBoardService.Forbbiden_4Service;
import checkBoardService.Forbidden_3Service;
import checkBoardService.judgeService;
import com.goBang.model.Board;

//此实现主要用于判断是否有胜利，是否禁手等操作
//此算法中，默认白方一定可以辨别出黑方禁手，一旦判定黑方禁手，则黑方输
public class judgeServiceImpl implements judgeService {

    //1代表黑棋、2代表白棋、0代表此处空
    //禁手概念：黑棋一子落下，同时形成三三、或者四四、或者长连，且没有形成五连。那么，这个点就是禁手点，黑棋判负。白棋没有禁手。

    ForbbidenLongService longJudge = new ForbbidenLongServiceImpl();
    Forbidden_3Service forbidden3Judge = new Forbidden3ServiceImpl();
    Forbbiden_4Service forbidden4Judge = new Forbbiden4ServiceImpl();

    //返回值有4中情况：1为没有任何状况、2为禁手、3为输、4为赢
    public int judge(Board board, int x, int y, char player) {

//        if (player == '1' ) {
//            if (Forbidden(board, x, y)) {
//                return 2;
//            }
//        }
//
//        if (player == '1' ) {
//            if (Forbidden3(board, x, y)) {
//                System.out.println("-------2----------");
//                return 2;
//            }
//        }


        if (player == '1' ) {
            if (longJudge.Forbidden(board, x, y)) {
//                System.out.println("黑子长连禁手");
//                System.out.println("当前棋盘如下");
//                for (int i = 0; i < 15; i++) {
//                    for (int j = 0; j < 15; j++ ) {
//                        System.out.print(board.isolation[i][j] + " ");
//                    }
//                    System.out.println("");
//                }
                return 2;
            }

            if (Win(board, x, y, player)) {
                System.out.println("黑子赢");
                return 4;
            }

            if (forbidden3Judge.Forbidden3(board,x,y)) {
//                System.out.println("黑子三三禁手");
//                System.out.println("当前棋盘如下");
//                for (int i = 0; i < 15; i++) {
//                    for (int j = 0; j < 15; j++ ) {
//                        System.out.print(board.isolation[i][j] + " ");
//                    }
//                    System.out.println("");
//                }

                return 2;
            }

            if(forbidden4Judge.Forbidden4(board, x, y)) {
//                System.out.println("黑子四四禁手");
//                System.out.println("当前棋盘如下");
//                for (int i = 0; i < 15; i++) {
//                    for (int j = 0; j < 15; j++ ) {
//                        System.out.print(board.isolation[i][j] + " ");
//                    }
//                    System.out.println("");
//                }
                return 2;
            }
        } else {
            if (Win(board, x, y, player)) {
//                System.out.println("白方赢");
                return 4;
            }
        }


//        if(Win(board, x,  y, player)){
//            System.out.println("----4-------");
//            return 4;
//        }
       // System.out.println("无状况");
        return 1;
    }




    private boolean Win(Board board, int x, int y,char player) {

        String pattern = "";
        pattern = pattern + player + player + player + player + player;
//        System.out.println(pattern);
        int position_x = x;
        int position_y = y;


        //先将最左边的棋坐标找到，也有可能是棋盘边缘,此步骤从左上角开始
        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == player) {
                position_x -= 1;
                position_y -= 1;
            } else {
                break;
            }
        }
        position_x += 1;//plus one to get the right position
        position_y += 1;
        int count = 0;//计算棋个数

        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == player) {
                count++;
                position_x++;
                position_y++;
            }else{
                break;
            }
        }

        if (count >= 5) {
            return true;
        }

        //////////////////左上

        //右上角开始计算

        position_x = x;
        position_y = y;

        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == player) {
                position_x -= 1;
                position_y += 1;
            } else {
                break;
            }
        }
        position_x += 1;//plus one to get the right position
        position_y -= 1;
        count = 0;//计算黑棋长连个数

        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == player) {
                count++;
                position_x++;
                position_y--;
            } else{
                break;
            }
        }

        if (count >= 5) {
            return true;
        }

        //////////////////右上

        //最左边开始计算
        position_x = x;
        position_y = y;

        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == player) {
                position_y -= 1;
            }  else {
                break;
            }
        }
        //plus one to get the right position
        position_y += 1;
        count = 0;//计算黑棋长连个数

        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == player) {
                count++;
                position_y++;
            }else{
                break;
            }
        }

        if (count >= 5) {
            return true;
        }

        //////////////////左边

        //最上边开始计算
        position_x = x;
        position_y = y;

        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == player) {
                position_x -= 1;
            }  else {
                break;
            }
        }
        position_x += 1;//plus one to get the right position
        count = 0;//计算黑棋长连个数

        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == player) {
                count++;
                position_x++;
            }else{
                break;
            }
        }

        if (count >= 5) {
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

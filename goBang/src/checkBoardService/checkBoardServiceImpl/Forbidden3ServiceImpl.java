package checkBoardService.checkBoardServiceImpl;

import checkBoardService.Forbidden_3Service;
import com.goBang.model.Board;

public class Forbidden3ServiceImpl implements Forbidden_3Service {
    //判断三三禁手
    //1代表黑棋、2代表白棋、0代表此处空
    public boolean Forbidden3(Board board, int x, int y) {

        //活三有x011和0110两种组合，只要八个方向任意两个方向搭配成功，即可，此种方法可以检查出大部分双活三
        /*
            the living 3-3 forbbiden has two easy model, and just find a successful conbination of two direction, we can check it out.
            this method or theory can check out most situation of 3-3 situations.
         */


        //左边和左上方
        //left and leftup
        if ((dirLeft(board,x,y).equals("0011")  || dirLeft(board,x,y).equals("0110")  || dirLeft(board, x, y).equals("1011")  || dirLeft(board, x, y).equals("2011") )
                && (dirLeftup(board,x,y).equals("0011")  || dirLeftup(board,x,y).equals("0110" ) || dirLeftup(board, x, y).equals("1011" ) || dirLeftup(board, x, y).equals("2011") ) ) {

            //check the left side
            if (board.isolation[x][y - 1] == '0') {
                if (y < 5 || board.isolation[x][y + 1] == '1' || board.isolation[x][y - 5] == '1' || board.isolation[x][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x][y -1] == '1') {
                if (y < 5 || board.isolation[x][y + 2] == '1' || board.isolation[x][y - 4] == '1' || board.isolation[x][y - 3] != '0'  || board.isolation[x][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//left check finished

            //check the leftup side
            if (board.isolation[x - 1][y - 1] == '0') {
                if (x < 5 || y < 5 || board.isolation[x + 1][y + 1] == '1' || board.isolation[x - 5][y - 5] == '1' || board.isolation[x - 4][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y] == '1') {
                if (x < 4 || y < 4 || board.isolation[x + 2][y + 2] == '1' || board.isolation[x - 4][y - 4] == '1' || board.isolation[x - 3][y - 3] != '0' || board.isolation[x + 1][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//leftup side check finished

            return true;
        }

        //左边和上方
        //left and up
        if ((dirLeft(board,x,y).equals("0011")  || dirLeft(board,x,y).equals("0110")  || dirLeft(board, x, y).equals("1011")  || dirLeft(board, x, y).equals("2011") )
                && (dirup(board,x,y).equals("0011")  || dirup(board,x,y).equals("0110")  || dirup(board, x, y).equals("1011")  || dirup(board, x, y).equals("2011") ) ) {

            //check the left side
            if (board.isolation[x][y - 1] == '0') {
                if (y < 5 || board.isolation[x][y + 1] == '1' || board.isolation[x][y - 5] == '1' || board.isolation[x][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x][y - 1] == '1') {
//                System.out.println(x);
//                System.out.println(y);
                if (y < 4 || board.isolation[x][y + 2] == '1' || board.isolation[x][y - 4] == '1' || board.isolation[x][y - 3] != '0' || board.isolation[x][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//left check finished

            //check the up side
            if (board.isolation[x - 1][y] == '0') {
                if (x < 5 || board.isolation[x + 1][y] == '1' || board.isolation[x - 5][y] == '1' || board.isolation[x - 4][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y] == '1') {
                if (x < 4 || board.isolation[x + 2][y] == '1' || board.isolation[x - 4][y] == '1' || board.isolation[x - 3][y] != '0' || board.isolation[x + 1][y] != '0') {
                    return false;//find the death 3 forbbiden
                }

            }//up check finished

            return true;
        }

        //左边和右上方
        //left and rightup
        if ((dirLeft(board,x,y).equals("0011")  || dirLeft(board,x,y).equals("0110")  || dirLeft(board, x, y).equals("1011")  || dirLeft(board, x, y).equals("2011") )
                && (dirRightUP(board,x,y).equals("0011")  || dirRightUP(board,x,y).equals("0110")  || dirRightUP(board, x, y).equals("1011")  || dirRightUP(board, x, y).equals("2011") ) ) {

            //check the left side
            if (board.isolation[x][y - 1] == '0') {
                if (y < 5 ||board.isolation[x][y + 1] == '1' || board.isolation[x][y - 5] == '1' || board.isolation[x][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x][y -1] == '1') {
                if (y < 4 || board.isolation[x][y + 2] == '1' || board.isolation[x][y - 4] == '1' || board.isolation[x][y - 3] != '0' || board.isolation[x][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//left check finished

            //check the rightup side
            if (board.isolation[x - 1][y + 1] == '0') {
                if (x < 5 || y < 5 || board.isolation[x + 1][y - 1] == '1' || board.isolation[x - 5][y + 5] == '1' || board.isolation[x - 4][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y + 1] == '1') {
                if (x < 4 || y < 4 || board.isolation[x + 2][y - 2] == '1' || board.isolation[x - 4][y + 4] == '1' || board.isolation[x - 3][y + 3] != '0' || board.isolation[x + 1][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//rightup check finished

            return true;
        }

        //左边和右边，不存在双活三可能性？ 目前来看是这样的，暂时没有深入查询 11月14日15：46分，备注！

        //左边和右下
        //left and rightdown
        if ((dirLeft(board,x,y).equals("0011")  || dirLeft(board,x,y).equals("0110")  || dirLeft(board, x, y).equals("1011")  || dirLeft(board, x, y).equals("2011") )
                && (dirRightDown(board,x,y).equals("0011")  || dirRightDown(board,x,y).equals("0110")  || dirRightDown(board, x, y).equals("1011")  || dirRightDown(board, x, y).equals("2011") ) ) {

            //check the left side
            if (board.isolation[x][y - 1] == '0') {
                if (y < 5 || board.isolation[x][y + 1] == '1' || board.isolation[x][y - 5] == '1' || board.isolation[x][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x][y - 1] == '1') {
                if (y < 4 || board.isolation[x][y + 2] == '1' || board.isolation[x][y - 4] == '1' || board.isolation[x][y - 3] != '0' || board.isolation[x][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//left check finished

            //check the rightdown side
            if (board.isolation[x + 1][y + 1] == '0') {
                if (x > 9 || y > 9 || board.isolation[x - 1][y - 1] == '1' || board.isolation[x + 5][y + 5] == '1' || board.isolation[x + 4][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y + 1] == '1') {
                if (x < 2 || y < 2 || y > 10 || x > 10 ||board.isolation[x - 2][y - 2] == '1' || board.isolation[x + 4][y + 4] == '1' || board.isolation[x + 3][y + 3] != '0' || board.isolation[x - 1][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//left check finished


            return true;
        }

        //左边和下边
        //left and down
        if ((dirLeft(board,x,y).equals("0011")  || dirLeft(board,x,y).equals("0110")  || dirLeft(board, x, y).equals("1011")  || dirLeft(board, x, y).equals("2011") )
                && (dirDown(board,x,y).equals("0011")  || dirDown(board,x,y).equals("0110")  || dirDown(board, x, y).equals("1011")  || dirDown(board, x, y).equals("2011") ) ) {

            //check the left side
            if (board.isolation[x][y - 1] == '0') {
                if (y < 5 || board.isolation[x][y + 1] == '1' || board.isolation[x][y - 5] == '1' || board.isolation[x][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x][y - 1] == '1') {
                if (y < 4 || board.isolation[x][y + 2] == '1' || board.isolation[x][y - 4] == '1' || board.isolation[x][y - 3] != '0' || board.isolation[x][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//left check finished

            //check the down side
            if (board.isolation[x + 1][y] == '0') {
                if (x > 9 || board.isolation[x + 1][y] == '1' || board.isolation[x + 5][y] == '1' || board.isolation[x + 4][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y] == '1') {
                if (x < 2 || x > 10 || board.isolation[x - 2][y] == '1' || board.isolation[x + 4][y] == '1' || board.isolation[x + 3][y] != '0' || board.isolation[x - 1][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//down check finished

            return true;

        }

        //左边和左下边
        //left and leftdown
        if ((dirLeft(board,x,y).equals("0011")  || dirLeft(board,x,y).equals("0110")  || dirLeft(board, x, y).equals("1011")  || dirLeft(board, x, y).equals("2011") )
                && (dirLeftDown(board,x,y).equals("0011")  || dirLeftDown(board,x,y).equals("0110")  || dirLeftDown(board, x, y).equals("1011")  || dirLeftDown(board, x, y).equals("2011") ) ) {

            //check the left side
            if (board.isolation[x][y - 1] == '0') {
                if (y < 5 || board.isolation[x][y + 1] == '1' || board.isolation[x][y - 5] == '1' || board.isolation[x][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x][y - 1] == '1') {
                if (y < 4 || board.isolation[x][y + 2] == '1' || board.isolation[x][y - 4] == '1' || board.isolation[x][y - 3] != '0' || board.isolation[x][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//left check finished

            //check the leftdown side
            if (board.isolation[x + 1][y - 1] == '0') {
                if (x > 9 || y < 5 || board.isolation[x - 1][y + 1] == '1' || board.isolation[x + 5][y - 5] == '1' || board.isolation[x + 4][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y - 1] == '1') {
                if (x > 10 || y < 4 || board.isolation[x - 2][y + 1] == '1' || board.isolation[x + 4][y - 4] == '1' || board.isolation[x + 3][y - 3] != '0' || board.isolation[x - 1][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//leftdown check finished

            return true;
        }

        //左上和上方
        //leftup and up
        if ((dirLeftup(board,x,y).equals("0011")  || dirLeftup(board,x,y).equals("0110")  || dirLeftup(board, x, y).equals("1011")  || dirLeftup(board, x, y).equals("2011") )
                && (dirup(board,x,y).equals("0011")  || dirup(board,x,y).equals("0110")  || dirup(board, x, y).equals("1011")  || dirup(board, x, y).equals("2011") ) ) {

            //check the leftup side
            if (board.isolation[x - 1][y - 1] == '0') {
                if (x < 5 || y < 5 || board.isolation[x + 1][y + 1] == '1' || board.isolation[x - 5][y - 5] == '1' || board.isolation[x - 4][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y - 1] == '1') {
                if (x < 4 || y < 4 || board.isolation[x + 2][y + 2] == '1' || board.isolation[x - 4][y - 4] == '1' || board.isolation[x - 3][y - 3] != '0' || board.isolation[x + 1][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//leftup side check finished

            //check the up side
            if (board.isolation[x - 1][y] == '0') {
                if (x < 5 || board.isolation[x + 1][y] == '1' || board.isolation[x - 5][y] == '1' || board.isolation[x - 4][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y] == '1') {
                if (x < 4 || board.isolation[x + 2][y] == '1' || board.isolation[x - 4][y] == '1' || board.isolation[x - 3][y] != '0' || board.isolation[x + 1][y] != '0') {
                    return false;//find the death 3 forbbiden
                }

            }//up check finished

            return true;
        }

        //左上和右上
        //leftup and rightup
        if ((dirLeftup(board,x,y).equals("0011")  || dirLeftup(board,x,y).equals("0110")  || dirLeftup(board, x, y).equals("1011")  || dirLeftup(board, x, y).equals("2011") )
                && (dirRightUP(board,x,y).equals("0011")  || dirRightUP(board,x,y).equals("0110")  || dirRightUP(board, x, y).equals("1011")  || dirRightUP(board, x, y).equals("2011") ) ) {

            //check the leftup side
            if (board.isolation[x - 1][y - 1] == '0') {
                if (x < 5 || y < 5 || board.isolation[x + 1][y + 1] == '1' || board.isolation[x - 5][y - 5] == '1' || board.isolation[x - 4][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y - 1] == '1') {
                if (x < 4 || y < 4 || board.isolation[x + 2][y + 2] == '1' || board.isolation[x - 4][y - 4] == '1' || board.isolation[x - 3][y - 3] != '0' || board.isolation[x + 1][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//leftup side check finished


            //check the rightup side
            if (board.isolation[x - 1][y + 1] == '0') {
                if (x < 5 || y > 9 || board.isolation[x + 1][y - 1] == '1' || board.isolation[x - 5][y + 5] == '1' || board.isolation[x - 4][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y + 1] == '1') {
                if (x < 4 || y > 10 || board.isolation[x + 2][y - 2] == '1' || board.isolation[x - 4][y + 4] == '1' || board.isolation[x - 3][y + 3] != '0' || board.isolation[x + 1][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//rightup check finished


            return true;
        }

        //左上和右
        //leftup and right
        if ((dirLeftup(board,x,y).equals("0011")  || dirLeftup(board,x,y).equals("0110")  || dirLeftup(board, x, y).equals("1011")  || dirLeftup(board, x, y).equals("2011") )
                && (dirRight(board,x,y).equals("0011")  || dirRight(board,x,y).equals("0110")  || dirRight(board, x, y).equals("1011")  || dirRight(board, x, y).equals("2011") ) ) {

            //check the leftup side
            if (board.isolation[x - 1][y - 1] == '0') {
                if (x < 5 || y < 5 || board.isolation[x + 1][y + 1] == '1' || board.isolation[x - 5][y - 5] == '1' || board.isolation[x - 4][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y - 1] == '1') {
                if (x < 4 || y < 4 || board.isolation[x + 2][y + 2] == '1' || board.isolation[x - 4][y - 4] == '1' || board.isolation[x - 3][y - 3] != '0' || board.isolation[x + 1][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//leftup side check finished

            //check the right side
            if (board.isolation[x][y + 1] == '0') {
                if (y > 9 || board.isolation[x][y - 1] == '1' || board.isolation[x][y + 5] == '1' || board.isolation[x][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x][y + 1] == '1') {
                if (y > 10 || board.isolation[x][y - 2] == '1' || board.isolation[x][y + 4] == '1' || board.isolation[x][y + 3] != '0' || board.isolation[x][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//right side check finished


            return true;
        }

        //左上和右下，不存在双活三
        //leftup and rightdown can't construct a 3-3 forbbiden

        //左上和下方
        //leftup and down
        if ((dirLeftup(board,x,y).equals("0011")  || dirLeftup(board,x,y).equals("0110")  || dirLeftup(board, x, y).equals("1011")  || dirLeftup(board, x, y).equals("2011") )
                && (dirDown(board,x,y).equals("0011")  || dirDown(board,x,y).equals("0110")  || dirDown(board, x, y).equals("1011")  || dirDown(board, x, y).equals("2011") ) ) {

            //check the leftup side
            if (board.isolation[x - 1][y - 1] == '0') {
                if (x < 5 || y < 5 || board.isolation[x + 1][y + 1] == '1' || board.isolation[x - 5][y - 5] == '1' || board.isolation[x - 4][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y - 1] == '1') {
                if (x < 4 || y < 4 || board.isolation[x + 2][y + 2] == '1' || board.isolation[x - 4][y - 4] == '1' || board.isolation[x - 3][y - 3] != '0' || board.isolation[x + 1][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//leftup side check finished


            //check the down side
            if (board.isolation[x + 1][y] == '0') {
                if (x > 9 || board.isolation[x + 1][y] == '1' || board.isolation[x + 5][y] == '1' || board.isolation[x + 4][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y] == '1') {
                if (x > 10 || board.isolation[x - 2][y] == '1' || board.isolation[x + 4][y] == '1' || board.isolation[x + 3][y] != '0' || board.isolation[x - 1][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//down check finished



            return true;
        }

        //左上和左下
        //leftup and leftdown
        if ((dirLeftup(board,x,y).equals("0011")  || dirLeftup(board,x,y).equals("0110")  || dirLeftup(board, x, y).equals("1011")  || dirLeftup(board, x, y).equals("2011") )
                && (dirLeftDown(board,x,y).equals("0011")  || dirLeftDown(board,x,y).equals("0110")  || dirLeftDown(board, x, y).equals("1011")  || dirLeftDown(board, x, y).equals("2011") ) ) {

            //check the leftup side
            if (board.isolation[x - 1][y - 1] == '0') {
                if (x < 5 || y < 5 || board.isolation[x + 1][y + 1] == '1' || board.isolation[x - 5][y - 5] == '1' || board.isolation[x - 4][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y - 1] == '1') {
                if (x < 4 || y < 4 || board.isolation[x + 2][y + 2] == '1' || board.isolation[x - 4][y - 4] == '1' || board.isolation[x - 3][y - 3] != '0' || board.isolation[x + 1][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//leftup side check finished

            //check the leftdown side
            if (board.isolation[x + 1][y - 1] == '0') {
                if (x > 9 || y < 5 || board.isolation[x - 1][y + 1] == '1' || board.isolation[x + 5][y - 5] == '1' || board.isolation[x + 4][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y - 1] == '1') {
                if (x > 10 || y < 4 ||board.isolation[x - 2][y + 1] == '1' || board.isolation[x + 4][y - 4] == '1' || board.isolation[x + 3][y - 3] != '0' || board.isolation[x - 1][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//leftdown check finished


            return true;
        }

        //上方和右上
        //up and rightup
        if ((dirup(board,x,y).equals("0011")  || dirup(board,x,y).equals("0110")  || dirup(board, x, y).equals("1011")  || dirup(board, x, y).equals("2011") )
                && (dirRightUP(board,x,y).equals("0011")  || dirRightUP(board,x,y).equals("0110")  || dirRightUP(board, x, y).equals("1011")  || dirRightUP(board, x, y).equals("2011") ) ) {

            //check the up side
            if (board.isolation[x - 1][y] == '0') {
                if (x < 5 || board.isolation[x + 1][y] == '1' || board.isolation[x - 5][y] == '1' || board.isolation[x - 4][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y] == '1') {
                if (x < 4 || board.isolation[x + 2][y] == '1' || board.isolation[x - 4][y] == '1' || board.isolation[x - 3][y] != '0' || board.isolation[x + 1][y] != '0') {
                    return false;//find the death 3 forbbiden
                }

            }//up check finished

            //check the rightup side
            if (board.isolation[x - 1][y + 1] == '0') {
                if (x < 5 || y > 9 || board.isolation[x + 1][y - 1] == '1' || board.isolation[x - 5][y + 5] == '1' || board.isolation[x - 4][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y + 1] == '1') {
                if (x < 4 || y > 10 ||board.isolation[x + 2][y - 2] == '1' || board.isolation[x - 4][y + 4] == '1' || board.isolation[x - 3][y + 3] != '0' || board.isolation[x + 1][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//rightup check finished



            return true;
        }

        //上方和右方
        //up and right
        if ((dirup(board,x,y).equals("0011")  || dirup(board,x,y).equals("0110")  || dirup(board, x, y).equals("1011")  || dirup(board, x, y).equals("2011") )
                && (dirRight(board,x,y).equals("0011")  || dirRight(board,x,y).equals("0110")  || dirRight(board, x, y).equals("1011")  || dirRight(board, x, y).equals("2011") ) ) {

            //check the up side
            if (board.isolation[x - 1][y] == '0') {
                if (x < 5 || board.isolation[x + 1][y] == '1' || board.isolation[x - 5][y] == '1' || board.isolation[x - 4][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y] == '1') {
                if (x < 4 || board.isolation[x + 2][y] == '1' || board.isolation[x - 4][y] == '1' || board.isolation[x - 3][y] != '0' || board.isolation[x + 1][y] != '0') {
                    return false;//find the death 3 forbbiden
                }

            }//up check finished

            //check the right side
            if (board.isolation[x][y + 1] == '0') {
                if (y > 9 || board.isolation[x][y - 1] == '1' || board.isolation[x][y + 5] == '1' || board.isolation[x][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x][y + 1] == '1') {
                if (y > 10 || board.isolation[x][y - 2] == '1' || board.isolation[x][y + 4] == '1' || board.isolation[x][y + 3] != '0' || board.isolation[x][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//right side check finished


            return true;
        }

        //上方和右下
        //up and rightdown
        if ((dirup(board,x,y).equals("0011")  || dirup(board,x,y).equals("0110")  || dirup(board, x, y).equals("1011")  || dirup(board, x, y).equals("2011") )
                && (dirRightDown(board,x,y).equals("0011")  || dirRightDown(board,x,y).equals("0110")  || dirRightDown(board, x, y).equals("1011")  || dirRightDown(board, x, y).equals("2011") ) ) {

            //check the up side
            if (board.isolation[x - 1][y] == '0') {
                if (x < 5 || board.isolation[x + 1][y] == '1' || board.isolation[x - 5][y] == '1' || board.isolation[x - 4][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y] == '1') {
                if (x < 4 || board.isolation[x + 2][y] == '1' || board.isolation[x - 4][y] == '1' || board.isolation[x - 3][y] != '0' || board.isolation[x + 1][y] != '0') {
                    return false;//find the death 3 forbbiden
                }

            }//up check finished

            //check the rightdown side
            if (board.isolation[x + 1][y + 1] == '0') {
                if (x > 9 || y > 9 || board.isolation[x - 1][y - 1] == '1' || board.isolation[x + 5][y + 5] == '1' || board.isolation[x + 4][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y + 1] == '1') {
                if (x > 10 || y > 10 || board.isolation[x - 2][y - 2] == '1' || board.isolation[x + 4][y + 4] == '1' || board.isolation[x + 3][y + 3] != '0' || board.isolation[x - 1][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//left check finished

            return true;
        }


        //上方和下方不存在双活三
        //up and down can't construct a 3-3 forbbiden

        //上方和左下
        //up and leftdown
        if ((dirup(board,x,y).equals("0011")  || dirup(board,x,y).equals("0110")  || dirup(board, x, y).equals("1011")  || dirup(board, x, y).equals("2011") )
                && (dirLeftDown(board,x,y).equals("0011")  || dirLeftDown(board,x,y).equals("0110")  || dirLeftDown(board, x, y).equals("1011")  || dirRightDown(board, x, y).equals("2011") ) ) {

            //check the up side
            if (board.isolation[x - 1][y] == '0') {
                if (x < 5 || board.isolation[x + 1][y] == '1' || board.isolation[x - 5][y] == '1' || board.isolation[x - 4][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y] == '1') {
                if (x < 4 || board.isolation[x + 2][y] == '1' || board.isolation[x - 4][y] == '1' || board.isolation[x - 3][y] != '0' || board.isolation[x + 1][y] != '0') {
                    return false;//find the death 3 forbbiden
                }

            }//up check finished

            //check the leftdown side
            if (board.isolation[x + 1][y - 1] == '0') {
                if (x > 9 || y < 5 || board.isolation[x - 1][y + 1] == '1' || board.isolation[x + 5][y - 5] == '1' || board.isolation[x + 4][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y - 1] == '1') {
                if (x > 10 || y < 4 || board.isolation[x - 2][y + 1] == '1' || board.isolation[x + 4][y - 4] == '1' || board.isolation[x + 3][y - 3] != '0' || board.isolation[x - 1][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//leftdown check finished

            return true;
        }

        //右上和右
        //rightup and right
        if ((dirRightUP(board,x,y).equals("0011")  || dirRightUP(board,x,y).equals("0110")  || dirRightUP(board, x, y).equals("1011")  || dirRightUP(board, x, y).equals("2011") )
                && (dirRight(board,x,y).equals("0011")  || dirRight(board,x,y).equals("0110")  || dirRight(board, x, y).equals("1011")  || dirRight(board, x, y).equals("2011") ) ) {

            //check the rightup side
            if (board.isolation[x - 1][y + 1] == '0') {
                if (x < 5 || y > 9 || board.isolation[x + 1][y - 1] == '1' || board.isolation[x - 5][y + 5] == '1' || board.isolation[x - 4][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y + 1] == '1') {
                if (x < 4 || y > 10 || board.isolation[x + 2][y - 2] == '1' || board.isolation[x - 4][y + 4] == '1' || board.isolation[x - 3][y + 3] != '0' || board.isolation[x + 1][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//rightup check finished

            //check the right side
            if (board.isolation[x][y + 1] == '0') {
                if (y > 9 || board.isolation[x][y - 1] == '1' || board.isolation[x][y + 5] == '1' || board.isolation[x][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x][y + 1] == '1') {
                if (y > 4 || board.isolation[x][y - 2] == '1' || board.isolation[x][y + 4] == '1' || board.isolation[x][y + 3] != '0' || board.isolation[x][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//right side check finished

            return true;
        }

        //右上和右下
        //rightup and rightdown
        if ((dirRightUP(board,x,y).equals("0011")  || dirRightUP(board,x,y).equals("0110")  || dirRightUP(board, x, y).equals("1011")  || dirRightUP(board, x, y).equals("2011") )
                && (dirRightDown(board,x,y).equals("0011")  || dirRightDown(board,x,y).equals("0110")  || dirRightDown(board, x, y).equals("1011")  || dirRightDown(board, x, y).equals("2011") ) ) {

            //check the rightup side
            if (board.isolation[x - 1][y + 1] == '0') {
                if (x < 5 || y > 9 ||  board.isolation[x + 1][y - 1] == '1' || board.isolation[x - 5][y + 5] == '1' || board.isolation[x - 4][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y + 1] == '1') {
                if (x < 4 || y > 10 || board.isolation[x + 2][y - 2] == '1' || board.isolation[x - 4][y + 4] == '1' || board.isolation[x - 3][y + 3] != '0' || board.isolation[x + 1][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//rightup check finished

            //check the rightdown side
            if (board.isolation[x + 1][y + 1] == '0') {
                if (x > 9 || y > 9 || board.isolation[x - 1][y - 1] == '1' || board.isolation[x + 5][y + 5] == '1' || board.isolation[x + 4][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y + 1] == '1') {
                if (x > 10 || y > 10 || board.isolation[x - 2][y - 2] == '1' || board.isolation[x + 4][y + 4] == '1' || board.isolation[x + 3][y + 3] != '0' || board.isolation[x - 1][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//rightdown check finished


            return true;
        }

        //右上和下
        //rightup and down
        if ((dirRightUP(board,x,y).equals("0011")  || dirRightUP(board,x,y).equals("0110")  || dirRightUP(board, x, y).equals("1011")  || dirRightUP(board, x, y).equals("2011") )
                && (dirDown(board,x,y).equals("0011")  || dirDown(board,x,y).equals("0110")  || dirDown(board, x, y).equals("1011")  || dirDown(board, x, y).equals("2011") ) ) {

            //check the rightup side
            if (board.isolation[x - 1][y + 1] == '0') {
                if (x < 5 || y > 9 || board.isolation[x + 1][y - 1] == '1' || board.isolation[x - 5][y + 5] == '1' || board.isolation[x - 4][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x - 1][y + 1] == '1') {
                if (x < 4 || y > 10 || board.isolation[x + 2][y - 2] == '1' || board.isolation[x - 4][y + 4] == '1' || board.isolation[x - 3][y + 3] != '0' || board.isolation[x + 1][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//rightup check finished

            //check the down side
            if (board.isolation[x + 1][y] == '0') {
                if (x > 9 || board.isolation[x + 1][y] == '1' || board.isolation[x + 5][y] == '1' || board.isolation[x + 4][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y] == '1') {
                if (x > 10 || board.isolation[x - 2][y] == '1' || board.isolation[x + 4][y] == '1' || board.isolation[x + 3][y] != '0' || board.isolation[x - 1][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//down check finished

            return true;
        }

        //右上左下不存在双活三
        //rightup and leftdown can't construct a 3-3 forbbiden

        //右和右下
        //right and rightdown
        if ((dirRight(board,x,y).equals("0011")  || dirRight(board,x,y).equals("0110")  || dirRight(board, x, y).equals("1011")  || dirRight(board, x, y).equals("2011") )
                && (dirRightDown(board,x,y).equals("0011")  || dirRightDown(board,x,y).equals("0110")  || dirRightDown(board, x, y).equals("1011")  || dirRightDown(board, x, y).equals("2011") ) ) {

            //check the right side
            if (board.isolation[x][y + 1] == '0') {
                if (y > 9 || board.isolation[x][y - 1] == '1' || board.isolation[x][y + 5] == '1' || board.isolation[x][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x][y + 1] == '1') {
                if (y > 10 || board.isolation[x][y - 2] == '1' || board.isolation[x][y + 4] == '1' || board.isolation[x][y + 3] != '0' || board.isolation[x][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//right side check finished

            //check the rightdown side
            if (board.isolation[x + 1][y + 1] == '0') {
                if (x > 9 || y > 9 || board.isolation[x - 1][y - 1] == '1' || board.isolation[x + 5][y + 5] == '1' || board.isolation[x + 4][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y + 1] == '1') {
                if (x > 10 || y > 10 || board.isolation[x - 2][y - 2] == '1' || board.isolation[x + 4][y + 4] == '1' || board.isolation[x + 3][y + 3] != '0' || board.isolation[x - 1][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//rightdown check finished

            return true;
        }

        //右和下
        //right and down
        if ((dirRight(board,x,y).equals("0011")  || dirRight(board,x,y).equals("0110")  || dirRight(board, x, y).equals("1011")  || dirRight(board, x, y).equals("2011") )
                && (dirDown(board,x,y).equals("0011")  || dirDown(board,x,y).equals("0110")  || dirDown(board, x, y).equals("1011")  || dirDown(board, x, y).equals("2011") ) ) {

            //check the right side
            if (board.isolation[x][y + 1] == '0') {
                if (y > 9 || board.isolation[x][y - 1] == '1' || board.isolation[x][y + 5] == '1' || board.isolation[x][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x][y + 1] == '1') {
                if (y > 10 || board.isolation[x][y - 2] == '1' || board.isolation[x][y + 4] == '1' || board.isolation[x][y + 3] != '0' || board.isolation[x][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//right side check finished


            //check the down side
            if (board.isolation[x + 1][y] == '0') {
                if (x > 9 || board.isolation[x + 1][y] == '1' || board.isolation[x + 5][y] == '1' || board.isolation[x + 4][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y] == '1') {
                if (x > 10 || board.isolation[x - 2][y] == '1' || board.isolation[x + 4][y] == '1' || board.isolation[x + 3][y] != '0' || board.isolation[x - 1][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//down check finished

            return true;
        }

        //右和左下
        //right and leftdown
        if ((dirRight(board,x,y).equals("0011")  || dirRight(board,x,y).equals("0110")  || dirRight(board, x, y).equals("1011")  || dirRight(board, x, y).equals("2011") )
                && (dirLeftDown(board,x,y).equals("0011")  || dirLeftDown(board,x,y).equals("0110")  || dirLeftDown(board, x, y).equals("1011")  || dirLeftDown(board, x, y).equals("2011") ) ) {

            //check the right side
            if (board.isolation[x][y + 1] == '0') {
                if (y > 9 || board.isolation[x][y - 1] == '1' || board.isolation[x][y + 5] == '1' || board.isolation[x][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x][y + 1] == '1') {
                if (y > 10 || board.isolation[x][y - 2] == '1' || board.isolation[x][y + 4] == '1' || board.isolation[x][y + 3] != '0' || board.isolation[x][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//right side check finished

            //check the leftdown side
            if (board.isolation[x + 1][y - 1] == '0') {
                if (x > 9 || y < 5 || board.isolation[x - 1][y + 1] == '1' || board.isolation[x + 5][y - 5] == '1' || board.isolation[x + 4][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y - 1] == '1') {
                if (x > 10 || y < 4 || board.isolation[x - 2][y + 1] == '1' || board.isolation[x + 4][y - 4] == '1' || board.isolation[x + 3][y - 3] != '0' || board.isolation[x - 1][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//leftdown check finished

            return true;
        }

        //右下和下
        //rightdown and down
        if ((dirRightDown(board,x,y).equals("0011")  || dirRightDown(board,x,y).equals("0110")  || dirRightDown(board, x, y).equals("1011")  || dirRightDown(board, x, y).equals("2011") )
                && (dirDown(board,x,y).equals("0011")  || dirDown(board,x,y).equals("0110")  || dirDown(board, x, y).equals("1011")  || dirDown(board, x, y).equals("2011") ) ) {

            //check the rightdown side
            if (board.isolation[x + 1][y + 1] == '0') {
                if (x > 9 || y > 9 || board.isolation[x - 1][y - 1] == '1' || board.isolation[x + 5][y + 5] == '1' || board.isolation[x + 4][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y + 1] == '1') {
                if (x > 10 || y > 10 || board.isolation[x - 2][y - 2] == '1' || board.isolation[x + 4][y + 4] == '1' || board.isolation[x + 3][y + 3] != '0' || board.isolation[x - 1][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//rightdown check finished

            //check the down side
            if (board.isolation[x + 1][y] == '0') {
                if (x > 9 || board.isolation[x + 1][y] == '1' || board.isolation[x + 5][y] == '1' || board.isolation[x + 4][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y] == '1') {
                if (x > 10 || board.isolation[x - 2][y] == '1' || board.isolation[x + 4][y] == '1' || board.isolation[x + 3][y] != '0' || board.isolation[x - 1][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//down check finished

            return true;
        }

        //右下和左下
        //rightdown and leftdown
        if ((dirRightDown(board,x,y).equals("0011")  || dirRightDown(board,x,y).equals("0110")  || dirRightDown(board, x, y).equals("1011")  || dirRightDown(board, x, y).equals("2011") )
                && (dirLeftDown(board,x,y).equals("0011")  || dirLeftDown(board,x,y).equals("0110")  || dirLeftDown(board, x, y).equals("1011")  || dirLeftDown(board, x, y).equals("2011") ) ) {

            //check the rightdown side
            if (board.isolation[x + 1][y + 1] == '0') {
                if (x > 9 || y > 9 || board.isolation[x - 1][y - 1] == '1' || board.isolation[x + 5][y + 5] == '1' || board.isolation[x + 4][y + 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y + 1] == '1') {
                if (x > 10 || y > 10 || board.isolation[x - 2][y - 2] == '1' || board.isolation[x + 4][y + 4] == '1' || board.isolation[x + 3][y + 3] != '0' || board.isolation[x - 1][y - 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//rightdown check finished


            //check the leftdown side
            if (board.isolation[x + 1][y - 1] == '0') {
                if (x > 9 || y < 5 || board.isolation[x - 1][y + 1] == '1' || board.isolation[x + 5][y - 5] == '1' || board.isolation[x + 4][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y - 1] == '1') {
                if (x > 10 || y < 4 || board.isolation[x - 2][y + 1] == '1' || board.isolation[x + 4][y - 4] == '1' || board.isolation[x + 3][y - 3] != '0' || board.isolation[x - 1][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//leftdown check finished



            return true;
        }

        //下和左下
        //down and leftdown
        if ((dirDown(board,x,y).equals("0011")  || dirDown(board,x,y).equals("0110")  || dirDown(board, x, y).equals("1011")  || dirDown(board, x, y).equals("2011") )
                && (dirLeftDown(board,x,y).equals("0011")  || dirLeftDown(board,x,y).equals("0110")  || dirLeftDown(board, x, y).equals("1011")  || dirLeftDown(board, x, y).equals("2011") ) ) {

            //check the down side
            if (board.isolation[x + 1][y] == '0') {
                if (x > 9 || board.isolation[x + 1][y] == '1' || board.isolation[x + 5][y] == '1' || board.isolation[x + 4][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y] == '1') {
                if (x > 4 || board.isolation[x - 2][y] == '1' || board.isolation[x + 4][y] == '1' || board.isolation[x + 3][y] != '0' || board.isolation[x - 1][y] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//down check finished

            //check the leftdown side
            if (board.isolation[x + 1][y - 1] == '0') {
                if (x > 9 || y < 5 || board.isolation[x - 1][y + 1] == '1' || board.isolation[x + 5][y - 5] == '1' || board.isolation[x + 4][y - 4] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }

            if (board.isolation[x + 1][y - 1] == '1') {
                if (x > 10 || y < 4 || board.isolation[x - 2][y + 1] == '1' || board.isolation[x + 4][y - 4] == '1' || board.isolation[x + 3][y - 3] != '0' || board.isolation[x - 1][y + 1] != '0') {
                    return false;//find the death 3 forbbiden
                }
            }//leftdown check finished

            return true;
        }


        //三三禁手的特殊情况,此情况是指，除了以上的的头对头情况外，可能还存在关键点位于中间，下面的函数主要解决此种情况
        /*
            the special situation in 3-3 forbbiden: there are some critical points in the body that could construct a 3-3  forbbiden,


            for example,       1
                             1 1 1
                               1
                    this situation may also be the living 3-3 forbbiden.

           and the functions below are designed to solve the situation
                                                                            2021.11.21
         */

        //cross and vertical
        if (x > 2 && y > 2 &&  x < 12 && y < 12 && board.isolation[x - 1][y] == '1' && board.isolation[x + 1][y] == '1'
                && board.isolation[x][y - 1] == '1' && board.isolation[x][y + 1] == '1') {

            // check vertical
            if (board.isolation[x - 2][y] != '0' || board.isolation[x + 2][y] != '0' || board.isolation[x - 3][y] == '1' || board.isolation[x + 3][y] == '1') {
                return false;
            }// vertical check finished

            // check cross
            if (board.isolation[x][y - 2] != '0' || board.isolation[x][y + 2] != '0' || board.isolation[x][y - 3] == '1' || board.isolation[x][y + 3] == '1') {
                return false;
            } //cross check finished

            return true;
        }

        //leftup and cross
        if (x > 2 && y > 2 &&  x < 12 && y < 12 && board.isolation[x - 1][y - 1] == '1' && board.isolation[x + 1][y + 1] == '1'
                && board.isolation[x][y - 1] == '1' && board.isolation[x][y + 1] == '1') {

            // check cross
            if (board.isolation[x][y - 2] != '0' || board.isolation[x][y + 2] != '0' || board.isolation[x][y - 3] == '1' || board.isolation[x][y + 3] == '1') {
                return false;
            } // cross check finished

            // check leftup
            if (board.isolation[x - 2][y - 2] != '0' || board.isolation[x + 2][y + 2] != '0' || board.isolation[x - 3][y - 3] == '1' || board.isolation[x + 3][y + 3] == '1') {
                return false;
            }// leftup check finished


            return true;
        }

        //rightup and cross
        if (x > 2 && y > 2 &&  x < 12 && y < 12 && board.isolation[x - 1][y + 1] == '1' && board.isolation[x + 1][y - 1] == '1'
                && board.isolation[x][y - 1] == '1' && board.isolation[x][y + 1] == '1') {

            //check rightup
            if (board.isolation[x - 2][y + 2] != '0' || board.isolation[x + 2][y - 2] != '0' || board.isolation[x - 3][y + 3] == '1' || board.isolation[x + 3][y - 3] == '1') {
                return false;
            } //rightup check finished

            // check cross
            if (board.isolation[x][y - 2] != '0' || board.isolation[x][y + 2] != '0' || board.isolation[x][y - 3] == '1' || board.isolation[x][y + 3] == '1') {
                return false;
            } // cross check finished

            return true;
        }


        //leftup and vertical
        if (x > 2 && y > 2 &&  x < 12 && y < 12 && board.isolation[x - 1][y] == '1' && board.isolation[x + 1][y] == '1'
                && board.isolation[x - 1][y - 1] == '1' && board.isolation[x + 1][y + 1] == '1') {

            // check vertical
            if (board.isolation[x - 2][y] != '0' || board.isolation[x + 2][y] != '0' || board.isolation[x - 3][y] == '1' || board.isolation[x + 3][y] == '1') {
                return false;
            }// vertical check finished


            // check leftup
            if (board.isolation[x - 2][y - 2] != '0' || board.isolation[x + 2][y + 2] != '0' || board.isolation[x - 3][y - 3] == '1' || board.isolation[x + 3][y + 3] == '1') {
                return false;
            }// leftup check finished

            return true;
        }

        //leftup and rightup
        if (x > 2 && y > 2 &&  x < 12 && y < 12 && board.isolation[x - 1][y - 1] == '1' && board.isolation[x + 1][y + 1] == '1'
                && board.isolation[x - 1][y + 1] == '1' && board.isolation[x + 1][y - 1] == '1') {

            // check leftup
            if (board.isolation[x - 2][y - 2] != '0' || board.isolation[x + 2][y + 2] != '0' || board.isolation[x - 3][y - 3] == '1' || board.isolation[x + 3][y + 3] == '1') {
                return false;
            }// leftup check finished

            //check rightup
            if (board.isolation[x - 2][y + 2] != '0' || board.isolation[x + 2][y - 2] != '0' || board.isolation[x - 3][y + 3] == '1' || board.isolation[x + 3][y - 3] == '1') {
                return false;
            } //rightup check finished

            return true;
        }

        //vertical and rightup
        if (x > 2 && y > 2 &&  x < 12 && y < 12 && board.isolation[x - 1][y] == '1' && board.isolation[x + 1][y] == '1'
                && board.isolation[x - 1][y + 1] == '1' && board.isolation[x + 1][y - 1] == '1') {

            // check vertical
            if (board.isolation[x - 2][y] != '0' || board.isolation[x + 2][y] != '0' || board.isolation[x - 3][y] == '1' || board.isolation[x + 3][y] == '1') {
                return false;
            }// vertical check finished

            //check rightup
            if (board.isolation[x - 2][y + 2] != '0' || board.isolation[x + 2][y - 2] != '0' || board.isolation[x - 3][y + 3] == '1' || board.isolation[x + 3][y - 3] == '1') {
                return false;
            } //rightup check finished

            return true;
        }












        return false;
    };

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

package checkBoardService.checkBoardServiceImpl;

import checkBoardService.Forbbiden_4Service;
import com.goBang.model.Board;

public class Forbbiden4ServiceImpl implements Forbbiden_4Service {

    public boolean Forbidden4(Board board, int x, int y) {

        /*
        To judge the 4-4 forbbiden, we just need to judge if there are four black chesses in eight direction except some special situation
         and the functions below can judge most 4-4 forbbiden.
         */

        //left-本位置
        if (dirLeft(board, x,y).equals("1110")  || dirLeft(board, x,y).equals("0111")
                || dirLeft(board, x, y).equals("2111")  || dirLeft(board, x, y).equals("1101")) {

            if (dirLeft(board, x, y).equals("1101") && board.isolation[x][y] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y - 1)
                        || leftUpJudge(board, x, y - 3) || leftUpJudge(board, x, y - 4)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y - 1)
                        || upJudge(board, x, y - 3) || upJudge(board, x, y - 4)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y - 1)
                        || rightUpJudge(board, x, y - 3) || rightUpJudge(board, x, y - 4)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y - 1)
                        || rightDownJudge(board, x, y - 3) || rightDownJudge(board, x, y - 4)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y - 1)
                        || downJudge(board, x, y - 3) || downJudge(board, x, y - 4)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y - 1)
                        || leftDownJudge(board, x, y - 3) || leftDownJudge(board, x, y - 4)) {
                    return true;
                }
            }

            if (dirLeft(board, x, y).equals("1110") && board.isolation[x][y] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y - 2)
                        || leftUpJudge(board, x, y - 3) || leftUpJudge(board, x, y - 4)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y - 2)
                        || upJudge(board, x, y - 3) || upJudge(board, x, y - 4)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y - 2)
                        || rightUpJudge(board, x, y - 3) || rightUpJudge(board, x, y - 4)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y - 2)
                        || rightDownJudge(board, x, y - 3) || rightDownJudge(board, x, y - 4)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y - 2)
                        || downJudge(board, x, y - 3) || downJudge(board, x, y - 4)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y - 2)
                        || leftDownJudge(board, x, y - 3) || leftDownJudge(board, x, y - 4)) {
                    return true;
                }
            }

            if (dirLeft(board, x, y).equals("2111") && board.isolation[x][y] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y - 2)
                        || leftUpJudge(board, x, y - 3) || leftUpJudge(board, x, y - 1)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y - 2)
                        || upJudge(board, x, y - 3) || upJudge(board, x, y - 1)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y - 2)
                        || rightUpJudge(board, x, y - 3) || rightUpJudge(board, x, y - 1)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y - 2)
                        || rightDownJudge(board, x, y - 3) || rightDownJudge(board, x, y - 1)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y - 2)
                        || downJudge(board, x, y - 3) || downJudge(board, x, y - 1)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y - 2)
                        || leftDownJudge(board, x, y - 3) || leftDownJudge(board, x, y - 1)) {
                    return true;
                }
            }

            if (dirLeft(board, x, y).equals("0111") && board.isolation[x][y] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y - 2)
                        || leftUpJudge(board, x, y - 3) || leftUpJudge(board, x, y - 1)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y - 2)
                        || upJudge(board, x, y - 3) || upJudge(board, x, y - 1)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y - 2)
                        || rightUpJudge(board, x, y - 3) || rightUpJudge(board, x, y - 1)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y - 2)
                        || rightDownJudge(board, x, y - 3) || rightDownJudge(board, x, y - 1)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y - 2)
                        || downJudge(board, x, y - 3) || downJudge(board, x, y - 1)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y - 2)
                        || leftDownJudge(board, x, y - 3) || leftDownJudge(board, x, y - 1)) {
                    return true;
                }
            }

        }

        //left_向右偏移1个单位进行判断
        if (dirLeft(board, x,y + 1).equals("1110")  || dirLeft(board, x,y + 1 ).equals("0111")
                || dirLeft(board, x, y + 1).equals("2111")  || dirLeft(board, x, y + 1).equals("1101")) {

            if (dirLeft(board, x, y + 1).equals("1101") && board.isolation[x][y + 1] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y + 1)
                        || leftUpJudge(board, x, y - 3) || leftUpJudge(board, x, y - 2)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y + 1)
                        || upJudge(board, x, y - 3) || upJudge(board, x, y - 2)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y + 1)
                        || rightUpJudge(board, x, y - 3) || rightUpJudge(board, x, y - 2)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y + 1)
                        || rightDownJudge(board, x, y - 3) || rightDownJudge(board, x, y - 2)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y + 1)
                        || downJudge(board, x, y - 3) || downJudge(board, x, y - 2)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y + 1)
                        || leftDownJudge(board, x, y - 3) || leftDownJudge(board, x, y - 2)) {
                    return true;
                }
            }

            if (dirLeft(board, x, y + 1).equals("1110") && board.isolation[x][y + 1] == '1') {

                //左上方
                if (leftUpJudge(board, x, y + 1) || leftUpJudge(board, x, y - 2)
                        || leftUpJudge(board, x, y - 3) || leftUpJudge(board, x, y - 1)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y + 1) || upJudge(board, x, y - 2)
                        || upJudge(board, x, y - 3) || upJudge(board, x, y - 1)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y + 1) || rightUpJudge(board, x, y - 2)
                        || rightUpJudge(board, x, y - 3) || rightUpJudge(board, x, y - 1)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y + 1) || rightDownJudge(board, x, y - 2)
                        || rightDownJudge(board, x, y - 3) || rightDownJudge(board, x, y - 1)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y + 1) || downJudge(board, x, y - 2)
                        || downJudge(board, x, y - 3) || downJudge(board, x, y - 1)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y + 1) || leftDownJudge(board, x, y - 2)
                        || leftDownJudge(board, x, y - 3) || leftDownJudge(board, x, y - 1)) {
                    return true;
                }
            }

            if (dirLeft(board, x, y + 1).equals("2111") && board.isolation[x][y + 1] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y - 2)
                        || leftUpJudge(board, x, y + 1) || leftUpJudge(board, x, y - 1)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y - 2)
                        || upJudge(board, x, y + 1) || upJudge(board, x, y - 1)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y - 2)
                        || rightUpJudge(board, x, y + 1) || rightUpJudge(board, x, y - 1)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y - 2)
                        || rightDownJudge(board, x, y + 1) || rightDownJudge(board, x, y - 1)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y - 2)
                        || downJudge(board, x, y  + 1) || downJudge(board, x, y - 1)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y - 2)
                        || leftDownJudge(board, x, y + 1) || leftDownJudge(board, x, y - 1)) {
                    return true;
                }
            }

            if (dirLeft(board, x, y + 1).equals("0111") && board.isolation[x][y + 1] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y - 2)
                        || leftUpJudge(board, x, y  + 1) || leftUpJudge(board, x, y - 1)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y - 2)
                        || upJudge(board, x, y + 1) || upJudge(board, x, y - 1)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y - 2)
                        || rightUpJudge(board, x, y + 1) || rightUpJudge(board, x, y - 1)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y - 2)
                        || rightDownJudge(board, x, y + 1) || rightDownJudge(board, x, y - 1)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y - 2)
                        || downJudge(board, x, y + 1) || downJudge(board, x, y - 1)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y - 2)
                        || leftDownJudge(board, x, y + 1) || leftDownJudge(board, x, y - 1)) {
                    return true;
                }
            }

        }

        //left_向右偏移2个单位进行判断
        if (dirLeft(board, x,y + 2).equals("1110")  || dirLeft(board, x,y + 2).equals("0111")
                || dirLeft(board, x, y + 2).equals("2111")  || dirLeft(board, x, y + 2).equals("1101")) {


            if (dirLeft(board, x, y + 2).equals("1101") && board.isolation[x][y + 2] == '1') {

                //左上方
                if (leftUpJudge(board, x, y + 1) || leftUpJudge(board, x, y - 1)
                        || leftUpJudge(board, x, y - 2) || leftUpJudge(board, x, y + 2)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y + 1) || upJudge(board, x, y - 1)
                        || upJudge(board, x, y - 2) || upJudge(board, x, y + 2)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y + 1) || rightUpJudge(board, x, y - 1)
                        || rightUpJudge(board, x, y - 2) || rightUpJudge(board, x, y + 2)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y + 1) || rightDownJudge(board, x, y - 1)
                        || rightDownJudge(board, x, y - 2) || rightDownJudge(board, x, y + 2)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y + 1) || downJudge(board, x, y - 1)
                        || downJudge(board, x, y - 2) || downJudge(board, x, y + 2)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y + 1) || leftDownJudge(board, x, y - 1)
                        || leftDownJudge(board, x, y + 2) || leftDownJudge(board, x, y - 2)) {
                    return true;
                }
            }//complished

            if (dirLeft(board, x, y + 2).equals("1110") && board.isolation[x][y + 2] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y - 1)
                        || leftUpJudge(board, x, y - 2) || leftUpJudge(board, x, y + 2)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y - 2)
                        || upJudge(board, x, y - 1) || upJudge(board, x, y + 2)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y - 2)
                        || rightUpJudge(board, x, y - 1) || rightUpJudge(board, x, y + 2)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y - 2)
                        || rightDownJudge(board, x, y - 1) || rightDownJudge(board, x, y + 2)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y - 2)
                        || downJudge(board, x, y - 1) || downJudge(board, x, y + 2)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y - 2)
                        || leftDownJudge(board, x, y - 1) || leftDownJudge(board, x, y + 2)) {
                    return true;
                }
            }//complished

            if (dirLeft(board, x, y + 2).equals("2111") && board.isolation[x][y + 2] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y + 2)
                        || leftUpJudge(board, x, y + 1) || leftUpJudge(board, x, y - 1)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y + 2)
                        || upJudge(board, x, y + 1) || upJudge(board, x, y - 1)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y + 2)
                        || rightUpJudge(board, x, y + 1) || rightUpJudge(board, x, y - 1)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y + 2)
                        || rightDownJudge(board, x, y + 1) || rightDownJudge(board, x, y - 1)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y + 2)
                        || downJudge(board, x, y + 1) || downJudge(board, x, y - 1)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y + 2)
                        || leftDownJudge(board, x, y + 1) || leftDownJudge(board, x, y - 1)) {
                    return true;
                }
            }//complished

            if (dirLeft(board, x, y + 2).equals("0111") && board.isolation[x][y + 2] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y + 2)
                        || leftUpJudge(board, x, y + 1) || leftUpJudge(board, x, y - 1)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y + 2)
                        || upJudge(board, x, y + 1) || upJudge(board, x, y - 1)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y + 2)
                        || rightUpJudge(board, x, y + 1) || rightUpJudge(board, x, y - 1)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y + 2)
                        || rightDownJudge(board, x, y + 1) || rightDownJudge(board, x, y - 1)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y + 2)
                        || downJudge(board, x, y + 1) || downJudge(board, x, y - 1)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y + 2)
                        || leftDownJudge(board, x, y + 1) || leftDownJudge(board, x, y - 1)) {
                    return true;
                }
            }//complished
//
        }

        //left_向右偏移3个单位进行判断
        if (dirLeft(board, x,y + 3).equals("1110")  || dirLeft(board, x,y + 3).equals("0111")
                || dirLeft(board, x, y + 3).equals("2111")  || dirLeft(board, x, y + 3).equals("1101")) {


            if (dirLeft(board, x, y + 3).equals("1101")  && board.isolation[x][y + 3] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y - 1)
                        || leftUpJudge(board, x, y + 2) || leftUpJudge(board, x, y + 3)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y - 1)
                        || upJudge(board, x, y + 3) || upJudge(board, x, y + 2)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y - 1)
                        || rightUpJudge(board, x, y + 3) || rightUpJudge(board, x, y + 2)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y - 1)
                        || rightDownJudge(board, x, y + 3) || rightDownJudge(board, x, y + 2)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y - 1)
                        || downJudge(board, x, y + 3) || downJudge(board, x, y + 2)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y - 1)
                        || leftDownJudge(board, x, y + 3) || leftDownJudge(board, x, y + 2)) {
                    return true;
                }
            }//complished

            if (dirLeft(board, x, y + 3).equals("1110")  && board.isolation[x][y + 3] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y - 1)
                        || leftUpJudge(board, x, y + 1) || leftUpJudge(board, x, y + 3)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y - 1)
                        || upJudge(board, x, y + 1) || upJudge(board, x, y + 3)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y - 1)
                        || rightUpJudge(board, x, y + 3) || rightUpJudge(board, x, y + 1)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y - 1)
                        || rightDownJudge(board, x, y + 3) || rightDownJudge(board, x, y + 1)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y - 1)
                        || downJudge(board, x, y + 3) || downJudge(board, x, y + 1)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y - 1)
                        || leftDownJudge(board, x, y + 3) || leftDownJudge(board, x, y + 4)) {
                    return true;
                }
            }//complished

            if (dirLeft(board, x, y + 3).equals("2111") && board.isolation[x][y + 3] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y + 2)
                        || leftUpJudge(board, x, y + 3) || leftUpJudge(board, x, y + 1)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y + 2)
                        || upJudge(board, x, y + 3) || upJudge(board, x, y + 1)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y + 2)
                        || rightUpJudge(board, x, y + 3) || rightUpJudge(board, x, y + 1)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y + 2)
                        || rightDownJudge(board, x, y + 3) || rightDownJudge(board, x, y + 1)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y + 2)
                        || downJudge(board, x, y + 3) || downJudge(board, x, y + 1)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y + 2)
                        || leftDownJudge(board, x, y + 3) || leftDownJudge(board, x, y + 1)) {
                    return true;
                }
            }//complished

            if (dirLeft(board, x, y + 3).equals("0111") && board.isolation[x][y + 3] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y + 2)
                        || leftUpJudge(board, x, y + 3) || leftUpJudge(board, x, y + 1)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y + 2)
                        || upJudge(board, x, y + 3) || upJudge(board, x, y + 1)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y + 2)
                        || rightUpJudge(board, x, y + 3) || rightUpJudge(board, x, y + 1)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y + 2)
                        || rightDownJudge(board, x, y + 3) || rightDownJudge(board, x, y + 1)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y + 2)
                        || downJudge(board, x, y + 3) || downJudge(board, x, y + 1)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y + 2)
                        || leftDownJudge(board, x, y + 3) || leftDownJudge(board, x, y + 1)) {
                    return true;
                }
            }//complished

        }

        //left_向右偏移4个单位进行判断
        if (dirLeft(board, x,y + 4).equals("1110")  || dirLeft(board, x,y + 4).equals("0111")
                || dirLeft(board, x, y + 4).equals("2111")  || dirLeft(board, x, y + 4).equals("1101")) {


            if (dirLeft(board, x, y + 4).equals("1101") && board.isolation[x][y + 4] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y + 1)
                        || leftUpJudge(board, x, y + 3) || leftUpJudge(board, x, y + 4)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y + 1)
                        || upJudge(board, x, y + 3) || upJudge(board, x, y + 4)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y + 1)
                        || rightUpJudge(board, x, y + 3) || rightUpJudge(board, x, y + 4)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y + 1)
                        || rightDownJudge(board, x, y + 3) || rightDownJudge(board, x, y + 4)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y + 1)
                        || downJudge(board, x, y + 3) || downJudge(board, x, y + 4)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y + 1)
                        || leftDownJudge(board, x, y + 3) || leftDownJudge(board, x, y + 4)) {
                    return true;
                }
            }//complished

            if (dirLeft(board, x, y + 4).equals("1110") && board.isolation[x][y + 4] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x, y + 2)
                        || leftUpJudge(board, x, y + 4) || leftUpJudge(board, x, y + 1)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x, y + 2)
                        || upJudge(board, x, y + 4) || upJudge(board, x, y + 1)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x, y + 2)
                        || rightUpJudge(board, x, y + 4) || rightUpJudge(board, x, y + 1)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x, y + 2)
                        || rightDownJudge(board, x, y + 4) || rightDownJudge(board, x, y + 1)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x, y + 2)
                        || downJudge(board, x, y + 4) || downJudge(board, x, y + 1)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x, y + 2)
                        || leftDownJudge(board, x, y + 4) || leftDownJudge(board, x, y + 1)) {
                    return true;
                }
            }//complished

        }

        //up_本位置判断
        if (dirup(board, x,y).equals("1110")  || dirup(board, x,y).equals("0111")
                || dirup(board, x, y).equals("2111")  || dirup(board, x, y).equals("1101")) {

            if (dirup(board, x, y).equals("1101") && board.isolation[x][y] == '1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y)
                        || leftJudge(board, x - 3, y) || leftJudge(board, x - 4, y)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y)
                        || leftUpJudge(board, x - 3, y) || leftUpJudge(board, x - 4, y)) {
                    return true;
                }
                //上方
//                if (upJudge(board,x,y) || upJudge(board, x - 1, y)
//                        || upJudge(board, x - 3, y) || upJudge(board, x - 4, y)) {
//                    return true;
//                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y)
                        || rightUpJudge(board, x - 3, y) || rightUpJudge(board, x - 4, y)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y)
                        || rightJudge(board, x - 3, y) || rightJudge(board, x - 4, y)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y )
                        || rightDownJudge(board, x - 3, y) || rightDownJudge(board, x - 4, y)) {
                    return true;
                }
                //下方
//                if (downJudge(board,x,y) || downJudge(board, x - 1, y)
//                        || downJudge(board, x - 3, y) || downJudge(board, x - 4, y)) {
//                    return true;
//                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y)
                        || leftDownJudge(board, x - 3, y) || leftDownJudge(board, x - 4, y)) {
                    return true;
                }
            }//complished

            if (dirup(board, x, y).equals("1110") && board.isolation[x][y] == '1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 2, y)
                        || leftJudge(board, x - 3, y) || leftJudge(board, x - 4, y)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 2, y)
                        || leftUpJudge(board, x - 3, y) || leftUpJudge(board, x - 4, y)) {
                    return true;
                }
                //上方
//                if (upJudge(board,x,y) || upJudge(board, x - 2, y)
//                        || upJudge(board, x - 3, y) || upJudge(board, x - 4, y)) {
//                    return true;
//                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 2, y)
                        || rightUpJudge(board, x - 3, y) || rightUpJudge(board, x - 4, y)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 2, y)
                        || rightJudge(board, x - 3, y) || rightJudge(board, x - 4, y)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 2, y)
                        || rightDownJudge(board, x - 3, y) || rightDownJudge(board, x - 4, y)) {
                    return true;
                }
                //下方
//                if (downJudge(board,x,y) || downJudge(board, x - 2, y)
//                        || downJudge(board, x - 3, y) || downJudge(board, x - 4, y)) {
//                    return true;
//                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 2, y)
                        || leftDownJudge(board, x - 3, y) || leftDownJudge(board, x - 4, y)) {
                    return true;
                }
            }//complished

            if ((dirup(board, x, y).equals("2111") || dirup(board, x, y).equals("0111")) && board.isolation[x][y] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y)
                        || leftUpJudge(board, x - 2, y) || leftUpJudge(board, x - 3, y)) {
                    return true;
                }
                //上方
//                if (upJudge(board,x,y) || upJudge(board, x - 1, y)
//                        || upJudge(board, x - 2, y) || upJudge(board, x - 3, y)) {
//                    return true;
//                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y)
                        || rightUpJudge(board, x - 2, y) || rightUpJudge(board, x - 3, y)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y)
                        || rightDownJudge(board, x - 2, y) || rightDownJudge(board, x - 3, y)) {
                    return true;
                }
                //下方
//                if (downJudge(board,x,y) || downJudge(board, x - 1, y)
//                        || downJudge(board, x - 2, y) || downJudge(board, x - 3, y)) {
//                    return true;
//                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y)
                        || leftDownJudge(board, x - 2, y) || leftDownJudge(board, x - 3, y)) {
                    return true;
                }
            }//complished

        }
        //up_向下偏移1个单位进行判断
        if (dirup(board, x + 1,y).equals("1110")  || dirup(board, x + 1,y).equals("0111")
                || dirup(board, x + 1, y).equals("2111")  || dirup(board, x + 1, y).equals("1101")) {

            if (dirup(board, x + 1, y).equals("1101") && board.isolation[x + 1][y] == '1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 2, y)
                        || leftJudge(board, x - 3, y) || leftJudge(board, x + 1, y)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 2, y)
                        || leftUpJudge(board, x - 3, y) || leftUpJudge(board, x + 1, y)) {
                    return true;
                }
                //上方
//                if (upJudge(board,x,y) || upJudge(board, x - 2, y)
//                        || upJudge(board, x - 3, y) || upJudge(board, x + 1, y)) {
//                    return true;
//                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 2, y)
                        || rightUpJudge(board, x - 3, y) || rightUpJudge(board, x + 1, y)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 2, y)
                        || rightJudge(board, x - 3, y) || rightJudge(board, x + 1, y)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 2, y )
                        || rightDownJudge(board, x - 3, y) || rightDownJudge(board, x + 1, y)) {
                    return true;
                }
                //下方
//                if (downJudge(board,x,y) || downJudge(board, x - 2, y)
//                        || downJudge(board, x - 3, y) || downJudge(board, x + 1, y)) {
//                    return true;
//                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 2, y)
                        || leftDownJudge(board, x - 3, y) || leftDownJudge(board, x + 1, y)) {
                    return true;
                }
            }//complished

//            if (dirup(board, x + 1, y).equals("1110")) {
//
//                //左方
//                if (leftJudge(board, x, y) || leftJudge(board, x - 2, y)
//                        || leftJudge(board, x - 3, y) || leftJudge(board, x - 4, y)) {
//                    return true;
//                }
//                //左上方
//                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 2, y)
//                        || leftUpJudge(board, x - 3, y) || leftUpJudge(board, x - 4, y)) {
//                    return true;
//                }
//                //上方
//                if (upJudge(board,x,y) || upJudge(board, x - 2, y)
//                        || upJudge(board, x - 3, y) || upJudge(board, x - 4, y)) {
//                    return true;
//                }
//                //右上方
//                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 2, y)
//                        || rightUpJudge(board, x - 3, y) || rightUpJudge(board, x - 4, y)) {
//                    return true;
//                }
//                //右方
//                if (rightJudge(board, x, y) || rightJudge(board, x - 2, y)
//                        || rightJudge(board, x - 3, y) || rightJudge(board, x - 4, y)) {
//                    return true;
//                }
//                //右下方
//                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 2, y - 1)
//                        || rightDownJudge(board, x - 3, y) || rightDownJudge(board, x - 4, y)) {
//                    return true;
//                }
//                //下方
//                if (downJudge(board,x,y) || downJudge(board, x - 2, y - 1)
//                        || downJudge(board, x - 3, y) || downJudge(board, x - 4, y)) {
//                    return true;
//                }
//                //左下方
//                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 2, y - 1)
//                        || leftDownJudge(board, x - 3, y) || leftDownJudge(board, x - 4, y)) {
//                    return true;
//                }
//            }//complished

            if ((dirup(board, x + 1, y).equals("2111") || dirup(board, x + 1, y).equals("0111")) && board.isolation[x + 1][y] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y)
                        || leftUpJudge(board, x - 2, y) || leftUpJudge(board, x + 1, y)) {
                    return true;
                }
                //上方
//                if (upJudge(board,x,y) || upJudge(board, x - 1, y)
//                        || upJudge(board, x - 2, y) || upJudge(board, x + 1, y)) {
//                    return true;
//                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y)
                        || rightUpJudge(board, x - 2, y) || rightUpJudge(board, x + 1, y)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y)
                        || rightDownJudge(board, x - 2, y) || rightDownJudge(board, x + 1, y)) {
                    return true;
                }
                //下方
//                if (downJudge(board,x,y) || downJudge(board, x - 1, y)
//                        || downJudge(board, x - 2, y) || downJudge(board, x + 1, y)) {
//                    return true;
//                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y)
                        || leftDownJudge(board, x - 2, y) || leftDownJudge(board, x + 1, y)) {
                    return true;
                }
            }//complished

        }

//        //up_向下偏移2个单位判断
        if (dirup(board, x + 2,y).equals("1110")  || dirup(board, x + 2,y).equals("0111")
                || dirup(board, x + 2, y).equals("2111")  || dirup(board, x + 2, y).equals("1101")) {

            if (dirup(board, x + 2, y).equals("1110")  && board.isolation[x + 2][y] == '1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 2, y)
                        || leftJudge(board, x - 1, y) || leftJudge(board, x + 2, y)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 2, y)
                        || leftUpJudge(board, x - 1, y) || leftUpJudge(board, x + 2, y)) {
                    return true;
                }

                //上方,不可进行重复判断

                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 2, y)
                        || rightUpJudge(board, x - 1, y) || rightUpJudge(board, x + 2, y)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 2, y)
                        || rightJudge(board, x - 1, y) || rightJudge(board, x + 2, y)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 2, y)
                        || rightDownJudge(board, x - 1, y) || rightDownJudge(board, x + 2, y)) {
                    return true;
                }
                //下方,特殊情况

                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 2, y)
                        || leftDownJudge(board, x - 1, y) || leftDownJudge(board, x + 2, y)) {
                    return true;
                }
            }//complished

            if ((dirup(board, x + 2, y).equals("2111") || dirup(board, x + 2, y).equals("0111")) && board.isolation[x + 2][y] == '1') {

                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y)
                        || leftUpJudge(board, x + 2, y) || leftUpJudge(board, x + 1, y)) {
                    return true;
                }
                //上方，不可进行判断
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y)
                        || rightUpJudge(board, x + 2, y) || rightUpJudge(board, x + 1, y)) {
                    return true;
                }
                //右方特殊情况，以后考虑
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y)
                        || rightDownJudge(board, x + 2, y) || rightDownJudge(board, x + 1, y)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 1, y)
                        || downJudge(board, x + 2, y) || downJudge(board, x + 1, y)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y)
                        || leftDownJudge(board, x + 2, y) || leftDownJudge(board, x + 1, y)) {
                    return true;
                }
            }//complished

        }

        //up_向下偏移3个单位判断
        if (dirup(board, x + 3,y).equals("1110")  || dirup(board, x + 3,y).equals("0111")
                || dirup(board, x + 3, y).equals("2111")  || dirup(board, x + 3, y).equals("1101")) {

            if (dirup(board, x + 3, y).equals("1101") && board.isolation[x + 3][y] == '1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y)
                        || leftJudge(board, x + 3, y) || leftJudge(board, x + 2, y)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y)
                        || leftUpJudge(board, x + 3, y) || leftUpJudge(board, x + 2, y)) {
                    return true;
                }
                //上方
//                if (upJudge(board,x,y) || upJudge(board, x - 1, y)
//                        || upJudge(board, x + 3, y) || upJudge(board, x + 2, y)) {
//                    return true;
//                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y)
                        || rightUpJudge(board, x + 3, y) || rightUpJudge(board, x + 2, y)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y)
                        || rightJudge(board, x + 3, y) || rightJudge(board, x + 2, y)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y )
                        || rightDownJudge(board, x + 3, y) || rightDownJudge(board, x + 2, y)) {
                    return true;
                }
                //下方
//                if (downJudge(board,x,y) || downJudge(board, x - 1, y)
//                        || downJudge(board, x + 3, y) || downJudge(board, x + 2, y)) {
//                    return true;
//                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y)
                        || leftDownJudge(board, x + 3, y) || leftDownJudge(board, x + 2, y)) {
                    return true;
                }
            }//complished

            if (dirup(board, x + 3, y).equals("1110")  && board.isolation[x + 3][y] == '1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y)
                        || leftJudge(board, x + 3, y) || leftJudge(board, x + 1, y)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y)
                        || leftUpJudge(board, x + 3, y) || leftUpJudge(board, x + 1, y)) {
                    return true;
                }
                //上方
//                if (upJudge(board,x,y) || upJudge(board, x - 1, y)
//                        || upJudge(board, x + 3, y) || upJudge(board, x + 1, y)) {
//                    return true;
//                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y)
                        || rightUpJudge(board, x + 3, y) || rightUpJudge(board, x + 1, y)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y)
                        || rightJudge(board, x + 3, y) || rightJudge(board, x + 1, y)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y )
                        || rightDownJudge(board, x + 3, y) || rightDownJudge(board, x + 1, y)) {
                    return true;
                }
                //下方
//                if (downJudge(board,x,y) || downJudge(board, x - 1, y)
//                        || downJudge(board, x + 3, y) || downJudge(board, x + 1, y)) {
//                    return true;
//                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y)
                        || leftDownJudge(board, x + 3, y) || leftDownJudge(board, x + 1, y)) {
                    return true;
                }
            }//complished

            if (((dirup(board, x + 3, y).equals("2111") || dirup(board, x + 3, y).equals("0111"))) && board.isolation[x + 3][y] == '1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x + 1, y)
                        || leftJudge(board, x + 3, y) || leftJudge(board, x + 2, y)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x + 1, y)
                        || leftUpJudge(board, x + 3, y) || leftUpJudge(board, x + 2, y)) {
                    return true;
                }
                //上方
//                if (upJudge(board,x,y) || upJudge(board, x + 1, y)
//                        || upJudge(board, x + 3, y) || upJudge(board, x + 2, y)) {
//                    return true;
//                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x + 1, y)
                        || rightUpJudge(board, x + 3, y) || rightUpJudge(board, x + 2, y)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x + 1, y)
                        || rightJudge(board, x + 3, y) || rightJudge(board, x + 2, y)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x + 1, y )
                        || rightDownJudge(board, x + 3, y) || rightDownJudge(board, x + 2, y)) {
                    return true;
                }
                //下方
//                if (downJudge(board,x,y) || downJudge(board, x + 1, y)
//                        || downJudge(board, x + 3, y) || downJudge(board, x + 2, y)) {
//                    return true;
//                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x + 1, y)
                        || leftDownJudge(board, x + 3, y) || leftDownJudge(board, x + 2, y)) {
                    return true;
                }
            }//complished

        }

        //up_向下偏移4个单位判断
        if (dirup(board, x + 4,y).equals("1110")  || dirup(board, x + 4,y).equals("0111")
                || dirup(board, x + 4, y).equals("2111")  || dirup(board, x + 4, y).equals("1101")) {

            if (dirup(board, x + 4, y).equals("1101")  && board.isolation[x + 4][y] == '1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x + 1, y)
                        || leftJudge(board, x + 3, y) || leftJudge(board, x + 4, y)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x + 1, y)
                        || leftUpJudge(board, x + 3, y) || leftUpJudge(board, x + 4, y)) {
                    return true;
                }
                //上方
//                if (upJudge(board,x,y) || upJudge(board, x + 1, y)
//                        || upJudge(board, x + 3, y) || upJudge(board, x + 4, y)) {
//                    return true;
//                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x + 1, y)
                        || rightUpJudge(board, x + 3, y) || rightUpJudge(board, x + 4, y)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x + 1, y)
                        || rightJudge(board, x + 3, y) || rightJudge(board, x + 4, y)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x + 1, y )
                        || rightDownJudge(board, x + 3, y) || rightDownJudge(board, x + 4, y)) {
                    return true;
                }
                //下方
//                if (downJudge(board,x,y) || downJudge(board, x + 1, y)
//                        || downJudge(board, x + 3, y) || downJudge(board, x + 4, y)) {
//                    return true;
//                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x + 1, y)
                        || leftDownJudge(board, x + 3, y) || leftDownJudge(board, x + 4, y)) {
                    return true;
                }
            }//complished

            if (dirup(board, x + 4, y).equals("1110") && board.isolation[x + 4][y] == '1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x + 1, y)
                        || leftJudge(board, x + 2, y) || leftJudge(board, x + 4, y)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x + 1, y)
                        || leftUpJudge(board, x + 2, y) || leftUpJudge(board, x + 4, y)) {
                    return true;
                }
                //上方
//                if (upJudge(board,x,y) || upJudge(board, x + 1, y)
//                        || upJudge(board, x + 2, y) || upJudge(board, x + 4, y)) {
//                    return true;
//                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x + 1, y)
                        || rightUpJudge(board, x + 2, y) || rightUpJudge(board, x + 4, y)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x + 1, y)
                        || rightJudge(board, x + 2, y) || rightJudge(board, x + 4, y)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x + 1, y )
                        || rightDownJudge(board, x + 2, y) || rightDownJudge(board, x + 4, y)) {
                    return true;
                }
                //下方
//                if (downJudge(board,x,y) || downJudge(board, x + 1, y)
//                        || downJudge(board, x + 2, y) || downJudge(board, x + 4, y)) {
//                    return true;
//                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x + 1, y)
                        || leftDownJudge(board, x + 2, y) || leftDownJudge(board, x + 4, y)) {
                    return true;
                }
            }//complished

        }





        //leftup_本位置判断
        if (dirLeftup(board, x,y).equals("1110")  || dirLeftup(board, x,y).equals("0111")
                || dirLeftup(board, x, y).equals("2111")  || dirLeftup(board, x, y).equals("1101")) {

            if (dirLeftup(board, x, y).equals("1101")) {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y - 1)
                        || leftJudge(board, x - 3, y - 3) || leftJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //左上方
//                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y)
//                        || leftUpJudge(board, x - 3, y - 3) || leftUpJudge(board, x - 3, y - 3)) {
//                    return true;
//                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 1, y - 1)
                        || upJudge(board, x - 3, y - 3) || upJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y - 1)
                        || rightUpJudge(board, x - 3, y - 3) || rightUpJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y - 1)
                        || rightJudge(board, x - 3, y - 3) || rightJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //右下方
//                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y )
//                        || rightDownJudge(board, x + 3, y) || rightDownJudge(board, x + 2, y)) {
//                    return true;
//                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 1, y - 1)
                        || downJudge(board, x - 3, y - 3) || downJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y - 1)
                        || leftDownJudge(board, x - 3, y - 3) || leftDownJudge(board, x - 4, y - 4)) {
                    return true;
                }
            }//complished

            if (dirLeftup(board, x, y).equals("1110")) {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 4, y - 4)
                        || leftJudge(board, x - 3, y - 3) || leftJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //左上方
//                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y)
//                        || leftUpJudge(board, x - 3, y - 3) || leftUpJudge(board, x - 3, y - 3)) {
//                    return true;
//                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 2, y - 2)
                        || upJudge(board, x - 3, y - 3) || upJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 2, y - 2)
                        || rightUpJudge(board, x - 3, y - 3) || rightUpJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 2, y - 2)
                        || rightJudge(board, x - 3, y - 3) || rightJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //右下方
//                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y )
//                        || rightDownJudge(board, x + 3, y) || rightDownJudge(board, x + 2, y)) {
//                    return true;
//                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 2, y - 2)
                        || downJudge(board, x - 3, y - 3) || downJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 2, y - 2)
                        || leftDownJudge(board, x - 3, y - 3) || leftDownJudge(board, x - 4, y - 4)) {
                    return true;
                }
            }//complished

            if (dirLeftup(board, x, y).equals("2111") || dirLeftup(board, x, y).equals("0111")) {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y - 1)
                        || leftJudge(board, x - 3, y - 3) || leftJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //左上方
//                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y - 1)
//                        || leftUpJudge(board, x - 3, y - 3) || leftUpJudge(board, x - 2, y - 2)) {
//                    return true;
//                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 1, y - 1)
                        || upJudge(board, x - 3, y - 3) || upJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y - 1)
                        || rightUpJudge(board, x - 3, y - 3) || rightUpJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y - 1)
                        || rightJudge(board, x - 3, y - 3) || rightJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //右下方
//                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y - 1)
//                        || rightDownJudge(board, x - 3, y - 3) || rightDownJudge(board, x - 2, y - 2)) {
//                    return true;
//                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 1, y - 1)
                        || downJudge(board, x - 3, y - 3) || downJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y - 1)
                        || leftDownJudge(board, x - 3, y - 3) || leftDownJudge(board, x - 2, y - 2)) {
                    return true;
                }
            }//complished

        }

        //leftup_向右下偏移1个单位
        if (dirLeftup(board,x + 1,y + 1).equals("1110")  || dirLeftup(board, x + 1,y + 1).equals("0111")
                || dirLeftup(board, x + 1, y + 1).equals("2111")  || dirLeftup(board, x + 1, y + 1).equals("1101")) {

            if (dirLeftup(board, x + 1, y + 1).equals("1101") && board.isolation[x + 1][y + 1] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 2, y - 2)
                        || leftJudge(board, x - 3, y - 3) || leftJudge(board, x + 1, y + 1)) {
                    return true;
                }
                //左上方
//                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y)
//                        || leftUpJudge(board, x - 3, y - 3) || leftUpJudge(board, x - 3, y - 3)) {
//                    return true;
//                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x + 1, y + 1)
                        || upJudge(board, x - 3, y - 3) || upJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x + 1, y + 1)
                        || rightUpJudge(board, x - 3, y - 3) || rightUpJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x + 1, y + 1)
                        || rightJudge(board, x - 3, y - 3) || rightJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //右下方
//                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y )
//                        || rightDownJudge(board, x + 3, y) || rightDownJudge(board, x + 2, y)) {
//                    return true;
//                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x + 1, y + 1)
                        || downJudge(board, x - 3, y - 3) || downJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x + 1, y + 1)
                        || leftDownJudge(board, x - 3, y - 3) || leftDownJudge(board, x - 2, y - 2)) {
                    return true;
                }
            }//complished

            if ((dirLeftup(board, x + 1, y + 1).equals("2111") || dirLeftup(board, x + 1, y + 1).equals("0111"))
                    && board.isolation[x + 1][y + 1] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y - 1)
                        || leftJudge(board, x - 3, y - 3) || leftJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //左上方
//                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y - 1)
//                        || leftUpJudge(board, x - 3, y - 3) || leftUpJudge(board, x - 2, y - 2)) {
//                    return true;
//                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 1, y - 1)
                        || upJudge(board, x - 3, y - 3) || upJudge(board, x - 2, y - 1)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y - 1)
                        || rightUpJudge(board, x - 3, y - 3) || rightUpJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y - 1)
                        || rightJudge(board, x - 3, y - 3) || rightJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //右下方
//                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y - 1)
//                        || rightDownJudge(board, x - 3, y - 3) || rightDownJudge(board, x - 2, y - 2)) {
//                    return true;
//                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 1, y - 1)
                        || downJudge(board, x - 3, y - 3) || downJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y - 1)
                        || leftDownJudge(board, x - 3, y - 3) || leftDownJudge(board, x - 2, y - 2)) {
                    return true;
                }
            }//complished

        }

        //leftup_向右下偏移2个单位
        if (dirLeftup(board, x + 2,y + 2).equals("1110")  || dirLeftup(board, x + 2,y + 2).equals("0111")
                || dirLeftup(board, x + 2, y + 2).equals("2111")  || dirLeftup(board, x + 2, y + 2).equals("1101")) {

            if (dirLeftup(board, x + 2, y + 2).equals("1110") && board.isolation[x + 2][y + 2] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y - 1)
                        || leftJudge(board, x + 2, y + 2) || leftJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //左上方
//                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y)
//                        || leftUpJudge(board, x - 3, y - 3) || leftUpJudge(board, x - 3, y - 3)) {
//                    return true;
//                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 1, y - 1)
                        || upJudge(board, x + 2, y + 2) || upJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y - 1)
                        || rightUpJudge(board, x + 2, y + 2) || rightUpJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y - 1)
                        || rightJudge(board, x + 2, y + 2) || rightJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //右下方
//                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y )
//                        || rightDownJudge(board, x + 3, y) || rightDownJudge(board, x + 2, y)) {
//                    return true;
//                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 1, y - 1)
                        || downJudge(board, x + 2, y + 2) || downJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y - 1)
                        || leftDownJudge(board, x + 2, y + 2) || leftDownJudge(board, x - 2, y - 2)) {
                    return true;
                }
            }//complished

            if ((dirLeftup(board, x + 2, y + 2).equals("2111") || dirLeftup(board, x + 2, y + 2).equals("0111"))
                    && board.isolation[x + 2][y + 2] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y - 1)
                        || leftJudge(board, x + 1, y  + 2) || leftJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //左上方
//                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y - 1)
//                        || leftUpJudge(board, x - 3, y - 3) || leftUpJudge(board, x - 2, y - 2)) {
//                    return true;
//                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 1, y - 1)
                        || upJudge(board, x + 1, y + 1) || upJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y - 1)
                        || rightUpJudge(board, x + 1, y + 1) || rightUpJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y - 1)
                        || rightJudge(board, x + 1, y + 1) || rightJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //右下方
//                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y - 1)
//                        || rightDownJudge(board, x - 3, y - 3) || rightDownJudge(board, x - 2, y - 2)) {
//                    return true;
//                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 1, y - 1)
                        || downJudge(board, x + 1, y + 1) || downJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y - 1)
                        || leftDownJudge(board, x + 1, y + 1) || leftDownJudge(board, x + 2, y + 2)) {
                    return true;
                }
            }//complished

        }

        //leftup_向右下偏移3个单位
        if (dirLeftup(board, x + 3,y + 3).equals("1110")  || dirLeftup(board, x + 3,y + 3).equals("0111")
                || dirLeftup(board, x + 3, y + 3).equals("2111")  || dirLeftup(board, x + 3, y + 3).equals("1101")) {

            if (dirLeftup(board, x + 3, y + 3).equals("1101") && board.isolation[x + 3][y + 3] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y - 1)
                        || leftJudge(board, x - 3, y - 3) || leftJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //左上方
//                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y)
//                        || leftUpJudge(board, x - 3, y - 3) || leftUpJudge(board, x - 3, y - 3)) {
//                    return true;
//                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 1, y - 1)
                        || upJudge(board, x - 3, y - 3) || upJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y - 1)
                        || rightUpJudge(board, x - 3, y - 3) || rightUpJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y - 1)
                        || rightJudge(board, x - 3, y - 3) || rightJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //右下方
//                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y )
//                        || rightDownJudge(board, x + 3, y) || rightDownJudge(board, x + 2, y)) {
//                    return true;
//                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 1, y - 1)
                        || downJudge(board, x - 3, y - 3) || downJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y - 1)
                        || leftDownJudge(board, x - 3, y - 3) || leftDownJudge(board, x - 4, y - 4)) {
                    return true;
                }
            }//complished

            if (dirLeftup(board, x + 3, y + 3).equals("1110") && board.isolation[x + 3][y + 3] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 4, y - 4)
                        || leftJudge(board, x - 3, y - 3) || leftJudge(board, x - 2, y - 2)) {
                    return true;
                }
                //左上方
//                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y)
//                        || leftUpJudge(board, x - 3, y - 3) || leftUpJudge(board, x - 3, y - 3)) {
//                    return true;
//                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 2, y - 2)
                        || upJudge(board, x - 3, y - 3) || upJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 2, y - 2)
                        || rightUpJudge(board, x - 3, y - 3) || rightUpJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 2, y - 2)
                        || rightJudge(board, x - 3, y - 3) || rightJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //右下方
//                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y )
//                        || rightDownJudge(board, x + 3, y) || rightDownJudge(board, x + 2, y)) {
//                    return true;
//                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 2, y - 2)
                        || downJudge(board, x - 3, y - 3) || downJudge(board, x - 4, y - 4)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 2, y - 2)
                        || leftDownJudge(board, x - 3, y - 3) || leftDownJudge(board, x - 4, y - 4)) {
                    return true;
                }
            }//complished

            if ((dirLeftup(board, x + 3, y + 3).equals("2111") || dirLeftup(board, x + 3, y + 3).equals("0111"))
                    && board.isolation[x + 3][y + 3] == '1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x + 1, y + 1)
                        || leftJudge(board, x + 3, y + 3) || leftJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //左上方
//                if (leftUpJudge(board, x, y) || leftUpJudge(board, x + 1, y + 1)
//                        || leftUpJudge(board, x + 3, y + 3) || leftUpJudge(board, x + 2, y + 2)) {
//                    return true;
//                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x + 1, y + 1)
                        || upJudge(board, x + 3, y + 3) || upJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x + 1, y + 1)
                        || rightUpJudge(board, x + 3, y + 3) || rightUpJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x + 1, y + 1)
                        || rightJudge(board, x + 3, y + 3) || rightJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //右下方
//                if (rightDownJudge(board,x,y) || rightDownJudge(board, x + 1, y + 1)
//                        || rightDownJudge(board, x + 3, y + 3) || rightDownJudge(board, x + 2, y + 2)) {
//                    return true;
//                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x + 1, y + 1)
                        || downJudge(board, x + 3, y + 3) || downJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x + 1, y + 1)
                        || leftDownJudge(board, x + 3, y + 3) || leftDownJudge(board, x + 2, y + 2)) {
                    return true;
                }
            }//complished

        }

        //leftup_向右下偏移4个单位
        if (dirLeftup(board, x + 4,y + 4).equals("1110")  || dirLeftup(board, x + 4,y + 4).equals("0111")
                || dirLeftup(board, x + 4, y + 4).equals("2111")  || dirLeftup(board, x + 4, y + 4).equals("1101")) {

            if (dirLeftup(board, x + 4, y + 4).equals("1110") && board.isolation[x + 4][y + 4] == '1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x + 1, y + 1)
                        || leftJudge(board, x + 4, y + 4) || leftJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //左上方
//                if (leftUpJudge(board, x, y) || leftUpJudge(board, x + 1, y)
//                        || leftUpJudge(board, x + 4, y + 4) || leftUpJudge(board, x + 4, y + 4)) {
//                    return true;
//                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x + 1, y + 1)
                        || upJudge(board, x + 4, y + 4) || upJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x + 1, y + 1)
                        || rightUpJudge(board, x + 4, y + 4) || rightUpJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x + 1, y + 1)
                        || rightJudge(board, x + 4, y + 4) || rightJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //右下方
//                if (rightDownJudge(board,x,y) || rightDownJudge(board, x + 1, y )
//                        || rightDownJudge(board, x + 3, y) || rightDownJudge(board, x + 2, y)) {
//                    return true;
//                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x + 1, y + 1)
                        || downJudge(board, x + 4, y + 4) || downJudge(board, x + 2, y + 2)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x + 1, y + 1)
                        || leftDownJudge(board, x + 4, y + 4) || leftDownJudge(board, x + 2, y + 2)) {
                    return true;
                }
            }//complished

            if (dirLeftup(board, x + 4, y + 4).equals("1101") && board.isolation[x + 4][y + 4] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x + 1, y + 1)
                        || leftJudge(board, x + 4, y + 4) || leftJudge(board, x + 3, y + 3)) {
                    return true;
                }
                //左上方
//                if (leftUpJudge(board, x, y) || leftUpJudge(board, x + 1, y)
//                        || leftUpJudge(board, x + 4, y + 4) || leftUpJudge(board, x + 4, y + 4)) {
//                    return true;
//                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x + 1, y + 1)
                        || upJudge(board, x + 4, y + 4) || upJudge(board, x + 3, y + 3)) {
                    return true;
                }
                //右上方
                if (rightUpJudge(board,x,y) || rightUpJudge(board, x + 1, y + 1)
                        || rightUpJudge(board, x + 4, y + 4) || rightUpJudge(board, x + 3, y + 3)) {
                    return true;
                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x + 1, y + 1)
                        || rightJudge(board, x + 4, y + 4) || rightJudge(board, x + 3, y + 3)) {
                    return true;
                }
                //右下方
//                if (rightDownJudge(board,x,y) || rightDownJudge(board, x + 1, y )
//                        || rightDownJudge(board, x + 3, y) || rightDownJudge(board, x + 3, y)) {
//                    return true;
//                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x + 1, y + 1)
                        || downJudge(board, x + 4, y + 4) || downJudge(board, x + 3, y + 3)) {
                    return true;
                }
                //左下方
                if (leftDownJudge(board,x,y) || leftDownJudge(board, x + 1, y + 1)
                        || leftDownJudge(board, x + 4, y + 4) || leftDownJudge(board, x + 3, y + 3)) {
                    return true;
                }
            }//complished

        }


        //rightup_本位置判断
        if (dirRightUP(board, x ,y ).equals("1110")  || dirRightUP(board, x ,y ).equals("0111")
                || dirRightUP(board, x , y ).equals("2111")  || dirRightUP(board, x , y ).equals("1101")) {

            if (dirRightUP(board, x , y ).equals("1101")) {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y + 1)
                        || leftJudge(board, x - 3, y + 3) || leftJudge(board, x - 4, y + 4)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y + 1)
                        || leftUpJudge(board, x - 3, y + 3) || leftUpJudge(board, x - 4, y + 4)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 1, y + 1)
                        || upJudge(board, x - 3, y + 3) || upJudge(board, x - 4, y + 4)) {
                    return true;
                }
                //右上方
//                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y + 1)
//                        || rightUpJudge(board, x - 3, y + 3) || rightUpJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y + 1)
                        || rightJudge(board, x - 3, y + 3) || rightJudge(board, x - 4, y + 4)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y + 1 )
                        || rightDownJudge(board, x - 3, y + 3) || rightDownJudge(board, x - 4, y + 4)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 1, y + 1)
                        || downJudge(board, x - 3, y + 3) || downJudge(board, x - 4, y + 4)) {
                    return true;
                }
                //左下方
//                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y + 1)
//                        || leftDownJudge(board, x - 3, y + 3) || leftDownJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
            }//complished

            if (dirRightUP(board, x , y ).equals("1110")) {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 2, y + 2)
                        || leftJudge(board, x - 3, y + 3) || leftJudge(board, x - 4, y + 4)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 2, y + 2)
                        || leftUpJudge(board, x - 3, y + 3) || leftUpJudge(board, x - 4, y + 4)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 2, y + 2)
                        || upJudge(board, x - 3, y + 3) || upJudge(board, x - 4, y + 4)) {
                    return true;
                }
                //右上方
//                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 2, y + 2)
//                        || rightUpJudge(board, x - 3, y + 3) || rightUpJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 2, y + 2)
                        || rightJudge(board, x - 3, y + 3) || rightJudge(board, x - 4, y + 4)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 2, y + 2 )
                        || rightDownJudge(board, x - 3, y + 3) || rightDownJudge(board, x - 4, y + 4)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 2, y + 2)
                        || downJudge(board, x - 3, y + 3) || downJudge(board, x - 4, y + 4)) {
                    return true;
                }
                //左下方
//                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 2, y + 2)
//                        || leftDownJudge(board, x - 3, y + 3) || leftDownJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
            }//complished

            if (dirRightUP(board, x , y ).equals("2111") || dirRightUP(board, x , y ).equals("0111")) {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y + 1)
                        || leftJudge(board, x - 3, y + 3) || leftJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y + 1)
                        || leftUpJudge(board, x - 3, y + 3) || leftUpJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 1, y + 1)
                        || upJudge(board, x - 3, y + 3) || upJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //右上方
//                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y + 1)
//                        || rightUpJudge(board, x - 3, y + 3) || rightUpJudge(board, x - 2, y + 2)) {
//                    return true;
//                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y + 1)
                        || rightJudge(board, x - 3, y + 3) || rightJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y + 1 )
                        || rightDownJudge(board, x - 3, y + 3) || rightDownJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 1, y + 1)
                        || downJudge(board, x - 3, y + 3) || downJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //左下方
//                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y + 1)
//                        || leftDownJudge(board, x - 3, y + 3) || leftDownJudge(board, x - 2, y + 2)) {
//                    return true;
//                }
            }//complished

        }

        //rightup_左下偏移1个单位判断
        if (dirRightUP(board, x + 1,y - 1).equals("1110")  || dirRightUP(board, x + 1,y - 1).equals("0111")
                || dirRightUP(board, x + 1, y - 1).equals("2111")  || dirRightUP(board, x + 1, y - 1).equals("1101")) {

            if (dirRightUP(board, x + 1, y - 1).equals("1101") && board.isolation[x + 1][y - 1] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x + 1, y - 1)
                        || leftJudge(board, x - 3, y + 3) || leftJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x + 1, y - 1)
                        || leftUpJudge(board, x - 3, y + 3) || leftUpJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x + 1, y - 1)
                        || upJudge(board, x - 3, y + 3) || upJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //右上方
//                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y + 1)
//                        || rightUpJudge(board, x - 3, y + 3) || rightUpJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x + 1, y - 1)
                        || rightJudge(board, x - 3, y + 3) || rightJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x + 1, y - 1 )
                        || rightDownJudge(board, x - 3, y + 3) || rightDownJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x + 1, y - 1)
                        || downJudge(board, x - 3, y + 3) || downJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //左下方
//                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y + 1)
//                        || leftDownJudge(board, x - 3, y + 3) || leftDownJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
            }//complished

            if ((dirRightUP(board, x + 1, y - 1).equals("2111") || dirRightUP(board, x + 1, y - 1).equals("0111"))
                    && board.isolation[x + 1][y - 1] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x + 1, y - 1)
                        || leftJudge(board, x - 1, y + 1) || leftJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x + 1, y - 1)
                        || leftUpJudge(board, x - 1, y + 1) || leftUpJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x + 1, y - 1)
                        || upJudge(board, x - 1, y + 1) || upJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //右上方
//                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y + 1)
//                        || rightUpJudge(board, x - 1, y + 1) || rightUpJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x + 1, y - 1)
                        || rightJudge(board, x - 1, y + 1) || rightJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x + 1, y - 1 )
                        || rightDownJudge(board, x - 1, y + 1) || rightDownJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x + 1, y - 1)
                        || downJudge(board, x - 1, y + 1) || downJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //左下方
//                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y + 1)
//                        || leftDownJudge(board, x - 1, y + 1) || leftDownJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
            }//complished

        }

        //rightup_左下偏移2个单位判断
        if (dirRightUP(board, x + 2,y - 2).equals("1110")  || dirRightUP(board, x + 2,y - 2).equals("0111")
                || dirRightUP(board, x + 2, y - 2).equals("2111")  || dirRightUP(board, x + 2, y - 2).equals("1101")) {

            if (dirRightUP(board, x + 2, y - 2).equals("1110") && board.isolation[x + 2][y - 2] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y + 1)
                        || leftJudge(board, x + 2, y - 2) || leftJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y + 1)
                        || leftUpJudge(board, x + 2, y - 2) || leftUpJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 1, y + 1)
                        || upJudge(board, x + 2, y - 2) || upJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //右上方
//                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y + 1)
//                        || rightUpJudge(board, x - 3, y + 3) || rightUpJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y + 1)
                        || rightJudge(board, x + 2, y - 2) || rightJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y + 1 )
                        || rightDownJudge(board, x + 2, y - 2) || rightDownJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 1, y + 1)
                        || downJudge(board, x + 2, y - 2) || downJudge(board, x - 2, y + 2)) {
                    return true;
                }
                //左下方
//                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y + 1)
//                        || leftDownJudge(board, x - 3, y + 3) || leftDownJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
            }//complished

            if ((dirRightUP(board, x + 2, y - 2).equals("2111") || dirRightUP(board, x + 2, y - 2).equals("0111"))
                    && board.isolation[x + 2][y - 2] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y + 1)
                        || leftJudge(board, x + 2, y - 2) || leftJudge(board, x + 1, y - 1)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y + 1)
                        || leftUpJudge(board, x + 2, y - 2) || leftUpJudge(board, x + 1, y - 1)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 1, y + 1)
                        || upJudge(board, x + 2, y - 2) || upJudge(board, x + 1, y - 1)) {
                    return true;
                }
                //右上方
//                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y + 1)
//                        || rightUpJudge(board, x - 3, y + 3) || rightUpJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y + 1)
                        || rightJudge(board, x + 2, y - 2) || rightJudge(board, x + 1, y - 1)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y + 1 )
                        || rightDownJudge(board, x + 2, y - 2) || rightDownJudge(board, x + 1, y - 1)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 1, y + 1)
                        || downJudge(board, x + 2, y - 2) || downJudge(board,  x + 1, y - 1)) {
                    return true;
                }
                //左下方
//                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y + 1)
//                        || leftDownJudge(board, x - 3, y + 3) || leftDownJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
            }//complished

        }

        //rightup_左下偏移3个单位判断
        if (dirRightUP(board, x + 3,y - 3).equals("1110")  || dirRightUP(board, x + 3,y - 3).equals("0111")
                || dirRightUP(board, x + 3, y - 3).equals("2111")  || dirRightUP(board, x + 3, y - 3).equals("1101")) {

            if (dirRightUP(board, x + 3, y - 3).equals("1110") && board.isolation[x + 3][y - 3] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y + 1)
                        || leftJudge(board, x + 1, y - 1) || leftJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y + 1)
                        || leftUpJudge(board, x + 1, y - 1) || leftUpJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 1, y + 1)
                        || upJudge(board, x + 1, y - 1) || upJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //右上方
//                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y + 1)
//                        || rightUpJudge(board, x - 3, y + 3) || rightUpJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y + 1)
                        || rightJudge(board, x + 1, y - 1) || rightJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y + 1 )
                        || rightDownJudge(board, x + 1, y - 1) || rightDownJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 1, y + 1)
                        || downJudge(board, x + 1, y - 1) || downJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //左下方
//                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y + 1)
//                        || leftDownJudge(board, x - 3, y + 3) || leftDownJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
            }//complished

            if (dirRightUP(board, x + 3, y - 3).equals("1101") && board.isolation[x + 3][y - 3] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x - 1, y + 1)
                        || leftJudge(board, x + 2, y - 2) || leftJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x - 1, y + 1)
                        || leftUpJudge(board, x + 2, y - 2) || leftUpJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x - 1, y + 1)
                        || upJudge(board, x + 2, y - 2) || upJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //右上方
//                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y + 1)
//                        || rightUpJudge(board, x - 3, y + 3) || rightUpJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x - 1, y + 1)
                        || rightJudge(board, x + 2, y - 2) || rightJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x - 1, y + 1 )
                        || rightDownJudge(board, x + 2, y - 2) || rightDownJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x - 1, y + 1)
                        || downJudge(board, x + 2, y - 2) || downJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //左下方
//                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y + 1)
//                        || leftDownJudge(board, x - 3, y + 3) || leftDownJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
            }//complished

            if ((dirRightUP(board, x + 3, y - 3).equals("2111") || dirRightUP(board, x + 3, y - 3).equals("0111"))
                    && board.isolation[x + 3][y - 3] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x + 3, y - 3)
                        || leftJudge(board, x + 2, y - 2) || leftJudge(board, x + 1, y - 1)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x + 3, y - 3)
                        || leftUpJudge(board, x + 2, y - 2) || leftUpJudge(board, x + 1, y - 1)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x + 3, y - 3)
                        || upJudge(board, x + 2, y - 2) || upJudge(board, x + 1, y - 1)) {
                    return true;
                }
                //右上方
//                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y + 1)
//                        || rightUpJudge(board, x - 3, y + 3) || rightUpJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x + 3, y - 3)
                        || rightJudge(board, x + 2, y - 2) || rightJudge(board, x + 1, y - 1)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x + 3, y - 3 )
                        || rightDownJudge(board, x + 2, y - 2) || rightDownJudge(board, x + 1, y - 1)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x + 3, y - 3)
                        || downJudge(board, x + 2, y - 2) || downJudge(board,  x + 1, y - 1)) {
                    return true;
                }
                //左下方
//                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y + 1)
//                        || leftDownJudge(board, x - 3, y + 3) || leftDownJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
            }//complished

        }

        //rightup_左下偏移4个单位判断
        if (dirRightUP(board, x + 4,y - 4).equals("1110")  || dirRightUP(board, x + 4,y - 4).equals("0111")
                || dirRightUP(board, x + 4,y - 4).equals("2111")  || dirRightUP(board, x + 4,y - 4).equals("1101")) {

            if (dirRightUP(board, x + 4,y - 4).equals("1110") && board.isolation[x + 4][y - 4] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x + 2, y - 2)
                        || leftJudge(board, x + 1, y - 1) || leftJudge(board, x + 4, y - 4)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x + 2, y - 2)
                        || leftUpJudge(board, x + 1, y - 1) || leftUpJudge(board, x + 4, y - 4)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x + 2, y - 2)
                        || upJudge(board, x + 1, y - 1) || upJudge(board, x + 4, y - 4)) {
                    return true;
                }
                //右上方
//                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y + 1)
//                        || rightUpJudge(board, x - 3, y + 3) || rightUpJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x + 2, y - 2)
                        || rightJudge(board, x + 1, y - 1) || rightJudge(board, x + 4, y - 4)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x + 2, y - 2 )
                        || rightDownJudge(board, x + 1, y - 1) || rightDownJudge(board, x + 4, y - 4)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x + 2, y - 2)
                        || downJudge(board, x + 1, y - 1) || downJudge(board, x + 4, y - 4)) {
                    return true;
                }
                //左下方
//                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y + 1)
//                        || leftDownJudge(board, x - 3, y + 3) || leftDownJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
            }//complished

            if (dirRightUP(board, x + 4,y - 4).equals("1101") && board.isolation[x + 4][y - 4] =='1') {

                //左方
                if (leftJudge(board, x, y) || leftJudge(board, x + 1, y - 1)
                        || leftJudge(board, x + 4, y - 4) || leftJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //左上方
                if (leftUpJudge(board, x, y) || leftUpJudge(board, x + 1, y - 1)
                        || leftUpJudge(board, x + 4, y - 4) || leftUpJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //上方
                if (upJudge(board,x,y) || upJudge(board, x + 1, y - 1)
                        || upJudge(board, x + 4, y - 4) || upJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //右上方
//                if (rightUpJudge(board,x,y) || rightUpJudge(board, x - 1, y + 1)
//                        || rightUpJudge(board, x - 3, y + 3) || rightUpJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
                //右方
                if (rightJudge(board, x, y) || rightJudge(board, x + 1, y - 1)
                        || rightJudge(board, x + 4, y - 4) || rightJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //右下方
                if (rightDownJudge(board,x,y) || rightDownJudge(board, x + 1, y - 1 )
                        || rightDownJudge(board, x + 4, y - 4) || rightDownJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //下方
                if (downJudge(board,x,y) || downJudge(board, x + 1, y - 1)
                        || downJudge(board, x + 4, y - 4) || downJudge(board, x + 3, y - 3)) {
                    return true;
                }
                //左下方
//                if (leftDownJudge(board,x,y) || leftDownJudge(board, x - 1, y + 1)
//                        || leftDownJudge(board, x - 3, y + 3) || leftDownJudge(board, x - 4, y + 4)) {
//                    return true;
//                }
            }//complished
        }


         /*functions below are designed to solve the special situation,

        for example,
           1 1 1 0 1 0 1 1 1 ,
           1 0 1 1 1 0 1 ,
           1 1 0 1 1 0 1 1
        */


        // 111010111
        // cross

        if (dirLeft(board,x,y).equals("1110") && dirRight(board,x,y).equals("1110")) {
            return true;
        }

        if (dirLeft(board,x,y - 2).equals("1110") && dirRight(board,x,y - 2).equals("1110") && board.isolation[x][y - 2] == '1') {
            return true;
        }

        if (dirLeft(board,x,y + 2).equals("1110") && dirRight(board,x,y + 2).equals("1110") && board.isolation[x][y + 2] == '1') {
            return true;
        }

        if (dirLeft(board,x,y + 3).equals("1110") && dirRight(board,x,y + 3).equals("1110") && board.isolation[x][y + 3] == '1') {
            return true;
        }

        if (dirLeft(board,x,y - 3).equals("1110") && dirRight(board,x,y - 3).equals("1110") && board.isolation[x][y - 3] == '1') {
            return true;
        }

        if (dirLeft(board,x,y + 4).equals("1110") && dirRight(board,x,y + 4).equals("1110") && board.isolation[x][y + 4] == '1') {
            return true;
        }

        if (dirLeft(board,x,y - 4).equals("1110") && dirRight(board,x,y - 4).equals("1110") && board.isolation[x][y - 4] == '1') {
            return true;
        }

        // vertical
        if (dirup(board,x,y).equals("1110") && dirDown(board,x,y).equals("1110")) {
            return true;
        }

        if (dirup(board,x - 2,y).equals("1110") && dirDown(board,x - 2,y).equals("1110") && board.isolation[x - 2][y] == '1') {
            return true;
        }

        if (dirup(board,x + 2,y).equals("1110") && dirDown(board,x + 2,y).equals("1110") && board.isolation[x + 2][y] == '1') {
            return true;
        }

        if (dirup(board,x + 3,y).equals("1110") && dirDown(board,x + 3,y).equals("1110") && board.isolation[x + 3][y] == '1') {
            return true;
        }

        if (dirup(board,x - 3,y).equals("1110") && dirDown(board,x - 3,y).equals("1110") && board.isolation[x - 3][y] == '1') {
            return true;
        }

        if (dirup(board,x + 4,y).equals("1110") && dirDown(board,x + 4,y).equals("1110") && board.isolation[x + 4][y] == '1') {
            return true;
        }

        if (dirup(board,x - 4,y).equals("1110") && dirDown(board,x - 4,y).equals("1110") && board.isolation[x - 4][y] == '1') {
            return true;
        }

        //leftup and rightdown
        if (dirLeftup(board,x,y).equals("1110") && dirRightDown(board,x,y).equals("1110")) {
            return true;
        }

        if (dirLeftup(board,x + 2,y + 2).equals("1110") && dirRightDown(board,x + 2,y + 2).equals("1110") && board.isolation[x + 2][y + 2] == '1') {
            return true;
        }

        if (dirLeftup(board,x - 2,y - 2).equals("1110") && dirRightDown(board,x - 2,y - 2).equals("1110") && board.isolation[x - 2][y - 2] == '1') {
            return true;
        }

        if (dirLeftup(board,x + 3,y + 3).equals("1110") && dirRightDown(board,x + 3,y + 3).equals("1110") && board.isolation[x + 3][y + 3] == '1') {
            return true;
        }

        if (dirLeftup(board,x - 3,y - 3).equals("1110") && dirRightDown(board,x - 3,y - 3).equals("1110") && board.isolation[x - 3][y - 3] == '1') {
            return true;
        }

        if (dirLeftup(board,x + 4,y + 4).equals("1110") && dirRightDown(board,x + 4,y + 4).equals("1110") && board.isolation[x + 4][y + 4] == '1') {
            return true;
        }

        if (dirLeftup(board,x - 4,y - 4).equals("1110") && dirRightDown(board,x - 4,y - 4).equals("1110") && board.isolation[x - 4][y - 4] == '1') {
            return true;
        }

        //rightup and leftdown
        if (dirRightUP(board,x,y).equals("1110") && dirLeftDown(board,x,y).equals("1110")) {
            return true;
        }

        if (dirRightUP(board,x + 2,y - 2).equals("1110") && dirLeftDown(board,x + 2,y - 2).equals("1110") && board.isolation[x + 2][y - 2] == '1') {
            return true;
        }

        if (dirRightUP(board,x - 2,y + 2).equals("1110") && dirLeftDown(board,x - 2,y + 2).equals("1110") && board.isolation[x - 2][y + 2] == '1') {
            return true;
        }

        if (dirRightUP(board,x + 3,y - 3).equals("1110") && dirLeftDown(board,x + 3,y - 3).equals("1110") && board.isolation[x + 3][y - 3] == '1') {
            return true;
        }

        if (dirRightUP(board,x - 3,y + 3).equals("1110") && dirLeftDown(board,x - 3,y + 3).equals("1110") && board.isolation[x - 3][y + 3] == '1') {
            return true;
        }

        if (dirRightUP(board,x + 4,y - 4).equals("1110") && dirLeftDown(board,x + 4,y - 4).equals("1110") && board.isolation[x + 4][y - 4] == '1') {
            return true;
        }

        if (dirRightUP(board,x - 4,y + 4).equals("1110") && dirLeftDown(board,x - 4,y + 4).equals("1110") && board.isolation[x - 4][y + 4] == '1') {
            return true;
        }

        //1 0 1 1 1 0 1
        // cross
        if ((dirLeft(board,x,y).equals("0101") || dirLeft(board, x, y).equals("2101"))
                && (dirRight(board,x,y).equals("0101") || dirRight(board,x,y).equals("2101"))) {
            return true;
        }

        if ((dirLeft(board,x,y - 1).equals("0101") || dirLeft(board, x, y - 1).equals("2101"))
                && (dirRight(board,x,y - 1).equals("0101") || dirRight(board,x,y - 1).equals("2101"))
                && board.isolation[x][y - 1] == '1') {
            return true;
        }

        if ((dirLeft(board,x,y + 1).equals("0101") || dirLeft(board, x, y + 1).equals("2101"))
                && (dirRight(board,x,y + 1).equals("0101") || dirRight(board,x,y + 1).equals("2101"))
                && board.isolation[x][y + 1] == '1') {
            return true;
        }

        if ((dirLeft(board,x,y - 3).equals("0101") || dirLeft(board, x, y - 3).equals("2101"))
                && (dirRight(board,x,y - 3).equals("0101") || dirRight(board,x,y - 3).equals("2101"))
                && board.isolation[x][y - 3] == '1') {
            return true;
        }

        if ((dirLeft(board,x,y + 3).equals("0101") || dirLeft(board, x, y + 3).equals("2101"))
                && (dirRight(board,x,y + 3).equals("0101") || dirRight(board,x,y + 3).equals("2101"))
                && board.isolation[x][y + 3] == '1') {
            return true;
        }

        //vertical
        if ((dirup(board,x,y).equals("0101") || dirup(board, x, y).equals("2101") )
                && (dirDown(board,x,y).equals("0101") || dirDown(board,x,y).equals("2101") )
                && board.isolation[x][y] == '1') {
            return true;
        }

        if ((dirup(board,x - 1,y).equals("0101") || dirup(board, x - 1, y).equals("2101") )
                && (dirDown(board,x - 1,y).equals("0101") || dirDown(board,x - 1,y).equals("2101") )
                && board.isolation[x - 1][y] == '1') {
            return true;
        }

        if ((dirup(board,x + 1,y).equals("0101") || dirup(board, x + 1, y).equals("2101") )
                && (dirDown(board,x + 1,y).equals("0101") || dirDown(board,x + 1,y).equals("2101") )
                && board.isolation[x - 1][y] == '1') {
            return true;
        }

        if ((dirup(board,x - 3,y).equals("0101") || dirup(board, x - 3, y).equals("2101") )
                && (dirDown(board,x - 3,y).equals("0101") || dirDown(board,x - 3,y).equals("2101")
                && board.isolation[x - 3][y] == '1') ) {
            return true;
        }

        if ((dirup(board,x + 3,y).equals("0101") || dirup(board, x + 3, y).equals("2101") )
                && (dirDown(board,x + 3,y).equals("0101") || dirDown(board,x + 3,y).equals("2101") )
                && board.isolation[x + 3][y] == '1') {
            return true;
        }//complished

        //leftup and rightdown
        if ((dirLeftup(board,x,y).equals("0101") || dirLeftup(board, x, y).equals("2101") )
                && (dirRightDown(board,x,y).equals("0101") || dirRightDown(board,x,y).equals("2101") ) ) {
            return true;
        }

        if ((dirLeftup(board,x - 1,y - 1).equals("0101") || dirLeftup(board, x - 1, y - 1).equals("2101") )
                && (dirRightDown(board,x - 1,y - 1).equals("0101") || dirRightDown(board,x - 1,y - 1).equals("2101") )
                && board.isolation[x - 1][y - 1] == '1') {
            return true;
        }

        if ((dirLeftup(board,x - 3,y - 3).equals("0101") || dirLeftup(board, x - 3, y - 3).equals("2101") )
                && (dirRightDown(board,x - 3,y - 3).equals("0101") || dirRightDown(board,x - 3,y - 3).equals("2101") )
                && board.isolation[x - 1][y - 3] == '1') {
            return true;
        }

        if ((dirLeftup(board,x + 1,y + 1).equals("0101") || dirLeftup(board, x + 1, y + 1).equals("2101") )
                && (dirRightDown(board,x + 1,y + 1).equals("0101") || dirRightDown(board,x + 1,y + 1).equals("2101") )
                && board.isolation[x + 1][y + 1] == '1') {
            return true;
        }

        if ((dirLeftup(board,x + 3,y + 3).equals("0101") || dirLeftup(board, x + 3, y + 3).equals("2101") )
                && (dirRightDown(board,x + 3,y + 3).equals("0101") || dirRightDown(board,x + 3,y + 3).equals("2101") )
                && board.isolation[x + 3][y + 3] == '1') {
            return true;
        }

        //rightup and leftdown
        if ((dirRightUP(board,x,y).equals("0101") || dirRightUP(board, x, y).equals("2101") )
                && (dirLeftDown(board,x,y).equals("0101") || dirLeftDown(board,x,y).equals("2101") ) ) {
            return true;
        }

        if ((dirRightUP(board,x - 1,y + 1).equals("0101") || dirRightUP(board,x - 1,y + 1).equals("2101") )
                && (dirLeftDown(board,x - 1,y + 1).equals("0101") || dirLeftDown(board,x - 1,y + 1).equals("2101") )
                && board.isolation[x - 1][y + 1] == '1') {
            return true;
        }

        if ((dirRightUP(board,x + 1,y - 1).equals("0101") || dirRightUP(board,x + 1,y - 1).equals("2101") )
                && (dirLeftDown(board,x + 1,y - 1).equals("0101") || dirLeftDown(board,x + 1,y - 1).equals("2101") )
                && board.isolation[x + 1][y - 1] == '1') {
            return true;
        }

        if ((dirRightUP(board,x - 3,y + 3).equals("0101") || dirRightUP(board,x - 3,y + 3).equals("2101") )
                && (dirLeftDown(board,x - 3,y + 3).equals("0101") || dirLeftDown(board,x - 3,y + 3).equals("2101") )
                && board.isolation[x - 3][y + 3] == '1') {
            return true;
        }

        if ((dirRightUP(board,x + 3,y - 3).equals("0101") || dirRightUP(board,x + 3,y - 3).equals("2101") )
                && (dirLeftDown(board,x + 3,y - 3).equals("0101") || dirLeftDown(board,x + 3,y - 3).equals("2101") )
                && board.isolation[x + 3][y - 3] == '1') {
            return true;
        }

        //1 1 0 1 1 0 1 1
        //        singnal
        //cross
        if (dirLeft(board, x, y).equals("1101") && (dirRight(board, x, y).equals("0110") || dirRight(board, x, y).equals("2110"))
                && board.isolation[x][y] == '1' ) {
            return true;
        }

        if (dirLeft(board, x, y + 1).equals("1101") && (dirRight(board, x, y + 1).equals("0110") || dirRight(board, x, y + 1).equals("2110"))
                && board.isolation[x][y + 1] == '1' ) {
            return true;
        }

        if (dirLeft(board, x, y + 3).equals("1101") && (dirRight(board, x, y + 3).equals("0110") || dirRight(board, x, y + 3).equals("2110"))
                && board.isolation[x][y + 3] == '1' ) {
            return true;
        }

        if (dirLeft(board, x, y + 4).equals("1101") && (dirRight(board, x, y + 4).equals("0110") || dirRight(board, x, y + 4).equals("2110"))
                && board.isolation[x][y + 4] == '1' ) {
            return true;
        }

        if (dirLeft(board, x, y - 3).equals("1101") && (dirRight(board, x, y - 3).equals("0110") || dirRight(board, x, y - 3).equals("2110"))
                && board.isolation[x][y - 3] == '1' ) {
            return true;
        }

        if (dirLeft(board, x, y - 2).equals("1101") && (dirRight(board, x, y - 2).equals("0110") || dirRight(board, x, y - 2).equals("2110"))
                && board.isolation[x][y - 2] == '1' ) {
            return true;
        }

        //leftup and rightdown
        if (dirLeftup(board, x, y).equals("1101") && (dirRightDown(board, x, y).equals("0110") || dirRightDown(board, x, y).equals("2110"))
                && board.isolation[x][y] == '1' ) {
            return true;
        }

        if (dirLeftup(board, x - 2, y - 2).equals("1101") && (dirRightDown(board,x - 2, y - 2).equals("0110")
                || dirRightDown(board,x - 2, y - 2).equals("2110"))
                && board.isolation[x - 2][y - 2] == '1' ) {
            return true;
        }

        if (dirLeftup(board, x - 3, y - 3).equals("1101") && (dirRightDown(board,x - 3, y - 3).equals("0110")
                || dirRightDown(board,x - 3, y - 3).equals("2110"))
                && board.isolation[x - 3][y - 3] == '1' ) {
            return true;
        }

        if (dirLeftup(board, x + 4, y + 4).equals("1101") && (dirRightDown(board,x + 4, y + 4).equals("0110")
                || dirRightDown(board,x + 4, y + 4).equals("2110"))
                && board.isolation[x + 4][y + 4] == '1' ) {
            return true;
        }

        if (dirLeftup(board, x + 3, y + 3).equals("1101") && (dirRightDown(board,x + 3, y + 3).equals("0110")
                || dirRightDown(board,x + 3, y + 3).equals("2110"))
                && board.isolation[x + 3][y + 3] == '1' ) {
            return true;
        }

        if (dirLeftup(board, x + 1, y + 1).equals("1101") && (dirRightDown(board,x + 1, y + 1).equals("0110")
                || dirRightDown(board,x + 1, y + 1).equals("2110"))
                && board.isolation[x + 1][y + 1] == '1' ) {
            return true;
        }



        //vertical
        if (dirup(board, x, y).equals("1101") && (dirDown(board, x, y).equals("0110") || dirDown(board, x, y).equals("2110"))
                && board.isolation[x][y] == '1' ) {
            return true;
        }

        if (dirup(board, x + 1, y).equals("1101") && (dirDown(board, x + 1, y).equals("0110") || dirDown(board, x + 1, y).equals("2110"))
                && board.isolation[x + 1][y] == '1' ) {
            return true;
        }

        if (dirup(board, x + 3, y).equals("1101") && (dirDown(board, x + 3, y).equals("0110") || dirDown(board, x + 3, y).equals("2110"))
                && board.isolation[x + 3][y] == '1' ) {
            return true;
        }

        if (dirup(board, x + 4, y).equals("1101") && (dirDown(board, x + 4, y).equals("0110") || dirDown(board, x + 4, y).equals("2110"))
                && board.isolation[x + 4][y] == '1' ) {
            return true;
        }

        if (dirup(board, x - 3, y).equals("1101") && (dirDown(board, x - 3, y).equals("0110") || dirDown(board, x - 3, y).equals("2110"))
                && board.isolation[x - 3][y] == '1' ) {
            return true;
        }

        if (dirup(board, x - 2, y).equals("1101") && (dirDown(board, x - 2, y).equals("0110") || dirDown(board, x - 2, y).equals("2110"))
                && board.isolation[x - 2][y] == '1' ) {
            return true;
        }

        //rightup and leftdown
        if (dirRightUP(board, x, y).equals("1101") && (dirLeftDown(board, x, y).equals("0110")
                || dirLeftDown(board, x, y).equals("2110"))
                && board.isolation[x][y] == '1' ) {
            return true;
        }

        if (dirRightUP(board, x + 1, y - 1).equals("1101") && (dirLeftDown(board, x + 1, y - 1).equals("0110")
                || dirLeftDown(board, x + 1, y - 1).equals("2110"))
                && board.isolation[x + 1][y - 1] == '1' ) {
            return true;
        }

        if (dirRightUP(board, x + 3, y - 3).equals("1101") && (dirLeftDown(board, x + 3, y - 3).equals("0110")
                || dirLeftDown(board, x + 3, y - 3).equals("2110"))
                && board.isolation[x + 3][y - 3] == '1' ) {
            return true;
        }

        if (dirRightUP(board, x + 4, y - 4).equals("1101") && (dirLeftDown(board, x + 4, y - 4).equals("0110")
                || dirLeftDown(board, x + 4, y - 4).equals("2110"))
                && board.isolation[x + 4][y - 4] == '1' ) {
            return true;
        }

        if (dirRightUP(board, x - 3, y + 3).equals("1101") && (dirLeftDown(board, x - 3, y + 3).equals("0110")
                || dirLeftDown(board, x - 3, y + 3).equals("2110"))
                && board.isolation[x - 3][y + 3] == '1' ) {
            return true;
        }

        if (dirRightUP(board, x - 2, y + 2).equals("1101") && (dirLeftDown(board, x - 2, y + 2).equals("0110")
                || dirLeftDown(board, x - 2, y + 2).equals("2110"))
                && board.isolation[x - 2][y + 2] == '1' ) {
            return true;
        }
        return false;
    }












    //对左方进行判断
    public boolean leftJudge(Board board, int x, int y) {
        if (dirLeft(board,x,y).equals("1110")  || dirLeft(board,x,y).equals("0111" )
                || dirLeft(board, x, y).equals("2111" ) || dirLeft(board, x, y).equals("1101" )) {
            return true;
        }

        if (x > 12 || x < 0 || y + 1 > 14 || y + 1 < 0) {
            return false;
        }

//        System.out.println("x:" + x + " y:" + y);
        if (board.isolation[x][y + 1] == '1') {
            if (dirLeft(board, x, y).equals("2110") || dirLeft(board, x, y).equals("0110")
                    || dirLeft(board, x, y).equals("0011") || dirLeft(board, x, y).equals("0211")
                    || dirLeft(board, x, y).equals("1011") || dirLeft(board, x, y).equals("1211")
                    || dirLeft(board, x, y).equals("2011") || dirLeft(board, x, y).equals("2211")) {
                return true;
            }
        }
        return false;
    }
    //对左上方向进行判断
    public boolean leftUpJudge(Board board, int x, int y) {
        if (dirLeftup(board,x,y).equals("1110")  || dirLeftup(board,x,y).equals("0111" )
                || dirLeftup(board, x, y).equals("2111" ) || dirLeftup(board, x, y).equals("1101" )) {
            return true;
        }

        if (x + 1 > 14 || x + 1 < 0 || y + 1 > 14 || y + 1 < 0) {
            return false;
        }

        if (board.isolation[x + 1][y + 1] == '1') {
            if (dirLeftup(board, x, y).equals("2110") || dirLeftup(board, x, y).equals("0110")
                    || dirLeftup(board, x, y).equals("0011") || dirLeftup(board, x, y).equals("0211")
                    || dirLeftup(board, x, y).equals("1011") || dirLeftup(board, x, y).equals("1211")
                    || dirLeftup(board, x, y).equals("2011") || dirLeftup(board, x, y).equals("2211")) {
                return true;
            }
        }
        return false;
    }
    //对上方进行判断
    public boolean upJudge(Board board, int x, int y) {
        if (dirup(board,x,y).equals("1110")  || dirup(board,x,y).equals("0111" )
                || dirup(board, x, y).equals("2111" ) || dirup(board, x, y).equals("1101" )) {
            return true;
        }

        if (x + 1 > 14 || x + 1 < 0 || y > 14 || y < 0) {
            return false;
        }

        if (board.isolation[x + 1][y] == '1') {
            if (dirup(board, x, y).equals("2110") || dirup(board, x, y).equals("0110")
                    || dirup(board, x, y).equals("0011") || dirup(board, x, y).equals("0211")
                    || dirup(board, x, y).equals("1011") || dirup(board, x, y).equals("1211")
                    || dirup(board, x, y).equals("2011") || dirup(board, x, y).equals("2211")) {
                return true;
            }
        }
        return false;
    }
    //对右上进行判断
    public boolean rightUpJudge(Board board, int x, int y) {
        if (dirRightUP(board,x,y).equals("1110")  || dirRightUP(board,x,y).equals("0111" )
                || dirRightUP(board, x, y).equals("2111" ) || dirRightUP(board, x, y).equals("1101" )) {
            return true;
        }

        if (x + 1 > 14 || x + 1 < 0 || y - 1 > 14 || y - 1 < 0) {
            return false;
        }

        if (board.isolation[x + 1][y - 1] == '1') {
            if (dirRightUP(board, x, y).equals("2110") || dirRightUP(board, x, y).equals("0110")
                    || dirRightUP(board, x, y).equals("0011") || dirRightUP(board, x, y).equals("0211")
                    || dirRightUP(board, x, y).equals("1011") || dirRightUP(board, x, y).equals("1211")
                    || dirRightUP(board, x, y).equals("2011") || dirRightUP(board, x, y).equals("2211")) {
                return true;
            }
        }
        return false;
    }
    //对右方进行判断
    public boolean rightJudge(Board board, int x, int y) {
        if (dirRight(board,x,y).equals("1110")  || dirRight(board,x,y).equals("0111" )
                || dirRight(board, x, y).equals("2111" ) || dirRight(board, x, y).equals("1101" )) {
            return true;
        }

        if (x > 14 || x < 0 || y - 1 > 14 || y - 1 < 0) {
            return false;
        }


        if (board.isolation[x][y - 1] == '1') {
            if (dirRight(board, x, y).equals("2110") || dirRight(board, x, y).equals("0110")
                    || dirRight(board, x, y).equals("0011") || dirRight(board, x, y).equals("0211")
                    || dirRight(board, x, y).equals("1011") || dirRight(board, x, y).equals("1211")
                    || dirRight(board, x, y).equals("2011") || dirRight(board, x, y).equals("2211")) {
                return true;
            }
        }
        return false;
    }
    //对右下方进行判断
    public boolean rightDownJudge(Board board, int x, int y) {
        if (dirRightDown(board,x,y).equals("1110")  || dirRightDown(board,x,y).equals("0111" )
                || dirRightDown(board, x, y).equals("2111" ) || dirRightDown(board, x, y).equals("1101" )) {
            return true;
        }

        if (x - 1 > 14 || x - 1 < 0 || y - 1 > 14 || y - 1 < 0) {
            return false;
        }

        if (board.isolation[x - 1][y - 1] == '1') {
            if (dirRightDown(board, x, y).equals("2110") || dirRightDown(board, x, y).equals("0110")
                    || dirRightDown(board, x, y).equals("0011") || dirRightDown(board, x, y).equals("0211")
                    || dirRightDown(board, x, y).equals("1011") || dirRightDown(board, x, y).equals("1211")
                    || dirRightDown(board, x, y).equals("2011") || dirRightDown(board, x, y).equals("2211")) {
                return true;
            }
        }
        return false;
    }
    //对下方进行判断
    public boolean downJudge(Board board, int x, int y) {
        if (dirDown(board,x,y).equals("1110")  || dirDown(board,x,y).equals("0111" )
                || dirDown(board, x, y).equals("2111" ) || dirDown(board, x, y).equals("1101" )) {
            return true;
        }

        if (x + 1 > 14 || x + 1 < 0 || y > 14 || y < 0) {
            return false;
        }

        if (board.isolation[x + 1][y] == '1') {
            if (dirDown(board, x, y).equals("2110") || dirDown(board, x, y).equals("0110")
                    || dirDown(board, x, y).equals("0011") || dirDown(board, x, y).equals("0211")
                    || dirDown(board, x, y).equals("1011") || dirDown(board, x, y).equals("1211")
                    || dirDown(board, x, y).equals("2011") || dirDown(board, x, y).equals("2211")) {
                return true;
            }
        }
        return false;
    }
    // 对左下进行判断
    public boolean leftDownJudge(Board board, int x, int y) {
        if (dirLeftDown(board,x,y).equals("1110")  || dirLeftDown(board,x,y).equals("0111" )
                || dirLeftDown(board, x, y).equals("2111" ) || dirLeftDown(board, x, y).equals("1101" )) {
            return true;
        }

        if (x - 1 > 14 || x - 1 < 0 || y + 1 > 14 || y + 1 < 0) {
            return false;
        }

        if (board.isolation[x - 1][y + 1] == '1') {
            if (dirLeftDown(board, x, y).equals("2110") || dirLeftDown(board, x, y).equals("0110")
                    || dirLeftDown(board, x, y).equals("0011") || dirLeftDown(board, x, y).equals("0211")
                    || dirLeftDown(board, x, y).equals("1011") || dirLeftDown(board, x, y).equals("1211")
                    || dirLeftDown(board, x, y).equals("2011") || dirLeftDown(board, x, y).equals("2211")) {
                return true;
            }
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

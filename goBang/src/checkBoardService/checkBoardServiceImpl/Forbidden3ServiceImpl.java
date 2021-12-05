package checkBoardService.checkBoardServiceImpl;

import checkBoardService.Forbidden3Service;
import com.goBang.model.Board;

public class Forbidden3ServiceImpl implements Forbidden3Service {
    //判断三三禁手
    //1代表黑棋、2代表白棋、0代表此处空
    public boolean Forbidden3(Board board, int x, int y) {

        //横向判断-本位置
        if (    (y + 1 > 0 && y + 1 < 15 &&
                (dirLeft(board, x, y).equals("0011") && board.isolation[x][y + 1] == '0')) ||

                (y + 2 > 0 && y + 2 < 15 &&
                        (dirLeft(board, x, y).equals("2011") && board.isolation[x][y + 1] == '0' && board.isolation[x][y + 2] =='0')) ||

                (y + 1 > 0 && y + 1 < 15 &&
                        (dirLeft(board, x, y).equals("0110") && board.isolation[x][y + 1] == '0'))) {

            if (dirLeft(board, x, y).equals("0011") || dirLeft(board, x, y).equals("2011")) {
                //水平判断
                if (verticalJudge(board, x, y) || verticalJudge(board, x, y - 1)
                        || verticalJudge(board, x, y - 2) ) {
                    return true;
                }
                //主对角线方向判断
                if (mainCrossJudge(board, x, y) || mainCrossJudge(board, x, y - 1)
                        || mainCrossJudge(board, x, y - 2) ) {
                    return true;
                }
                //副对角线方向判断
                if (viceCrossJudge(board, x, y) || viceCrossJudge(board, x, y - 1)
                        || viceCrossJudge(board, x, y - 2) ) {
                    return true;
                }
            }

            if (dirLeft(board, x, y).equals("0110")) {

                //水平判断
                if (verticalJudge(board, x, y) || verticalJudge(board, x, y - 2)
                        || verticalJudge(board, x, y - 3) ) {
                    return true;
                }

                //主对角线方向判断
                if (mainCrossJudge(board, x, y) || mainCrossJudge(board, x, y - 2)
                        || mainCrossJudge(board, x, y - 3) ) {
                    return true;
                }

                //副对角线方向判断
                if (viceCrossJudge(board, x, y) || viceCrossJudge(board, x, y - 2)
                        || viceCrossJudge(board, x, y - 3) ) {
                    return true;
                }
            }
        }//横向判断-本位置

        //横向判断-偏移1个单位
        if (    (y + 2 > 0 && y + 2 < 15 &&
                (dirLeft(board, x, y + 1).equals("0011") && board.isolation[x][y + 2] == '0'  && board.isolation[x][y + 1] == '1')) ||

                (y + 2 > 0 && y + 2 < 15 &&
                        (dirLeft(board, x, y + 1).equals("2011") && board.isolation[x][y + 2] == '0'
                                && board.isolation[x][y + 3] =='0' && board.isolation[x][y + 1] == '1'))) {

            if (dirLeft(board, x, y + 1).equals("0011") || dirLeft(board, x, y).equals("2011")) {

                //水平判断
                if (verticalJudge(board, x, y) || verticalJudge(board, x, y - 1)
                        || verticalJudge(board, x, y - 2) ) {
                    return true;
                }
                //主对角线方向判断
                if (mainCrossJudge(board, x, y) || mainCrossJudge(board, x, y - 1)
                        || mainCrossJudge(board, x, y + 1) ) {
                    return true;
                }
                //副对角线方向判断
                if (viceCrossJudge(board, x, y) || viceCrossJudge(board, x, y - 1)
                        || viceCrossJudge(board, x, y + 1) ) {
                    return true;
                }
            }

        }//横向判断-偏移1个单位

        //横向判断-偏移2个单位
        if (    (y + 3 > 0 && y + 3 < 15 &&
                (dirLeft(board, x, y + 2).equals("0011") && board.isolation[x][y + 3] == '0' && board.isolation[x][y + 2] == '1')) ||

                (y + 4 > 0 && y + 4 < 15 &&
                        (dirLeft(board, x, y + 2).equals("2011") && board.isolation[x][y + 3] == '0'
                                && board.isolation[x][y + 4] =='0' && board.isolation[x][y + 2] == '1')) ||

                (y + 3 > 0 && y + 3 < 15 &&
                        (dirLeft(board, x, y + 2).equals("0110") && board.isolation[x][y + 3] == '0' &&
                                board.isolation[x][y + 2] == '1'))) {

            if (dirLeft(board, x, y + 2).equals("0011") || dirLeft(board, x, y + 2).equals("2011")) {
                //水平判断
                if (verticalJudge(board, x, y) || verticalJudge(board, x, y + 1)
                        || verticalJudge(board, x, y + 2) ) {
                    return true;
                }
                //主对角线方向判断
                if (mainCrossJudge(board, x, y) || mainCrossJudge(board, x, y + 1)
                        || mainCrossJudge(board, x, y + 2) ) {
                    return true;
                }
                //副对角线方向判断
                if (viceCrossJudge(board, x, y) || viceCrossJudge(board, x, y + 1)
                        || viceCrossJudge(board, x, y + 2) ) {
                    return true;
                }
            }

            if (dirLeft(board, x, y + 2).equals("0110")) {

                //水平判断
                if (verticalJudge(board, x, y) || verticalJudge(board, x, y - 1)
                        || verticalJudge(board, x, y + 2) ) {
                    return true;
                }

                //主对角线方向判断
                if (mainCrossJudge(board, x, y) || mainCrossJudge(board, x, y - 1)
                        || mainCrossJudge(board, x, y + 2) ) {
                    return true;
                }

                //副对角线方向判断
                if (viceCrossJudge(board, x, y) || viceCrossJudge(board, x, y - 1)
                        || viceCrossJudge(board, x, y + 2) ) {
                    return true;
                }
            }

            return false;
        }//横向判断-偏移2个单位

        //横向判断-偏移3个单位
        if (    (y + 4 > 0 && y + 4 < 15 &&
                (dirLeft(board, x, y + 3).equals("0110") && board.isolation[x][y + 4] == '0' &&
                        board.isolation[x][y + 3] == '1'))) {

            if (dirLeft(board, x, y + 2).equals("0110")) {

                //水平判断
                if (verticalJudge(board, x, y) || verticalJudge(board, x, y + 1)
                        || verticalJudge(board, x, y + 3) ) {
                    return true;
                }

                //主对角线方向判断
                if (mainCrossJudge(board, x, y) || mainCrossJudge(board, x, y + 1)
                        || mainCrossJudge(board, x, y + 3) ) {
                    return true;
                }

                //副对角线方向判断
                if (viceCrossJudge(board, x, y) || viceCrossJudge(board, x, y + 1)
                        || viceCrossJudge(board, x, y + 3) ) {
                    return true;
                }
            }

            return false;
        }//横向判断-偏移3个单位

        return false;
    }




    //横向判断
    private boolean crossJudge(Board board, int x, int y) {

        //对于111排列，需要至少一边为双空
        if ((y + 1 < 15 && y + 1 > 0) && dirLeft(board, x, y).equals("0011") && board.isolation[x][y + 1] == '0') {
            return true;
        }

        if ((y + 2 < 15 && y + 2 > 0) && dirLeft(board, x, y).equals("2011") && board.isolation[x][y + 1] == '0'
                && board.isolation[x][y + 2] =='0') {
            return true;
        }

        //偏移1个单位检查
        if ((y + 2 < 15 && y + 2 > 0) && dirLeft(board, x, y + 1).equals("0011") && board.isolation[x][y + 2] == '0'
                && board.isolation[x][y + 1] == '1') {
            return true;
        }
        if ((y + 3 < 15 && y + 3 > 0) && dirLeft(board, x, y + 1).equals("2011") && board.isolation[x][y + 2] == '0'
                && board.isolation[x][y + 3] =='0' && board.isolation[x][y + 1] == '1') {
            return true;
        }//偏移1个单位检查

        //偏移2个单位检查
        if ((y + 3 < 15 && y + 3 > 0) && dirLeft(board, x, y + 2).equals("0011") && board.isolation[x][y + 3] == '0'
                && board.isolation[x][y + 2] == '1') {
            return true;
        }
        if ((y + 4 < 15 && y + 4 > 0) && dirLeft(board, x, y + 2).equals("2011") && board.isolation[x][y + 3] == '0'
                && board.isolation[x][y + 4] =='0' && board.isolation[x][y + 2] == '1') {
            return true;
        }//偏移2个单位检查


        //1101的情况
        if ((y + 1 < 15 && y + 1 > 0) && dirLeft(board, x, y).equals("0110") && board.isolation[x][y + 1] == '0') {
            return true;
        }

        //偏移2个单位检查
        if ((y + 3 < 15 && y + 3 > 0) && (dirLeft(board, x, y + 2).equals("0110") && board.isolation[x][y + 3] == '0'
                && board.isolation[x][y + 2] == '1')) {
            return true;
        }//偏移2个单位检查

        //偏移3个单位检查
        if ((y + 4 < 15 && y + 4 > 0) && dirLeft(board, x, y + 3).equals("0110") && board.isolation[x][y + 4] == '0'
                && board.isolation[x][y + 3] == '1') {
            return true;
        }//偏移3个单位检查

        return false;
    }

    //纵向判断
    private boolean verticalJudge(Board board, int x, int y) {

        //对于111排列，需要至少一边为双空
        if ((x + 1 < 15 && x + 1 > 0) && dirup(board, x, y).equals("0011") && board.isolation[x + 1][y] == '0') {
            return true;
        }
        if ((x + 2 < 15 && x + 2 > 0) && dirup(board, x, y).equals("2011") && board.isolation[x + 1][y] == '0'
                && board.isolation[x + 2][y] =='0') {
            return true;
        }

        //偏移1个单位检查
        if ((x + 2 < 15 && x + 2 > 0) && dirup(board, x + 1, y).equals("0011") && board.isolation[x + 2][y] == '0') {
            return true;
        }
        if ((x + 3 < 15 && x + 3 > 0) && dirup(board, x + 1, y).equals("2011") && board.isolation[x + 2][y] == '0'
                && board.isolation[x + 3][y] =='0' && board.isolation[x + 1][y] == '1') {
            return true;
        }//偏移1个单位检查

        //偏移2个单位检查
        if ((x + 3 < 15 && x + 3 > 0) && dirup(board, x + 2, y).equals("0011") && board.isolation[x + 3][y] == '0') {
            return true;
        }
        if ((x + 4 < 15 && x + 4 > 0) && dirup(board, x + 2, y).equals("2011") && board.isolation[x + 3][y] == '0'
                && board.isolation[x + 4][y] =='0' && board.isolation[x + 2][y] == '1') {
            return true;
        }//偏移2个单位检查


        //1101的情况
        if ((x + 1 < 15 && x + 1 > 0 && x - 1 > 0) && (dirup(board, x, y).equals("0110") && board.isolation[x + 1][y] == '0')
                || (dirDown(board, x, y).equals("0110") && board.isolation[x - 1][y] == '0')) {
            return true;
        }

        //偏移2个单位检查
        if ((x + 3 < 15 && x + 3 > 0 && x - 3 > 0) && (dirup(board, x + 2, y).equals("0110") && board.isolation[x + 3][y] == '0'
                && board.isolation[x + 2][y] == '1') ||
                (dirDown(board, x - 2, y).equals("0110") && board.isolation[x - 3][y] == '0'
                        && board.isolation[x - 2][y] == '1')) {
            return true;
        }//偏移2个单位检查

        //偏移3个单位检查
        if ((x + 4 < 15 && x + 4 > 0 && x - 4 > 0) && dirup(board, x + 3, y).equals("0110") && board.isolation[x + 4][y] == '0'
                && board.isolation[x + 3][y] == '1' ||
                (dirDown(board, x - 3, y).equals("0110") && board.isolation[x - 4][y] == '0'
                        && board.isolation[x - 3][y] == '1')) {
            return true;
        }//偏移3个单位检查

        return false;
    }

    //正对角线方向判断
    private boolean mainCrossJudge(Board board, int x, int y) {

        //对于111排列，需要至少一边为双空
        //本位置检查
        if ((x + 1 < 15 && x + 1 > 0 && y + 1 > 0 && y + 1 < 15) && dirLeftup(board, x, y).equals("0011") && board.isolation[x + 1][y + 1] == '0') {
            return true;
        }
        if ((x + 2 < 15 && x + 2 > 0 && y + 2 > 0 && y + 2 < 15) && dirLeftup(board, x, y).equals("2011") && board.isolation[x + 1][y + 1] == '0'
                && board.isolation[x + 2][y + 2] =='0') {
            return true;
        }//本位置检查

        //偏移1个单位检查
        if ((x + 3 < 15 && x + 3 > 0 && y + 3 > 0 && y + 3 < 15) && dirLeftup(board, x + 1, y + 1).equals("0011") && board.isolation[x + 2][y + 2] == '0'
                && board.isolation[x + 3][y + 3] == '0' && board.isolation[x + 1][y + 1] == '1') {
            return true;
        }
        if ((x + 3 < 15 && x + 3 > 0 && y + 3 > 0 && y + 3 < 15) && dirLeftup(board, x + 1, y + 1).equals("2011") && board.isolation[x + 2][y + 2] == '0'
                && board.isolation[x + 1][y + 1] =='1' && board.isolation[x + 3][y + 3] == '0') {
            return true;
        }//偏移1个单位检查

        //偏移2个单位检查
        if ((x + 3 < 15 && x + 3 > 0 && y + 3 > 0 && y + 3 < 15) && dirLeftup(board, x + 2, y + 2).equals("0011") && board.isolation[x + 3][y + 3] == '0'
                && board.isolation[x + 2][y + 2] == '1') {
            return true;
        }
        if ((x + 4 < 15 && x + 4 > 0 && y + 4 > 0 && y + 4 < 15) && dirLeftup(board, x + 2, y + 2).equals("2011") && board.isolation[x + 3][y + 3] == '0'
                && board.isolation[x + 4][y + 4] =='0' && board.isolation[x + 2][y + 2] == '1') {
            return true;
        }//偏移2个单位检查


        //1101的情况
        //本位置检查
        if ((x + 1 < 15 && x + 1 > 0 && y + 1 > 0 && y + 1 < 15 && x - 1 > 0)
                && (dirLeftup(board, x, y).equals("0110") && board.isolation[x + 1][y + 1] == '0'
                && board.isolation[x][y] == '1') ||
                (dirRightDown(board, x, y).equals("0110") && board.isolation[x - 1][y + 1] == '0'
                        && board.isolation[x][y] == '1')) {
            return true;
        }//本位置检查

        //偏移2个单位检查
        if ((x + 3 < 15 && x + 3 > 0 && y + 3 > 0 && y + 3 < 15 && x - 3 > 0 && y - 3 > 0) &&
                (dirLeftup(board, x + 2, y + 2).equals("0110") && board.isolation[x + 3][y + 3] == '0'
                        && board.isolation[x + 2][y + 2] == '1') ||
                (dirRightDown(board, x - 2, y - 2).equals("0110") && board.isolation[x - 3][y - 3] == '0'
                        && board.isolation[x - 2][y - 2] == '1')) {
            return true;
        }//偏移2个单位检查

        //偏移3个单位检查
        if ((x + 4 < 15 && x + 4 > 0 && y + 4 > 0 && y + 4 < 15 && x - 4 > 0 && y - 4 > 0) &&
                (dirLeftup(board, x + 3, y + 3).equals("0110") && board.isolation[x + 4][y + 4] == '0'
                        && board.isolation[x + 3][y + 3] == '1') ||
                (dirRightDown(board, x - 3, y - 3).equals("0110") && board.isolation[x - 4][y - 4] == '0'
                        && board.isolation[x - 3][y - 3] == '1')) {
            return true;
        }//偏移3个单位检查
        return false;
    }

    //正对角线方向判断
    private boolean viceCrossJudge(Board board, int x, int y) {

        //对于111排列，需要至少一边为双空
        //本位置检查
        if ((x + 1 < 15 && x + 1 > 0 && y - 1 > 0 && y - 1 < 15) &&
                dirRightUP(board, x, y).equals("0011") && board.isolation[x + 1][y - 1] == '0') {
            return true;
        }
        if ((x + 1 < 15 && x + 1 > 0 && y - 1 > 0 && y - 1 < 15) &&
                dirRightUP(board, x, y).equals("2011") && board.isolation[x + 1][y - 1] == '0'
                && board.isolation[x + 2][y - 2] =='0') {
            return true;
        }//本位置检查

        //偏移1个单位检查
        if ((x + 3 < 15 && x + 3 > 0 && y - 3 > 0 && y - 3 < 15) &&
                dirRightUP(board, x + 1, y + 1).equals("0011") && board.isolation[x + 2][y - 2] == '0'
                && board.isolation[x + 3][y - 3] == '0' && board.isolation[x + 1][y - 1] == '1') {
            return true;
        }
        if ((x + 3 < 15 && x + 3 > 0 && y - 3 > 0 && y - 3 < 15) &&
                dirRightUP(board, x + 1, y - 1).equals("2011") && board.isolation[x + 2][y - 2] == '0'
                && board.isolation[x + 1][y - 1] =='1' && board.isolation[x + 3][y - 3] == '0') {
            return true;
        }//偏移1个单位检查

        //偏移2个单位检查
        if ((x + 3 < 15 && x + 3 > 0 && y - 3 > 0 && y - 3 < 15) &&
                dirRightUP(board, x + 2, y - 2).equals("0011") && board.isolation[x + 3][y - 3] == '0'
                && board.isolation[x + 2][y - 2] == '1') {
            return true;
        }
        if ((x + 4 < 15 && x + 4 > 0 && y - 4 > 0 && y - 4 < 15) &&
                dirRightUP(board, x + 2, y - 2).equals("2011") && board.isolation[x + 3][y - 3] == '0'
                && board.isolation[x + 4][y - 4] =='0' && board.isolation[x + 2][y - 2] == '1') {
            return true;
        }//偏移2个单位检查


        //1101的情况
        //本位置检查
        if ((x + 1 < 15 && x + 1 > 0 && y - 1 > 0 && y - 1 < 15) && (
                (dirRightUP(board, x, y).equals("0110") && board.isolation[x + 1][y - 1] == '0'
                        && board.isolation[x][y] == '1') ||
                        (dirLeftDown(board, x, y).equals("0110") && board.isolation[x + 1][y - 1] == '0'
                                && board.isolation[x][y] == '1'))) {
            return true;
        }//本位置检查

        //偏移2个单位检查
        if ((x + 3 < 15 && x + 3 > 0 && x - 3 > 0 &&  y - 3 > 0 && y + 3 < 15) &&
                ((dirRightUP(board, x + 2, y - 2).equals("0110") && board.isolation[x + 3][y - 3] == '0'
                        && board.isolation[x + 2][y - 2] == '1') ||
                        (dirLeftDown(board, x - 2, y + 2).equals("0110") && board.isolation[x - 3][y + 3] == '0'
                                && board.isolation[x - 2][y + 2] == '1'))) {
            return true;
        }//偏移2个单位检查

        //偏移3个单位检查
        if ((x + 4 < 15 && x + 4 > 0 && x - 4 > 0 && y - 4 > 0 && y - 4 < 15 && y + 4 < 15) &&
                ((dirRightUP(board, x + 3, y - 3).equals("0110") && board.isolation[x + 4][y - 4] == '0'
                        && board.isolation[x + 3][y - 3] == '1') ||
                        (dirLeftDown(board, x - 3, y + 3).equals("0110") && board.isolation[x - 4][y + 4] == '0'
                                && board.isolation[x - 3][y + 3] == '1'))) {
            return true;
        }//偏移3个单位检查



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

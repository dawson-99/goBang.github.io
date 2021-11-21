package AIService.AIServiceImpl;

import AIService.AIService;
import com.goBang.model.AI;
import com.goBang.model.Board;

import java.awt.*;

import static checkBoardService.size.column;
import static checkBoardService.size.row;

public class AIwork implements AIService {
    //黑1 白2 空0
    //各个点的score得分数组；
    int score[][]=new int[row][column];
    //target的point类
    Point target[]=new Point[row*column];
    //找出棋盘上全部的棋子旁边的位置 标记为3;
    public void Find(Board board){
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(board.isolation[i][j]!='0'){//找到棋子
                    //做标记
                    if(i-1>=0&&board.isolation[i-1][j+1]=='0'){//找到棋子附近位置且该位置在棋盘内且未被填写棋子
                        target[count]=new Point(i-1,j+1);
                        count++;
                    }
                    if(i-1>=0&&board.isolation[i-1][j]=='0'){
                        target[count]=new Point(i-1,j);
                        count++;
                    }
                    if(i-1>=0&&j-1>=0&&board.isolation[i-1][j-1]=='0'){
                        target[count]=new Point(i-1,j-1);
                        count++;
                    }
                    if(j-1>=0&&board.isolation[i][j-1]=='0'){
                        target[count]=new Point(i,j-1);
                        count++;
                    }
                    if(j-1>=0&&board.isolation[i+1][j-1]=='0'){
                        target[count]=new Point(i+1,j-1);
                        count++;
                    }
                    if(board.isolation[i][j+1]=='0') {
                        target[count] = new Point(i, j + 1);
                        count++;
                    }
                    if(board.isolation[i+1][j+1]=='0') {
                        target[count] = new Point(i + 1, j + 1);
                        count++;
                    }
                    if(board.isolation[i+1][j]=='0') {
                        target[count] = new Point(i + 1, j);
                        count++;
                    }
                }
            }
        }
    }

    //对target中的每个位置的八个方向进行评分,取各个方向的四个棋子
    public void InitSCore(Board board, char AI,char player) {
        //活五
        //向左
        int array = 4;
        for (int i = 0; i < target.length; i++) {
            int count = 0;
                for (int j = (int) target[i].getX() - 1; j >= 0 && array > 0; j--) {
                    array--;
                    if (board.isolation[j][(int) target[i].getY()] == AI) {
                        count++;
                    }
                    if (count == 4) {
                        score[(int) target[i].getX()][(int) target[i].getY()] += 100000;
                    }
                }

                //向右
                array = 4;
                count = 0;
                for (int j = (int) target[i].getX() + 1; j < row && array > 0; j++) {
                    array--;
                    if (board.isolation[j][(int) target[i].getY()] == AI) {
                        count++;
                    }
                    if (count == 4) {
                        score[(int) target[i].getX()][(int) target[i].getY()] += 100000;
                    }
                }
                //向上
                array = 4;
                count = 0;
                for (int j = (int) target[i].getY() + 1; j < column && array > 0; j++) {
                    array--;
                    if (board.isolation[(int) target[i].getX()][j] == AI) {
                        count++;
                    }
                    if (count == 4) {
                        score[(int) target[i].getX()][(int) target[i].getY()] += 100000;
                    }
                }
                //向下
                array = 4;
                count = 0;
                for (int j = (int) target[i].getY() - 1; j >= 0 && array > 0; j--) {
                    array--;
                    if (board.isolation[(int) target[i].getX()][j] == AI) {
                        count++;
                    }
                    if (count == 4) {
                        score[(int) target[i].getX()][(int) target[i].getY()] += 100000;
                    }
                }

                //左斜上
                array = 4;
                count = 0;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() + 1; j >= 0 && k < column && array > 0; j--, k++) {
                    array--;
                    if (board.isolation[j][k] == AI) {
                        count++;
                    }
                    if (count == 4) {
                        score[(int) target[i].getX()][(int) target[i].getY()] += 100000;
                    }
                }
                //左斜下
                array = 4;
                count = 0;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() - 1; j >= 0 && k >= 0 && array > 0; j--, k--) {
                    array--;
                    if (board.isolation[j][k] == AI) {
                        count++;
                    }
                    if (count == 4) {
                        score[(int) target[i].getX()][(int) target[i].getY()] += 100000;
                    }
                }
                //右斜上
                array = 4;
                count = 0;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() + 1; j < row && k < column && array > 0; j++, k++) {
                    if (board.isolation[j][k] == AI) {
                        count++;
                    }
                    if (count == 4) {
                        score[(int) target[i].getX()][(int) target[i].getY()] += 100000;
                    }
                }
                //右斜下
                array = 4;
                count = 0;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() - 1; j < row && k >= 0 && array > 0; j++, k--) {
                    if (board.isolation[j][k] == AI) {
                        count++;
                    }
                    if (count == 4) {
                        score[(int) target[i].getX()][(int) target[i].getY()] += 100000;
                    }
                }

                String code = AI + "";
                //活四
                String alive_4 = '0' + AI + AI + AI + AI + '0' + "";
                String Ncode = "";
                //横向
                array = 4;
                for (int j = (int) target[i].getX() - 1; j >= 0 && array > 0; j--) {
                    array--;
                    code = board.isolation[j][(int) target[i].getY()] + code;
                    Ncode = board.isolation[j][(int) target[i].getY()] + Ncode;
                }
                array = 4;
                for (int k = (int) target[i].getX() + 1; k < column && array > 0; k++) {
                    array--;
                    code = code + board.isolation[k][(int) target[i].getY()];
                    Ncode = Ncode + board.isolation[k][(int) target[i].getY()];
                }
                if (code.contains(alive_4) && Ncode.contains(alive_4)) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 10000;
                }
                //纵向
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getY() + 1; j < column && array > 0; j++) {
                    array--;
                    code = code + board.isolation[(int) target[i].getX()][j];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int k = (int) target[i].getY() - 1; k >= 0; k--) {
                    array--;
                    code = board.isolation[(int) target[i].getX()][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(alive_4) && Ncode.contains(alive_4)) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 10000;
                }
                //斜线方向\
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() + 1; j >= 0 && k < column && array > 0; j--, k++) {
                    array--;
                    code = code + board.isolation[j][k];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() - 1; j < row && k >= 0 && array > 0; j++, k--) {
                    array--;
                    code = board.isolation[j][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(alive_4) && Ncode.contains(alive_4)) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 10000;
                }
                //反斜线方向/
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() + 1; j < row && k < column && array > 0; j++, k++) {
                    array--;
                    code = code + board.isolation[j][k];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() - 1; j >= 0 && k >= 0 && array > 0; j--, k--) {
                    array--;
                    code = board.isolation[j][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(alive_4) && Ncode.contains(alive_4)) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 10000;
                }

                //双眠四
                String Fhighdie_4 = '0' + AI + AI + AI + AI + player + "";
                String Shighdie_4 = AI + '0' + AI + AI + AI + "";
                String Thighdie_4 = AI + AI + '0' + AI + AI + "";
                String FOhighdie_4 = AI + AI + AI + '0' + AI + "";
                String fihighdie_4 = player + AI + AI + AI + AI + '0' + "";
                int number_highdie_4 = 0;//记录有几个眠四
                //横向
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() - 1; j >= 0 && array > 0; j--) {
                    array--;
                    code = board.isolation[j][(int) target[i].getY()] + code;
                    Ncode = board.isolation[j][(int) target[i].getY()] + Ncode;
                }
                array = 4;
                for (int k = (int) target[i].getX() + 1; k < column && array > 0; k++) {
                    array--;
                    code = code + board.isolation[k][(int) target[i].getY()];
                    Ncode = Ncode + board.isolation[k][(int) target[i].getY()];
                }
                if (code.contains(Fhighdie_4) && Ncode.contains(Fhighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(Shighdie_4) && Ncode.contains(Shighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(Thighdie_4) && Ncode.contains(Thighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(FOhighdie_4) && Ncode.contains(FOhighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(fihighdie_4) && Ncode.contains(fihighdie_4)) {
                    number_highdie_4++;
                }
                //纵向
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getY() + 1; j < column && array > 0; j++) {
                    array--;
                    code = code + board.isolation[(int) target[i].getX()][j];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int k = (int) target[i].getY() - 1; k >= 0; k--) {
                    array--;
                    code = board.isolation[(int) target[i].getX()][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Fhighdie_4) && Ncode.contains(Fhighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(Shighdie_4) && Ncode.contains(Shighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(Thighdie_4) && Ncode.contains(Thighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(FOhighdie_4) && Ncode.contains(FOhighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(fihighdie_4) && Ncode.contains(fihighdie_4)) {
                    number_highdie_4++;
                }
                //斜线方向\
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() + 1; j >= 0 && k < column && array > 0; j--, k++) {
                    array--;
                    code = code + board.isolation[j][k];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() - 1; j < row && k >= 0 && array > 0; j++, k--) {
                    array--;
                    code = board.isolation[j][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Fhighdie_4) && Ncode.contains(Fhighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(Shighdie_4) && Ncode.contains(Shighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(Thighdie_4) && Ncode.contains(Thighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(FOhighdie_4) && Ncode.contains(FOhighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(fihighdie_4) && Ncode.contains(fihighdie_4)) {
                    number_highdie_4++;
                }
                //反斜线方向/
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() + 1; j < row && k < column && array > 0; j++, k++) {
                    array--;
                    code = code + board.isolation[j][k];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() - 1; j >= 0 && k >= 0 && array > 0; j--, k--) {
                    array--;
                    code = board.isolation[j][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Fhighdie_4) && Ncode.contains(Fhighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(Shighdie_4) && Ncode.contains(Shighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(Thighdie_4) && Ncode.contains(Thighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(FOhighdie_4) && Ncode.contains(FOhighdie_4)) {
                    number_highdie_4++;
                }
                if (code.contains(fihighdie_4) && Ncode.contains(fihighdie_4)) {
                    number_highdie_4++;
                }
                if (number_highdie_4 > 1) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 10000;
                }

                //highdie_4&alive_3
                int number_alive_3 = 0;//记录活三的数量
                String Falive_3 = '0' + AI + AI + AI + '0' + "";
                String Salive_3 = AI + '0' + AI + AI + "";//跳活三
                String Talive_3 = AI + AI + '0' + AI + "";//跳活三
                //横向
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() - 1; j >= 0 && array > 0; j--) {
                    array--;
                    code = board.isolation[j][(int) target[i].getY()] + code;
                    Ncode = board.isolation[j][(int) target[i].getY()] + Ncode;
                }
                array = 4;
                for (int k = (int) target[i].getX() + 1; k < column && array > 0; k++) {
                    array--;
                    code = code + board.isolation[k][(int) target[i].getY()];
                    Ncode = Ncode + board.isolation[k][(int) target[i].getY()];
                }
                if (code.contains(Falive_3) && Ncode.contains(Falive_3)) {
                    number_alive_3++;
                }
                if (code.contains(Salive_3) && Ncode.contains(Salive_3)) {
                    number_alive_3++;
                }
                if (code.contains(Talive_3) && Ncode.contains(Talive_3)) {
                    number_alive_3++;
                }
                //纵向
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getY() + 1; j < column && array > 0; j++) {
                    array--;
                    code = code + board.isolation[(int) target[i].getX()][j];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int k = (int) target[i].getY() - 1; k >= 0; k--) {
                    array--;
                    code = board.isolation[(int) target[i].getX()][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Falive_3) && Ncode.contains(Falive_3)) {
                    number_alive_3++;
                }
                if (code.contains(Salive_3) && Ncode.contains(Salive_3)) {
                    number_alive_3++;
                }
                if (code.contains(Talive_3) && Ncode.contains(Talive_3)) {
                    number_alive_3++;
                }
                //斜线方向\
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() + 1; j >= 0 && k < column && array > 0; j--, k++) {
                    array--;
                    code = code + board.isolation[j][k];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() - 1; j < row && k >= 0 && array > 0; j++, k--) {
                    array--;
                    code = board.isolation[j][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Falive_3) && Ncode.contains(Falive_3)) {
                    number_alive_3++;
                }
                if (code.contains(Salive_3) && Ncode.contains(Salive_3)) {
                    number_alive_3++;
                }
                if (code.contains(Talive_3) && Ncode.contains(Talive_3)) {
                    number_alive_3++;
                }
                //反斜线方向/
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() + 1; j < row && k < column && array > 0; j++, k++) {
                    array--;
                    code = code + board.isolation[j][k];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() - 1; j >= 0 && k >= 0 && array > 0; j--, k--) {
                    array--;
                    code = board.isolation[j][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Falive_3) && Ncode.contains(Falive_3)) {
                    number_alive_3++;
                }
                if (code.contains(Salive_3) && Ncode.contains(Salive_3)) {
                    number_alive_3++;
                }
                if (code.contains(Talive_3) && Ncode.contains(Talive_3)) {
                    number_alive_3++;
                }
                //眠四活三
                if (number_alive_3 > 1 && number_highdie_4 > 1) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 10000;
                }

                //双活三
                if (number_alive_3 > 1) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 5000;
                }

                //眠三活三
                String Fdie_3 = '0' + '0' + AI + AI + AI + player + "";
                String Sdie_3 = '0' + AI + '0' + AI + AI + player + "";
                String Tdie_3 = '0' + AI + AI + '0' + AI + player + "";
                String FOdie_3 = AI + '0' + '0' + AI + AI + "";
                String fidie_3 = AI + '0' + AI + '0' + AI + "";
                String Sidie_3 = player + '0' + AI + AI + AI + '0' + player + "";
                int number_die_3 = 0;//记录眠三的数量
                //横向
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() - 1; j >= 0 && array > 0; j--) {
                    array--;
                    code = board.isolation[j][(int) target[i].getY()] + code;
                    Ncode = board.isolation[j][(int) target[i].getY()] + Ncode;
                }
                array = 4;
                for (int k = (int) target[i].getX() + 1; k < column && array > 0; k++) {
                    array--;
                    code = code + board.isolation[k][(int) target[i].getY()];
                    Ncode = Ncode + board.isolation[k][(int) target[i].getY()];
                }
                if (code.contains(Fdie_3) && Ncode.contains(Fdie_3)) {
                    number_die_3++;
                }
                if (code.contains(Sdie_3) && Ncode.contains(Sdie_3)) {
                    number_die_3++;
                }
                if (code.contains(Tdie_3) && Ncode.contains(Tdie_3)) {
                    number_die_3++;
                }
                if (code.contains(FOdie_3) && Ncode.contains(FOdie_3)) {
                    number_die_3++;
                }
                if (code.contains(fidie_3) && Ncode.contains(fidie_3)) {
                    number_die_3++;
                }
                if (code.contains(Sidie_3) && Ncode.contains(Sidie_3)) {
                    number_die_3++;
                }
                //纵向
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getY() + 1; j < column && array > 0; j++) {
                    array--;
                    code = code + board.isolation[(int) target[i].getX()][j];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int k = (int) target[i].getY() - 1; k >= 0; k--) {
                    array--;
                    code = board.isolation[(int) target[i].getX()][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Fdie_3) && Ncode.contains(Fdie_3)) {
                    number_die_3++;
                }
                if (code.contains(Sdie_3) && Ncode.contains(Sdie_3)) {
                    number_die_3++;
                }
                if (code.contains(Tdie_3) && Ncode.contains(Tdie_3)) {
                    number_die_3++;
                }
                if (code.contains(FOdie_3) && Ncode.contains(FOdie_3)) {
                    number_die_3++;
                }
                if (code.contains(fidie_3) && Ncode.contains(fidie_3)) {
                    number_die_3++;
                }
                if (code.contains(Sidie_3) && Ncode.contains(Sidie_3)) {
                    number_die_3++;
                }
                //斜线方向\
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() + 1; j >= 0 && k < column && array > 0; j--, k++) {
                    array--;
                    code = code + board.isolation[j][k];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() - 1; j < row && k >= 0 && array > 0; j++, k--) {
                    array--;
                    code = board.isolation[j][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Fdie_3) && Ncode.contains(Fdie_3)) {
                    number_die_3++;
                }
                if (code.contains(Sdie_3) && Ncode.contains(Sdie_3)) {
                    number_die_3++;
                }
                if (code.contains(Tdie_3) && Ncode.contains(Tdie_3)) {
                    number_die_3++;
                }
                if (code.contains(FOdie_3) && Ncode.contains(FOdie_3)) {
                    number_die_3++;
                }
                if (code.contains(fidie_3) && Ncode.contains(fidie_3)) {
                    number_die_3++;
                }
                if (code.contains(Sidie_3) && Ncode.contains(Sidie_3)) {
                    number_die_3++;
                }
                //反斜线方向/
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() + 1; j < row && k < column && array > 0; j++, k++) {
                    array--;
                    code = code + board.isolation[j][k];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() - 1; j >= 0 && k >= 0 && array > 0; j--, k--) {
                    array--;
                    code = board.isolation[j][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Fdie_3) && Ncode.contains(Fdie_3)) {
                    number_die_3++;
                }
                if (code.contains(Sdie_3) && Ncode.contains(Sdie_3)) {
                    number_die_3++;
                }
                if (code.contains(Tdie_3) && Ncode.contains(Tdie_3)) {
                    number_die_3++;
                }
                if (code.contains(FOdie_3) && Ncode.contains(FOdie_3)) {
                    number_die_3++;
                }
                if (code.contains(fidie_3) && Ncode.contains(fidie_3)) {
                    number_die_3++;
                }
                if (code.contains(Sidie_3) && Ncode.contains(Sidie_3)) {
                    number_die_3++;
                }
                //眠三活三
                if (number_die_3 > 1 && number_alive_3 > 1) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 1000;
                }

                //双眠三
                if (number_die_3 > 1) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 500;
                }

                //眠四
                if (number_highdie_4 == 1) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 500;
                }

                //单活三
                if (number_alive_3 == 1) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 100;
                }

                //跳活三
                int number_tiaoalive_3 = 0;
                //横向
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() - 1; j >= 0 && array > 0; j--) {
                    array--;
                    code = board.isolation[j][(int) target[i].getY()] + code;
                    Ncode = board.isolation[j][(int) target[i].getY()] + Ncode;
                }
                array = 4;
                for (int k = (int) target[i].getX() + 1; k < column && array > 0; k++) {
                    array--;
                    code = code + board.isolation[k][(int) target[i].getY()];
                    Ncode = Ncode + board.isolation[k][(int) target[i].getY()];
                }
                if (code.contains(Salive_3) && Ncode.contains(Salive_3)) {
                    number_tiaoalive_3++;
                }
                if (code.contains(Talive_3) && Ncode.contains(Talive_3)) {
                    number_tiaoalive_3++;
                }
                //纵向
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getY() + 1; j < column && array > 0; j++) {
                    array--;
                    code = code + board.isolation[(int) target[i].getX()][j];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int k = (int) target[i].getY() - 1; k >= 0; k--) {
                    array--;
                    code = board.isolation[(int) target[i].getX()][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Salive_3) && Ncode.contains(Salive_3)) {
                    number_tiaoalive_3++;
                }
                if (code.contains(Talive_3) && Ncode.contains(Talive_3)) {
                    number_tiaoalive_3++;
                }
                //斜线方向\
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() + 1; j >= 0 && k < column && array > 0; j--, k++) {
                    array--;
                    code = code + board.isolation[j][k];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() - 1; j < row && k >= 0 && array > 0; j++, k--) {
                    array--;
                    code = board.isolation[j][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Salive_3) && Ncode.contains(Salive_3)) {
                    number_tiaoalive_3++;
                }
                if (code.contains(Talive_3) && Ncode.contains(Talive_3)) {
                    number_tiaoalive_3++;
                }
                //反斜线方向/
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() + 1; j < row && k < column && array > 0; j++, k++) {
                    array--;
                    code = code + board.isolation[j][k];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() - 1; j >= 0 && k >= 0 && array > 0; j--, k--) {
                    array--;
                    code = board.isolation[j][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Falive_3) && Ncode.contains(Falive_3)) {
                    number_tiaoalive_3++;
                }
                if (code.contains(Salive_3) && Ncode.contains(Salive_3)) {
                    number_tiaoalive_3++;
                }
                //跳活三
                if (number_tiaoalive_3 >= 1) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 90;
                }

                //活二
                String Falive_2 = '0' + '0' + AI + AI + '0' + '0' + "";
                String Salive_2 = '0' + AI + '0' + AI + '0' + "";
                String Talive_2 = AI + '0' + '0' + AI + "";
                int number_alive_2 = 0;//记录活二的数量
                //横向
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() - 1; j >= 0 && array > 0; j--) {
                    array--;
                    code = board.isolation[j][(int) target[i].getY()] + code;
                    Ncode = board.isolation[j][(int) target[i].getY()] + Ncode;
                }
                array = 4;
                for (int k = (int) target[i].getX() + 1; k < column && array > 0; k++) {
                    array--;
                    code = code + board.isolation[k][(int) target[i].getY()];
                    Ncode = Ncode + board.isolation[k][(int) target[i].getY()];
                }
                if (code.contains(Falive_2) && Ncode.contains(Falive_2)) {
                    number_alive_2++;
                }
                if (code.contains(Salive_2) && Ncode.contains(Salive_2)) {
                    number_alive_2++;
                }
                if (code.contains(Talive_2) && Ncode.contains(Talive_2)) {
                    number_alive_2++;
                }
                //纵向
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getY() + 1; j < column && array > 0; j++) {
                    array--;
                    code = code + board.isolation[(int) target[i].getX()][j];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int k = (int) target[i].getY() - 1; k >= 0; k--) {
                    array--;
                    code = board.isolation[(int) target[i].getX()][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Falive_2) && Ncode.contains(Falive_2)) {
                    number_alive_2++;
                }
                if (code.contains(Salive_2) && Ncode.contains(Salive_2)) {
                    number_alive_2++;
                }
                if (code.contains(Talive_2) && Ncode.contains(Talive_2)) {
                    number_alive_2++;
                }
                //斜线方向\
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() + 1; j >= 0 && k < column && array > 0; j--, k++) {
                    array--;
                    code = code + board.isolation[j][k];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() - 1; j < row && k >= 0 && array > 0; j++, k--) {
                    array--;
                    code = board.isolation[j][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Falive_2) && Ncode.contains(Falive_2)) {
                    number_alive_2++;
                }
                if (code.contains(Salive_2) && Ncode.contains(Salive_2)) {
                    number_alive_2++;
                }
                if (code.contains(Talive_2) && Ncode.contains(Talive_2)) {
                    number_alive_2++;
                }
                //反斜线方向/
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() + 1; j < row && k < column && array > 0; j++, k++) {
                    array--;
                    code = code + board.isolation[j][k];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() - 1; j >= 0 && k >= 0 && array > 0; j--, k--) {
                    array--;
                    code = board.isolation[j][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Falive_2) && Ncode.contains(Falive_2)) {
                    number_alive_2++;
                }
                if (code.contains(Salive_2) && Ncode.contains(Salive_2)) {
                    number_alive_2++;
                }
                if (code.contains(Talive_2) && Ncode.contains(Talive_2)) {
                    number_alive_2++;
                }
                //双活二
                if (number_alive_2 > 1) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 50;
                }
                //活二
                if (number_alive_2 == 1) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 10;
                }
                //眠三
                if (number_die_3 == 1) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 5;
                }

                //眠二
                String Fdie_2 = '0' + '0' + '0' + AI + AI + player + "";
                String Sdie_2 = '0' + '0' + AI + '0' + AI + player + "";
                String Tdie_2 = '0' + AI + '0' + '0' + AI + player + "";
                String Fodie_2 = AI + '0' + '0' + '0' + AI + "";
                int number_die_2 = 0;//记录活二的数量
                //横向
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() - 1; j >= 0 && array > 0; j--) {
                    array--;
                    code = board.isolation[j][(int) target[i].getY()] + code;
                    Ncode = board.isolation[j][(int) target[i].getY()] + Ncode;
                }
                array = 4;
                for (int k = (int) target[i].getX() + 1; k < column && array > 0; k++) {
                    array--;
                    code = code + board.isolation[k][(int) target[i].getY()];
                    Ncode = Ncode + board.isolation[k][(int) target[i].getY()];
                }
                if (code.contains(Fdie_2) && Ncode.contains(Fdie_2)) {
                    number_die_2++;
                }
                if (code.contains(Sdie_2) && Ncode.contains(Sdie_2)) {
                    number_die_2++;
                }
                if (code.contains(Tdie_2) && Ncode.contains(Tdie_2)) {
                    number_die_2++;
                }
                if (code.contains(Fodie_2) && Ncode.contains(Fodie_2)) {
                    number_die_2++;
                }
                //纵向
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getY() + 1; j < column && array > 0; j++) {
                    array--;
                    code = code + board.isolation[(int) target[i].getX()][j];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int k = (int) target[i].getY() - 1; k >= 0; k--) {
                    array--;
                    code = board.isolation[(int) target[i].getX()][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Fdie_2) && Ncode.contains(Fdie_2)) {
                    number_die_2++;
                }
                if (code.contains(Sdie_2) && Ncode.contains(Sdie_2)) {
                    number_die_2++;
                }
                if (code.contains(Tdie_2) && Ncode.contains(Tdie_2)) {
                    number_die_2++;
                }
                if (code.contains(Fodie_2) && Ncode.contains(Fodie_2)) {
                    number_die_2++;
                }
                //斜线方向\
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() + 1; j >= 0 && k < column && array > 0; j--, k++) {
                    array--;
                    code = code + board.isolation[j][k];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() - 1; j < row && k >= 0 && array > 0; j++, k--) {
                    array--;
                    code = board.isolation[j][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Fdie_2) && Ncode.contains(Fdie_2)) {
                    number_die_2++;
                }
                if (code.contains(Sdie_2) && Ncode.contains(Sdie_2)) {
                    number_die_2++;
                }
                if (code.contains(Tdie_2) && Ncode.contains(Tdie_2)) {
                    number_die_2++;
                }
                if (code.contains(Fodie_2) && Ncode.contains(Fodie_2)) {
                    number_die_2++;
                }
                //反斜线方向/
                code = AI + "";
                Ncode = "";
                array = 4;
                for (int j = (int) target[i].getX() + 1, k = (int) target[i].getY() + 1; j < row && k < column && array > 0; j++, k++) {
                    array--;
                    code = code + board.isolation[j][k];
                    Ncode = Ncode + board.isolation[j][(int) target[i].getY()];
                }
                array = 4;
                for (int j = (int) target[i].getX() - 1, k = (int) target[i].getY() - 1; j >= 0 && k >= 0 && array > 0; j--, k--) {
                    array--;
                    code = board.isolation[j][k] + code;
                    Ncode = board.isolation[k][(int) target[i].getY()] + Ncode;
                }
                if (code.contains(Fdie_2) && Ncode.contains(Fdie_2)) {
                    number_die_2++;
                }
                if (code.contains(Sdie_2) && Ncode.contains(Sdie_2)) {
                    number_die_2++;
                }
                if (code.contains(Tdie_2) && Ncode.contains(Tdie_2)) {
                    number_die_2++;
                }
                if (code.contains(Fodie_2) && Ncode.contains(Fodie_2)) {
                    number_die_2++;
                }
                if (number_die_2 >= 1) {
                    score[(int) target[i].getX()][(int) target[i].getY()] += 2;
                }

            }
        }
    
    //找到所有点中得分最大的点，并返回该点
    public Point Max(){
        int min=0;
        Point a = null;
        for(int i=0;i<column;i++) {
            for(int j=0;j<row;j++) {
                System.out.print(score[i][j]+"  ");
                if(score[i][j]>min){
                    min=score[i][j];
                    a=new Point(i,j);
                }
                else{
                    a=new Point(0,0);
                }
            }
            System.out.println();
        }
        return a;
    }
}

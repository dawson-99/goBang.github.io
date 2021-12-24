package com.goBang.model;
import checkBoardService.size;
import java.awt.*;
import java.util.ArrayList;

public class AI implements size {
    int evaluation;
    int aiturn;
    int depth=4;
    Board board;
    char[][] isavil = new char[row][column];
    evaluated ed;
    AI(Board board){
        this.board=board;
        for (int i = 0; i < row; i++) {
            isavil[i] = board.isolation[i].clone();
        }
    }

    public int  MINMAX(Board board) {
        if(board.turn==aiturn){
            return MAX(depth);
        }else{
            return MIN(depth);
        }
    }
    public int  MAX(int depth){
        int MAX=Integer.MIN_VALUE,cot=0;
        if(depth<0){
            return ed.evaluate(isavil);
        }else{
            while(makenextmove(isavil,(char)aiturn,cot++)) {
               var val=MIN(depth-1);
               if(val>MAX)MAX=val;
            }
        }
        return MAX;
    }
    public int  MIN(int depth){
        int MIN=Integer.MAX_VALUE;
        int cot=0;
        if(depth<0){
            return ed.evaluate(isavil);
        }else{
            while(makenextmove(isavil,(char)aiturn,cot++)){
                var val=MAX(depth-1);
                if(val<MIN)MIN=val;
            }
        }
        return MIN;
    }
    public boolean makenextmove(char isavil[][],char turn,int cot){
        if(cot%15==14) return false;
        if (isavil[cot/(row-1)][cot%column]=='0'){
            isavil[cot/(row)-1][cot%column]=turn;
        }
        return true;

    }
    public void setchess( char[][] isavil,Point AIp,char turn){
        isavil[AIp.x][AIp.y]=turn;
    }
}

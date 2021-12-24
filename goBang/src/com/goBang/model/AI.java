package com.goBang.model;
import AIService.AIServiceImpl.AIwork;
import checkBoardService.size;
import AIService.*;

import java.awt.*;

public class AI implements size {
    int evaluation;
    evaluated ed;
    public void Alpha_Beta(Board board) {
        char[][] isavil = new char[row][column];
        for (int i = 0; i < row; i++) {
            isavil[i] = board.isolation[i].clone();
        }
        int Alpha = Integer.MAX_VALUE, Beta = Integer.MIN_VALUE;
        AIService aiService = new AIwork();
        aiService.Find(board);
        aiService.InitSCore(board, '2', (char) board.turn);
        Point AIp = aiService.Max();
        setchess(isavil,AIp, (char) board.turn);
        int deepth=0;
        /*while (deepth<4){
            evaluation = ed.evaluate(isavil);
            Aa=evaluation;
            if(){

            }
        }
         */
    }
    public void setchess( char[][] isavil,Point AIp,char turn){
        isavil[AIp.x][AIp.y]=turn;
    }
}

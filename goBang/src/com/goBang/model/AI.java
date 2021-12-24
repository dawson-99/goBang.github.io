package com.goBang.model;
import AIService.AIServiceImpl.AIwork;
import checkBoardService.size;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AI implements size {
    int aiturn;
    int depth=4;
    Board board;
    char[][] isavil = new char[row][column];
    evaluated ed;
    ArrayList<chessman> chessmanArrayList=new ArrayList<>();
    AI(Board board){
        this.board=board;
        for (int i = 0; i < row; i++) {
            isavil[i] = board.isolation[i].clone();
        }
        //ed=new evaluated((char)aiturn);
    }
    public void gen(ArrayList<chessman> gen){
        AIwork aIwork=new AIwork();
        aIwork.Find(board);
        aIwork.InitSCore(board,(char) aiturn,'1');
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if(aIwork.AIscore[i][j]!=0){
                    gen.add(new chessman(new Point(i,j),aIwork.AIscore[i][j]));
                }
            }
        }
    }
    public void Alpha_Beta(){
        int Alpha=Integer.MIN_VALUE,Beta=Integer.MAX_VALUE;
        MINMAX(depth,Alpha,Beta);
        Collections.sort(chessmanArrayList);
        setchess(chessmanArrayList.get(0).point);
    }
    public int  MINMAX(int depth,int Alpha,int Beta) {
        ArrayList<chessman> gen=new ArrayList<>();
        gen(gen);
        Collections.sort(gen);
        Point p=new Point(0,0);
        if(depth==0){
            chessmanArrayList.add(new chessman(p, ed.evaluate(isavil)));
            return ed.evaluate(isavil);
        }
        while(makenextmove(board,(char)aiturn,p)) {
            var val=-MINMAX(depth-1,-Beta,-Alpha);
            unmakenextmove(board,p);
            if(val>Alpha) {
                if (val >=Beta) return Beta;
                Alpha=val;
            }
                p.x++;
            if(p.x>14){
                p.y++;
                p.x=0;
            }
        }
        return Alpha;
    }
    public boolean makenextmove(Board board,char turn,Point p){
        if(p.x==14&&p.y==14) return false;
        if (board.isolation[p.x][p.y]=='0'){
            board.isolation[p.x][p.y]=turn;
        }
        return true;
    }
    public void unmakenextmove(Board board,Point p){
        board.isolation[p.x][p.y]='0';
    }
    public boolean over(Board board){
        return false;
    }
    public void setchess( Point AIp){
        board.isolation[AIp.x][AIp.y]=(char) aiturn;
    }
}

package com.goBang.model;
import AIService.AIServiceImpl.AIwork;
import checkBoardService.size;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
public class AI implements size {
    char aiturn,playerturn;
    int depth=4;
    Board board;
    char[][] isavil = new char[row][column];
    evaluated ed;
    ArrayList<chessman> chessmanArrayList=new ArrayList<>();
    AI(Board board,char AI){
        this.board=board;
        aiturn=AI;
        if(aiturn=='1') playerturn='2';
        else playerturn='1';
        copy(isavil);
        ed=new evaluated();
    }
    public void gen(ArrayList<chessman> gen,char turn){
        AIwork aIwork=new AIwork();
        aIwork.Find(board);
        aIwork.InitSCore(board,turn,'1');//得到playersore数组；
        //System.out.println(aiturn);
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                //System.out.print(aIwork.AIscore[i][j]+"  ");
                if(aIwork.AIscore[i][j]!=0){
                    gen.add(new chessman(new Point(i,j),aIwork.AIscore[i][j]));//将合适的点加入评估得到的数组
                }
            }
            //System.out.println();
        }
    }
    public void Alpha_Beta(Point point){
        int Alpha=Integer.MIN_VALUE,Beta=Integer.MAX_VALUE;
        MINMAX(depth,Alpha,Beta);
        Collections.sort(chessmanArrayList);
        point=chessmanArrayList.get(0).point;
        setchess(chessmanArrayList.get(0).point);
    }
    public int  MINMAX(int depth,int Alpha,int Beta) {
        int cot=0;//启发式评估函数排序后的取数顺序。
        ArrayList<chessman> gen=new ArrayList<>();//启发式评估函数点的存储
        if(depth%2==0){
            gen(gen,aiturn);
        }
        else gen(gen,playerturn);//调用启发式评估函数
        Collections.sort(gen);//排序
        //print(gen);
        Point p=new Point();
        if(depth==0){
            chessmanArrayList.add(new chessman(p,ed.evaluate(isavil,aiturn)));
            //System.out.println(ed.evaluate(isavil,aiturn));
            /*for (int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    System.out.print(isavil[i][j]);
                }
                System.out.println();
            }
             */
            return ed.evaluate(isavil, aiturn);
        }
        while(cot<gen.size()) {
            p=gen.get(cot).point;
            if(depth%2==0){
                makenextmove(board, aiturn, p);
            }else makenextmove(board,playerturn,p);
            copy(isavil);
            print(isavil);
            var val=-MINMAX(depth-1,-Beta,-Alpha);
            unmakenextmove(board,p);
            copy(isavil);
            if(val>Alpha){
                if (val >=Beta) return Beta;
                Alpha=val;
            }
                p.x++;
            if(p.x>14){
                p.y++;
                p.x=0;
            }
            cot++;
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
        board.isolation[AIp.x][AIp.y]=aiturn;
    }
    public void print(ArrayList<chessman> chessmanArrayList){
        //System.out.println(chessmanArrayList.size());
        for(chessman c:chessmanArrayList){
            System.out.println(c.point.x+"  "+c.point.y+"   "+c.eval);
        }
    }
    public void print(char[][] isvail){
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(isvail[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void copy(char[][] isavil){
        for (int i = 0; i < row; i++) {
            isavil[i] = board.isolation[i].clone();
        }
    }

}

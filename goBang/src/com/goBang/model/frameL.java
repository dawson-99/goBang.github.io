package com.goBang.model;
import checkBoardService.checkBoardServiceImpl.judgeServiceImpl;
import checkBoardService.judgeService;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class frameL implements checkBoardService.size, MouseListener {
    public Board f;
    public frameL(Board ft){
        this.f=ft;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        if((x-20)%40>=20){
            f.countx=(x-20)/40+1;
        }
        else{
            f.countx=(x-20)/40;
        }
        if((y-20)%40>=20){
           f.county=(y-20)/40+1;
        }
        else{
            f.county=(y-20)/40;
        }
        char c;
        if (f.turn == 1) {
            c = '1';
        } else {
            c = '2';
        }
        if(f.countx>=15||f.county>=15){
            JOptionPane.showMessageDialog(null,"请点击正确的位置");
        }
        else if(f.isolation[f.countx][f.county]!='0'){
            JOptionPane.showMessageDialog(null, "此处已经有棋子了，请下在其它地方");
            //System.out.println(countx+" "+county+"  "+f.isolation[countx][county]);
        }
        else {
            JLabel l;
            int x1=f.countx*size;
            int x2=f.county*size;
            if(f.turn==1){
                f.isolation[f.countx][f.county]='1';
                f.chessboard[f.countx][f.county]='1';
                f.turn++;
            }
            else{
                f.isolation[f.countx][f.county]='2';
                f.chessboard[f.countx][f.county]='2';
                f.turn--;
            }
            f.left.repaint();
            judgeService js = new judgeServiceImpl();
            //System.out.println(f.countx + "   " + f.county);
            // System.out.println(js.judge(f, f.countx, f.county, c));
            //返回值有4中情况：1为没有任何状况、2为禁手、3为输、4为赢
            switch (js.judge(f, f.countx, f.county, c)) {
                case 1:
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "黑方禁手,黑方输");
                    f.clear();
                    f.turn=1;
                    break;
                case 3:
                    if(c=='1') JOptionPane.showMessageDialog(null, "黑方输");
                    else JOptionPane.showMessageDialog(null, "白方输");
                    f.clear();
                    f.turn=1;
                    break;
                case 4:
                    if(c=='1')JOptionPane.showMessageDialog(null, "黑方赢");
                    else JOptionPane.showMessageDialog(null, "白方赢");
                    f.clear();
                    f.turn=1;
                    break;
            }
           //System.out.println(f.turn);
            AI ai;
            //AIService as=new AIwork();
            //char AI;
            Point p=new Point();
            if (f.turn == 1) {
                c = '2';
                ai=new AI(f,'1');
                //AI='1';
               /* as.Find(f);
                as.InitSCore(f,AI,c);
                as.InitSCore_2(f,c,AI);
                p=as.Max();
                System.out.println(p.x+"    "+p.y);
                f.isolation[p.x][p.y]='1';
                f.chessboard[p.x][p.y]='1';

                */
                f.turn++;
            } else {
                c = '1';
                ai=new AI(f,'2');
               // AI='2';
                /*
                as.Find(f);
                as.InitSCore(f,AI,c);
                as.InitSCore_2(f,c,AI);
                p=as.Max();
                System.out.println(p.x+"    "+p.y);
                f.isolation[p.x][p.y]='2';
                f.chessboard[p.x][p.y]='2';
                 */
                f.turn--;
            }
            ai.Alpha_Beta();
            f.left.repaint();
            switch (js.judge(f,p.x, p.y, c)) {
                case 1:
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "黑方禁手,黑方输");
                    f.clear();
                    f.turn=1;
                    break;
                case 3:
                    if(c=='1') JOptionPane.showMessageDialog(null, "黑方输");
                    else JOptionPane.showMessageDialog(null, "白方输");
                    f.clear();
                    f.turn=1;
                    break;
                case 4:
                    if(c=='1')JOptionPane.showMessageDialog(null, "黑方赢");
                    else JOptionPane.showMessageDialog(null, "白方赢");
                    f.clear();
                    f.turn=1;
                    break;
            }
        }
       //f.print();
    }
    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    @Override
    public void mouseExited(MouseEvent e) {

    }
}

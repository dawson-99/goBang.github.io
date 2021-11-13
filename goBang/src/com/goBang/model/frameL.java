package com.goBang.model;

import checkBoardService.size;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class frameL implements checkBoardService.size,MouseListener {
    public Board f;
    @Override
    public void mouseClicked(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        int countx;
        int county;
        if((x-20)%40>=20){
            countx=(x-20)/40+1;
        }
        else{
            countx=(x-20)/40;
        }
        if((y-20)%40>=20){
            county=(y-20)/40+1;
        }
        else{
            county=(y-20)/40;
        }
        Graphics gs=f.getGraphics();
        if(f.isolation[countx][county]!=0){
            JOptionPane.showMessageDialog(null, "此处已经有棋子了，请下在其它地方");
        }
        else {
            int x1=countx*size+20;
            int x2=county*size+20;
            if(f.turn==1){
                gs.setColor(Color.BLACK);
                gs.fillOval(x1,x2,size,size);
                f.isolation[countx][county]='1';
            }
            else{
                gs.setColor(Color.WHITE);
                gs.fillOval(x1,x2,size,size);
                f.isolation[countx][county]='2';
            }

        }
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

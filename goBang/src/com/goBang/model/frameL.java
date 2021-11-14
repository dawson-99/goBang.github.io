package com.goBang.model;

import checkBoardService.size;
import  javax.imageio.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

import static javax.imageio.ImageIO.read;

public class frameL implements checkBoardService.size,MouseListener {
    public Board f;
    public frameL(Board ft){
        this.f=ft;
    }

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
        //f.print(f);
        if(countx>=15||county>=15){
            JOptionPane.showMessageDialog(null,"请点击正确的位置");
        }
        else if(f.isolation[countx][county]!='0'){
            JOptionPane.showMessageDialog(null, "此处已经有棋子了，请下在其它地方");
            //System.out.println(countx+" "+county+"  "+f.isolation[countx][county]);
        }
        else {
            JLabel l;
            int x1=countx*size;
            int x2=county*size;
            if(f.turn==1){
                f.isolation[countx][county]='1';
                f.turn++;
            }
            else{
                f.isolation[countx][county]='2';
                f.turn--;
            }
            f.left.repaint();
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

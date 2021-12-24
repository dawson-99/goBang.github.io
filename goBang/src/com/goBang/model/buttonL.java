package com.goBang.model;

import checkBoardService.size;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class buttonL implements checkBoardService.size, ActionListener {
    public  Board f;
    public buttonL(Board ft){
        this.f=ft;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("重新开始")){
            f.clear();
            f.turn=1;
            f.left.repaint();
        }
    }
}

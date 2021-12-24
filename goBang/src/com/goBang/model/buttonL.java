package com.goBang.model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

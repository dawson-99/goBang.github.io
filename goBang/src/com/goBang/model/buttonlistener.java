package com.goBang.model;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonlistener implements ActionListener, checkBoardService.size {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"您开始了游戏");
        new Board("五子棋");
    }
}

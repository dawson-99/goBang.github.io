package com.goBang.model;

import checkBoardService.size;
import javax.swing.*;
import java.awt.*;

public class startBoard extends JPanel implements checkBoardService.size {
    JFrame start=new JFrame(){
        @Override
        public void paint(Graphics g){
            ImageIcon icon = new ImageIcon("./goBang/src/resources/b.jpg");
            g.drawImage(icon.getImage(), 0, 0, getSize().width,getSize().height, this);
        }
    };
    public startBoard(String s){
        start.setTitle(s);
        start.setResizable(true);
        start.setSize(new Dimension(800,650));
        start.setLayout(null);
        start.setLocationRelativeTo(null);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setVisible(true);
        Font ft=new Font("华文行楷",Font.ITALIC,13);
        JButton star=new JButton("开始新游戏");
        star.setFont(ft);
        start.add(star);
        star.setBounds(300,400,200,100);
        buttonlistener ls=new buttonlistener();
        star.addActionListener(ls);
    }
}

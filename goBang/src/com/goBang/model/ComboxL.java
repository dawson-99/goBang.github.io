package com.goBang.model;

import checkBoardService.*;
import checkBoardService.checkBoardServiceImpl.judgeServiceImpl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboxL implements ItemListener {
    public  Board f;
    public ComboxL(Board ft){
        f=ft;
        frameL fL=new frameL(f);
        f.left.addMouseListener(fL);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
       /* if(e.getItem().toString().equals("自由开局")){
            System.out.println("自由开局");
            judgeService js=new judgeServiceImpl();
            char c;
            if(f.turn==1){
                c='1';
            }else{
                c='2';
            }
            System.out.println(js.judge(f,f.countx,f.county,c));
            //返回值有4中情况：1为没有任何状况、2为禁手、3为输、4为赢
            switch (js.judge(f,f.countx,f.county,c)){
                case 1:
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"禁手");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"当前方输");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"当前方赢");
                    break;
            }
        }
        else if(e.equals("指定开局")){
            System.out.println("指定开局");
            judgeService js=new judgeServiceImpl();
            char c;
            if(f.turn==1){
                c='1';
            }else{
                c='2';
            }
            System.out.println(js.judge(f,f.countx,f.county,c));
            //返回值有4中情况：1为没有任何状况、2为禁手、3为输、4为赢
            switch (js.judge(f,f.countx,f.county,c)){
                case 1:
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"禁手");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"当前方输");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"当前方赢");
                    break;
            }
        }
 */
    }

}

package com.goBang.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboxL implements ItemListener {
    /*public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("自由开局")){

        }
        else if(e.getActionCommand().equals("指定开局")){

        }
    }
*/
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.equals("自由开局")){

        }
        else if(e.equals("指定开局")){

        }
    }
}

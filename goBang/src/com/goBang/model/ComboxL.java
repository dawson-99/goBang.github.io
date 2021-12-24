package com.goBang.model;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class ComboxL implements ItemListener {
    public Board f;
    public ComboxL(Board ft) {
        f = ft;
        frameL fL = new frameL(f);
        f.left.addMouseListener(fL);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getItem().toString().equals("自由开局")) {

            } else if (e.getItem().toString().equals("指定开局")) {

            }
        }

}
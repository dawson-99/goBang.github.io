package com.goBang.model;

import java.awt.*;
import java.nio.channels.Pipe;

public class chessman implements Comparable<chessman>{
    Point point;
    int eval;
    chessman(Point p,int e){
        point=new Point(p);
        eval=e;
    }
    @Override
    public int compareTo(chessman o) {
        return o.eval-this.eval;
    }
}

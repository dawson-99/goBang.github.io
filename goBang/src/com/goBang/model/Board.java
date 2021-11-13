package com.goBang.model;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Board extends JPanel implements checkBoardService.size {
    public Graphics gs;
    JFrame game=new JFrame();
    public int turn=1;
    public char [][]isolation=new char[row][column];
    public Board(String s){
        init(s);
    }
    private void init(String s){
        Container con=game.getContentPane();
        game.setTitle(s);
        con.setBackground(Color.WHITE);
        game.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        game.setBounds(0,0,800,650);
        game.setLocationRelativeTo(null);
        game.setLayout(new BorderLayout());
        Dimension dim1=new Dimension(150,0);//设置右半部分的大小
        Dimension dim2=new Dimension(550,0);//设置左半部分的大小
        Dimension dim3=new Dimension(140,40);//设置右边按钮组件的大小
        //String path="back.jpg";
        //ImageIcon background=new ImageIcon(path);
        // 把背景图片显示在一个标签里面
        //JLabel label=new JLabel(background);
        // 把标签的大小位置设置为图片刚好填充整个面板
        //label.setBounds(0,0,game.getWidth(),game.getHeight());
        // 把内容窗格转化为JPanel，否则不能用方法setOpaque()来使内容窗格透明
        //JPanel imagePanel = (JPanel) game.getContentPane();
        //imagePanel.setOpaque(false);
        // 把背景图片添加到分层窗格的最底层作为背景
        //game.getLayeredPane().add(label,Integer.valueOf(Integer.MIN_VALUE));
        //设置可见
        JPanel left =new JPanel(){
            //重写此JPanel的paint
            public void paint(Graphics gs){
               super.paint(gs);
               gs.setColor(Color.BLACK);
               for(int i=0;i<row;i++){
                   gs.drawLine(x,y+i*size,x+(column-1)*size,y+i*size);
               }
               for(int i=0;i<column;i++){
                   gs.drawLine(x+i*size,y,x+i*size,y+(row-1)*size);
               }//线
               gs.fillOval(x+(row-1)/2*size-8,y+(column-1)/2*size-8,16,16);//天元
               int tar=size*8;
               gs.fillOval(x+size*3-5,y+size*3-5,10,10);
               gs.fillOval(x+size*3+tar-5,y+size*3-5,10,10);
               gs.fillOval(x+size*3+tar-5,y+size*3+tar-5,10,10);
               gs.fillOval(x+size*3-5,y+size*3+tar-5,10,10);//四星
            }
            @Override
            protected void paintComponent(Graphics g ){
                ImageIcon icon = new ImageIcon("src/resources/back.jpg");
                Image img = icon.getImage();
                g.drawImage(img, 0, 0,img.getWidth(), this.getHeight(), this);
            }
        };
        left.setPreferredSize(dim2);
        //left.setBackground(Color.cyan);
        game.add(left,BorderLayout.CENTER);
        JPanel right=new JPanel();
        right.setPreferredSize(dim1);
        game.add(right,BorderLayout.EAST);
        right.setLayout(new FlowLayout());
        String[] butname= {"开始新游戏","认输"};
        JButton[] button=new JButton[2];
        for(int i=0;i<butname.length;i++) {
            button[i]=new JButton(butname[i]);
            button[i].setPreferredSize(dim3);
            button[i].setBackground(Color.white);
            button[i].setVerticalAlignment(SwingConstants.CENTER);
            right.add(button[i]);
        }//按钮
        //按钮监控类
        buttonL butListen=new buttonL();
        //对每一个按钮都添加状态事件的监听处理机制
        for(int i=0;i<butname.length;i++) {
            button[i].addActionListener(butListen);//添加发生操作的监听方法
        }
        String []st={"自由开局","指定开局"};
        JComboBox box=new JComboBox(st);
        right.add(box);
        //下拉框
        game.setResizable(false);
        game.setVisible(true);
    }
}

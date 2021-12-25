package com.goBang.model;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Board extends JPanel implements checkBoardService.size {
    JFrame game=new JFrame();
    public int turn=1;//
    public  int countx;//mouse x
    public int county;//mouse y
    public char [][]isolation=new char[row][column];//chess board
    public char [][]chessboard=new char[row][column];
    JPanel left;
    JPanel right;
    public Board(String s){
        init(s);
    }
    private void init(String s){
        Container con=game.getContentPane();
        game.setTitle(s);
        con.setBackground(Color.WHITE);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setBounds(0,0,800,650);
        game.setLocationRelativeTo(null);
        game.setLayout(new BorderLayout());
        Dimension dim1=new Dimension(150,0);//设置右半部分的大小
        Dimension dim2=new Dimension(550,0);//设置左半部分的大小
        Dimension dim3=new Dimension(140,40);//设置右边按钮组件的大小
        for(int i=0;i<row;++i){
            for(int j=0;j<column;++j){
                isolation[i][j]='0';
                chessboard[i][j]='0';
            }
        }
        left =new JPanel(){
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
                //Graphics2D g2=(Graphics2D)gs;
               for(int i=0;i<row;i++){
                    for(int j=0;j<column;j++){
                        if(isolation[i][j]=='1'){
                            //gs.setColor(Color.BLACK);
                            //gs.fillOval(i*size,j*size,size,size);
                            try {
                                BufferedImage bi= ImageIO.read(new File("goBang/src/resources/black.jpg"));
                                BufferedImage image=new BufferedImage(bi.getWidth(),bi.getHeight(),BufferedImage.TYPE_INT_ARGB);
                                Graphics2D tm=image.createGraphics();
                                tm.drawImage(bi,i*size,j*size,this);
                                Rectangle2D.Double rect=new Rectangle2D.Double(i*size,j*size,size,size);
                                TexturePaint t=new TexturePaint(bi,rect);
                                ((Graphics2D) gs).setPaint(t);
                                ((Graphics2D) gs).fill(new Ellipse2D.Float(i*size,j*size,size,size));
                            }catch(IOException e){
                                System.out.println("File read error:"+e);
                            }
                        }//black chess
                        else if(isolation[i][j]=='2'){
                            //gs.setColor(Color.WHITE);
                            //gs.fillOval(i*size,j*size,size,size);
                            try {
                                BufferedImage bi= ImageIO.read(new File("goBang/src/resources/white.jpg"));
                                BufferedImage image=new BufferedImage(bi.getWidth(),bi.getHeight(),BufferedImage.TYPE_INT_ARGB);
                                Graphics2D tm=image.createGraphics();
                                tm.drawImage(bi,i*size,j*size,this);
                                Rectangle2D.Double rect=new Rectangle2D.Double(i*size,j*size,size,size);
                                TexturePaint t=new TexturePaint(bi,rect);
                                ((Graphics2D) gs).setPaint(t);
                                ((Graphics2D) gs).fill(new Ellipse2D.Float(i*size,j*size,size,size));
                            }catch(IOException e){
                                System.out.println("File read error:"+e);
                            }
                        }//white chess
                    }
                }
            }
            @Override
            protected void paintComponent(Graphics g){
                ImageIcon icon = new ImageIcon("./goBang/src/resources/back1.jpg");
                g.drawImage(icon.getImage(), 0, 0, getSize().width,getSize().height, this);
               }
        };
        left.setLayout(null);
        left.setPreferredSize(dim2);
        //left.setBackground(Color.cyan);
        game.add(left,BorderLayout.CENTER);
        right=new JPanel();
        right.setPreferredSize(dim1);
        game.add(right,BorderLayout.EAST);
        right.setLayout(new FlowLayout());
        String  butname= "重新开始";
        JButton button=new JButton(butname);
        button.setPreferredSize(dim3);
        button.setBackground(Color.white);
        button.setVerticalAlignment(SwingConstants.CENTER);
        right.add(button);
        //按钮
        //按钮监控类
        buttonL butListen=new buttonL(this);
        //对每一个按钮都添加同一个状态事件的监听处理机制
        button.addActionListener(butListen);//添加发生操作的监听方法
        String []st={"先手","后手"};
        JComboBox box=new JComboBox(st);
        ComboxL boxListen=new ComboxL(this);
        box.addItemListener(boxListen);
        right.add(box);
        //下拉框
        JTextField f1=new JTextField("制作人：");
        JTextField f2=new JTextField("张国铭");
        JTextField f3=new JTextField("魏万程");
        JTextField f4=new JTextField("徐睿航");
        f1.setEditable(false);
        f2.setEditable(false);
        f3.setEditable(false);
        f4.setEditable(false);
        right.add(f1);
        right.add(f2);
        right.add(f3);
        right.add(f4);
        game.setResizable(false);
        game.setVisible(true);
    }
    void print(){
        for(int i=0;i<row;++i){
            for(int j=0;j<column;++j){
               System.out.print(isolation[i][j]+"  ");
            }
            System.out.println();
        }
    }
    void clear(){
        for(int i=0;i<row;++i){
            for(int j=0;j<column;++j){
               isolation[i][j]='0';
               chessboard[i][j]='0';
            }
        }
    }
}

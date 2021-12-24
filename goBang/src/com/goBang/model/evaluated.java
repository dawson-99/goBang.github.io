package com.goBang.model;

import static checkBoardService.size.column;
import static checkBoardService.size.row;

public class evaluated {
    public int evaluate(char [][]isavil,char ai){
        char player;
        int totoalnumber=0;
        if(ai=='1'){
            player='2';
        }else player='1';
        String length_5=ai+ai+ai+ai+ai+"";
        String alive_4="0"+ai+ai+ai+ai+"0"+"";
        String died_41="0"+ai+ai+ai+ai+player+"";
        String died_42=ai+"0"+ai+ai+ai+"";
        String died_43=ai+ai+"0"+ai+ai+"";
        String died_44=ai+ai+ai+"0"+ai+"";
        String died_45=player+ai+ai+ai+ai+"0"+"";
        String alive_31="0"+ai+ai+ai+"0"+"";
        String alive_32=ai+"0"+ai+ai+"";
        String alive_33=ai+ai+"0"+ai+"";
        String died_31="0"+"0"+ai+ai+ai+player+"";
        String died_32="0"+ai+"0"+ai+ai+player+"";
        String died_33="0"+ai+ai+"0"+ai+player+"";
        String died_34=ai+"0"+"0"+ai+ai+"";
        String died_35=ai+"0"+ai+"0"+ai+"";
        String died_36=player+"0"+ai+ai+ai+"0"+player+"";
        String died_37=player+ai+ai+ai+"0"+"0"+"";
        String died_38=player+ai+ai+"0"+ai+"0"+"";
        String died_39=player+ai+"0"+ai+ai+"0"+"";
        String died_310=ai+ai+"0"+"0"+ai+"";
        String alive_21="0"+"0"+ai+ai+"0"+"0"+"";
        String alive_22="0"+ai+"0"+ai+"0"+"";
        String alive_23=ai+"0"+"0"+ai+"";
        String died_21="0"+"0"+"0"+ai+ai+player+"";
        String died_22="0"+"0"+ai+"0"+ai+player+"";
        String died_23="0"+ai+"0"+"0"+ai+player+"";
        String died_24=ai+"0"+"0"+"0"+ai+"";
        String died_25=player+ai+ai+"0"+"0"+"0"+"";
        String died_26=player+ai+"0"+ai+"0"+"0"+"";
        String died_27=player+ai+"0"+"0"+ai+"0"+"";
        String alive_1="0"+ai+"0"+"";
        String []model=new String[88];
        for(int k=0;k<15;k++) {
            //横线
                for (int j = 0; j < 15; j++) {
                    model[k] += isavil[k][j];
                }
        }
        for(int k=0;k<15;k++) {
            //竖线
                for (int j = 0; j < 15; j++) {
                    model[15 + k] += isavil[j][k];
                }

        }
        //斜线
        for(int m=0;m<15;m++) {
            for (int j = 14-m, k = 0; j >= 0 && k <= 14; j--, k++) {
                model[30+ m] += isavil[j][k];
            }
        }
        for(int m=0;m<14;m++) {
                for (int j = 14, k = 14 - m; j >= 0 && k <= 14; j--, k++) {
                    model[45+m] += isavil[j][k];
                }
        }
        for(int m=0;m<15;m++) {
                for (int j = m, k = 0; j <= 14 && k <= 14; j++, k++) {
                    model[59 + m] += isavil[j][k];
                }
        }
        for(int m=0;m<14;m++) {
                for (int j = 0, k = m; j <= 14 && k <= 14; j++, k++) {
                    model[74+m] += isavil[j][k];
                }
        }
        for(int i=0;i<88;i++){
            if(model[i].contains(length_5)){
                totoalnumber+=100000;
            }
            if(model[i].contains(alive_4)){
                totoalnumber+=10000;
            }
            if(model[i].contains(died_41)){
                totoalnumber+=1000;
            }
            if(model[i].contains(died_42)){
                totoalnumber+=1000;
            }
            if(model[i].contains(died_43)){
                totoalnumber+=1000;
            }
            if(model[i].contains(died_44)){
                totoalnumber+=1000;
            }
            if(model[i].contains(died_45)){
                totoalnumber+=1000;
            }
            if(model[i].contains(alive_31)){
                totoalnumber+=1000;
            }
            if(model[i].contains(alive_32)){
                totoalnumber+=1000;
            }
            if(model[i].contains(alive_33)){
                totoalnumber+=1000;
            }
            if(model[i].contains(died_31)){
                totoalnumber+=100;
            }
            if(model[i].contains(died_32)){
                totoalnumber+=100;
            }
            if(model[i].contains(died_33)){
                totoalnumber+=100;
            }
            if(model[i].contains(died_34)){
                totoalnumber+=100;
            }
            if(model[i].contains(died_35)){
                totoalnumber+=100;
            }
            if(model[i].contains(died_36)){
                totoalnumber+=100;
            }
            if(model[i].contains(died_37)){
                totoalnumber+=100;
            }
            if(model[i].contains(died_38)){
                totoalnumber+=100;
            }
            if(model[i].contains(died_39)){
                totoalnumber+=100;
            }
            if(model[i].contains(died_310)){
                totoalnumber+=100;
            }
            if(model[i].contains(alive_21)){
                totoalnumber+=100;
            }
            if(model[i].contains(alive_22)){
                totoalnumber+=100;
            }
            if(model[i].contains(alive_23)){
                totoalnumber+=100;
            }
            if(model[i].contains(died_21)){
                totoalnumber+=10;
            }
            if(model[i].contains(died_22)){
                totoalnumber+=10;
            }
            if(model[i].contains(died_23)){
                totoalnumber+=10;
            }
            if(model[i].contains(died_24)){
                totoalnumber+=10;
            }
            if(model[i].contains(died_25)){
                totoalnumber+=10;
            }
            if(model[i].contains(died_26)){
                totoalnumber+=10;
            }
            if(model[i].contains(died_27)){
                totoalnumber+=10;
            }
            if(model[i].contains(alive_1)){
                totoalnumber+=10;
            }
            //System.out.println(model[i]);
        }
        //System.out.println(totoalnumber);
       /* for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(isavil[i][j]);
            }
            System.out.println();
        }
        */
        return totoalnumber;
    }
}

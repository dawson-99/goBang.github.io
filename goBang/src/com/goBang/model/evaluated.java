package com.goBang.model;


public class evaluated {
    char ai;
    evaluated(char a){
        ai=a;
    }
    public int evaluate(char [][]isavil){
        char player;
        int totoalnumber=0;
        if(ai=='1'){
            player='2';
        }else player='1';
        String length_5=ai+ai+ai+ai+ai+"";
        String alive_4='0'+ai+ai+ai+ai+'0'+"";
        String died_41='0'+ai+ai+ai+ai+player+"";
        String died_42=ai+'0'+ai+ai+ai+"";
        String died_43=ai+ai+'0'+ai+ai+"";
        String died_44=ai+ai+ai+'0'+ai+"";
        String died_45=player+ai+ai+ai+ai+'0'+"";
        String alive_31='0'+ai+ai+ai+'0'+"";
        String alive_32=ai+'0'+ai+ai+"";
        String alive_33=ai+ai+'0'+ai+"";
        String died_31='0'+'0'+ai+ai+ai+player+"";
        String died_32='0'+ai+'0'+ai+ai+player+"";
        String died_33='0'+ai+ai+'0'+ai+player+"";
        String died_34=ai+'0'+'0'+ai+ai+"";
        String died_35=ai+'0'+ai+'0'+ai+"";
        String died_36=player+'0'+ai+ai+ai+'0'+player+"";
        String alive_21='0'+'0'+ai+ai+'0'+'0'+"";
        String alive_22='0'+ai+'0'+ai+'0'+"";
        String alive_23=ai+'0'+'0'+ai+"";
        String died_21='0'+'0'+'0'+ai+ai+player+"";
        String died_22='0'+'0'+ai+'0'+ai+player+"";
        String died_23='0'+ai+'0'+'0'+ai+player+"";
        String died_24=ai+'0'+'0'+'0'+ai+"";
        String alive_1='0'+ai+'0'+"";
        String []model=new String[59];
        //横线
        for(int i=0;i<15;i++){
            for(int j=0;j<15;j++){
                model[i]+=isavil[i][j];
            }
        }
        //竖线
        for(int i=0;i<15;i++){
            for(int j=0;j<15;j++){
                model[model.length+i]+=isavil[j][i];
            }
        }
        //斜线
        for(int i=14;i>=0;i--){
            for(int j=14-i,k=0;j>=0&&k<=14;j--,k++){
               model[model.length+14-i]+=isavil[j][k];
            }
        }
        for(int i=13;i>=0;i--){
            for(int j=14,k=14-i;j>=0&&k<=14;j--,k++) {
                model[model.length + 13 - i] += isavil[j][k];
            }
        }
        for(int i=0;i<=14;i++){
            for(int j=14-i,k=0;j<=14&&k<=14;j++,k++){
                model[model.length+i]+=isavil[j][k];
            }
        }
        for(int i=13;i>=0;i--){
            for(int j=0,k=14-i;j<=14&&k<=14;j++,k++){
                model[model.length+13-i]+=isavil[j][k];
            }
        }
        for(int i=0;i<59;i++){
            if(model[i]==length_5){
                totoalnumber+=100000;
            }
            if(model[i]==alive_4){
                totoalnumber+=10000;
            }
            if(model[i]==died_41){
                totoalnumber+=1000;
            }
            if(model[i]==died_42){
                totoalnumber+=1000;
            }
            if(model[i]==died_43){
                totoalnumber+=1000;
            }
            if(model[i]==died_44){
                totoalnumber+=1000;
            }
            if(model[i]==alive_31){
                totoalnumber+=1000;
            }
            if(model[i]==alive_32){
                totoalnumber+=1000;
            }
            if(model[i]==alive_33){
                totoalnumber+=1000;
            }
            if(model[i]==died_31){
                totoalnumber+=100;
            }
            if(model[i]==died_32){
                totoalnumber+=100;
            }
            if(model[i]==died_33){
                totoalnumber+=100;
            }
            if(model[i]==died_34){
                totoalnumber+=100;
            }
            if(model[i]==died_35){
                totoalnumber+=100;
            }
            if(model[i]==died_36){
                totoalnumber+=100;
            }
            if(model[i]==alive_21){
                totoalnumber+=100;
            }
            if(model[i]==alive_22){
                totoalnumber+=100;
            }
            if(model[i]==alive_23){
                totoalnumber+=100;
            }
            if(model[i]==died_21){
                totoalnumber+=10;
            }
            if(model[i]==died_22){
                totoalnumber+=10;
            }
            if(model[i]==died_23){
                totoalnumber+=10;
            }
            if(model[i]==died_24){
                totoalnumber+=10;
            }
            if(model[i]==alive_1){
                totoalnumber+=10;
            }
        }
        return 0;
    }
}

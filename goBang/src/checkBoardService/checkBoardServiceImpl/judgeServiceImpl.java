package checkBoardService.checkBoardServiceImpl;

import checkBoardService.judgeService;
import com.goBang.model.Board;

import java.util.HashMap;

import static checkBoardService.size.column;
import static checkBoardService.size.row;

public class judgeServiceImpl implements judgeService {

    //1代表黑棋、2代表白棋、0代表此处空
    //AI为白子
    public int judge(Board board, int x, int y) {
        int [][]chessValue=new int[row][column];
        THashMap tHashMap = null;
        HashMap<String, Integer> hashMap = new HashMap<>();//储存棋局可能出现的权值
        tHashMap.setValue(hashMap);
        String code = "";     //记录每个方向上的棋局情况。""+数字 ：自动转成字符串
        char color = '0';
        Integer value = 0;
        int max = 0,im=0,jm=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <column ; j++) {
                if (board.isolation[i][j] != 0)
                    continue;
                //向左:
                for (int k = i - 1; k >= 0; k--) {
                    if (board.isolation[k][j] == 0) {  //若紧邻的点也未落子，直接结束本循环
                        break;
                    } else if (color == 0) {
                        color = board.isolation[k][j];
                        code += board.isolation[k][j];
                    } else if(color != board.isolation[k][j]){ //若后面紧接着异色棋子，记录该棋子，结束循环
                        code += board.isolation[k][j];
                        break;
                    } else {
                        code += board.isolation[k][j];
                    }
                }
                value = hashMap.get(code);
                if (value != null) {
                    chessValue[i][j] += value;
                }
                code = "";
                color = 0;
                //向右:
                for (int k = i + 1; k <row; k++) {
                    if (board.isolation[k][j] == 0) {
                        break;
                    } else if (color == 0) {
                        color = board.isolation[k][j];
                        code += board.isolation[k][j];
                    } else if(color != board.isolation[k][j]){
                        code += board.isolation[k][j];
                        break;
                    } else {
                        code += board.isolation[k][j];
                    }
                }
                value = hashMap.get(code);
                if (value != null) {
                    chessValue[i][j] += value;
                }
                code = "";
                color = 0;
                //向上:
                for (int k = j - 1; k >= 0; k--) {
                    if (board.isolation[i][k] == 0) {
                        break;
                    } else if (color == 0) {
                        color = board.isolation[i][k];
                        code += board.isolation[i][k];
                    } else if(color != board.isolation[i][k]){
                        code += board.isolation[i][k];
                        break;
                    } else {
                        code += board.isolation[i][k];
                    }
                }
                value = hashMap.get(code);
                if (value != null) {
                    chessValue[i][j] += value;
                }
                code = "";
                color = 0;
                //向下:
                for (int k = j + 1; k < row; k++) {
                    if (board.isolation[i][k] == 0) {
                        break;
                    } else if (color == 0) {
                        color = board.isolation[i][k];
                        code += board.isolation[i][k];
                    } else if(color != board.isolation[i][k]){
                        code += board.isolation[i][k];
                        break;
                    } else {
                        code += board.isolation[i][k];
                    }
                }
                value = hashMap.get(code);
                if (value != null) {
                    chessValue[i][j] += value;
                }
                code = "";
                color = 0;




            }
        }
        return 0;
    }

    //AI为黑子
    public  int judge_2(Board board, int x , int y){

        return 0;
    }
}

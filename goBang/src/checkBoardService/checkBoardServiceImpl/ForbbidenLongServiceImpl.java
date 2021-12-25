package checkBoardService.checkBoardServiceImpl;

import checkBoardService.ForbbidenLongService;
import com.goBang.model.Board;

public class ForbbidenLongServiceImpl implements ForbbidenLongService {


    public boolean Forbidden(Board board, int x, int y) {


        int position_x = x;
        int position_y = y;


        //先将最左边的黑棋坐标找到，也有可能是棋盘边缘,此步骤从左上角开始
        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == '1') {
                position_x -= 1;
                position_y -= 1;
            } else {
                break;
            }
        }
        position_x += 1;//plus one to get the right position
        position_y += 1;
        int count = 0;//计算黑棋长连个数

        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == '1') {
                count++;
                position_x++;
                position_y++;
            }else{
                break;
            }
        }

        if (count > 5) {
            return true;
        }

        //////////////////左上

        //右上角开始计算

        position_x = x;
        position_y = y;

        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == '1') {
                position_x -= 1;
                position_y += 1;
            } else {
                break;
            }
        }
        position_x += 1;//plus one to get the right position
        position_y -= 1;
        count = 0;//计算黑棋长连个数

        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == '1') {
                count++;
                position_x++;
                position_y--;
            } else{
                break;
            }
        }

        if (count > 5) {
            return true;
        }

        //////////////////右上

        //最左边开始计算
        position_x = x;
        position_y = y;

        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == '1') {
                position_y -= 1;
            }  else {
                break;
            }
        }
        //plus one to get the right position
        position_y += 1;
        count = 0;//计算黑棋长连个数

        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == '1') {
                count++;
                position_y++;
            }else{
                break;
            }
        }

        if (count > 5) {
            return true;
        }

        //////////////////左边

        //最上边开始计算
        position_x = x;
        position_y = y;

        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == '1') {
                position_x -= 1;
            }  else {
                break;
            }
        }
        position_x += 1;//plus one to get the right position
        count = 0;//计算黑棋长连个数

        while(position_x > -1 && position_y > -1 &&  position_x < 15 && position_y < 15) {
            if (board.isolation[position_x][position_y] == '1') {
                count++;
                position_x++;
            }else{
                break;
            }
        }

        if (count > 5) {
            return true;
        }


        return false;
    };

}

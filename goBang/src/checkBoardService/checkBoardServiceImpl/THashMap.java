package checkBoardService.checkBoardServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class THashMap {
    HashMap<String, Integer> hashMap = new HashMap<>();//储存棋局可能出现的权值
    //白棋为AI
    public void setValue(HashMap<String, Integer> hashMap) {
        hashMap.put("1", 20);
        hashMap.put("11", 200);
        hashMap.put("111", 2000);
        hashMap.put("1111", 3000);
        hashMap.put("12", 10);
        hashMap.put("112", 100);
        hashMap.put("1112", 1000);
        hashMap.put("11112", 2000);
    }

    //黑棋为AI
    public void setValue_2(HashMap<String, Integer> hashMap) {
        hashMap.put("2", 20);
        hashMap.put("22", 200);
        hashMap.put("222", 2000);
        hashMap.put("2222", 3000);
        hashMap.put("21", 10);
        hashMap.put("221", 100);
        hashMap.put("2221", 1000);
        hashMap.put("22221", 2000);
    }
}

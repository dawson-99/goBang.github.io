package AIService;


import com.goBang.model.Board;

import java.awt.*;

public interface AIService {
    public void Find(Board board);
    public void InitSCore(Board board, char AI,char player);
    public Point Max();
}

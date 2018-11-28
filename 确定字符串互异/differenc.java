import java.util.*;

public class Different {
    public boolean checkDifferent(String iniString) {

        int length = iniString.length();

        //抽屉原理
        //ASCⅡ码0-255为字符
        if (length > 256) {
            return false;
        } else {
            for (int i = 0; i < length; i++) {
                char ch = iniString.charAt(i);
                for (int j = i + 1; j < length; j++) {
                    if (ch == iniString.charAt(j)) return false;
                }
            }
        }
        
        return true;
    }
}
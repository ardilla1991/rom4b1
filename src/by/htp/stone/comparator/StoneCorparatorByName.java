package by.htp.stone.comparator;

import java.util.Comparator;
import by.htp.stone.entity.Stone;

public class StoneCorparatorByName implements Comparator<Stone>{

    public int compare(Stone obj1, Stone obj2) {
        String str1 = obj1.getName();
        String str2 = obj2.getName();
       
        return str1.compareTo(str2);
    }
}

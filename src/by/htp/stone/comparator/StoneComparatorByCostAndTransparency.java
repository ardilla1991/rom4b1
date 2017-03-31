package by.htp.stone.comparator;

import java.util.Comparator;
import by.htp.stone.entity.Stone;

public class StoneComparatorByCostAndTransparency implements Comparator<Stone>{
	
    public int compare(Stone obj1, Stone obj2) {
        int sort = (int)(obj1.getCost() - obj2.getCost());
        if ( sort == 0 ) {
        	sort = (int)(obj1.getTransparency() - obj2.getTransparency());
        }
       
        return sort;
    }
}

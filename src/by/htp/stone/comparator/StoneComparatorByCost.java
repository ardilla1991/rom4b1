package by.htp.stone.comparator;

import java.util.Comparator;
import by.htp.stone.entity.Stone;

public class StoneComparatorByCost implements Comparator<Stone>{

	public int compare(Stone obj1, Stone obj2) {
		double cost1 = obj1.getCost();
		double cost2 = obj2.getCost();
		if ( cost1 < cost2 ) {
			return -1;
		} else if ( cost1 == cost2 ) {
			return 0;
		} else {
			return 1;
		}	
	}
}

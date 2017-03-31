package by.htp.stone.action;

import by.htp.stone.entity.Necklace;
import by.htp.stone.entity.Stone;

public class NecklaceActions {
	
	public Necklace sortStones(Necklace necklace) {
		Stone serviceEl;
		Necklace listSort = new Necklace();

		listSort = necklace;
		
		for ( int i = 0; i < listSort.getStonesArraySize(); i++ ) {
			for ( int j = i + 1; j < listSort.getStonesArraySize(); j++ ) {
				if ( listSort.getStones()[j].getCost() > listSort.getStones()[i].getCost() ) {
					serviceEl = listSort.getStones()[i];
					listSort.getStones()[i] = listSort.getStones()[j];
					listSort.getStones()[j] = serviceEl;
				}
			}
		}
		
		return listSort;
	}
}

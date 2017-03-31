package by.htp.stone.action;

import java.util.Scanner;

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
	
	public Stone[] getStonesWithDefinedTransparency(Necklace necklace) {
		Scanner inDouble = new Scanner(System.in);
		double transparencyFrom = inDouble.nextDouble();
		double transparencyTo = inDouble.nextDouble();
		inDouble.close();
		
		int counter = 0;
		for ( int i = 0; i < necklace.getStonesArraySize(); i++ ) {
			if ( necklace.getStones()[i].getTransparency() >= transparencyFrom 
					&& necklace.getStones()[i].getTransparency() <= transparencyTo) {
				necklace.getStones()[counter] = necklace.getStones()[i];
				counter++;
			}
		}
		Stone[] stonesTransparetcy = new Stone[counter];
		System.arraycopy(necklace.getStones(), 0, stonesTransparetcy, 0, counter);
		
		return stonesTransparetcy;
	}
}

package by.htp.stone.entity;

import java.util.Arrays;

public class Necklace {
	
	private Stone stones[] = new Stone[5];
	
	public void addStone(Stone stone) {
		stones = addStoneRecord(stones, stone);
	}
	
	public Stone[] addStoneRecord(Stone[] stones, Stone stone) {
		int emptyIndex = -1;
		while ( (emptyIndex = getEmptyStonesIndex()) == -1 ) {
			Stone[] serv = new Stone[stones.length + 5];
			for (int i = 0; i < stones.length; i++){
				serv[i] = stones[i];
			}
			stones = serv;
		}
		stones[emptyIndex] = stone;
		
		return stones;
	}
	
	private int getEmptyStonesIndex() {
		for ( int i = 0; i < stones.length; i++ ) {
			if ( stones[i] == null ) {
				return i;
			}
		}
		
		return -1;
	}
	
	public int getStonesArraySize() {
		for ( int i = 0; i < stones.length; i++ ) {
			if ( stones[i] == null) {
				return i;
			} else if ( i == stones.length - 1 ) { // if the last element is full
				return i + 1;
			}
		}
		
		return 0;
	}
	
	public Stone[] getStones() {
		return stones;
	}
	
	public double getPrice() {
		double price = 0.0;
		for ( int i = 0; i < getStonesArraySize(); i++ ) {
			price += stones[i].getCost();
		}
		
		return price;
	}
	
	public double getWeigth() {
		double weight = 0.0;
		for ( int i = 0; i < getStonesArraySize(); i++ ) {
			weight += stones[i].getWeight();
		}
		
		return weight;
	}

	@Override
	public String toString() {
		return "Necklace [stones=" + Arrays.toString(stones) + "]";
	}
}

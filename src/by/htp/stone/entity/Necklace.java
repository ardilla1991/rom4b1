package by.htp.stone.entity;

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
			if ( stones[i] == null ) {
				return i;
			}
		}
		
		return 0;
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
			System.out.println(stones[i].getWeight());
			weight += stones[i].getWeight();
		}
		
		return weight;
	}
	
	public Stone[] addStoneSortRecord(Stone[] stones, Stone stone) {
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
	
	public Stone[] getStones() {
		return stones;
	}
}

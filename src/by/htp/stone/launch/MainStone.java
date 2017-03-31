package by.htp.stone.launch;

import by.htp.stone.action.NecklaceActions;
import by.htp.stone.entity.*;

/*
 * ������� ���������� ����������, ��������������� ��������� �����������:
 * ������������ ����������� ���: ������, ������������, �����������, ������������.
 * ������ ����� ������ ����� ���������� ����� �������� � ������������� ������.
 * ������������ ������ ����������� ������ �����, ����� ��� ����� �����.
 * ��� ����������� ������ ���� ������������ ���������� �� ���������� ���� java code convention.
 * ������ ������ ���� �������� ��������� �� �������.
 * ���������� ���� ������ ���� �����������.
 * ��� �������� ���������� ������������� ����� ������������ �����.
 * 
 * �����. 
 * ���������� �������� ����������� � ��������������� ������.
 * �������� ����� ��� ��������. ���������� ����� ��� (� �������) � ���������.
 * �������� ���������� ������ �������� �� ������ ��������. 
 * ����� ����� � ��������, ��������������� ��������� ��������� ���������� ������������.
 */
public class MainStone {
	
	public static void main(String[] args) {
		
		Stone stone1 = new Precious("almaz", 0.1, 10, 0.1);
		Stone stone2 = new Precious("rubin", 0.1, 12, 0.1);
		Stone stone3 = new Precious("izumrud", 0.1, 4, 0.1);
		Stone stone4 = new Precious("sapfir", 0.1, 9, 0.1);
		
		Stone stone5 = new Semiprecious("lazurit", 0.2, 1, 0.4);
		Stone stone6 = new Semiprecious("malahit", 0.2, 3, 0.4);
		Stone stone7 = new Semiprecious("yantar", 0.2, 2, 0.4);
		Stone stone8 = new Semiprecious("hrustal", 0.2, 7, 0.4);
		Stone stone9 = new Semiprecious("rodonit", 0.2, 5, 0.4);
		
		Necklace necklace = new Necklace();
		necklace.addStone(stone1);
		necklace.addStone(stone3);
		necklace.addStone(stone5);
		necklace.addStone(stone7);
		necklace.addStone(stone7);
		System.out.println(necklace);
		
		System.out.print("Necklace's cost is ");
		System.out.println(necklace.getPrice());
		
		System.out.print("Necklace's weight is ");
		System.out.println(necklace.getWeigth());
		
		NecklaceActions necklaceActions = new NecklaceActions();
		Necklace necklaceSort = necklaceActions.sortStones(necklace);
		System.out.println("Sort by cost ");
		System.out.println(necklaceSort);
		
		Stone[] stonesTransparency = necklaceActions.getStonesWithDefinedTransparency(necklace);
		System.out.println("Get stones with defined transparency interval ");
		for ( int i = 0; i < stonesTransparency.length; i++ ) {
			System.out.println("name=" + stonesTransparency[i].getName() 
					+ "; weight=" + stonesTransparency[i].getWeight() 
					+ "; cost=" + stonesTransparency[i].getCost()
					+ "; transparency=" + stonesTransparency[i].getTransparency());
		}
	}
	
}

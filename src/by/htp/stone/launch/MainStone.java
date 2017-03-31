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
 * �����. ���������� �������� ����������� � ��������������� ������.
 * �������� ����� ��� ��������. ���������� ����� ��� (� �������) � ���������.
 * �������� ���������� ������ �������� �� ������ ��������. ����� ����� � ��������, 
 * ��������������� ��������� ��������� ���������� ������������.
 */
public class MainStone {
	
	public static void main(String[] args) {
		
		Stone stone1 = new Precious("almaz", 0.1, 15, 0.1);
		Stone stone2 = new Precious("rubin", 0.1, 15, 0.1);
		Stone stone3 = new Precious("izumrud", 0.1, 15, 0.1);
		Stone stone4 = new Precious("sapfir", 0.1, 15, 0.1);
		
		Stone stone5 = new Semiprecious("lazurit", 0.2, 5, 0.4);
		Stone stone6 = new Semiprecious("malahit", 0.2, 5, 0.4);
		Stone stone7 = new Semiprecious("yantar", 0.2, 5, 0.4);
		Stone stone8 = new Semiprecious("hrustal", 0.2, 5, 0.4);
		Stone stone9 = new Semiprecious("rodonit", 0.2, 5, 0.4);
		
		Necklace necklace = new Necklace();
		necklace.addStone(stone1);
		necklace.addStone(stone3);
		necklace.addStone(stone5);
		necklace.addStone(stone7);
		necklace.addStone(stone7);
		
		System.out.print("Necklace's cost is ");
		System.out.println(necklace.getPrice());
		
		System.out.print("Necklace's weight is ");
		System.out.println(necklace.getWeigth());
		
		NecklaceActions necklaceActions = new NecklaceActions();
		
		Necklace necklace2 = necklaceActions.sortStones(necklace);
		System.out.println(necklace2);
	}
	
}

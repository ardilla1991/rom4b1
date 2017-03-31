package by.htp.stone.launch;

import java.util.Arrays;

import by.htp.stone.action.NecklaceActions;
import by.htp.stone.comparator.StoneComparatorByCost;
import by.htp.stone.comparator.StoneCorparatorByName;
import by.htp.stone.comparator.StoneComparatorByCostAndTransparency;
import by.htp.stone.entity.*;

/*
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
 * Каждый класс должен иметь отражающее смысл название и информативный состав.
 * Наследование должно применяться только тогда, когда это имеет смысл.
 * При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * Классы должны быть грамотно разложены по пакетам.
 * Консольное меню должно быть минимальным.
 * Для хранения параметров инициализации можно использовать файлы.
 * 
 * Камни. 
 * Определить иерархию драгоценных и полудрагоценных камней.
 * Отобрать камни для ожерелья. Подсчитать общий вес (в каратах) и стоимость.
 * Провести сортировку камней ожерелья на основе ценности. 
 * Найти камни в ожерелье, соответствующие заданному диапазону параметров прозрачности.
 */
public class MainStone {
	
	public static void main(String[] args) {
		
		Stone stone1 = new Precious("almaz", 0.1, 10, 0.1);
		Stone stone2 = new Precious("rubin", 0.1, 12, 0.7);
		Stone stone3 = new Precious("izumrud", 0.1, 4, 0.3);
		Stone stone4 = new Precious("sapfir", 0.1, 9, 0.07);
		
		Stone stone5 = new Semiprecious("lazurit", 0.2, 1, 0.2);
		Stone stone6 = new Semiprecious("malahit", 0.2, 3, 0.04);
		Stone stone7 = new Semiprecious("yantar", 0.2, 2, 0.33);
		Stone stone8 = new Semiprecious("hrustal", 0.2, 7, 0.56);
		Stone stone9 = new Semiprecious("rodonit", 0.2, 5, 0.23);
		
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
		
		Stone[] stoneSort = necklace.getStones();
		Arrays.sort(stoneSort);
		System.out.println("Стандартная сортировка для массива объектов"
				+ " Stone:\n"+Arrays.toString(stoneSort));
		
		System.out.println("Sort with Comporator");
		Arrays.sort(stoneSort, new StoneComparatorByCost());
		System.out.println("Сортируем по cost:\n"+Arrays.toString(stoneSort));
		
		Arrays.sort(stoneSort, new StoneCorparatorByName());
		System.out.println("Сортируем по name:\n"+Arrays.toString(stoneSort));

		Arrays.sort(stoneSort, new StoneComparatorByCostAndTransparency());
		System.out.println("Сортируем по cost and transparency:\n"+Arrays.toString(stoneSort));
		
		//Comparator<Stone> comparator = new StoneComporator();
	}
	
}

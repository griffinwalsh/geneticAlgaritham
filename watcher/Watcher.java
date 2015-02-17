package geneticAlgaritham.watcher;

import geneticAlgaritham.organism.Organism;
import geneticAlgaritham.world.World;

public class Watcher {
public static double numOfOrganisms = 10;
public static double avarageMoney;
public static double money;
public static Organism[] organismArray = new Organism[10];


	public static void main(String[] args) {
		
		World.runWorld();
		
		organismArray = World.organismArray;
		
		for (int i = 0 ; i < organismArray.length ; i++) {	
			money = organismArray[i].getMoney();	
			avarageMoney += money;
				}
		avarageMoney /= numOfOrganisms;	
		System.out.println("the avarage money is " + avarageMoney);
		
		
	}
}

		
//public void setOrganismArray(Organism[] organismArray) {
//	this.organismArray = organismArray;
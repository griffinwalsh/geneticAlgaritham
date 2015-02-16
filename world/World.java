package geneticAlgaritham.world;


import java.util.Random;

import geneticAlgaritham.organism.Organism;

public class World {
	
	Organism[] organismArray = new Organism[10];
	public static int organismID = 1;
	public static int time = 1;
	public static int maxTime = 10;
	public static double money;
	public static double randInt(int min, int max) {

	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	  
	    int randomInt = rand.nextInt((max - min) + 1) + min;
	  
	    double randomNumber = randomInt;
	    return randomNumber;
	    
	}
	public static void main(String[] args) {
	

			
		Organism[] organism = new Organism[10];
			for (int i = 0 ; i < organism.length ; i++) {
				organism[i] = new Organism();
				organism[i].setOrganismID(organismID);
				organismID++;
				
		}
		while (time < maxTime) {
			for (int i = 0; i < organism.length; i++) {		
				money = organism[i].getMoney();
				money += randInt(0,10);
				System.out.println(money);
				int organismID;
				organismID = organism[i].getOrganismID();
				System.out.println(organismID);
				organism[i].setMoney(money);
				 }
			time++;
			}
		
		}
	
		
		
}
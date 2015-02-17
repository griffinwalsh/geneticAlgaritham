package geneticAlgaritham.world;


import java.util.Random;

import geneticAlgaritham.organism.Organism;

public class World {
	
	public static Organism[] organismArray = new Organism[10];
	public static int organismID = 1;
	public static int time = 1;
	public static int maxTime = 10;
	public static double WMoney;
	public static double randInt(int min, int max) {

	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	  
	    int randomInt = rand.nextInt((max - min) + 1) + min;
	  
	    double randomNumber = randomInt;
	    return randomNumber;
	    
	}
	
	public static void runWorld() {
	

			
		
			for (int i = 0 ; i < organismArray.length ; i++) {
				organismArray[i] = new Organism();
				organismArray[i].setOrganismID(organismID);
				organismID++;
				
		}
		while (time <= maxTime) {
			System.out.println("Time Period " + time);
			for (int i = 0; i < organismArray.length; i++) {		
				WMoney = organismArray[i].getMoney();
				WMoney += randInt(0,10);
				organismID = organismArray[i].getOrganismID();
				organismArray[i].setMoney(WMoney);
				System.out.println("Organism " + organismID + " has $" + WMoney);
				 }
			time++;
			}

		
		}
//	public Organism[] getOrganismArray() {
//		return organismArray;
//    }
}
    


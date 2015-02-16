package geneticAlgaritham.organism;


public class Organism {

	public double money;
	public int organismID;
	

	
	public Organism() {
//		assign organism(organismNumber) a rule set
		money = 1000;	
		
	
			
		}

	public double getMoney() {
		return money;
		}
	public void setMoney(double money) {
		this.money = money;
	}
	
	public int getOrganismID() {
		return organismID; 
		}
	public void setOrganismID(int organismID) {
		this.organismID = organismID;
	}
		
	}
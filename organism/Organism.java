package geneticAlgaritham.organism;


public class Organism {

	public double Omoney;
	public int organismID;
	public double faith;
	
	
	public Organism() {
		Omoney = 1000;	
		
	
			
		}

	public double getMoney() {
		return Omoney;
		}
	public void setMoney(double money) {
		this.Omoney = money;
	}
	
	public int getOrganismID() {
		return organismID; 
		}
	public void setOrganismID(int organismID) {
		this.organismID = organismID;
	}
	
	public double getFaith() {
		return faith;
	}
	public void setFaith(double faith) {
	this.faith = faith;
	}
	}
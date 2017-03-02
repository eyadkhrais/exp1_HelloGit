package com.mycompany.exp1.village;

public class Village implements HasVillagers, GrowingVillage{
	private int numberOfVillagers;
	
	public Village(int numberOfVillagers){
		this.numberOfVillagers = numberOfVillagers;
	};
	@Override
	public int countOfVillagers() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int addVillagers(int addVillagers) {
		numberOfVillagers +=addVillagers;
		return numberOfVillagers;
	}

}

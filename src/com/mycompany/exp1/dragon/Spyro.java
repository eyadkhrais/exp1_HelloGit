/**
 * 
 */
package com.mycompany.exp1.dragon;

import com.mycompany.exp1.village.Village;

/**
 * @author eyad
 *
 */
public class Spyro extends Mushu {
	private Village village2eat;
	public Spyro(Village village2eat)
	{
		this.village2eat = village2eat;
		
	}
	
	@Override
	public boolean eatVillage(Village village) {
		// TODO Auto-generated method stub
		return true;
	}
}

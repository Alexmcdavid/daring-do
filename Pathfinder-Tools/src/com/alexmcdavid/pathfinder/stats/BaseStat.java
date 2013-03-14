/**
 * 
 */
package com.alexmcdavid.pathfinder.stats;

/**
 * @author Alexis
 *
 * BaseStats are the funadmental attributes, like strength. They rarely change.
 */
public class BaseStat extends Stat {
	
	//public for inheritance
	public int value;
	public int modifier;
	
	//Constructor when given an initial value
	public BaseStat(int initialValue){
		value = initialValue;
		modifier = calcModifier(value);
	}
	
	//Constructor with no initial value
	public BaseStat() {
		value = 0;
	}
	
	//Set value and calculate modifier for new value
	public void setValue(int target) {
		value = target;
		modifier = calcModifier(value);
	}
	
	public int getValue() {
		return value;
	}
	
	//Uses the BaseStat's value to calculate the modifier for the stat
	public int calcModifier(int statval) {
		
		int bonus = statval;
		bonus = bonus / 2;
		bonus = bonus - 5;
		return bonus;
	}
	
	public int getModifier() {
		return modifier;
	}

}

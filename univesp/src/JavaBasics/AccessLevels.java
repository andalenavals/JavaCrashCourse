package JavaBasics;

import BankServices.Data;

/* Modifier		Class	Package		Subclass	World
 * private		Y			N			N		N
 * public		Y			Y			Y		Y
 * protected	Y			Y			Y		N
 * no modifier	Y			Y			Y		N
 * (default)
 */ 
public class AccessLevels {
	private String name;
	private int age;
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args){
		Data today = new Data(12,10,2020);
		Data tomorrow = new Data(13,10,2020);
		System.out.println("Today day is: " +today.dia); //dia is a private attribute
		//System.out.println("Today day is: " +today.getDia());
	}
	
	
}


package BankServices;

public class Data implements Cloneable{
	public int dia;
	private int mes;
	private int ano;
	
	public static void main(String[] args){
		Data today = new Data(12,10,2020);
		Data tomorrow = new Data(13,10,2020);
		System.out.println("Today is: " +today.toString());
		System.out.println("Tomorrow is: " +tomorrow.toString());
		
		today.setData(today.dia+7, today.mes, today.ano);
		System.out.println("Today +7 is: " +today.toString());
		
		//Lets invert Dates
		today.trocarCom(tomorrow);
		System.out.println("Today is: " +today.toString());
		System.out.println("Tomorrow is: " +tomorrow.toString());
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning not allowed");
			return this;
		}
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setData(int dia, int mes, int ano) {
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	public String toString() {
		return dia+"/"+mes+"/"+ano;
		//String na = Integer.toString(dia)+"/"+Integer.toString(mes)+"/"+Integer.toString(ano);
		//return na;	
	}
	
	public void trocarCom(Data a) {
		Data aux = new Data(this.dia,this.mes,this.ano);
		this.setData(a.dia, a.mes, a.ano);
		a.setData(aux.dia, aux.mes, aux.ano);
	}
	
}

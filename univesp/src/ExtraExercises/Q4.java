package ExtraExercises;


public class Q4 {

	public static void main(String[] args) {

		int a =2;
		int b= 3;
		
		//Troca(a,b);
		
		// Troca inside main
		// int aux=a;
		// a=b;
		// b=aux;
		
		a = swap(b, b = a);
		
		System.out.println(a);
		System.out.println(b);

	}
	
	public static void Troca(int a, int b) {
		// java does not pass by reference 
		// c++ like 
		// void swap(int &a, int &b) 
		int aux=a;
		a=b;
		b=aux;			
	}
	
	public static int swap(int... args) {
		 return args[0];
	}

}

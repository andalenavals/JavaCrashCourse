package EmployeeExample;

public class Test {

	public static void main(String[] args) {
		Comparable [] vec= new Employee[4];
		vec[0]=new Employee(11, "Jesus");
		vec[1]=new Employee(10, "Maria");
		vec[2]=new Employee(1,"Jose");
		vec[3]=new Employee(9,"Noe");
		ordenSelection(vec, vec.length);
		for (int i = 0; i < vec.length; i++) {
			System.out.println(vec[i]);
		}

	}
	public static void  ordenSelection(Comparable[] vec, int n ) {
		for (int i = 0; i <= n-2; i++) {
			int min=i;
			for (int j = i+1; j <= n-1; j++) {
				if (vec[j].compareTo(vec[min]) < 0) {
					min=j;
				}
				Comparable aux= vec[min];
				vec[min]=vec[i];
				vec[i]=aux;
			}
		}
	}
}

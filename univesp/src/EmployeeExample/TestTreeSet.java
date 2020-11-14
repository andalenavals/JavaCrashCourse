package EmployeeExample;
import java.util.*;
public class TestTreeSet {
	public static void main(String[] args) {
		Set<Employee> s=new TreeSet<Employee>();
		s.add(new Employee(11, "Manoel" ));
		Employee l=new Employee(10,"Luiz");
		s.add(l);
		s.add(new Employee(1, "Fernando" ));
		s.add(new Employee(9, "Lina" ));
		System.out.println(s);
		System.out.println("Primeiro"+((TreeSet)s).first());
		System.out.println("Elementos menores"+((TreeSet)s).headSet(l));


	}
}

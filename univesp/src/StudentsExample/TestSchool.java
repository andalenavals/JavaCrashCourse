package StudentsExample;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;


public class TestSchool {
	public static void main(String[] args) {
	Student e1= new Student(123,"Jesus", 10.0);
	Student e2= new Student(124,"Maria", 7.0);
	Student e3= new Student(125,"Jose", 8.5);
	Student e4= new Student(222,"Teresa", 1.0);
	
	List <Student> list1 = new LinkedList<Student>();
	List <Student> list2 = new ArrayList<Student>();
	
	list1.add(e1);
	list1.add(e2);
	list2.add(e3);
	list2.add(e4);
	
	Turma t1 = new Turma(list1);
	Turma t2 = new Turma(list2);
	t1.updateMedia();	
	t2.updateMedia();
	System.out.println("1"+t1.toString());
	//System.out.println("2"+t2.toString());
	//System.out.println("Aluno com maio nota "+t1.bestStudent());
	//System.out.println("Aluno com maio nota "+t2.bestStudent());
	e1.setNota(7.0);
	t1.updateMedia();
	System.out.println("1"+t1.toString());

	//t1.mergeTurmas(t2);
	//System.out.println("1"+t1.toString());
	//System.out.println("2"+t2.toString());
	
	}
}

package StudentsExample;

import EmployeeExample.Employee;

public class Student implements Comparable {
	private int id;
	private String nome;
	private double nota;
	public Student(int id, String nome, double nota){
		this.id=id;
		this.nome=nome;
		this.nota=nota;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", nome=" + nome + ", nota=" + nota + "]";
	}
	
	@Override
	public int compareTo(Object obj) {
		return Double.compare(this.nota, ((Student) obj).nota) ;
	}
	
	
	
	
	
	

}

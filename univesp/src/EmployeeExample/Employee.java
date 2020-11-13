package EmployeeExample;

public class Employee implements Comparable {
	private int id;
	private String nome;
	
	public Employee(int id, String nome) {
		this.id=id;
		this.nome=nome;
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
	
	//public int compareTo(Object obj) {
	//	return this.id-((Employee) obj).getId();
	// }
	
	public int compareTo(Object obj) {
		return this.nome.compareTo(((Employee)obj).getNome());
	}

	public String toString() {
		return "Employee [id=" + id + ", nome=" + nome + "]";
	}
	
	

}

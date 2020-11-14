package StudentsExample;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class Turma {
	private List<Student> students;
	private double media;	
	public Turma(List<Student> students) {
		this.students=students;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "Turma [students=" + students + ", media=" + media + "]";
	}
	
	public void updateMedia() {
		double sum=0;
		for(Student obj:students) {
			sum+= obj.getNota(); 
		}
		this.media=sum/students.size();
	}
	
	public Student bestStudent() {
		return Collections.max(students);
	}
	
	public List<Student> approvedStudents(){
		List <Student> appstudents= new LinkedList();
		for(Student obj:students) {
			if (obj.getNota()>= 5.0) {
				appstudents.add(obj);
			}
		}		
		return appstudents; 
	}
	
	public void mergeTurmas(Turma A) {
		students.addAll(A.getStudents());
		this.updateMedia();
		A.getStudents().clear();
		A.media=0;
	}
	
	

}

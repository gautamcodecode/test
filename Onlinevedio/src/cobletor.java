import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student implements Comparable<student>{
	
	@Override
	public int compareTo(student stud) {
		// TODO Auto-generated method stub
		return this.name.compareTo(stud.name)>0?1:-1;
		
	}
	public int id;
	public String name;
	public int salary;
	public String position;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public student(int id, String name, int salary, String position) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.position = position;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", salary=" + salary + ", position=" + position + "]";
	}
	
	
}
public class cobletor {
	public static void main(String[] args) {
		List<student> stud=new ArrayList<>();
		stud.add(new student(29, "chaman", 2000, "chaprasi"));
		stud.add(new student(26, "manan", 1000, "bhikhari"));
		stud.add(new student(88, "sagan", 5000, "salesman"));
		stud.add(new student(8, "jaman", 1000, "manager"));
	System.out.println(stud);
//	comparable example
	
	Collections.sort(stud);
	System.out.println(stud);
//	Comparator<student> s=( s1,  s2)->  s1.getId()%10>s2.getId()%10?1:-1;
//	Comparator<student> d=(s3,s4)-> s3.getSalary()>s4.getSalary()?1:-1;	
	
Collections.sort(stud, (s1,s2)->  s1.getId()%10>s2.getId()%10?1:-1);
System.out.println(stud);
Collections.sort(stud, (s3,s4)-> s3.getSalary()>s4.getSalary()?1:-1);
	System.out.println(stud);
	}
}

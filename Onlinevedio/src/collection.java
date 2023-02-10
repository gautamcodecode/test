import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{
	int empid;
	String empname;
	int deptid;
	int salary;
	String status="on duty";
	int yearofjoining;
	
	public int getYearofjoining() {
		return yearofjoining;
	}
	public void setYearofjoining(int yearofjoining) {
		this.yearofjoining = yearofjoining;
	}
	public Employee(int empid, String empname, int deptid, int salary, String status, int yearofjoining) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.deptid = deptid;
		this.salary = salary;
		this.status = status;
		this.yearofjoining = yearofjoining;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", deptid=" + deptid + ", salary=" + salary
				+ ", status=" + status + ", yearofjoining=" + yearofjoining + "]";
	}
	
}
public class collection {
public static void main(String[] args) {
	List<Employee> emp=new ArrayList<>();
	emp.add(new Employee(101, "raju", 1, 4000, "on duty",2001));
	emp.add(new Employee(102, "kaju", 5, 5000, "off duty",2020));
	emp.add(new Employee(103, "maju", 1, 6000, "on duty",2009));
	emp.add(new Employee(104, "taju", 2, 7000, "off duty",2015));
	emp.add(new Employee(105, "saju", 5, 8000, "on duty",2014));
	emp.add(new Employee(106, "haju", 2, 9000, "off duty",2011));
	emp.add(new Employee(107, "jaju", 1, 10000, "on duty",2010));
//	in each department generate list of employee
	Map<Integer,List<Employee>> emplistbasedondept=emp.stream().collect(Collectors.groupingBy(Employee::getDeptid,Collectors.toList()));
//	Map<Integer,List<Employee>> emplistbasedondept=emp.stream().collect(Collectors.groupingBy(Employee::getDeptid));

	emplistbasedondept.entrySet().forEach(val->System.out.println(val.getKey()+"\n"+"----------"+val.getValue()));
	Map<Integer,List<Employee>> emplistbasedondep=emp.stream().collect(Collectors.groupingBy(e->e.getDeptid()));
	System.out.println(emplistbasedondep);
//	in each department count number of employee
	Map<Integer,Long> deptempcount= emp.stream().collect(Collectors.groupingBy(Employee::getDeptid, Collectors.counting()));
	deptempcount.entrySet().forEach(val->System.out.println("dept : "+val.getKey()+"    count: "+val.getValue()));
//	employee count of on and off duty
    Long offdutycount= emp.stream().filter(r->"off duty".equals(r.getStatus())).count();
    Long ondutycount= emp.stream().filter(r->"on duty".equals(r.getStatus())).count();
	System.out.println("off duty count:"+ offdutycount+ "  on duty count:"+ ondutycount);
//	get employee detail of min and max salary
	Optional<Employee> e1= emp.stream().max(Comparator.comparing(Employee::getSalary));
//	Optional<Employee> e2= emp.stream().min(Comparator.comparing(Employee::getSalary).reversed());

	Optional<Employee> e2= emp.stream().min(Comparator.comparing(Employee::getSalary));
	Optional<Employee> e3 = emp.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
//	second highest salary
	Optional<Employee> e4 = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
    System.out.println(e1.get().empname+"   "+e1.get().salary);
    System.out.println(e2); 
    System.out.println(e3);
    System.out.println(e4);
//    max salary from each dept
    Map<Integer,Optional<Employee>> topsalery=emp.stream().collect(Collectors.groupingBy(Employee::getDeptid,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
    topsalery.entrySet().forEach(val->System.err.println("dept : "+val.getKey()+"\n"+"emp " +val.getValue()));
    Map<Integer,Employee> topsaler=emp.stream().collect(Collectors.groupingBy(e->e.deptid,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(e->e.getSalary())), Optional::get)));
    System.out.println(topsaler);
    topsaler.entrySet().forEach(val->System.err.println("dept : "+val.getKey()+"\n"+"emp " +val.getValue()));
    Map<Integer,Optional<Employee>> topsalerrr=emp.stream().collect(Collectors.groupingBy(e->e.deptid,Collectors.maxBy(Comparator.comparingDouble(e->e.getSalary()))));
    topsalerrr.entrySet().forEach(val->System.err.println("dept : "+val.getKey()+"\n"+"emp " +val.getValue()));
    

//    most work experiance
    Optional<Employee> w=  emp.stream().min(Comparator.comparing(Employee::getYearofjoining));
    System.out.println("name : "+w.get().empname+"   "+"joining year : "+w.get().getYearofjoining());
//    most work experiance in each dept
    Map<Integer, Optional<Employee>> dd  =emp.stream().collect(Collectors.groupingBy(e->e.deptid, Collectors.minBy(Comparator.comparing(e->e.yearofjoining))));
    dd.entrySet().forEach(val->System.out.println("depatment id is : "+val.getKey()+"\n"+"employee is "+val.getValue()));
//    most work experiance in perticular department
    Map<Integer, Optional<Employee>> dd1  =emp.stream().filter(e->e.getDeptid()==2).collect(Collectors.groupingBy(e->e.deptid, Collectors.minBy(Comparator.comparing(e->e.yearofjoining))));
    dd1.entrySet().forEach(val->System.out.println("depatment id is : "+val.getKey()+"\n"+"employee is "+val.getValue()));
	Optional<Employee>gg=  emp.stream().filter(e->e.getDeptid()==1).min(Comparator.comparing(Employee::getYearofjoining));
	System.out.println("max exp in dept 1 is : "+"\n"+gg);
//	print name whose salary more then 7000
	emp.stream().filter(e->e.getSalary()>7000).map(e->e.getEmpname()).forEach(e->System.out.println(e));
}
}
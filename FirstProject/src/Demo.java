class Department{
    int id;
    String departmentName;

    public Department(){
        System.out.println("Department");
    }

    public Department(int id,String name) {
        this.id=id;
        departmentName=name;
    }

    public void display(){
        System.out.println("Name:::"+this.departmentName);
    }
}
class Employee extends Department {

    int empId;
    String empName;
    public Employee(){
        //super();
        System.out.println("Employee");
    }
    public Employee(int id,String name){
        //super(id,name);
        this.empId=id;
        this.empName=name;
        System.out.println("Employee parameterized");
    }
    @Override
    public void display() {
        System.out.println("Employee name:"+empName+empId);
    }
}
public class Demo{
    public static void main(String[] args) {
        Department d1=new Employee(101,"Bipin");
        d1.display();
        System.out.println(d1.id);
    }
}
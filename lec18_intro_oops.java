class Employee{
    int id;
    String name;
    int salary;

    public void printdetails() {
        System.out.println("my id is "+id);
        System.out.println("& my name is "+ name);
    }

    public int getSalary(int salary) {
        this.salary = salary;
        System.out.println("my salary is "+salary+"k");
    return 0;
    }
}

public class lec18_intro_oops {
    public static void main(String[] args) {
 Employee dhruv=new Employee();
 Employee john= new Employee(); // instantiating a new employee object
 //setting attributes for dhruv
        dhruv.id=9215;
        dhruv.name="dhruv";
        //setting attributes for john
        john.id=4235;
        john.name="john";
        //printing attributes
       dhruv.printdetails();
        System.out.println(dhruv.getSalary(34));
       john.printdetails();
        System.out.println(john.getSalary(12));
    }
}

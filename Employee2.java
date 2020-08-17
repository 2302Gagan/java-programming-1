import java.util.Arrays;
import java.util.List;

class Emp{
     private int empId, empSalary;
     private String empName, empDesignation, empLocation;

     //default constructor
     public Emp(){}

     public Emp(int empId, String empName, String empDesignation, int empSalary, String empLocation)
     {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
     }

     //getters and setters
    public int getEmpId(){
         return empId;
    }
    public void setEmpId(int empId){
         this.empId = empId;
    }

    public String getEmpName(){
         return empName;
    }
    public void setEmpName(String empName){
         this.empName = empName;
    }

    public String getEmpDesignation(){
         return empDesignation;
    }
    public void setEmpDesignation(String empDesignation){
         this.empDesignation = empDesignation;
    }

    public int getEmpSalary(){
         return empSalary;
    }
    public void setEmpSalary(int empSalary){
         this.empSalary = empSalary;
    }

    public String getEmpLocation(){
         return empLocation;
    }
    public void setEmpLocation(String empLocation){
         this.empLocation = empLocation;
    }

    //toString
    public String toString(){
         return "name: "+ empName;
    }


}
public class Employee2 {
    public static void main(String[] args)
    {
        List<Emp> info = Arrays.asList(
                new Emp(1,"Riya","MANAGER",40000,"Delhi"),
                new Emp(2,"Aman","CSE",50000,"Bangalore"),
                new Emp(3,"Aditya","SOFTWARE TESTER",57000,"Lucknow"),
                new Emp(4,"Chahat","SOFTWARE ANALYST",30000,"Gujarat"),
                new Emp(5,"Sanya","INTERIOR DESIGNER",55000,"Mumbai"),
                new Emp(6,"Nandini","ETHICAL HACKER",65000,"Rajasthan"),
                new Emp(7,"Mohit","ACCOUNTANT",510000,"Assam"),
                new Emp(8,"Sunny","LAWYER",70000,"Kerala"),
                new Emp(9,"Monica","TECHNICAL EXECUTIVE",75000,"Goa"),
                new Emp(10,"Gaurav","WEB DEVELOPER",60000,"Uttrakhand")
        );
        System.out.println("Employee Names: ");
        for (Emp emp : info) {
            System.out.println(emp.getEmpName());
        }

        System.out.println("\nEmployee Salaries greater than 50000: ");
        info.stream().filter(p-> p.getEmpSalary() > 50000).forEach(p-> System.out.println(p.getEmpName() +"\t"+ p.getEmpSalary()));

        System.out.println("\nEmployee Location starts with 'M': ");
        info.stream().filter(p-> p.getEmpLocation().startsWith("M")).forEach(p-> System.out.println(p.getEmpLocation()));

        System.out.println("\nEmployee Designation ends with 'E': ");
        info.stream().filter(p-> p.getEmpDesignation().endsWith("E")).forEach(p-> System.out.println(p.getEmpDesignation()));


    }
}

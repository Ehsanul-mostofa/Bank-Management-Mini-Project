public class Employee {
    
    private String name;
    private String empId;
    private double salary;
    
    Employee(String n, String eid, double sl) {
        this.setName(n);
        this.setEmpId(eid);
        this.setSalary(sl);
    }
    
    
    public void setName(String name){
      this.name=name;
    }
    public String getName(){
       return name;     
    }
    
    public void setEmpId(String empId){
      this.empId=empId;
    }
    public String getEmpId(){
       return empId;     
    }
    
    public void setSalary(double salary){
    this.salary=salary;
    }
    public double getSalary(){
    return salary;
    }
    
    public void showEmpInfo(){
    System.out.println("Employee " +this.getEmpId()+ "Details :");
    System.out.println("Name :   " +this.getName());
    System.out.println("Salary : " +this.getSalary());
    
    }
      
}

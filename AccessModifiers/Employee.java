package ClassPack;

public class Employee {
    
    private String name = "";
    private String jobTitle = "";
    private double attendance = 0.0;
    private double salary = 0.0;
 
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
 
    public String getjobTitle() {
        return jobTitle;
    }
 
    public void setjobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
 
    public double getattendance() {
        return attendance;
    }
 
    public void setattendance(Double attendance) {
        this.attendance = attendance;
    }
 
    public double getsalary() {
        return salary;
    }
 
    public void setsalary(double salary) {
        this.salary = salary;
    }
 
    public double totalSalary() {
        return attendance * salary;
    }

}

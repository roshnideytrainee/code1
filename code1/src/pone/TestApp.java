package pone;
import pone.EmpAddress;

import java.util.*;

class Employee implements Comparable<Employee> {
    private String empName;
    private int empId;
    private double empSalary;
    private List<EmpAddress> empAdd;

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", empSalary=" + empSalary +
                ", empAdd=" + empAdd +
                '}';
    }

    public String getEmpName() {

        return empName;
    }

    public Employee() {

        super();
    }

    public Employee(String empName, int empId, double empSalary, List<EmpAddress> empAdd) {
        super();
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
        this.empAdd = empAdd;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {

        this.empId = empId;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public List<EmpAddress> getEmpAdd() {
        return empAdd;
    }

    public void setEmpAdd(List<EmpAddress> empAdd) {
        this.empAdd = empAdd;
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.getEmpSalary() - o.getEmpSalary());
    }
}
class EmpNameSort implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}

class EmpIdSort implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getEmpId() < o2.getEmpId()) {
            return -1;
        } else if (o1.getEmpId() > o2.getEmpId()) {
            return 1;
        } else {
            return 0;
        }
    }

}
public class TestApp {
    public static void main(String[] args) {
        ArrayList<Employee> e = new ArrayList<>();
        e.add(new Employee("Roshni Dey", 101, 15000.0, Arrays.asList(new EmpAddress(10, "BB Street", "Hindmotor", "WestBengal", 705668))));
        e.add(new Employee("Sushmita Mandal", 102, 10000.0, Arrays.asList(new EmpAddress(11, "Rooker Lane", "kolkata", "WestBengal", 703289))));
        e.add(new Employee("Payel Singh", 103, 6749.5, Arrays.asList(new EmpAddress(12, "Park Street", "Santoshpur", "WestBengal", 100075))));
        e.add(new Employee("Pratyush Majumder", 104, 18000.0, Arrays.asList(new EmpAddress(13, "Taratala St", "Budge Budge", "WestBengal", 700035))));

        System.out.println("Original Employee Collection:");
        for (Employee temp : e) {
            System.out.println(temp.getEmpName() + " " + temp.getEmpId() + " " + temp.getEmpSalary() + " " + temp.getEmpAdd());
        }
        System.out.println("\nEmployee Collection sorting on  employee salary using comparable");
        Collections.sort(e);
        for (Employee temp : e) {
            System.out.println(temp.getEmpName() + " " + temp.getEmpId() + " " + temp.getEmpSalary() + " " + temp.getEmpAdd());
        }
        System.out.println("\nEmployee Collection after sorting on employee name using comparator");
        EmpNameSort nameSort = new EmpNameSort();
        Collections.sort(e, nameSort);
        for (Employee temp : e) {
            System.out.println(temp.getEmpName() + " " + temp.getEmpId() + " " + temp.getEmpSalary() + " " + temp.getEmpAdd());
        }
        //*****
        System.out.println("\nEmployee Collection after sorting on employee id using comparator");
        EmpIdSort idSort = new EmpIdSort();
        Collections.sort(e, idSort);
        for (Employee temp : e) {
            System.out.println(temp.getEmpName() + " " + temp.getEmpId() + " " + temp.getEmpSalary() + " " + temp.getEmpAdd());
        }

    }
}






package ru.pobeda;

public abstract class Employee {
    protected String empName;
    protected String empEmail;
    protected int empSalary;

    public Employee(String empName, String empEmail, int empSalary) {
        this.empName = empName;
        this.empEmail = empEmail;
        this.empSalary = empSalary;
    }

    public Employee() {

    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public abstract boolean isWorking();

    public  abstract void changeEmail(String s);


}

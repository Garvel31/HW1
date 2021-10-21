package ru.pobeda;

public class TeamLead extends Employee{

    private int cabinetNumber;
    private String department;
    private String password;
    private boolean isHealth = true;

    public boolean isHealth() {
        return isHealth;
    }

    public void setHealth(boolean health) {
        isHealth = health;
    }

    public int getCabinetNumber() {
        return cabinetNumber;
    }

    public void setCabinetNumber(int cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public  boolean isWorking() {
       return   isHealth;
    }

    @Override
    public void changeEmail(String newemail) {
        this.empEmail = newemail;
    }
}

package ru.pobeda;

public class Trainee extends Employee{

    private int grade = 0;
    private int monthsWorking;
    private boolean isHealth = true;


    public Trainee(int grade, int monthsWorking, boolean isHealth, String empName, String empEmail, int empSalary ) {
        super(empName, empEmail, empSalary);
        this.grade = grade;
        this.monthsWorking = monthsWorking;
        this.isHealth = isHealth;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getMonthsWorking() {
        return monthsWorking;
    }

    public void setMonthsWorking(int monthsWorking) {
        this.monthsWorking = monthsWorking;
    }

    public boolean isHealth() {
        return isHealth;
    }

    public void setHealth(boolean health) {
        isHealth = health;
    }

    @Override
    public  boolean isWorking() {
        return   isHealth;
    }

//переписали метод абстрактного класса
    @Override
    public void changeEmail(String s) {
        this.empEmail = this.empName + String.valueOf(grade) + "@gmail.com";
    }

    public void autoGradeChange(){
        if (monthsWorking > 3)
            grade = 1;
        System.out.println("grade: " + String.valueOf(grade));
    }
}

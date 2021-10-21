package ru.pobeda;

public class TeamLead extends Employee implements Manager{

    private int cabinetNumber;
    private String department;
    private String password;
    private boolean isHealth = true;


//конструктор класса с конструктором абстрактного класса
    public TeamLead(int cabinetNumber, String department, String password, boolean isHealth, String empName, String empEmail, int empSalary ) {
        super(empName, empEmail, empSalary);
        this.cabinetNumber = cabinetNumber;
        this.department = department;
        this.password = password;
        this.isHealth = isHealth;
    }


//Геттеры и сеттеры
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


//Методы абстрактного класса Employee
    @Override
    public  boolean isWorking() {
       return   isHealth;
    }

    @Override
    public void changeEmail(String s) {
    }

// метод класса TeamLead
    public void changePassword (String newPassword){
        if (newPassword.length() > 5)
            this.password = newPassword;
        else
            System.out.println("Слишком короткий пароль");
    }

//метод из интерфейса
    @Override
    public void shortInfo() {
        System.out.println("Сотрудник " + empName + " работает в: " + department + " кабинет номер: " + String.valueOf(cabinetNumber) );
    }
}

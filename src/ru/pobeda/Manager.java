package ru.pobeda;

public class Manager extends Employee{

    private int cabinetNumber;



    @Override
    public boolean isWorking() {
        return false;
    }

    @Override
    public String changeEmail() {
        return null;
    }
}

package ru.pobeda;

public class Developer extends Employee{

    private String language;
    private String favoriteTechnology;
    private boolean hasLaptop;

    public Developer(String empName, String empEmail, int empSalary, String language, String favoriteTehnology, boolean hasLaptop) {
        super(empName, empEmail, empSalary);
        this.language = language;
        this.favoriteTechnology = favoriteTehnology;
        this.hasLaptop = hasLaptop;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFavoriteTechnology() {
        return favoriteTechnology;
    }

    public void setFavoriteTechnology(String favoriteTechnology) {
        this.favoriteTechnology = favoriteTechnology;
    }

    public boolean isHasLaptop() {
        return hasLaptop;
    }

    public void setHasLaptop(boolean hasLaptop) {
        this.hasLaptop = hasLaptop;
    }

    @Override
    public boolean isWorking() {
        return false;
    }

    @Override
    public void changeEmail(String newemail) {
        this.empEmail = newemail;
    }

    public void stackInfo(){
        System.out.println("сотрудник работает с " + language);
    }
}

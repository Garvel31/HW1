package ru.pobeda;

public class Main {

    public static void main(String[] args) {

        Developer dev = new Developer("Alex", "111@mail.ru", 10000, "JAVA", "Spring", true);
        dev.stackInfo();

        TeamLead teamLead = new TeamLead(33, "development", "12345", true, "Andrey", "main@mail.ru",50000 );
        teamLead.shortInfo();

        Trainee trainee = new Trainee(0, 4,true, "Alexey", "alex@gmail.com", 5000);
        trainee.autoGradeChange();

    }



}

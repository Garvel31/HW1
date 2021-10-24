package ru.pobeda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Developer dev = new Developer("Alex", "111@mail.ru", 10000, "JAVA", "Spring", true);
        dev.stackInfo();

        TeamLead teamLead = new TeamLead(33, "development", "12345", true, "Andrey", "main@mail.ru",50000 );
        teamLead.shortInfo();

        Trainee trainee = new Trainee(0, 4,true, "Alexey", "alex@gmail.com", 5000);
        trainee.autoGradeChange();

        Developer dev2 = new Developer("Roman", "222@mail.ru", 14000, "Phyton", "SQL", true);

        TeamLead teamLead2 = new TeamLead(34, "development", "12345", true, "Kolya", "main@mail.ru",50000 );

        Trainee trainee2 = new Trainee(0, 4,true, "Pavel", "Pavel@gmail.com", 4000);


//Создаем HashSet
        Set<Employee> set = new HashSet<Employee>();
        set.add(dev);
        set.add(teamLead);
        set.add(trainee);
        set.add(dev2);
        set.add(teamLead2);
        set.add(trainee2);

//Создаем ArrayList
        ArrayList<Employee> myList = new ArrayList<>();

//Заполняем ArrayList
        myList.addAll(set);

//Проверяем заполнение  ArrayList
        for (Employee el1 : myList){
            System.out.println(el1.getEmpName());
        }

// -------------------------------------ЗАДАНИЕ 2---------------------------------------------------------
//1) Анонимный класс на основе класса Employee
        var employee2 = new Employee() {

            private String healthState;
            private int phoneNumber;

            public String getHealthState() {
                return healthState;
            }

            public void setHealthState(String healthState) {
                this.healthState = healthState;
            }

            public int getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(int phoneNumber) {
                this.phoneNumber = phoneNumber;
            }



            public void showPhoneNumber() {
                System.out.println(phoneNumber);
            }

            public void showName() {
                System.out.println(empName);
            }


            @Override
            public boolean isWorking() {
                System.out.println(healthState);
                return false;
            }

            @Override
            public void changeEmail(String newEmail) {

            }

        };
        employee2.setHealthState("Здоров");
        employee2.isWorking();

// 2) создаем список и фильтруем по salary
        List<Employee> inList = myList.stream()
                .filter(employee -> employee.getEmpSalary()>5000)
                .collect(Collectors.toList());

//Проверяем какие элементы попали в список
        for (Employee el2 : inList){
            System.out.println(el2.empSalary);
        }

//преобразовываем поток сотрудников и выбираем только email
            myList.stream()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

//Создаем лист в который поместим салари
        List<Integer> salaryList = new ArrayList<>();

            myList.stream()
                .map(employee -> {
                    salaryList.add(employee.getEmpSalary());
                    return salaryList;
                })
                    .forEach(System.out::println);

//ВОПРОС: получается что форич срабатывает после каждой итерации мар, а не в самом конце? На выходе получается:
/* [14000]
   [14000, 50000]
   [14000, 50000, 5000]
   [14000, 50000, 5000, 10000]
   [14000, 50000, 5000, 10000, 50000]
   [14000, 50000, 5000, 10000, 50000, 4000]
*/

    }

}

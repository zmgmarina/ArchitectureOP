package HW_Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Program1 {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(60000, 80000);
        int salary2 = random.nextInt(600, 800);
        int age = random.nextInt(20, 65);
        int experience = random.nextInt(1, 30);
        int countOfWorkingDays = random.nextInt(10, 20);
        int countOfWorkingHours = random.nextInt(4, 8);

        int randomEmployee = random.nextInt(0,2);
        if (randomEmployee == 0) {
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], age, experience, salary);
        } else {
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], age, experience, salary2, countOfWorkingDays, countOfWorkingHours);
        }

    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *  Придумать несколько Comparator'ов для сортировки сотрудников
     *  по фамилии + имени или по возрасту и уровню ЗП.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();

        }


//        Arrays.sort(employees, new WorkExperienceComparator());
        Arrays.sort(employees, new AgeComparator());
//        Arrays.sort(employees);


        for (Employee employee : employees) {
            System.out.println(employee);

        }









    }

}

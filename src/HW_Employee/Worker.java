package HW_Employee;

public class Worker extends Employee {


    public Worker(String name, String surname, int age, int workExperience, double salary) {
        super(name, surname, age, workExperience, salary);
    }

    @Override
    public double calculateSalary() {

        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d лет; Трудовой стаж: %d; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, age, workExperience, calculateSalary());
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}

package HW_Employee;


public class Freelancer extends Employee {

    protected int countOfWorkingDays;
    protected int countOfWorkingHours;



    public Freelancer(String name, String surname, int age, int workExperience, double salary, int countOfWorkingDays, int countOfWorkingHours) {
        super(name, surname, age, workExperience, salary);
        this.countOfWorkingDays = countOfWorkingDays;
        this.countOfWorkingHours = countOfWorkingHours;
    }


    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d лет; Трудовой стаж: %d; Среднемесячная заработная плата (почасовая месячная оплата): %.2f (руб.)",
                surname, name, age, workExperience, calculateSalary());
    }

    /**
     * Расчет зарплаты фрилансера с учетом отработанного времени(дней, часов).
     */
    @Override
    public double calculateSalary() {
        return salary * countOfWorkingDays * countOfWorkingHours;


    }

    public int getCountOfWorkingDays() {
        return countOfWorkingDays;
    }
    public void setCountOfWorkingDays(int countOfWorkingDays) {
        this.countOfWorkingDays = countOfWorkingDays;
    }
    public int getCountOfWorkingHours() {
        return countOfWorkingHours;
    }
    public void setCountOfWorkingHours(int countOfWorkingHours) {
        this.countOfWorkingHours = countOfWorkingHours;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}



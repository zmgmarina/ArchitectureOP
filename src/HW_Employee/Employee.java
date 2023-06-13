package HW_Employee;

public abstract class Employee implements  Comparable<Employee> {

    protected String name;
    protected String surname;

    protected int age;
    protected int workExperience;
    protected double salary; // Ставка заработной платы


    public Employee(String name, String surname, int age, int workExperience, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workExperience = workExperience;
        this.salary = salary;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public double getSalary() {
        return salary;
    }


    /**
     * Расчет среднемесячной заработной платы
     *
     * @return
     */
    public abstract double calculateSalary();


    /**
     * Сортировка по фамилии и ЗП
     */
//    @Override
//    public int compareTo(Employee o) {
//        int res =  surname.compareTo(o.surname);
//        if (res == 0)
//            return Double.compare(calculateSalary(),o.calculateSalary());
//        else
//            return res;
//  }

    /**
     * Сортировка по фамилии и имени
     */
//
//    public int compareTo(Employee o) {
//        int res =  surname.compareTo(o.surname);
//        if (res == 0)
//            return name.compareTo(o.name);
//        else
//            return res;
//
//    }



}

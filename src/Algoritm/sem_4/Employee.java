package Algoritm.sem_4;

import java.util.Objects;

public class Employee {
    private String name;
    private String lastname;
    private Integer age;

    public Employee(String name, String lastname, Integer age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(lastname, employee.lastname) && Objects.equals(age, employee.age);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, age);
    }
}

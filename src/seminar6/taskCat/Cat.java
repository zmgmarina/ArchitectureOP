package seminar6.taskCat;
/* Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является информационной системой ветеринарной клиники.
 * */

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Cat {
    private String name;
    private String breed;
    private LocalDate birthDate;
    private String ownerName; // имя владельца
    private List<Vaccination> vaccinations = new ArrayList<>(); //создали пустую коллекцию прививок

    public Cat(String name, String breed, LocalDate birthDate, String ownerName) { //класс вакцинация не включаем
        this.name = name;
        this.breed = breed;
        this.birthDate = birthDate;
        this.ownerName = ownerName;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public void addVaccination(Vaccination vaccination) {  //этот метод позволяет получить доступ к нашей коллекции только на добавление (инкапсуляция)
        this.vaccinations.add(vaccination);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", birthDate=" + birthDate +
                ", ownerName='" + ownerName + '\'' +
                ", vaccinations=" + vaccinations +
                '}';
    }
}

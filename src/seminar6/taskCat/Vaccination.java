package seminar6.taskCat;

import java.time.LocalDate;

public class Vaccination {
    private LocalDate data;
    private String nameVaccine;

    public Vaccination(LocalDate data, String nameVaccine){
        this.data = data;
        this.nameVaccine = nameVaccine;
    }

    @Override
    public String toString() {
        return "Vaccination{" +
                "data=" + data +
                ", nameVaccine='" + nameVaccine + '\'' +
                '}';
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNameVaccine() {
        return nameVaccine;
    }

    public void setNameVaccine(String nameVaccine) {
        this.nameVaccine = nameVaccine;
    }
}


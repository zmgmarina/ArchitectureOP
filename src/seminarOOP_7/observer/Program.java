package seminarOOP_7.observer;

public class Program {


    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        Company geekBrains = new Company("GeekBrains", 100000, new Vacancy("Engineer", 90000), jobAgency);
        Company google = new Company("Google", 100000, new Vacancy("HR specialist", 85000), jobAgency);
        Company stroytech = new Company("Stroytech", 90000, new Vacancy("Plot Master", 80000), jobAgency);
        Company yandex = new Company("Yandex", 40000, new Vacancy("Сourier", 40000), jobAgency);


        Master ivanov = new Master("Ivanov", "Engineer");
        Master petrov = new Master("Petrov", "Engineer" );
        Student sidorov = new Student("Sidorov", "Assistant Manager");
        Specialist orlov = new Specialist("Orlov", "HR specialist");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(orlov);

        for (int i = 0; i < 1; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
            stroytech.needEmployee();
        }

    }

}

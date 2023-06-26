package seminarOOP_7.observer;

import java.util.Random;

public abstract class JobSeekers {
    private static Random random = new Random();

    private String name;

    private double minSalary;

    private String desirePost;

    public String getName() {
        return name;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public String getDesirePost() {
        return desirePost;
    }

    public JobSeekers(String name, String desirePost) {
        this.name = name;
        this.desirePost = desirePost;

        minSalary = random.nextDouble(80000, 100000);
    }

    public  void receiveOffer(String nameCompany, double salary, Vacancy vacancy){
        if (minSalary  <= vacancy.getSalary() && vacancy.getPost() == desirePost) {
            System.out.printf("%s (%.2f) %s >>> Мне нужна эта работа! (%s - %.2f, %s)\n", name, minSalary, desirePost, nameCompany, vacancy.getSalary(), vacancy.getPost());
            minSalary = vacancy.getSalary();
        }
        else{
            System.out.printf("%s (%.2f) %s >>> Я найду работу получше! (%s - %.2f, %s)\n", name, minSalary, desirePost, nameCompany, vacancy.getSalary(), vacancy.getPost());
    }
}




}

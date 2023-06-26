package seminarOOP_7.observer;

public class Vacancy {
    private  String post;

    private double minSalary;


    public Vacancy(String post, double salary) {
        this.post = post;
        this.minSalary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return minSalary;
    }

    public void setSalary(double salary) {
        this.minSalary = salary;
    }
}

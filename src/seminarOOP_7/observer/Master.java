package seminarOOP_7.observer;

public  class Master extends JobSeekers implements Observer {


    public Master(String name, String desirePost) {
        super(name, desirePost);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Vacancy vacancy) {
        super.receiveOffer(nameCompany, salary, vacancy);
    }
}

package seminarOOP_7.observer;

public class Specialist  extends  JobSeekers implements Observer{

    public Specialist(String name, String desirePost) {
        super(name, desirePost);
    }


    @Override
    public void receiveOffer(String nameCompany, double salary, Vacancy vacancy) {

    }
}

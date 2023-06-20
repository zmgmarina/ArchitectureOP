package seminarOOP_5.models;


import java.util.Date;

public class Reservation {

    private final int id; //номер резерва
    private static int counter = 9000;

    private Date date;
    private String name;

    private int tableNo;

    {
        id = ++ counter;
    }

    public int getId() {
        return id;
    }


    public static int getCounter() {
        return counter;
    }

    public Date getData() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Reservation(Date date, String name) { //id не включаем в конструктор, он будет генерироваться автоматически

        this.date = date;
        this.name = name;
    }

}

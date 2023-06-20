package seminarOOP_5.models;


import java.util.ArrayList;
import java.util.Collection;

public class Table {
    private static int counter = 100;
    private final int no; // номер столика

    private final Collection<Reservation> reservations = new ArrayList<>(); // столик в течение дня м/б несколько раз быть зарезервирован, поэтому создадим коллекцию резерваций накаждом столике

    {
        no = ++counter;  // инициализатор будет создавать номер столика
    }

    public int getNo() {
        return no;
    }


    public Collection<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
        return String.format("Столик №%d", no);
    }
}





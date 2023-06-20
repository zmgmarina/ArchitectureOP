package seminarOOP_5.presenters;

import seminarOOP_5.models.Reservation;
import seminarOOP_5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    /**
     * Это получение списка всех столиков
     * */
    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     * @return Номер брони
     */

    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);


}

package seminarOOP_5.views;

import seminarOOP_5.models.Table;
import seminarOOP_5.presenters.View;
import seminarOOP_5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    public void setObserver(ViewObserver observer){
        this.observer = observer;
    }

    public void updateTableView(Collection<Table> tables){
        for (Table table : tables) {
            System.out.println(table);

        }
    }
    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);

    }
    @Override
    public void updateReservationTableResult(int reservationNo) {
        System.out.printf("Столик успешно забронирован. Номер вашей брони: №%d\n", reservationNo);
    }

    @Override
    public void updateChangeReservationTableResult(int chengReservationNo) {

        System.out.printf("Ваша бронь успешно изменена. Номер вашей брони: №%d\n ", chengReservationNo);
    }


    /**
     *Действие клиента (пользователь нажал на кнопку изменения бронирования), изменения бронирование столика
     * @param oldReservation
     * @param reservationDate
     * @param tableNo
     * @param name
     */

    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }
}

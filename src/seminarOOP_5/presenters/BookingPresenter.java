package seminarOOP_5.presenters;


import seminarOOP_5.models.Reservation;
import seminarOOP_5.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver{
    private final View bookingView;
    private final Model tableModel;

    public BookingPresenter(View bookingView, Model tableModel) {
        this.bookingView = bookingView;
        this.tableModel = tableModel;
        bookingView.setObserver(this);


    }

    private Collection<Table> loadTable(){
       return tableModel.loadTables();

    }

    public void showTables(){
        bookingView.updateTableView(loadTable());
    }

    /**
     * отображаем результат резервирования столика
     */
    private void showReservationTableResult(int reservationNo){
        bookingView.updateReservationTableResult(reservationNo);

    }

    private void showChangeReservationTableResult(int changeReservationNo){
        bookingView.updateChangeReservationTableResult(changeReservationNo);

    }

     /**
     * Метод резервирования столика
     * @param orderDate дата резервирования
     * @param tableNo номер столика
     * @param name имя клиента
     * получаем номер брони
     */
    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = tableModel.reservationTable(orderDate, tableNo,name);
        showReservationTableResult(reservationNo);

    }


    @Override
    public void onChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name) {
        int changeReservationNo = tableModel.changeReservationTable(oldReservation, orderDate, tableNo, name);
        showChangeReservationTableResult(changeReservationNo);


    }


}

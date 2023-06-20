package seminarOOP_5;

import seminarOOP_5.models.TableModel;
import seminarOOP_5.presenters.BookingPresenter;
import seminarOOP_5.presenters.View;
import seminarOOP_5.views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);

        bookingPresenter.showTables();

        bookingView.reservationTable(new Date(), 103, "Станислав");
        bookingView.changeReservationTable(9001, new Date(), 102, "Марина");


    }




}

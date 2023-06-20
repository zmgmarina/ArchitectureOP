package seminarOOP_5.presenters;

import seminarOOP_5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    void setObserver(ViewObserver observer);

    void updateTableView(Collection<Table>tables);


    void updateReservationTableResult(int reservationNo);
    void updateChangeReservationTableResult(int changeReservationNo);
}

package Architecture_op.seminar4.onlineTicket;

/**
 * @Компонент: TicketActions
 * @Версия: 1.0.0
 * @Описание: Этот компонент определяет контракты для действий с билетами.
 * @от 2023-02-10
 */
interface TicketActions {
    boolean reserveTicket();
    boolean deductFunds();
    boolean confirmPurchase();
    void updateTicketAvailability();
    boolean cancelReservation();
}

package Architecture_op.seminar4.onlineTicket;

import java.util.Date;

/**
 * @Компонент: Ticket
 * @Версия: 1.0.0
 * @Описание: Этот компонент определяет свойства экземпляра класса Ticket.
 * @от 2023-02-10
 */
abstract class Ticket implements TicketActions {
    int number; //номер билета
    String routeId;  //номер маршрута
    Date departureTime; //дата отправления
    double price; //стоимость билета
}
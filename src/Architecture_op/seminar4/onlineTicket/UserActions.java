package Architecture_op.seminar4.onlineTicket;

import java.util.Date;

/**
 * @Компонент: UserActions
 * @Версия: 1.0.0
 * @Описание: Этот компонент определяет контракты для действий пользователя.
 * @от 2023-02-10
 */
interface UserActions {
    boolean authorize(String username, String password);
    boolean selectRoute(String routeId, Date time);
    boolean checkTicketAvailability();
    boolean checkFunds();
}

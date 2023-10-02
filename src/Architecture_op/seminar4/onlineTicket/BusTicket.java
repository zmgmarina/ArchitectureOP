package Architecture_op.seminar4.onlineTicket;

/**
 * @Компонент: BusTicket
 * @Версия: 1.0.0
 * @Описание: Этот компонент определяет реализацию методов интерфейса TicketActions.
 * @от 2023-02-10
 */
class BusTicket extends Ticket {

    /**
     * @apiNote Реализация метода бронирования билета.
     * @return true, при успешном выполнении предусловий
     *  и false, при невыполнении хотя бы одного из предусловий
     */
    @Override
    public boolean reserveTicket() {
        return false;
    }

    /**
     * @apiNote Списание средств за купленный билет
     * @return true, средства списываются при успешном выполнении предусловий
     * и false, средства не списываются при невыполнении хотя бы одного из предусловий
     */
    @Override
    public boolean deductFunds() {
        return false;
    }

    /**
     * @apiNote Подтверждение покупки билета
     * @return true, покупка подтверждается при успешном выполнении предусловий
     * и false, покупка не подтверждена при невыполнении хотя бы одного из предусловий
     */
    @Override
    public boolean confirmPurchase() {
        // Реализация метода
        return false;
    }

    /**
     * @apiNote Обновление доступности билетов
     */
    @Override
    public void updateTicketAvailability() {
        // Реализация метода
    }


    /**
     * @apiNote Отмена бронирования билета
     * @return true
     */
    @Override
    public boolean cancelReservation() {
        // Реализация метода
        return true;
    }
}

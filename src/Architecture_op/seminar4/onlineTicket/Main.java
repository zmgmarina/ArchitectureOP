package Architecture_op.seminar4.onlineTicket;

/**
 * @Компонент: Main
 * @Версия: 1.0.0
 * @Описание: Этот компонент выполняет программу по бронированию билета.
 * @от 2023-02-10
 */
public class Main {

    public static void main(String[] args) {
        // Создаем экземпляр пользователя
        User user = new User();
        Ticket ticket = new BusTicket();

        // Предположим, что пользователь не авторизован и не выбран маршрут
        // и что у него недостаточно средств для бронирования.

        // Пытаемся забронировать билет
        boolean isBookingSuccessful = user.reserveTicket();

        // Проверяем результат
        if (isBookingSuccessful) {
            System.out.println("Билет успешно забронирован.");
        } else {
            System.out.println("Не удалось забронировать билет.");

        }
    }
}

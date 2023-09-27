package Architecture_op.HW_2.bridge;

public class Main {
    public static void main(String[] args) {
        //создали экземпляр класса отправки данных через email прочтенных из базы данных
        Sender sender = new Email(new DataBaseReader());
        sender.sending();

        //отправление данных их файла
        sender.setDataReader(new FileReader());
        sender.sending();

        //теперь наш объект будет нести функцию Telegram, данные из базы данных
        sender = new Telegram(new DataBaseReader());
        sender.sending();

        //отправление данных их файла
        sender.setDataReader(new FileReader());
        sender.sending();


    }
}

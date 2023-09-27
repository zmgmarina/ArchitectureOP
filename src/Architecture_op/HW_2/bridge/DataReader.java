package Architecture_op.HW_2.bridge;

public interface DataReader {
    public void read();
}

class FileReader implements DataReader{

    @Override
    public void read() {
        System.out.println("Чтение данных из файла");
    }
}

class DataBaseReader implements DataReader{

    @Override
    public void read() {
        System.out.println("Чтение информации из базы данных");
    }
}
abstract class Sender{
    public DataReader dataReader;

    public Sender(DataReader dataReader) {
        this.dataReader = dataReader;
    }

    public void setDataReader(DataReader dataReader) {
        this.dataReader = dataReader;
    }

    public abstract void sending();
}

class Email extends Sender {
    public Email(DataReader dataReader) {
        super(dataReader);
    }

    @Override
    public void sending() {
        dataReader.read();
        System.out.println("Данные успешно отправлены при помощи email");
    }
}
class Telegram extends Sender{

    public Telegram (DataReader dataReader) {
        super(dataReader);
    }

    @Override
    public void sending() {
        dataReader.read();
        System.out.println("Данные успешно отправлены при помощи Telegram");

    }
}
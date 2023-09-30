package Architecture_op.HW_3;

//Класс конкретной модели телефона, имплементирует конкретный интерфейс с функциями, которые выполняет данная модель телефона,
// реализует его методы, плюс реализует метод  Call() класса Phone, от которого наследуется 

public class Nokia extends Phone implements PhoneFunctionsNokia{

    @Override
    public void SendSMS() {
        System.out.println("The phone Nokia sends SMS");

    }

    @Override
    public void Bluetooth() {
        System.out.println("The phone Nokia has the function Bluetooth");

    }

    @Override
    public void PhotoShooting() {
        System.out.println("The phone Nokia has the function PhotoShooting");
    }

    @Override
    void {
        System.out.println("Nokia calling");
    }
}

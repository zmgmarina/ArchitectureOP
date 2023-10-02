package Architecture_op.HW_3;

//Класс конкретной модели телефона, имплементирует конкретный интерфейс с функциями, которые выполняет данная модель телефона,
// реализует его методы, плюс реализует метод  Call() класса Phone, от которого наследуется 

public class Nokia extends Phone implements PhoneFunctionsNokia{

 // реализация метода
    @Override
    public void SendSMS() {
        System.out.println("The phone Nokia sends SMS");

    }
 // реализация метода
    @Override
    public void Bluetooth() {
        System.out.println("The phone Nokia has the function Bluetooth");

    }
 // реализация метода
    @Override
    public void PhotoShooting() {
        System.out.println("The phone Nokia has the function PhotoShooting");
    }
 // реализация метода
    @Override
    void Call(){
        System.out.println("Nokia calling");
    }
}

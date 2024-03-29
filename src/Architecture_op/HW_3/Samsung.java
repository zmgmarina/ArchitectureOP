package Architecture_op.HW_3;

//Также класс модели телефона, имплементирует конкретный интерфейс с функциями, которые выполняет данная модель телефона,
// реализует его методы, плюс реализует метод  Call() класса Phone, от которого наследуется 

public class Samsung extends  Phone implements PhoneFunctionsSamsung{
    @Override
    public void SendSMS() {
        System.out.println("The phone Samsung sends SMS");

    }

    @Override
    public void SendEMail() {
        System.out.println("The phone Samsung sends Email");
    }

    @Override
    public void Bluetooth() {
        System.out.println("The phone Samsung has the function Bluetooth");

    }

    @Override
    public void PhotoVideoShooting() {
        System.out.println("The phone Samsung has the function PhotoVideoShooting");
    }

    @Override
    void Call() {
        System.out.println("Samsung calling");
    }
}

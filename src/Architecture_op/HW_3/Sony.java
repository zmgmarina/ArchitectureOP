package Architecture_op.HW_3;

//Класс конкретной модели телефона, имплементирует конкретный интерфейс с функциями, которые выполняет данная модель телефона,
// реализует его методы, плюс реализует метод  Call() класса Phone, от которого наследуется 

public class Sony extends Phone implements PhoneFunctionsSony{
    @Override
    public void SendSMS() {
        System.out.println("The phone Sony sends SMS");

    }

    @Override
    public void SendEMail() {
        System.out.println("The phone Sony sends Email");

    }

    @Override
    public void PhotoVideoShooting() {
        System.out.println("The phone Sony has the function PhotoVideoShooting");

    }

    @Override
    void Call() {
        System.out.println("Sony calling");

    }
}

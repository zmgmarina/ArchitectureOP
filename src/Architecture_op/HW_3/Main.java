package Architecture_op.HW_3;

//В данном примере попыталась использовать принцип разделения интерфейсов
//Разбила методы по конкретным интерфейсам для каждой модели телефона, т.к. телефон может не выполнять какую-либо функцию
// и если бы использовался один общий интерфейс, каждый  класс обязан был бы реализовать все методы 

public class Main {
    public static void main(String[] args) {
// Создание экземляров классов Samsung Nokia и Sony с вызовом методов
        Samsung samsung = new Samsung();
        samsung.Bluetooth();
        samsung.PhotoVideoShooting();
        samsung.SendEMail();
        samsung.SendSMS();
        samsung.Call();

        Nokia nokia = new Nokia();
        nokia.Bluetooth();
        nokia.PhotoShooting();
        nokia.SendSMS();
        nokia.Call();

        Sony sony = new Sony();
        sony.SendSMS();
        sony.PhotoVideoShooting();
        sony.SendEMail();
        sony.Call();

    }
}

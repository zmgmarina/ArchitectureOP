package Architecture_op.HW_3;

//Разбила методы по конкретным интерфейсам для каждой модели телефона, для того чтобы телефон выполнял только те функции 

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

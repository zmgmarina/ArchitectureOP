package Architecture_op.HW_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

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

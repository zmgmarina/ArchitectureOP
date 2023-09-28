package Architecture_op.HW_3;

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
    void Call() {
        System.out.println("Nokia calling");
    }
}

package Architecture_op.HW_3;

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

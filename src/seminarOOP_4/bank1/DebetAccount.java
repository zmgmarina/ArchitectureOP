package seminarOOP_4.bank1;

public class DebetAccount<T extends PersonalData> extends Account<T> {

    public DebetAccount(T data, double amount) {
        super(data, amount);
    }
}

package seminarOOP_4;

public class Program {
    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount(54364354, 300);
        System.out.println(simpleAccount);

//        UniversalAccount universalAccount = new UniversalAccount(new AccountIdentifier(2132, "jhjk"), 343434);
//
//        System.out.println(((AccountIdentifier)universalAccount.getId()).getPrefix());

        Account<AccountIdentifier> account1 = new Account<>(new AccountIdentifier(555, "bnm"), 343543);
        System.out.println(account1);
        AccountIdentifier accountIdentifier = account1.getId();
        System.out.println(accountIdentifier.getPrefix());

        Integer[] numbers = {1, 5, 9, 4, 10, 8};
        String[] names = {"Илья", "Мария", "Денис", "Сергей", "Ольга", "Игорь"};

        Object[] newNames = ArrayUtils.replaceTwoElements(names, 1,3);

        for (Object el : newNames) {
            System.out.println(el);
        }

        Integer [] newNumbers = ArrayUtils.replaceTwoElements1(numbers, 0,2);
        for (Integer num : newNumbers) {
            System.out.println(num);
        }











    }
}

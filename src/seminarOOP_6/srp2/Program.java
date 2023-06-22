package seminarOOP_6.srp2;

public class Program {


    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();
        SaveToJson saveToJson = new  SaveToJson(order);
        InputFromConsole inputFromConsole = new InputFromConsole();
        inputFromConsole.input(order);
        saveToJson.saveToJson();

        SaveToTxt saveToTxt = new SaveToTxt(order);
//        InputFromConsole inputFromConsole1 = new InputFromConsole(order);
//        inputFromConsole1.input(order);
        saveToTxt.saveToTxt();




    }

}

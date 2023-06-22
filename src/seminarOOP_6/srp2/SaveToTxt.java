package seminarOOP_6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToTxt {
    private final Order order;
    public SaveToTxt(Order order) {
        this.order = order;
    }

    public void saveToTxt() {
        String fileName = "order.txt";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("clientName "+ order.getClientName()+ "\n");
            writer.write("product "+ order.getProduct()+ "\n");
            writer.write("qnt "+ order.getQnt()+ "\n");
            writer.write("price " + order.getPrice() + "\n");
//            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


}

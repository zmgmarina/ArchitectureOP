package Architecture_op.HW_2.abstractFactory;

import Algoritm.less3.List;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //создаем первую оркестровую группу
        InstrumentFactory instrumentFactor = new GroupOrchestrOne();

        Strings violon = instrumentFactor.createStrings();
        Percussion drums = instrumentFactor.createPercussion();
        Fanfare trombon = instrumentFactor.createFanfare();

        System.out.println("Sounds groupOrchestrOne!");
        ((Violon)violon).soundViolon();
        ((Drums)drums).soundDrums();
        ((Trombone)trombon).soundTrombone();


        //создаем вторую оркестровую группу
        InstrumentFactory instrumentFactor2 = new GroupOrchestrTwo();

        System.out.println("-----------------");
        System.out.println("Sounds groupOrchestrTwo!");
        Strings violoncelle = instrumentFactor2.createStrings();
        Percussion xylophone = instrumentFactor2.createPercussion();
        Fanfare trombon2 = instrumentFactor2.createFanfare();


        ((Violoncelle)violoncelle).soundVioloncelle();
        ((Xylophone)xylophone).soundXylophone();
        ((Trombone)trombon2).soundTrombone();



    }
}
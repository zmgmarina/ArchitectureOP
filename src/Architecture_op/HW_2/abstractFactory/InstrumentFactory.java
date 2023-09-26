package Architecture_op.HW_2.abstractFactory;

interface InstrumentFactory {
    Fanfare createFanfare();
    Strings createStrings();
    Percussion createPercussion();

}

//струнные инструменты
class Strings {
    public void soundStrings() {
        System.out.println("Sounds strings!");
    }
}

//духовые инструменты
class Fanfare {
    public void soundFanfare() {
        System.out.println("Sounds fanfare!");
    }
}

//ударные инструменты
class Percussion {
    public void soundPercussion() {
        System.out.println("Sounds percussion!");
    }
}

//скрипка
class Violon extends Strings{
    public void soundViolon() {
        System.out.println("Sounds violon!");
    }
}

//виолончель
class Violoncelle extends Strings{
    public void soundVioloncelle() {
        System.out.println("Sounds violoncelle!");
    }
}

//тромбон
class Trombone extends Fanfare{
    public void soundTrombone() {
        System.out.println("Sounds trombone!");
    }
}

//барабаны
class Drums extends Percussion{
    public void soundDrums() {
        System.out.println("Sounds drums!");
    }
}

//ксилофон
class Xylophone extends Percussion{
    public void soundXylophone () {
        System.out.println("Sounds xylophone!");
    }
}

class GroupOrchestrOne implements InstrumentFactory{

    @Override
    public Fanfare createFanfare() {
        return new Trombone();
    }
    @Override
    public Strings createStrings() {
        return new Violon();
    }
    @Override
    public Percussion createPercussion() {
        return new Drums();
    }
}

class GroupOrchestrTwo implements InstrumentFactory{

    @Override
    public Fanfare createFanfare() {
        return new Trombone();
    }
    @Override
    public Strings createStrings() {
        return new Violoncelle();
    }
    @Override
    public Percussion createPercussion() {
        return new Xylophone();
    }
}
package Exception.HW3;

public class DeliveryAddress {


    private String street;
    private int house;
    private int apartment;


    public DeliveryAddress(String street, int house, int apartment) {
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public void chackedInputAddress(String street, int house, int apartment) throws IllegalDataEntryException{
        if (street == null) {
            throw new IllegalDataEntryException("You have entered incorrect data.  " + "street: " + street);
        }
        if (house == 0){
            throw  new IllegalDataEntryException("You have entered incorrect data.  " + "house: " + house);
        }
        if (apartment == 0) {
            throw new IllegalDataEntryException("You have entered incorrect data.  " + "apartment: " + apartment);
        }
        if (street.matches("[-+]?\\d+")){
            throw  new IllegalDataEntryException("You have entered incorrect data.  " + "street: " + street);
        }

    }
    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public int getApartment() {
        return apartment;
    }
}

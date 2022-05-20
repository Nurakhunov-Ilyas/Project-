public class Main {
    public static void main(String[] args) {
        Vehicle passengerCar1 = new PassengerCar("Лада",60,40,true,4);
        Vehicle suv1 = new SUV("Hammer",85,80,false,4);
        Vehicle motorcycle1 = new Motorcycle("Harley Davidson",80,100,false,2);
        Vehicle passengerCar2 = new PassengerCar("Ламба",150,100,true,4);

        Vehicle[] vehicles = {passengerCar1,suv1,motorcycle1,passengerCar2};

        TransportSorter ts = new TransportSorter(vehicles);
        ts.print();
        ts.sort();
    }
}

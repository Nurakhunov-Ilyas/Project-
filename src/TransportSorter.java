public class TransportSorter{
    Vehicle[] vehicles = {};
    public TransportSorter(Vehicle[] vehicles) {this.vehicles = vehicles;}

    public  void sort() {
        for (Vehicle ts: vehicles){
            if(ts instanceof PassengerCar){
                System.out.println("\n Транспортное средство " + ts.getModel()+ " отправляется в отдел легковых машин");
                ((PassengerCar) ts).drive();
                ((PassengerCar) ts).stop();
            }
            else if (ts instanceof SUV){
                System.out.println("\nТранспортное средство " + ts.getModel()+ " отправляется в отдел грузовых машин");
                ((SUV) ts).drive();
                ((SUV) ts).stop();
            } else if (ts instanceof Motorcycle) {
                System.out.println("\nТранспортное средство " + ts.getModel()+ " отправляется в отдел мотоциклов");
                ((Motorcycle) ts).drive();
                ((Motorcycle) ts).stop();
            }

        }
    }


    public void print(){
        for(Vehicle ts: vehicles){
            System.out.println(ts.getModel());
        }
    }
}

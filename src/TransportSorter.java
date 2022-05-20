public class TransportSorter{
    Vehicle[] vehicles = {};
    public TransportSorter(Vehicle[] vehicles) {this.vehicles = vehicles;}

    public  void sort() {
        for (Vehicle ts: vehicles){
            if(ts instanceof PassengerCar){
                System.out.println("\n ������������ �������� " + ts.getModel()+ " ������������ � ����� �������� �����");
                ((PassengerCar) ts).drive();
                ((PassengerCar) ts).stop();
            }
            else if (ts instanceof SUV){
                System.out.println("\n������������ �������� " + ts.getModel()+ " ������������ � ����� �������� �����");
                ((SUV) ts).drive();
                ((SUV) ts).stop();
            } else if (ts instanceof Motorcycle) {
                System.out.println("\n������������ �������� " + ts.getModel()+ " ������������ � ����� ����������");
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

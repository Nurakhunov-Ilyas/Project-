public class SUV extends Vehicle {
    public SUV(String model, int speed, int fuel, boolean isDieselFuel, int countWheels) {
        super(model, speed, fuel, isDieselFuel);
        this.countWheels = countWheels;
    }

    public int getCountWheels() {
        return countWheels;
    }

    private int countWheels;

    private void checkFuel(){
        if (getFuel()>100 || getFuel()<0){
            return;
        }
        System.out.println();
    }

    void getmodel(){
        System.out.println(getModel());
    }


    @Override
    public void drive() {
        if(getFuel() == 0){
            System.out.println("Бак пуст");
            return;
        }else
            System.out.println("Транспорт поехал \n Удобно проезжаем по машинам");
    }

    @Override
    public void stop() {
        System.out.println("Транспорт остановился \n ...Резко...");
    }
}

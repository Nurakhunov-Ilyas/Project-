public class PassengerCar extends Vehicle{
    public PassengerCar(String model, int speed, int fuel, boolean isDieselFuel, int countWheels) {
        super(model, speed, fuel, isDieselFuel);
        this.countWheels = countWheels;
    }

    public int getCountWheels() {
        return countWheels;
    }

    private int countWheels;



    @Override
    public void drive() {
        System.out.println("Транспорт поехал \n Удобно проезжаем пробки");
    }

    @Override
    public void stop() {
        System.out.println("Транспорт остановился \n ...Плавно...");
    }
}

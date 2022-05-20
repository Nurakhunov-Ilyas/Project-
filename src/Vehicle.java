public class Vehicle {
    private String model;
    private int speed;
    private int fuel;
    private boolean isDieselFuel;

    public Vehicle(String model, int speed, int fuel, boolean isDieselFuel){
        this.model = model;
        this.speed = speed;
        this.fuel = fuel;
        this.isDieselFuel = isDieselFuel;
    }

    public void drive(){
        if (fuel <= 0){
            System.out.println("Бак пустой");
            return;}

        if(fuel>=1) {
            System.out.println("Транспорт поехал");
        }
    }

    public void stop(){
        System.out.println("Транспорт остановился");
    }

    public void refuel(){
        if(fuel == 0){
            System.out.println("Заправте транспорт");
            fuel = fuel+100;
        }
        checkFuel();
    }

    private void checkFuel(){
        if(fuel < 0){fuel = 0;}
        else if(fuel > 100){fuel = 100;}
    }


    public String getModel() {return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuel() {
        return fuel;
    }

    public boolean isDieselFuel() {
        return isDieselFuel;
    }

}

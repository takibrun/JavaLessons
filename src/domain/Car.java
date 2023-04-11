package domain;

public class Car {

    double totalMiles;

    public Car() {
        this.totalMiles = 10;
    }

    public void carSound(String sound) {
        System.out.println(sound);
    }
    public double getMiles(double miles) {

        this.totalMiles = this.totalMiles + miles;
        return this.totalMiles;
    }

}

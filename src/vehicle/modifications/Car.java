package vehicle.modifications;

import java.util.ArrayList;

/**
 * Created by VladislavGolovatyuk
 * @version 1.0
 */
public class Car {

    private String dayOfManufacture;
    private String enginesType;
    private int maximumSpeed;
    private int accelerationTimeUp;
    private int passengerCapacity;
    private int numberOfPassengersInsideAtTheMoment;
    private int currentSpeed;
    public ArrayList<CarWheel> carWheels = new ArrayList<>();
    public ArrayList<CarDoor> carDoors = new ArrayList<>();


    public Car(String dayOfManufacture) {
        this.dayOfManufacture = dayOfManufacture;
    }

    public Car(String dayOfManufacture, String enginesType,
               int maximumSpeed, int accelerationTimeUp, int passengerCapacity,
               int numberOfPassengersInsideAtTheMoment,
               int currentSpeed) {

        this.dayOfManufacture = dayOfManufacture;
        this.enginesType = enginesType;
        this.maximumSpeed = maximumSpeed;
        this.accelerationTimeUp = accelerationTimeUp;
        this.passengerCapacity = passengerCapacity;
        this.numberOfPassengersInsideAtTheMoment = numberOfPassengersInsideAtTheMoment;
        this.currentSpeed = currentSpeed;

        for (int i = 0; i < 4; i++) {
            carDoors.add(new CarDoor());
            carWheels.add(new CarWheel());
        }

    }


    public void passengerLanding(int numberOfPassengersInsideAtTheMoment) {
        numberOfPassengersInsideAtTheMoment++;
        System.out.println("В машину посажен пасажир и теперь в ней " +
                numberOfPassengersInsideAtTheMoment + " пассажиров");

    }

    public void disembarkationOfAPassenger(int numberOfPassengersInsideAtTheMoment) {
        if (numberOfPassengersInsideAtTheMoment == 0) {
            System.out.println("Некого высаживать, салон пуст");
        } else {
            numberOfPassengersInsideAtTheMoment--;
            System.out.println("Один пассажир высажен, и теперь в автомобиле "
                    + numberOfPassengersInsideAtTheMoment + " пассажиров");
        }
    }

    public void disembarkAllPassengers(int numberOfPassengersInsideAtTheMoment){
        numberOfPassengersInsideAtTheMoment = 0;
        System.out.println("Все пассажиры высажены");
    }


    public void getDoorIndex(int index) {
        carDoors.get(index).doorStatusIfno();
    }

    public void getWheelIndex(int index) {
        carWheels.get(index).wheelStatusInfo();
    }

    public void removeAllwheels() {
        carWheels.clear();
        System.out.println("Все колеса сняты");
    }

    public void addWhells(int counterOfWheels) {
        for (int i = 0; i < counterOfWheels; i++) {
            carWheels.add(new CarWheel());
        }
        System.out.println("Сейчас на автомобиле установлено " + carWheels.size() + " колес");
    }


    public double getMaxSpeed() {
        if (numberOfPassengersInsideAtTheMoment == 0) {
            System.out.println("Машину некому вести, так что ее максимальная скорость = 0))");
            return 0;
        } else {
            double valueWheels[] = new double[carWheels.size()];
            for (int i = 0; i < valueWheels.length; i++) {
                valueWheels[i] = carWheels.get(i).getWheelIntegrityStatus();
            }
            double currentCarMaxSpeed = getMinValue(valueWheels) * maximumSpeed;
            return currentCarMaxSpeed;
        }
    }

    private double getMinValue(double data[]) {
        double minValue = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < minValue) {
                minValue = data[i];
            }
        }
        return minValue;
    }

    public void fullInfoCar() {
        System.out.println("дата выпуска: " + dayOfManufacture);
        System.out.println("тип двигателя: " + enginesType);
        System.out.println("текущая максимальная скорость: " + getMaxSpeed());
        System.out.println("разгон до сотни: " + accelerationTimeUp);
        System.out.println("максимальная вместимость: " + passengerCapacity);
        System.out.println("текущая вместимость: " + numberOfPassengersInsideAtTheMoment);
        System.out.println("текущая скорость: " + currentSpeed);
    }

}
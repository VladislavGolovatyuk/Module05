package vehicle.modifications;

/**
 * Created by VladislavGolovatyuk
 * @version 0.4
 */
public class CarWheel {

    private double wheelIntegrityStatus;
    private boolean wheelsAvailability;
    private int persent;


    public CarWheel(){

        this.wheelIntegrityStatus = 1;
        this.wheelsAvailability = true;
    }

    public CarWheel(double wheelIntegrityStatus, boolean wheelsAvailability){
        this.wheelIntegrityStatus = wheelIntegrityStatus;
        this.wheelsAvailability = wheelsAvailability;

    }


    public void changeWheel() {
        wheelsAvailability = true;
        wheelIntegrityStatus = 1;
        System.out.println("Шина заменена");
    }

    public void wearOutABusResource(int persent){
        wheelIntegrityStatus = wheelIntegrityStatus - (wheelIntegrityStatus * persent / 100);
        System.out.println("Вы стерли шину на " + persent + " и теперь она имеет " +
                "значение " + wheelIntegrityStatus);
    }

    public double wheelState() {
        return wheelIntegrityStatus;
    }

    public void wheelStatusInfo() {
        if ((wheelIntegrityStatus > 0) && (wheelIntegrityStatus < 1)){
            System.out.println("Шина ещё пригодна и имеет значение " + wheelIntegrityStatus);
        } else {
            System.out.println("Шину не мешало бы щаменить, она изношена");
        }
    }


    public void setWheelIntegrityStatus(double wheelIntegrityStatus){
        this.wheelIntegrityStatus = wheelIntegrityStatus;
    }

    public double getWheelIntegrityStatus(){
        return wheelIntegrityStatus;
    }

    public void setWheelsAvailability(boolean wheelsAvailability){
        this.wheelsAvailability = wheelsAvailability;
    }

    public boolean getWheelsAvailability(){
        return wheelsAvailability;
    }


}

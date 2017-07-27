package vehicle.modifications;

/**
 * Created by VladislavGolovatyuk
 * @version 0.4
 */
public class CarDoor {

    private boolean doorCondition;
    private boolean windowCondition;


    public CarDoor(){

        this.doorCondition = true;
        this.windowCondition = true;
    }

    public CarDoor(boolean doorCondition, boolean windowCondition){
        this.doorCondition = doorCondition;
        this.windowCondition = windowCondition;
    }



    public void closeDoorMethod() {
        if (!doorCondition){
            System.out.println("Дверь закрыта");
            doorCondition = true;
        }
    }

    public void openDoorMethod(){
        if (doorCondition){
            System.out.println("Дверь открыта");
            doorCondition = false;
        }
    }

    public void invertDoor(){
        if (doorCondition) {
            doorCondition = false;
            System.out.println("Закрытая дверь открылась");
        } else {
            doorCondition = true;
            System.out.println("Открытая дверь закрылась");
        }
    }

    public void openWindowMethod() {
        if (windowCondition){
            System.out.println("Окно открыто");
            windowCondition = false;
        }
    }

    public void closeWindowMethod() {
        if (!windowCondition){
            System.out.println("Дверь закрыта");
            windowCondition = true;
        }
    }

    public void invertWindow(){
        if (windowCondition) {
            windowCondition = false;
            System.out.println("Закрытое окно открылось");
        } else {
            windowCondition = true;
            System.out.println("Открытое окно закрылось");
        }
    }

    public void doorStatusIfno(){
        if(doorCondition){
            System.out.println("Дверь закрыта");
        } else {
            System.out.println("Дверь открыта");
        }
    }

    public void windowStatusIfno(){
        if(windowCondition){
            System.out.println("Окно закрыто");
        } else {
            System.out.println("Окно открыто");
        }
    }


    public void setDoorCondition (boolean doorCondition){
        this.doorCondition = doorCondition;
    }

    public boolean getDoorCondition(){
        return doorCondition;
    }

    public void setWindowCondition(boolean windowCondition){
        this.windowCondition = windowCondition;
    }

    public boolean getWindowCondition(){
        return windowCondition;
    }

}
public class main{
    public static void main(String[] args){

        Garage garage = new Garage();
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.Park(car1);
        garage.Park(car2);


    }
}


class Garage{


    void Park(Car car){
        System.out.println("The " + car.name + " is Parked in the Garage.");
    }

    

}

class Car{

    String name;
    Car(String name){
        this.name = name;
    }

}
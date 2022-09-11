public class main{
    public static void main(String[] args){

        Car car = new Car();
        car.go();

    }
}


abstract class Vehicle {

    abstract void go();

}


class Car extends Vehicle {

    @Override
    void go() {
        System.out.println("The Driver is driving the Car ");
        
    }

}


public class main {
    public static void main(String[] args){

        Car car = new Car();
        car.go();

        Bycycle bike = new Bycycle();
        bike.go();

        System.out.println(bike.speed);
        System.out.println(car.doors);
        System.out.println(bike.peddles);

    }
}


 // Inheritance = this is the process in which one class aquire the attributes and method of other class.



 class Vehicle {

     double speed;

     void go(){
         System.out.println("The vehicle is moving ");
     }

     void stop(){
         System.out.println("The vehicle is stopped");
     }

 }


 class Bycycle extends Vehicle{

    int wheel = 2;
    int peddles = 2;

 }

 class Car extends Vehicle{

    int wheel = 4;
    int doors = 4;

}

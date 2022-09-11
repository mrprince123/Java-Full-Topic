import javax.sound.sampled.SourceDataLine;

// toString = special method that all object inherit
//              That return string that "textually repreasent" object
//              can be used implicitly and explicitly

public class main{
    public static void main(String[] args){

        Car car = new Car();
        System.out.println(car.toString());
        // System.out.println(car);
    }
}


class Car {

    String make = "Ford";
    String model = "Mustang GT";
    String color = "red";
    int year = 1999;


    public String toString(){
        return make + "\n"+ model + "\n" + color + "\n" + year;
    }
}
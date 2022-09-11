public class main {
    public static void main(String[] args){

        Dog dog = new Dog();
        dog.speak();

        Animal animal = new Animal();
        animal.speak();

    }
}


class Animal{

    void speak(){
        System.out.println("The Animal Speak");
    }
}

class Dog extends Animal{

    @Override
    void speak(){
        System.out.println("The Animal Dog is Barking ");
    }

}
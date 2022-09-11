import javax.sound.sampled.SourceDataLine;

public class main {
    public static void main(String[] args){

        Human human = new Human("Sandy", 34, 40);
        System.err.println(human.name);

        human.Eating();
        human.Drinking();
    }
}


class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    void Eating(){
        System.out.println(this.name + " is Eating");
    }

    void Drinking(){
        System.out.println(this.name + " is Drinking");
    }
}
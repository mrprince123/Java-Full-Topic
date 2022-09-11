public class main{
    public static void main(String[] args){

        Hero hero = new Hero("Batman", 35, "$$$");
        Hero hero2 = new Hero("Zadi", 87, "Everything");
        System.out.println(hero2.toString());
        // System.out.println(hero.name);
        // System.out.println(hero.age);
        // System.out.println(hero.power);


    }
}


class Person{

    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String toString(){
        return this.name + "\n" + this.age + "\n";

    }

   

}

class Hero extends Person{

    String power;

    Hero(String name , int age, String power){
        super(name, age);
        this.power = power;

    }

    public String toString(){
        return super.toString() + this.power;

    }

}
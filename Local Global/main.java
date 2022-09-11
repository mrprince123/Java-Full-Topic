import java.util.Random;

public class main {
    public static void main(String[] args){

        // local = declared inside the method.
        //       but used by only that method.
        // or visisble only to that method.


        // global =                     declared outside the method but within the main class
        //          visible to all part of a class.

        DiceRoller diceRoller = new DiceRoller();









        
    }
}

class DiceRoller {

    Random random;
    int number = 0;

    DiceRoller (){
        random = new Random();
        roll();
    }

    // DiceRoller(){
    //     Random random = new Random();
    //     int number = 0;
    //     roll(random, number);
    // }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}


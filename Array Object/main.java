public class main {
    public static void main(String[] args){

        Food[] rafrigrator = new Food[3];

        Food food1 = new Food("HamBurger");
        Food food2 = new Food("Cheese");
        Food food3 = new Food("Pizza");

        rafrigrator[0] = food1;
        rafrigrator[1] = food2;
        rafrigrator[2] = food3;

        System.out.println(rafrigrator[1].name);
    }
}


class Food{

    String name;

    Food(String name){
        this.name = name;
    }

}
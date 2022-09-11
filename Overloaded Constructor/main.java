public class main {
    public static void main(String[] args){


        Pizza pizza = new Pizza("Thick Chrust");
        System.out.println("This is all the ingrident of Pizza: ");
        System.err.println(pizza.bread);
        System.err.println(pizza.sauce);
        System.err.println(pizza.topping);
        System.err.println(pizza.chesse);

    }
}

class Pizza {

    String bread;
    String sauce;
    String chesse;
    String topping;

    Pizza(){
        this.bread = bread;
        this.chesse = chesse;
        this.sauce = sauce;
        this.topping = topping;

    }


    Pizza(String bread){
        this.bread = bread;
        

    }

    Pizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
        

    }
    
    Pizza(String bread, String sauce, String chesse){
        this.bread = bread;
        this.chesse = chesse;
        this.sauce = sauce;

    }

    Pizza(String bread, String sauce, String chesse, String topping){
        this.bread = bread;
        this.chesse = chesse;
        this.sauce = sauce;
        this.topping = topping;

    }

}
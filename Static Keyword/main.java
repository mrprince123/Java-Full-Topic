public class main{
    public static void main(String[] args){

        Friend friend = new Friend("BoB");
        Friend friend2 = new Friend("Sandy");
        Friend friend3 = new Friend("Pussty");
        Friend friend4 = new Friend("Banty");



        System.out.println(friend.noOfFriends);
        Friend.DisplayFriends();

    }
}


class Friend{

    String name;
    static int noOfFriends; 

    Friend(String name){
        this.name = name;
        noOfFriends++;
    }

    static void DisplayFriends(){
        System.out.println("You have " + noOfFriends + " friends");

    }
}
public class main{
    public static void main(String args[]){
        int a = 0;
        int b = 1;
        int c;

        Scanner sc = new Scanner(System.in);
        int enterNumber sc.nextInt();

        for(int i = 0; i<=enterNumber; i++){
            c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
        }
    }
}
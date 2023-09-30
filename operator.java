import java.util.Scanner;
public class operator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b) {
            System.out.println("Equal");
        }

        else if(a>b)    {
                System.out.println("a is greater");
            }
        else    {
                System.out.println("a is lesser");
            }




        // if(num%2==0){
        //     System.out.println("Even Number");

        // }
        // else{
        //     System.out.println("Odd Number");
        // }

}
}

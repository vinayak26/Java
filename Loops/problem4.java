import java.util.*;
public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
            do{
                int num=sc.nextInt();
                if(num>=90 && num<=100){
                    System.out.println("This is good");
                }
                else if(num<=89&&num>=60){
                    System.out.println("This is also good");
                }
                else if (num<=59&&num>=0){
                    System.out.println("This is good a well");
                }
                else{
                    System.out.println("Invalid");
                }
                System.out.println("Want to continue ? Yes(1) or no(0)");
                menu = sc.nextInt(); 
        } while(menu==1);

    }
}

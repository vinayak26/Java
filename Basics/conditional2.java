import java.util.*;

public class conditional2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // Same code with Switch

        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namestay");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid Button");           
        }

        // Same code with if else 


        // if(button == 1 ) {
        //     System.out.println("Hello");
        // }
        // else if (button == 2) {
        //     System.out.println("Namestay");
        // }
        // else if (button == 3) {
        //     System.out.println("Bonjour");
        // }

        // else{
        //     System.out.println("Invalid Button");
        // }
    }    
}

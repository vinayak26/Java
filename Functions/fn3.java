import java.util.*;

public class fn3 {

    public static void prime(int n){
        for(int i = 2; i<=n/2;i++){
            if(n%i==0){
                System.out.println("Not prime");
            }
            else {
                System.out.println("Prime");
            }
            return;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        prime(n);
    }
}

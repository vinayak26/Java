//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.*;


public class q7 {

    public static void exponent(int n, int x){        
        double result = Math.pow(n, x);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int x = sc.nextInt();
            exponent(n, x);
        
    }
}

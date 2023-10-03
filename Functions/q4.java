//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
// import java.lang.Math.*;

public class q4 {

    public static void circumference(int r){
        double result= Math.PI * (2* r);
        System.out.println(result);
    return;
    }


   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    circumference(r);
   } 
}

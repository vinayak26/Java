//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class q3 {

  public static void greaterOfTwo(int a, int b){
    if(a>b){
        System.out.println(a);
    }
    else{
        System.out.println(b);
    }
    return;
  } 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    greaterOfTwo(a, b);
  }  
}

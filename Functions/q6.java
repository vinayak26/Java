// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.*;

public class q6 {
    public static void numCount(int n){
        Scanner sc = new Scanner(System.in);
        int pCount = 0;
        int nCount = 0;
        int zCount = 0;
        for(int i = 1; i<=n; i++){
            int num = sc.nextInt();
            if(num>0){                
                pCount = pCount+1;
     
            }
            else if(num<0){ 
                nCount = nCount+1;              
                             
            }
            else{
                zCount = zCount +1;               
            }   
        }
        // Print the counts within the numCount function
        System.out.println("Positive Count: " + pCount);
        System.out.println("Negative Count: " + nCount);
        System.out.println("Zero Count: " + zCount);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numCount(n);
    }
}

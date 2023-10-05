//Find the maximum & minimum number in an array of integers. 

import java.util.Scanner;


public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i = 0 ; i<size;i++){
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MAX_VALUE + 1;
        int min = Integer.MIN_VALUE - 1;





        for(int i = 0 ; i<size ; i++){
            if(numbers[i]>max){

                max=numbers[i];
                
            }if(numbers[i]<min){
                min = numbers[i];
            }
        }

        System.out.println("Largest number is :" + max);
        System.out.println("Minimum number is: " + min);
    }
}

//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.


import java.util.*;

public class q5 {

    public static void eligible(int age){
        if(age>=18){
            System.out.println("You are Eligible to Vote");
        }
        else{
            System.out.println("You are not Eligible to Vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        eligible(age);
    }    
}

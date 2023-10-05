import java.util.*;
public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i = 0; i <size;i++){
            numbers[i]=sc.nextInt();
        }
        boolean isAscending = true;

        //output

        for(int i = 0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("Ascending");
        }
        else{
            System.out.println("Not Ascending");
        }
    }
}

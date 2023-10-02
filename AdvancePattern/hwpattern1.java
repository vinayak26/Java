public class hwpattern1 {
    public static void main(String[] args) {
        int n = 5;
        //stars
        for(int i=1;i<=n;i++){
            for(int j=1;j<=1;j++){
            System.out.print("*");
        }
        //spaces
        for(int space=0;space<=i-1;space++){
            System.out.print(" ");
        }if(i>1){
        System.out.print("*");}
        
        System.out.println();
        }
        
    }
}

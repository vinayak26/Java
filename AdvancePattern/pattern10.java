public class pattern10{
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1 ; i<=n; i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*"+ " ");
            }
            for(int space = 1; space<=2*(n-i);space++){
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
             System.out.println();
        }
             
        for(int i = n ; i>=1; i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*"+ " ");
            }
            for(int space = 1; space<=2*(n-i);space++){
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
             System.out.println();

}
}
}
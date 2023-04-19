public class Nested1_Square {
    
    public static void main(String[] args) {
        //MACHINE PROBLEM #1: SQUARE
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        sc.close();
        
        for(int r=1; r<=n; r++){
            for(int c=1; c<=n; ++c){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
    
}

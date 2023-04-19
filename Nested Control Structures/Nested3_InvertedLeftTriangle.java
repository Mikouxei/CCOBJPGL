public class Nested3_InvertedLeftTriangle {
    
    public static void main(String[] args) {
        //MACHINE PROBLEM #3: INVERTED LEFT HALF TRIANGLE 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        sc.close();
        
        for(int r=n; r>=1; r--){
            for(int c=1; c<=r; ++c){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
}

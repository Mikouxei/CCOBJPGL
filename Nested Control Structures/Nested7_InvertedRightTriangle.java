public class Nested7_InvertedRightTriangle {
    
    public static void main(String[] args) {
        //MACHINE PROBLEM #7: INVERTED RIGHT HALF TRIANGLE 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        sc.close();
        
        for(int r=n; r>=1; r--){
            for(int s=n; s>=r; s-=1){
                System.out.print("  ");
            }
            for(int o=1; o<=r; ++o){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
    
}

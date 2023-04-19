public class Nested10_FullTriangle {
    
    public static void main(String[] args) {
        //MACHINE PROBLEM #10: FULL TRIANGLE 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        sc.close();
        
        for(int r=1; r<=n; r++){
            for(int s=n; s>=r; s-=1){
                System.out.print("  ");
            }
            for(int o=1; o<=r*2-1; ++o){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
    
}

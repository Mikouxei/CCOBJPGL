public class Nested9_InvertedRightHollowTriangle {
    
    public static void main(String[] args) {
        //MACHINE PROBLEM #9: INVERTED RIGHT HOLLOW HALF TRIANGLE  
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        sc.close();
        
        for(int r=n; r>=1; r--){
            for(int s=n; s>=r; s-=1){
                System.out.print("  ");
            }
            for(int o=1; o<=r; ++o){
                if(o==1 || r==n || o==r){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        
    }
    
}

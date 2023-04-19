public class Nested4_LeftHollowTriangle {
    
    public static void main(String[] args) {
        //MACHINE PROBLEM #4: LEFT HOLLOW HALF TRIANGLE 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        sc.close();
        
        for(int r=1; r<=n; r++){
            for(int c=1; c<=r; ++c){
                if(c==1 || r==n || c==r){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        
    }
    
}

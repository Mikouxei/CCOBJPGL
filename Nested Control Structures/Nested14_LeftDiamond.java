public class Nested14_LeftDiamond {

    public static void main(String[] args) {
        //MACHINE PROBLEM #14: HALF LEFT DIAMOND 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        sc.close();
        
        for(int r=1; r<=n/2; r++){
            for(int o=1; o<=r; ++o){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int r=n/2+1; r>=1; r--){
            for(int o=1; o<=r; ++o){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
    
}

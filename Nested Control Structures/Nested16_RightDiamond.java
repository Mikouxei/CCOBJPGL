public class Nested16_RightDiamond {

    public static void main(String[] args) {
        //MACHINE PROBLEM #16: HALF RIGHT DIAMOND  
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        sc.close();
        
        for(int r=1; r<=n/2; r++){
            for(int s=n/2; s>=r; s-=1){
                System.out.print("  ");
            }
            for(int o=1; o<=r; ++o){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int r=n/2+1; r>=1; r--){
            for(int s=n/2; s>=r; s-=1){
                System.out.print("  ");
            }
            for(int o=1; o<=r; ++o){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
    
}

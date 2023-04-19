public class Nested15_LeftHollowDiamond {

    public static void main(String[] args) {
        //MACHINE PROBLEM #15: HALF LEFT HOLLOW DIAMOND 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        sc.close();
        
        for(int r=1; r<=n/2; r++){
            for(int o=1; o<=r; ++o){
                if(o==1 || o==r){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        for(int r=n/2+1; r>=1; r--){
            for(int o=1; o<=r; ++o){
                if(o==1 || o==r){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        
    }
    
}

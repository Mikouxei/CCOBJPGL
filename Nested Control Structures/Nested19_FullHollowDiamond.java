public class Nested19_FullHollowDiamond {

    public static void main(String[] args) {
        //MACHINE PROBLEM #19: FULL HOLLOW DIAMOND 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of figure: ");
        int n = sc.nextInt();
        sc.close();
        
        for(int r=1; r<=n/2; r++){
            for(int s=n/2; s>=r; s-=1){
                System.out.print("  ");
            }
            for(int o=1; o<=r*2-1; ++o){
                if(o==1 || o==r*2-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        for(int r=n/2+1; r>=1; r--){
            for(int s=n/2; s>=r; s-=1){
                System.out.print("  ");
            }
            for(int o=1; o<=r*2-1; ++o){
                if(o==1 || o==r*2-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        
    }
    
}

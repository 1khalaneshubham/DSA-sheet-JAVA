import java.util.*;

public class TilingProblem {

    public static int Tiling(int n) {

    // base case
    if(n == 0 || n == 1){
        return 1;
    } 
    // kaam 
    // Vertical choice
    int fnm1 = Tiling(n-1);

    // horizontal choice
    int fnm2 = Tiling(n-2);
    
    int totWays = fnm1 + fnm2;
    return totWays;
    }
    public static void main(String[] args) {
   
        System.out.println((Tiling(4)));
   }
}
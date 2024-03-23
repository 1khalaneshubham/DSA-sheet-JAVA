import java.util.*;

public class FriendsPairing {
    
    public static int PairingFriends(int n){
        // Base Case 
        if(n == 1 || n == 2){
            return n;
        }
        // Choice
        // Single
        int fnm1 = PairingFriends(n-1);

        // Pair
        int fnm2 = PairingFriends(n-2);
        int pairways = (n-1)*fnm2;

        // totWays
        int totWays = fnm1 + pairways;
        return totWays;

        // return PairingFriends(n-1) + (n-1) * PairingFriends(n-2);
    }
    public static void main(String[] args) {
     
        PairingFriends(3);
        System.out.println( PairingFriends(3));
    }
}

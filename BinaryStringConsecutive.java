import java.util.*;

public class BinaryStringConsecutive {

    public static void PrintBinStrings(int n , int lastplace, String str){

        // Base Case
        if(n == 0){
            System.out.println(str);
            return;
        }
        // kaam
        // if(lastplace == 0) {
        //     // Sit 0 on chair n
        //     PrintBinStrings(n-1, 0, str.append("0"));
        //     PrintBinStrings(n-1, 1, str.append("1"));
        // }else{
        //     PrintBinStrings(n, lastplace, str);
        // }

        PrintBinStrings(n-1, 0, str+"0");
        if(lastplace == 0){
            PrintBinStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        PrintBinStrings(3, 0, "");
    }
}

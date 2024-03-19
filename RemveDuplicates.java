import java.util.*;

public class RemveDuplicates {

    public static void RemveDup(String str , int idx, StringBuilder newStr, boolean map[]){
        // Base Case
        if(idx == str.length()){
            System.out.println(newStr);
            
            return ;
        }
        // Kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true ) {
            // Duplicate
            RemveDup(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            RemveDup(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "aadpeffddpeweesdfeejk";
        RemveDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}

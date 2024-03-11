/*
Input: original_array[] = {1, 2, 3} Output: array_reversed[] = {3, 2, 1}

Input: original_array[] = {4, 5, 1, 2}
Output: array_reversed[] = {2, 1, 5, 4}
*/

import java.util.*;


public class ArrayReversecode {

    public static void reverseArray(int[] arr){
        int[] revsArr = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            revsArr[i] = arr[arr.length-i-1];
        }

        // Print reversed array
        System.out.print("Reversed Array: ");
        for(int i : revsArr){
            System.out.print(i + " ");
        }
    } 
    public static void main(String[] args) {
        // int[] arr1 = {4, 5, 1, 2};
        int[] arr1 = {1, 2, 3};

        reverseArray(arr1);
    }
}




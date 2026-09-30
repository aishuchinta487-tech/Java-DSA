import java.util.*;

class Solution {
    public static void main(String[] args) {

        int[] arr = new int[6];

        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
        arr[5] = 11;

        for (int i = 0; i <= 5; i++) {
            Arrays.sort(arr);
         
        }
       
        System.out.println("Smallest Element");
         System.out.println(arr[0]);
         System.out.println("Largest Element");
        System.out.println(arr.length-1);
        System.out.println(" Second Largest Element");
        System.out.println(arr.length-2);
        
    }
}
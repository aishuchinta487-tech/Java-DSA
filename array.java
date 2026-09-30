import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr = new int[n];

        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
        arr[5] = 11;
 int largest=Integer.MIN_VALUE;
 int sclargest=Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
           if(arr[i]>largest){
            sclargest=largest;
            largest=arr[i];
           }
           else if(arr[i]>slargest&& arr[i]!=largest){
           slargest=arr[i];
           }
         
        }
       
    }
}
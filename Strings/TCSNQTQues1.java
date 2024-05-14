// Return missing element in the array


// take a input M and a arr as input of len M-1 arr should contain distinct unique 
// elemetns from 1 to M no element in arr should be repeated write a function to return
// the element that is missing in the arr.

import java.util.Scanner;

public class TCSNQTQues1 {
    public static int isNotPresent(int[] a, int M){
        int sum=0;
        for(int i:a){
            sum += i;
        }
        int totalSum = M*(M+1)/2;
        int ans = totalSum - sum;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = sc.nextInt();
        int[] a = new int[M-1];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("The number not present in the array is: " + isNotPresent(a, M));
        sc.close();
    }
}

//The Game is as follows You have given a binary array, where 1 denotes push operation and 0 denotes a pop operation in a queue. The task is to check if the possible
//set of operations are valid or not.
//Print Valid if the set of Operations are Valid Otherwise Print Invalid.
//Input Format
//The First Line contains an Integer T, as the number of Test cases.
//The Next Line contains an Integer N, as the Size of the Array.
//The Next Line contains N Binary numbers separated by space.

import java.util.*;
public class Main {
    public static void main (String args[]) {
    Scanner kx= new Scanner (System.in);
    int test=kx.nextInt();
    while(test!=0){
        int n=kx.nextInt();
        int [] nums= new int [n];
        for (int i=0;i<n;i++){
            nums[i]=kx.nextInt();
        }
        if (check(nums))
        System.out.println("Valid");
        else
        System.out.println("Invalid");
        test--;
    }
    }
    public static boolean check(int[] arr){
        int zero=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==1)
            zero++;
            else{
             if (zero==0)
            return false;
            zero--;
            }
        }
        return true;
    }
}

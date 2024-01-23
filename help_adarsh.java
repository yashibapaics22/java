//Adarsh is free at this time. He has a given array of integers arr, Now he is making all possible subarrays of this array and trying to find the sum of smallest
//element from each subarray.This process will take a long time so help him to find his result in less time.
//Since the answer may be large, return the answer modulo 10^9 + 7.
//Print the sum of the smallest element of each possible sub array.
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner kx= new Scanner (System.in);
        int length= kx.nextInt();
        int [] nums= new int [length];
        for (int z=0;z<length;z++){
            nums[z]= kx.nextInt();
        }
        int c=0;
        int sum_of_mins=0;
        for (int s=0;s<length;s++){
            int minimum=nums[s];
            for (int h=s;h<length;h++){
                minimum=Math.min(nums[h],minimum);
                sum_of_mins+=+minimum;
            }
        }
    System.out.println(sum_of_mins);
    }
}

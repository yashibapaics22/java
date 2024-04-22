//We are given a circular array, print the next greater number for every element. If it is not found print -1 for that number. 
//To find the next greater number for element Ai , start from index i + 1 and go uptil the last index after which we start looking for the greater number from the starting 
//index of the array since array is circular.
//Input Format
//First line contains the length of the array n. Second line contains the n space separated integers.
import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner kx= new Scanner (System.in);
    int n=kx.nextInt();
    int [] nums= new int [n];
    for (int i=0;i<n;i++){
        nums[i]=kx.nextInt();
    }
    int [] arr= new int [n];
    Stack<Integer> st= new Stack<>();
    for (int i=0;i<2*n-1;i++){
        while(!st.isEmpty() && nums[st.peek()]<nums[i%n]){
            arr[st.pop()]=nums[i%n];
        }
        if (i<n)
        st.push(i);
    }
    while(!st.isEmpty()){
        arr[st.pop()]=-1;
    }
    for (int i=0;i<n;i++)
    System.out.print(arr[i]+" ");
        // Your Code Here
    }
}

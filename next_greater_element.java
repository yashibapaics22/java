//Given an array, print the Next Greater Element (NGE) for every element. The Next Greater Element for an element x is the first greater
//element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1.
//Input Format
//First line of the input contains a single integer T denoting the number of testcases. First line of each testcase contains an integer N 
//denoting the size of array. Second line of each testcase contains N space seperated integers denoting the array.


import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++)
				arr[i] = scn.nextInt();
			nextLarger(arr);
			t--;
		}

	}
	// Function to print Next Greater Element for each element of the array
	public static void nextLarger(int[] arr) {
        Stack <Integer> st= new Stack<>();
		int [] nums= new int [arr.length];
		for (int i=0;i<arr.length;i++){
			while(!st.isEmpty() && arr[st.peek()]<arr[i]){
				nums[st.pop()]=arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()){
			nums[st.pop()]=-1;
		}
// Write Code here
        for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]+","+nums[i]);
		}
	}
}

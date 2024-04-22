//he stock span problem is a financial problem where we have a series of N daily price quotes for a stock and we need to calculate span of stock’s price for all N days.
//You are given an array of length N, where ith element of array denotes the price of a stock on ith. Find the span of stock's price on ith day, for every 1<=i<=N.
//A span of a stock's price on a given day, i, is the maximum number of consecutive days before the (i+1)th day, for which stock's price on these days is less than or 
//equal to that on the ith day.
//Input Format
//First line contains integer N denoting size of the array.
//Next line contains N space separated integers denoting the elements of the array.


import java.util.*;
public class Main {
	public static void main(String args[])  {
	Scanner kx= new Scanner (System.in);
		// Your Code Here
	int n=kx.nextInt();
	int [] nums=new int [n];
	for (int i=0;i<n;i++){
		nums[i]=kx.nextInt();
	}
	Stack<Integer> st=new Stack<>();
	int [] ans= new int [n];
	for (int i=0;i<n;i++){
       while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
         st.pop();
	   }
       if (!st.isEmpty())
	   ans[i]=i-st.peek();
	   else
	   ans[i]=i+1;
	   st.push(i);
	}
	for (int i=0;i<n;i++){
		System.out.print(ans[i]+" ");
	}
	System.out.println("END");
	}
}


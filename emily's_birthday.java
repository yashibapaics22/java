/*It's Emily’s birthday today, so all her friends brought candy for her. It’s customary at her school that every classmate of hers gives her one unique candy. 
Some of her classmates were absent on that day, so Emily’s best friend, being mischievous, snuck some extra candies in place of those friends into her Candy Bag.
You are given the contents of Emily’s Candy Bag, could you find which candies are from her best friend?
Input Format
First line contains an integer N, the number of candies in Emily’s Bag.
Second line contains N space separated integers Ai, representing a candy from the person Ai.
Constraints
1 <= N <= 105
1 <= Ai <= N
Output Format
Print the value that represents the candies from Emily’s best friend.
Sample Input
5
1 3 4 2 2
Sample Output
2
Explanation
As there are two candies numbered 2, Emily’s best friend gave her candy numbered 2.*/

import java.util.*;
public class Main {
    public static void main (String args[]) {
    Scanner kx = new Scanner (System.in);
    int length=kx.nextInt();
    int [] nums= new int [length];
    for (int i=0;i<length;i++){
        nums[i]=kx.nextInt();
    }
    Arrays.sort(nums);
    for (int z=1;z<length;z++){
        if (nums[z]==nums[z-1]){
            System.out.println(nums[z]);
            break;
        }
    }
    }
}

//Monu has been given three array of different sizes . Let the arrays be A, B, C. Monu aim to find the calculate the minimum absolute difference between the maximum
//and minimum number from the triplet a, b, c such that a, b, c belongs to A, B, C i.e minimize |max(a,b,c) - min(a,b,c)|
//Input Format
//The first line contains a three numbers n1, n2, n3 denoting the size of the three arrays respectively. The next line contains n1 integers separated by space which 
//are the elements of the first array. The next line contains n2 integers separated by space which are the elements of the second array. The next line contains n3 integers 
//separated by space which are the elements of the third array.
import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner kx= new Scanner (System.in);
      int n1=kx.nextInt();
      int n2=kx.nextInt();
      int n3=kx.nextInt();
      int [] arr1=new int [n1];
      int [] arr2= new int [n2];
      int [] arr3= new int [n3];
      for (int i=0;i<n1;i++){
          arr1[i]=kx.nextInt();
      }
      for (int i=0;i<n2;i++){
          arr2[i]=kx.nextInt();
      }
      for (int i=0;i<n3;i++){
          arr3[i]=kx.nextInt();
      }
      int max=Integer.MAX_VALUE;
      for (int p:arr1){
          for (int q:arr2){
              for (int r:arr3){
                  int test1=Math.min(Math.min(p,q),r);
                  int test2=Math.max(Math.max(p,q),r);
                  int sub= test2-test1;
                  if (max>sub)
                  max=sub;
              }
          }
      }
      System.out.println(max);
    }
}

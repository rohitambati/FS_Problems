/*Given an array of integers, return the maximum sum for a non-empty subarray (contiguous elements) with at most one element deletion. 
In other words, you want to choose a subarray and optionally delete one element 
from it so that there is still at least one element left and the sum of the remaining elements is maximum
possible.

Note that the subarray needs to be non-empty after deleting one element.

The first line of input contains the array of integers 
Example 1:

Input: arr = [1,-2,0,3]
Output: 4

Explanation: Because we can choose [1, -2, 0, 3] and drop -2, thus the subarray [1, 0, 3]
becomes the maximum value.

Example 2:
Input: arr = [1,-2,-2,3]
Output: 3

Explanation: We just choose [3] and it's the maximum sum.

Example 3:
Input: arr = [-1,-1,-1,-1]
Output: -1

Explanation: The final subarray needs to be non-empty. You can't choose [-1] and delete -1
from it, then get an empty subarray to make the sum equals to 0.
*/
import java.util.*;
class MaxSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=s.split(" ");
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            al.add(Integer.parseInt(a[i]));
        }
        //System.out.println(al);
        int neg=0; //sum of negative numbers
        int count=0;
        for(int i=0;i<al.size();i++){
            if(al.get(i)<0){
                neg+=al.get(i);
                count++;
            }
        }
        if(Math.abs(neg)>Collections.max(al) && count>1){
            System.out.println((int)Collections.max(al));
            
        }
        
        else if(Math.abs(neg)>Collections.max(al) && count==1){
            int sum=0;
            for(int i=0;i<al.size();i++){
                if(al.get(i)>0){
                    sum+=al.get(i);
                }
            }
            System.out.println((int)sum);
        }   
        else if(Math.abs(neg)<Collections.max(al) && count==1){
            int sum=0;
            for(int i=0;i<al.size();i++){
                if(al.get(i)>0){
                    sum+=al.get(i);
                }
            }
            System.out.println((int)sum);
        }   

    }
}
/*
You are given a list of N integers List[], list contains both +ve and -ve integers.
Your task is to findout, the Highest Product possible,
Where the product is the product of all the elements of contiguous sublist sList[],
and sub list should conatin atleast 1 integer.

Input Format:
-------------
Line-1: An integer N.
Line-2: N space separated integers, List[].

Output Format:
--------------
Print an integer output, the highest product.

Sample Input-1:
---------------
4
2 3 -2 4

Sample Output-1:
----------------
6

Explanation:
------------
Product of contiguous sub list [2,3].


Sample Input-2:
---------------
3
-2 0 -3

Sample Output-2:
----------------
0

Explanation:
------------
Product of sub list [0], where [-2,-3] is not a contiguous sublist

*/
import java.util.*;
class HighestProduct{
    public static int findProduct(List<Integer> sublst){
        if(sublst.size()==1){
            return sublst.get(0);
        }
        int product=1;
        for(int i=0;i<sublst.size();i++){
            product*=sublst.get(i);
        }
        return product;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            al.add(x);
        }
        int max_product=Integer.MIN_VALUE;
        for(int i=0;i<al.size();i++){
            for(int j=i+1;j<al.size();j++){
                List<Integer> sublst = al.subList(i,j);
                if(max_product<findProduct(sublst)){
                    max_product=findProduct(sublst);
                }
            }
        }
        System.out.println(max_product);
    }
}
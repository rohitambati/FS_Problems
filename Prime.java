/*

Leela wants to win every time. 
She will be given a pair of Integers(a,b), Which are Positive Prime numbers. 

A prime number is an integer greater than 1 that has no positive divisors 
other than 1 and itself.

-Their absolute difference is exactly equal to  2     [|b-a|=2].

She will be given a range of integers (i,j) Both Inclusive 
Help Leela find such pairs which are in the range(i,j)

Note that pairs (a,b) and (b,a) are considered to be the same pair.

Print 0 if no such pairs exists

Sample Test Case
input = 3 13
output = 3

Explanation1:
There are three pairs of twins: (3,5),(5,7) and (11,13).
*/

import java.util.*;
class Prime{
    public static boolean checkPrime(int num){
        if(num==0 || num==1)
            return false;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1<1){
            n1=2;
        }   
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=n1;i<=n2;i++){
            if(checkPrime(i)==true){
                al.add(i);
            }
            
        }
        //System.out.println(al);
        int count=0;
        for(int i=0;i<al.size()-1;i++){
           for(int j=i+1;j<al.size();j++){
               if(Math.abs(al.get(i)-al.get(j))==2){
                   count++;
               }
           }
        }
        System.out.println(count);
    }
}

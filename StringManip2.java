/*
We have a string S of lowercase letters, and an integer array shifts.

Call the shift of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a'). 

For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.

Now for each shifts[i] = x, we want to shift the first i+1 letters of S, x times.

Return the final string after all such shifts to S are applied.

Example 1:
input =abc
3 5 9
output =rpl


input: S = abc, shifts = [3,5,9]
Output: rpl
Explanation: 
We start with "abc".
After shifting the first 1 letters of S by 3, we have "dbc".
After shifting the first 2 letters of S by 5, we have "igc".
After shifting the first 3 letters of S by 9, we have "rpl", the answer.

*/
import java.util.*;
class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuffer str=new StringBuffer();
        String input=sc.next();
        str.append(input);
        String s=new String();
        sc.nextLine();
        s=sc.nextLine();
        
        String[] arr=s.split(" ");
        int[] shifts=new int[arr.length];
        for(int i=0;i<shifts.length;i++){
            shifts[i]=Integer.parseInt(arr[i]);
        }
        for(int i=0;i<shifts.length;i++){
            for(int j=0;j<=i;j++){
                if(shifts[i]>26){ 
                    shifts[i]-=26;
                }
                if((int)(str.charAt(j))==122){ // if(char==z) resetting to a
                    str.setCharAt(j,(char)(96+shifts[i]));
                }
                int x=(int)str.charAt(j)+shifts[i];
                else if(x>122){
                    int ascii=(int)(str.charAt(j))+shifts[i];
                    str.setCharAt(j,(char)ascii);
                }
                else{
                    str.setCharAt(j,(char)(str.charAt(j)+shifts[i]));
                }
            }
        }
        System.out.println(str.toString());
    }
}

/*Suraj and Tom are two best friends. 

Both of them have given two Strings S1 and S2 
Suraj has given String S1 and Tom has given String S2
Suraj is always bothered about Tom Strings and checks if's  his string follows sSequence of Tom strings or not 

Help Suraj to solve his problem 

print true if it follows sSequence else print false

A sSequence of  string is a new string which is formed from the original string by removing some (can be none) of the characters without
disturbing the relative positions of the remaining characters. 


Sample Test Case1

input = abc
ahbgdc
output = true


Sample Test Case2
input = aik
appkllli
output = false

Explanation - aik is not a subsequnece of appkllli 


Sample Test Case3

input = axc 
ahbgdc
output = false

Both strings consists only of lowercase characters.
*/

import java.util.*;
class SSequence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int index1=0,index2=0;
        while(index2<s2.length()){
            if(s2.charAt(index2)==s1.charAt(index1)){
                index1++;
                if(index1==s1.length()){
                    System.out.println(true);
                    System.exit(1);
                }
            }
            index2++;
        }

        System.out.println(false);
    }
}
/*Write a java program to read a word as input and returns another string as output, 
such that , a vowel in the input string will be de denoted by upper case letter ‘V’ and a 
consonant in the input string will be denoted by upper case letter ‘C’. 

Note - The output will contain a word containing alternating sequence of ‘C’ and ‘V’.
It is not permissible to have two or more consecutive V or C in Sequence.
Assume the Input String will contain only lower and upper case alphabets 

input = hello 
output = CVCV

Explanation - When we convert the above  "hello" we have CVCCV 
but for the output It is not permissible to have two or more consecutive V or C in Sequence.
so CVCCV changes to CVCV 


Sample Test Cases 

input = aeibo
output = VCV

input = Whereabouts
output = CVCVCVC
             
input = aeiou
output = V

input = BCDEFGIIKL
output = CVCVC

input = aeiOUabCdEfg
output = VCVC
*/
import java.util.*;
class Pattern2{
    public static void printPattern(String s){
        StringBuilder sb=new StringBuilder();
        ArrayList<Character> vowels=new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int index=0;
        for(int i=0;i<s.length();i++){
            if(index==0 && vowels.contains(s.charAt(i))){
                sb.append('V');
                index++;
            }
            else if(index==0 && !vowels.contains(s.charAt(i))){
                sb.append('C');
                index++;
            }
            else if(vowels.contains(s.charAt(i)) && sb.charAt(index-1)!='V' ){
                sb.append('V');
                index++;
            }
            else if(!vowels.contains(s.charAt(i)) && sb.charAt(index-1)!='C' ){
                sb.append('C');
                index++;
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        printPattern(s);
    }
}
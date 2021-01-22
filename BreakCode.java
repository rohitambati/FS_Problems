/*

Ramu has given a task to break his friends code 
he will given all lower case alphabets  and code as the input 
Ramu has to figure the text from the code and display the text 

Input - The first line of input consists of lower case alphabets 
and code 

The first alphabet letter will given 01, second alphabet will be given 02, and so on 

Output - Break the code and display the string 


Sample Test Case - 1 
input =abcdefghijklmnopqrstuvwxyz
110525
output = key


Explantion - 
From the above test case we have 'a' has '01', 'b' has '02', and finally 'z' has '26' 
where each alphabet will be assigned a two digit number 
and for the code 110525 the characters will be 11 as 'k', 05 as 'e' and 25 as 'y' 
so the output is "key" 

Sample Test Case - 2
input =
qpwoeirutyalskdjfhgzmxncbv
131013090521
output = system


Explantion - From the above test case we have 'q' as '01' , 'p' as '02' and finally 'v' as '26'
and for the code 131013090521 we have the following code 
13-s
10-y
13-s
09-t
05-e
21-m

so the output is system

*/
import java.util.*;
class BreakCode{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String key=sc.next();
        String code=sc.next();
        for(int i=0;i<key.length();i++){
            System.out.println(i+" "+key.charAt(i));
        }
        for(int i=0;i<code.length()-1;i=i+2){
            int index=Integer.parseInt(code.substring(i,i+2));
            System.out.println(index+" "+key.charAt(index-1));
            System.out.println(key.charAt(index-1));
        }
    }
}
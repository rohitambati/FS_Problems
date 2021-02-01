/*

Program1

Ramu  has given a string which will only contain lower case alphabets(a-z). 
He wants to reduce the string by doing a series of operations. 
In each operation he selects a pair of adjacent lowercase letters that are same, and he will remove them. 
For example, the word "ccd" would be "d" in one operation.
Ramu work is to delete as many characters as possible using the method and print final string. 
If the final string is empty then print  "-1"


Sample Test Case-1
input = addcbccttt
output = acbt

Explanation
ramu performs the following sequence of operations to get the final string.
addcbccttt -->  acbccttt --> acbttt --> acbt

input = aa
output = -1

input = dood

Explanation
following operations to get the final string
dood → dd → -1

*/
import java.util.*;
class StringManipulation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder(s);
        for(int i=1;i<sb.length();i++){
            if(sb.charAt(i)==sb.charAt(i-1)){
                sb.delete(i-1,i+1);
                i=1;
                if(sb.length()==0){
                    System.out.println("-1");
                    System.exit(1);
                }
            }
        }
        System.out.println(sb.toString());
    }
}

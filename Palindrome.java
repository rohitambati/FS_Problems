/*Write a Java program to check if a sentence is a palindrome or not

If Palindrome print true else print false

We know a string is Palindrome if it is the same reading from both sides.
Now you have to check if a string is palindrome or not

Note - Assume the input line  here is not case sensitive
ignore the special symbols,spaces and compare only the characters and print true or false


input =a man a plan a canal panama
output = 1

in the above  example first character is 'a' last character is 'a'
second character is 'm' last second character is 'm' and comparing so on all characters should be equal


input =do nine men interpret nine men i nod
output = true

input =Red rum, sir, is murder
output = true 

input = Was it a cat I saw?
output = true

input =Eva,   can I s e e b^% e e s i n a ca;;;ve?
output = true 

input =No lemon, no melon
output = true 
*/
import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122)){
                sb.append(s.charAt(i));
            }
        }
        String str=sb.toString();
        sb.reverse();
        String reverse = sb.toString();
        if(str.equalsIgnoreCase(reverse)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
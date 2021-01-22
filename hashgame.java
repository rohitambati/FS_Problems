/*Program-1 

Tanu and Manu are playing a Rangoli Game with "#", as part of the game 
Tanu has to read a group of words and double every consonant and 
place an "#" in between them . 



Sample Test Case-1
input = this is fun
output = t#th#his#s is#s f#fun#n

Explanation 
t is consonant then double the consonant and place "#" in between, 
So it becomes "t#t" and do this for full string

Sample Test Case-2
input =hello
output = h#hel#ll#lo

Explanation 
h is consonant then double the consonant and place "#" in between, 
so it become "h#h" and e is vowel so no change for it and  same for the remaining characters 
*/
import java.util.*;
class hashgame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        ArrayList<Character> al=new ArrayList<Character>();
        al.add('a');
        al.add('e');
        al.add('i');
        al.add('o');
        al.add('u');
        for(int i=0;i<str.length();i++){
            if(al.contains(str.charAt(i))){
                sb.append(str.charAt(i));
            }
            else if(str.charAt(i)==' '){
                sb.append(" ");
            }
            else{
                sb.append(str.charAt(i)+"#"+str.charAt(i));
            }
        }
        System.out.println(sb.toString());
        
    }
}
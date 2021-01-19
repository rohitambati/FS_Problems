/*Program1

Ramu and Shyam are playing a game called ReverseGame. 
In this game Shyam wants Ramu to convert the string in the following manner 

Ramu has to only reverse the letters(a-z,A-Z) and other letters remain unchanged


Sample Test Case -1

input = a&b*c$rt
output = t&r*c$ba

Explanation - 

From the above test case we have a,b,c,r,t as the alphabets 
and reversing only this characters without disturbing other characters we will have 
t&r*c$ba as the output

Sample Test Case -2

input = a&b$c#d
output = d&c$b#a

Explanation - 

From the above test case we have a,b,c,d as the alphabets 
and reversing only this characters without disturbing other characters we will have 
d&c$b#a  as the output
*/
import java.util.*;
class ReverseGame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder();
        LinkedHashMap<Integer,Character> hm=new LinkedHashMap<Integer,Character>();
        for(int i=0;i<str.length();i++){
            if(!Character.isLetter(str.charAt(i))){
                //System.out.println(str.charAt(i)+" "+i);
                hm.put(i,str.charAt(i)); 
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        sb.reverse();
        for (Map.Entry<Integer,Character> entry : hm.entrySet()){
            int pos=entry.getKey();
            char c=entry.getValue();
            sb.insert(pos,c); 
            //System.out.println(sb.toString());
        }    
        System.out.println(sb.toString());
    }
}
/*

You are provided a string of characters(lowercase only),
You can change the order of the characters of the string.
After changing the order, the resultant string should be 
no two immidiate characters are same.

Return true, if you are able to find such resultant string, 
Otherwise false.

Input Format:
-------------
A String S

Output Format:
--------------
Print a boolean value.


input = aaabd
output = true


input =aaab
output =false

*/

import java.util.*;
class StringManip{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        int index=0;
        while(index<s.length()){
            char c=s.charAt(index);
            int count=1;
            for(int i=index+1;i<s.length();i++){
                if(s.charAt(i)==c){
                    count+=1;
                }
            }
            if(!hm.containsKey(c)){
                hm.put(c,count);
                index++;
            }
            else{
                index++;
            }
        }
        //System.out.println(hm.toString());
        int maxValue=(Collections.max(hm.values()));
        if(maxValue-1 == (s.length()-maxValue) || maxValue<=s.length()/2 || maxValue==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

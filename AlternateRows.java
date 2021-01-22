/*
 Given a group of word/words and number of rows 'n'. 
 write it as shown in the test cases 


Sample Test Case - 1
input = THURSDAY
2
output = TUSAHRDY


Explanation: Write the word in 2 rows

T   U   S   A
  H    R   D   Y


the word formed is TUSAHRDY

Sample Test Case - 2
input = system
3
output = seytms

Explanation: write the given word in 3 rows 
s         e
  y    t    m
     s

the word is seytms


Sample Test Case-3
input =this is good
2
ti sgohsi od

t   i         s    g   o
  h   s    i         o   d

Explanation:
ti sgohsi od (We have one space in row-1 and another space in row-2) 

*/
import java.util.*;
class AlternateRows{
    public static void printPattern(String s,int n){
        StringBuilder[] sb=new StringBuilder[n];
        for(int i=0;i<n;i++){
            sb[i]=new StringBuilder();
        }
        int index=0;
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            sb[i].append(s.charAt(i));
            if(index==0){
                flag=true;
            }
            else if(index==n-1){
                flag=false;
            }
            if(flag){
                index++;
            }
            else{
                index--;
            }
        }
        for(i=0;i<n;i++){
            System.out.print(sb[i].toString());
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        if(n==1)
            System.out.println(s);
        else
            printPattern(s,n);    
    }
}

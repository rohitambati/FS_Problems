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
class Test
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
       
        int index=0;
        boolean flag=true;
        if(n==1)
        {
            System.out.println(s); 
            System.exit(1);
        }
        StringBuilder  sb[]=new StringBuilder[n];
        for(int i=0;i<n;i++)
        {
            sb[i]=new StringBuilder();
        }
        for(int i=0;i<s.length();i++)
        {
            sb[index].append(""+s.charAt(i));
            if(index==n-1)
            {
                flag=false;
            }
            else if(index==0)
            {
                flag=true;
            }
            if(flag)
            {
                index++;
            }
            else
            {
                index--;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(sb[i].toString());
        }
        
    }
}

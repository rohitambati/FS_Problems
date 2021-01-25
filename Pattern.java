/*
write a program to read a postive input 'n' from the user and print the following pattern 

Assume the input 'n' will always be a postive integer 

input = 5
output = 
A*1
B*C*3*2
D*E*F*6*5*4
G*H*I*J*10*9*8*7
K*L*M*N*O*15*14*13*12*11
 
Note - If in the above pattern if the alphabet exceed 'Z' then start print again from 'A'

*/
import java.util.*;
class Pattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ascii=65;
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)ascii+"*");
                ascii++;
                if(ascii>90){
                    ascii=65;
                }
            }
            ArrayList<Integer> al=new ArrayList<Integer>();
            for(int k=0;k<i;k++){
                al.add(num);
                Collections.sort(al,Collections.reverseOrder());
                //System.out.println(al);
                num++;
                for(int l=0;l<al.size();l++){
                    if(k==i-1){
                        System.out.print(al.get(l));
                        if(l!=al.size()-1)
                            System.out.print("*");
                    }
                }
                
            }
            System.out.println();
        }
    }
}
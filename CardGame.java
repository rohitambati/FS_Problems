/*

Andy and Shyam are playing a nice game. 
They are given a group of cards . 

In this game they each alternately discard and flip the cards on the pile from 
top to bottom 

At the starting they will say "YES" or "NO"

The first move is decided on which is called. 

If YES is called, the players top cards are flipped so they can see the face value. 
If NO is called, the top card is removed from each deck and discarded, 
then each flips their next card. 

Andy subtracts the value of Shyams card from his own and adds the result to his score. 
Likewise, Shyams subtracts the value of Andrea’s card from his own and adds the result to his score. 

From this point forward, each alternately discards then flips a card. 
Each time two cards are flipped, the players scores are computed as before. 

Once all the cards have been played, whoever has the maximum points wins. 

For Example Shyams cards, face down are [3,5,6] and Andy are [4,5,7]. 

After calling “YES” at random, they each compare their first cards. 
Shyams points are 3-4 =-1, and Andys are 4-3=1. 
They discard the 5’s and turn over their third cards. 
Shyam receives 6-7=-1 point and Andy receives 7-6=1 point. Shyams score is -2, Andys is +2 so Andy wins. 

You must print the name of the winner (Andy/Shyam) 
If both gets the same score print  "TIE"

The first line of input contains the Andys Number of cards followed by 
Andys cards  followed by 
Shyam Number of cards Followed by Shyam Cards and 
a string "YES"/"NO" 

Sample Input:
3
1 2 3
3
2 1 3
YES
Sample Output 
Shyam

Explanation
In this game, Andy =[1,2,3] and Shyam=[2,1,3]. 
Since the string Yes, the only cards flipped are at indexes 0 and 2. 


When i=0, Andy gets a[0]-m[0]=1-2 =-1 point and 
Shyam gets m[0]-a[0]=2-1 = 1 point.
When i=2, Andy gets a[2]-m[2]=3-3=0 points and Shyam gets m[2]-a[2]=3-3 = 0 points. 

At the end of play, Andy score is -1 and Shyam is 1 so Shyam wins

*/

import java.util.*;
class CardGame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] a=new int[n1]; //andy cards 
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[] s=new int[n2];  //shyam cards
        for(int i=0;i<n1;i++){
            s[i]=sc.nextInt(); 
        }
        String choice=sc.next();
        if(n1==0){
            System.out.println("Shyam");
            System.exit(1);
        }
        else if(n2==0){
            System.out.println("Andy");
            System.exit(1);
        }
        int ascore=0,sscore=0;
        int min=(n1<n2)?(n1):(n2);
        if(choice.equals("YES")){
            int index=0;
            for(int i=0;i<min;i=i+2){
               ascore+=a[i]-s[i];
               sscore+=s[i]-a[i];
               index=i;
               //System.out.println(ascore+" "+sscore);
            } 
            if(n1!=n2 && n1>min){
               while(index<n1){
                   ascore+=a[index];
                   index=index+2;
               }
            }
            else if(n1!=n2 && n2>min){
               while(index<n2){
                   sscore+=s[index];
                   index=index+2;
               }
            }
        }
        else{
            System.out.println("no");
            int index=1;
            for(int i=1;i<min;i=i+2){
               ascore=a[i]-s[i];
               sscore=s[i]-a[i];
            }
            if(n1!=n2 && n1>min){
               while(index<n1){
                   ascore+=a[index];
                   index=index+2;
               }
            }
            else if(n1!=n2 && n2>min){
               while(index<n2){
                   sscore+=s[index];
                   index=index+2;
               }
            }
        }

        if(ascore>sscore){
            System.out.println("Andy");
        }
        else if(ascore<sscore){
            System.out.println("Shyam");
        }
        else if(ascore==sscore){
            System.out.println("TIE");
        }
    }
}

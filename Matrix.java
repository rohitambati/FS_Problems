/*

Program-1

Write a program to interchange the middle row and middle column  elements of a matrix .

Accept the number of rows and columns of the matrix from the user if the matrix is not a square matrix print -1.

*assume it is odd dimensions matrix. 

input =
5 5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

output =
1 2 11 4 5 
6 7 12 9 10 
3 8 13 18 23 
16 17 14 19 20 
21 22 15 24 25 

*/

import java.util.*;
class Matrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=sc.nextInt();
            }
        }
        if(r!=c){
            System.out.println("-1");
            System.exit(1);
        }
        else{
            int row=0,col=(int)r/2;
            while(row<r && col>=0){
                int temp=m[row][col];
                m[row][col]=m[col][row];
                m[col][row]=temp;
                row++;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
Given an expression in string format print the value of the expression after evaluating 

Rules for Evaluation :
The expression is Evaluated from Left to Right and operators allowed are only +,-,/,*
Ignore Operator Precedence
Assume the expression only consists of numbers(0-9)(both postive and negative) and 
operators(+,-,*,/)

Test Case-1
input = 2+3*6
output = 30

Explanation :- The sum of 2+3 is 5 and 5*6 = 30 


Test Case-2
input = 5+7-9+0*0+1
output = 1

Explanation - The sum of 5+7 is 12 
12-9 is 3 and 3+0 is 3, 3*0 is 0 and 0+1 is 1 


Test Case-3
input = -1+-1*2
output = -4

Explanation -
-1 + -1 is -2 
and -2 * 2 is -4

import java.util.*;
class MathExp{
    public static int solution(int a,int b,char c){
        if(c=='+'){
            System.out.print(a+"+"+b+" = ");
            System.out.println(a+b);
            return a+b;
        }
        else if(c=='-'){
            System.out.print(a+" - "+b+" = ");
            System.out.println(a-b);
            return a-b;
        }
        else if(c=='*'){
            System.out.print(a+" * "+b+" = ");
            System.out.println(a*b);
            return a*b;
        }
        else if(c=='/'){
            System.out.print(a+" / "+b+" = ");
            System.out.println(a/b);
            return a/b;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        ArrayList<Integer> al=new ArrayList<Integer>();
        ArrayList<Character> op=new ArrayList<Character>(); //operators
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)=='-' && !Character.isDigit(exp.charAt(i+1))){
                al.add(-1*Character.getNumericValue(exp.charAt(i+1)));
                i=i+2;
            }
            if(Character.isDigit(exp.charAt(i))){
                System.out.println(exp.charAt(i)+" is digit ");
                al.add(Character.getNumericValue(exp.charAt(i)));
            }
            else{
                System.out.println(exp.charAt(i)+" is symbol ");
                op.add(exp.charAt(i));
            }
        }
        int ans=al.get(0),j=0;
        System.out.println(al);
        System.out.println(op);
        for(int i=0;i<al.size()-1;i=i+2){
                ans+=solution(ans,al.get(i+1),op.get(j));
                if(j<op.size()-1)
                    j++;
                /*if(i>0)
                    ans+=solution(ans,al.get(i+1),op.get(j)); 
        }
        System.out.println(ans);
    }
}*/
import java.util.*;
import java.lang.*;

class MathExp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n =0;
        for(int i=0;i<s.length();i++) {
            switch(s.charAt(i)) {
                case '+':
                        if(s.charAt(i+1)=='-'){
                            int a = Character.getNumericValue(s.charAt(i-1));
                            int b = -1*Character.getNumericValue(s.charAt(i+2));
                            n = a+b;
                        }
                        else{
                            int a = Character.getNumericValue(s.charAt(i-1));
                            int b = Character.getNumericValue(s.charAt(i+1));
                            n = a+b;
                        }
                    break;
                case '-':
                    if(s.charAt(i+1)=='-'){
                        int c = Character.getNumericValue(s.charAt(i-1));
                        int d = -1*Character.getNumericValue(s.charAt(i+2));
                        n = c-d;
                    }
                    else{
                        int c = Character.getNumericValue(s.charAt(i-1));
                        int d = Character.getNumericValue(s.charAt(i+1));
                        n = c-d;
                    }                    
                    break;
                case '*':
                        if(s.charAt(i+1)=='-'){
                            int e = Character.getNumericValue(s.charAt(i-1));
                            int f = -1*Character.getNumericValue(s.charAt(i+2));
                            n = e*f;
                        }
                        else{
                            int e = Character.getNumericValue(s.charAt(i-1));
                            int f = Character.getNumericValue(s.charAt(i+1));
                            n = e*f;
                        }
                    break;
                case '/':
                        if(s.charAt(i+1)=='-'){
                            int g = Character.getNumericValue(s.charAt(i-1));
                            int h = -1*Character.getNumericValue(s.charAt(i+2));
                            n = g/h;
                        }
                        else{
                            int g = Character.getNumericValue(s.charAt(i-1));
                            int h = Character.getNumericValue(s.charAt(i+1));
                            n = g/h;
                        }
                    break;
            }
        }
        System.out.println(n);
    }
}
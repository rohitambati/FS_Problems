import java.util.*;
class LongestPalindrome {
    public static String reverse(String str)
    {
        
        if (str == null || str.equals(""))
            return str;
 
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
    public static String normal(String str,int start,int end){
        return str.substring(start,end+1);
    }
    public static void findPalindrome(String s) {
        ArrayList<Character> al=new ArrayList<Character>();
        ArrayList<String> palindrome=new ArrayList<String>();
        if(s.length()==2){
            if(s.charAt(0)==s.charAt(1)){
                System.out.println(s);
                System.exit(1);
            }
            else{
                System.out.println(s.charAt(0));
                System.exit(1);
            }
        }
        for(int i=0;i<s.length();i++){
            al.add(s.charAt(i));   
        }
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(al.get(i)==(al.get(j))){
                    if(normal(s,i,j).equals(reverse(normal(s,i,j)))){
                        palindrome.add(normal(s,i,j));
                    }
                }
                
            }
        }
        System.out.println(longestPalindrome(palindrome));

    }
    public static String longestPalindrome(ArrayList<String> p){
        int max=-1;
        int index=0;
        for(int i=0;i<p.size();i++){
            if(((p.get(i)).length())>max){
                max=(p.get(i)).length();
                index=i;
            }
        }
        //System.out.println(p);
        return p.get(index);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.length()==1)
            System.out.println(s);
        else
            findPalindrome(s);
    }
}

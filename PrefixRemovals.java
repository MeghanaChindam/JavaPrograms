/*Question: You are given a string s consisting of lowercase letters of the English alphabet. 
You must perform the following algorithm on s:

Let x be the length of the longest prefix of s which occurs somewhere else in s as a contiguous 
substring (the other occurrence may also intersect the prefix). If x=0, break. Otherwise, 
remove the first x characters of s, and repeat.*/
import java.util.*;
public class Main{
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t--!=0){
	        String s=in.next();
	        Map<Character,Integer> m=new HashMap<>();
	        for(char c:s.toCharArray()) m.put(c,m.getOrDefault(c,0)+1);
	        int ind=-1;
	        for(int i=0;i<s.length();i++){
	            if(m.get(s.charAt(i))>1){
	                m.put(s.charAt(i),m.get(s.charAt(i))-1);
	                ind=i;
	            }else break;
	        }
	        for(int i=ind+1;i<s.length();i++) System.out.print(s.charAt(i));
	        System.out.println();
	    }
	}
}
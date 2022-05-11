//program to determine the smallest number k such that N = a1! + A2! + ... + Ak!, where each ai, for 1 ≤ i ≤ k is a positive integer.
import java.io.IOException;
import java.util.*; 
public class Main {
    static int[] fact=new int[10];
    static int size=1;
    static void preCompute(int N){
        fact[0] = 1;
        for (int i = 1; fact[i - 1] <= N; i++) {
            fact[i] = (fact[i - 1] * i);
            size++;
        }
    }
    static void findMin(int N){
        preCompute(N);
        int originalN = N;
        Vector<Integer> ans = new Vector<Integer>();
        for (int i = size - 1; i >= 0; i--) {
            while (N >= fact[i]) {
                N -= fact[i];
                ans.add(fact[i]);
            }
        }
        System.out.print(ans.size()+ "\n");
        /*for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i)+ " "); */
    }
    public static void main(String[] args) throws IOException {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         findMin(n);
         
 
    }
}
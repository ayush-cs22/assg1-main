/*
Q1) Sum of even and odd placed digits of a given number.
Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
2635
Sample Output
11
5
*/

import java.util.*;
public class sum_of_odd_and_even_placed_digits {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(),i=1,dig,evn_sm=0,odd_sm=0;
        while(N>0){
            dig=N%10;
            if(i%2==0)
            evn_sm+=dig;
            else
            odd_sm+=dig;
            N/=10;
            i+=1;
        }
        System.out.printf("%d\n%d",odd_sm,evn_sm);
	}
}

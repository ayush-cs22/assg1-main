/*
Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.

Input Format
Constraints
0 <= N <= 1000

Output Format
Sample Input
10
Sample Output
55
*/

import java.util.*;
public class nth_fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a = 0;
int b = 1;
while(n>0){
    a = a+b;
    b = a-b;
    n--;
}
    System.out.println(a);

    }
}

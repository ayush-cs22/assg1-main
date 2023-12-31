/*
Take the following as input.

A number (N1)
A number (N2)
Write a function which prints all armstrong numbers between N1 and N2 (inclusive).

371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

Input Format
Constraints
0 < N1 < 100 N1 < N2 < 10000

Output Format
Sample Input
400
1000
Sample Output
407
*/

import java.util.*;
public class print_armstrong_number {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i = n1; i<n2; i++){
            int c,s=0,r;
            c = i;
            while(c>0){
                r = c%10;
                s = s+(r*r*r);
                c = c/10;
            }
            if(s==i){
                System.out.println(i);
            }
        }
    }
}

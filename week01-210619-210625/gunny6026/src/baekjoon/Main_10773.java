package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Main_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int sum =0;
        while (n-- >0){
            int i = sc.nextInt();
            sum += i;

            if (i==0)
                sum -= stack.pop();
            else
                stack.push(i);
        }
        System.out.println(sum);
    }
}

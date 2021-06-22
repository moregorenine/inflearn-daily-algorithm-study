package baekjoon;

import java.io.*;
import java.util.Stack;

public class Main_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int array[] = new int[n];
        int answer[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        String[] temp = br.readLine().split(" ");
        for (int i=0; i<temp.length; i++){
            array[i] = Integer.parseInt(temp[i]);
        }

        stack.push(0);
        for (int i=1; i<n; i++){
            if (stack.isEmpty()){
                stack.push(i);
            }
            while (!stack.isEmpty() && array[stack.peek()]<array[i]){
                answer[stack.pop()] = array[i];
            }
            stack.push(i);
        }
        while (!stack.empty()){
            answer[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int x : answer){
            bw.write(x+" ");
        }
        bw.flush();
    }
}

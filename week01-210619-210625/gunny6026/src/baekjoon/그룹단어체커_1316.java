package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while (n-- > 0) {
            String str = br.readLine();
            if (check(str)) count++;
        }
        System.out.println(count);
    }
    static boolean check(String str) {
        boolean check[] = new boolean[26];
        int prev =0;
        for (int i=0; i<str.length(); i++){
           int now = str.charAt(i);
           if (now != prev){
               if (!check[now-'a']){
                   check[now-'a'] = true;
                   prev = now;
               }else {
                   return false;
               }
           }
        }
        return true;

    }
}

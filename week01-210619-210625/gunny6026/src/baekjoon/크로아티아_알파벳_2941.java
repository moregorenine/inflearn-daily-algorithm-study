package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아_알파벳_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count =0;
        int len = str.length();
        for (int i=0; i<len; i++){
            if (str.charAt(i)== 'c' && i< len-1){
                if (str.charAt(i+1)== '='){
                    i++;
                }else if (str.charAt(i+1) =='-'){
                    i++;
                }
            }else if (str.charAt(i)=='d' && i<len-1 ){
                if (str.charAt(i+1)=='-'){
                    i++;
                }else if (str.charAt(i+1)=='z'&& i<len-2){
                    if (str.charAt(i+2)=='='){
                        i+=2;
                    }
                }
            }else if (str.charAt(i)=='l' && i<len-1){
                if (str.charAt(i+1)=='j'){
                    i++;
                }
            }else if (str.charAt(i)=='n' && i<len-1){
                if (str.charAt(i+1)=='j'){
                    i++;
                }
            }else if (str.charAt(i)=='s' && i<len-1){
                if (str.charAt(i+1)=='='){
                    i++;
                }
            }else if (str.charAt(i)=='z' && i<len-1){
                if (str.charAt(i+1)=='='){
                    i++;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}

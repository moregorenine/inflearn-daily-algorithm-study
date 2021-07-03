package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class 체스판다시칠하기_1018 {
    static int chess[][];
    static int min = 32;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        chess = new int[N][M];
        for (int i=0; i<N; i++){
            String str = sc.next();
            for (int j =0; j<M; j++){
                if (str.charAt(j)=='B'){
                    chess[i][j] = 1;
                }
            }
        }
        int row = N-8;
        int column = M-8;
        for (int i= 0; i<= row; i++){
            for (int j=0; j<=column; j++){
                find(i,j);
            }
        }
        System.out.println(min);
    }
    public static void find(int x , int y){
        int value = chess[x][y];
        int count =0;
        for (int i=x; i<=x+7; i++){
            for (int j=y; j<=y+7; j++){
                if (value != chess[i][j]){
                    count++;
                }
                value = Math.abs(value-1);
            }
            value = Math.abs(value-1);
        }
        count = Math.min(count, 64-count);
        min = Math.min(min , count);
    }
}

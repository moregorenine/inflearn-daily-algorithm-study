package programmers;

import java.util.Arrays;
public class 예산 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0;
        for(int i : d){
            sum +=i;
        }
        if(budget>=sum) return d.length;
        int count =0;
        int j = d.length-1;
        while(sum > budget){
            sum -= d[j];
            j--;
            count++;
        }
        return d.length-count;
    }
}

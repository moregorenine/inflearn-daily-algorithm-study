package programmers;

import java.util.HashSet;

public class 폰켓몬 {
    public static void main(String[] args) {
        int nums[] = {3,3,3,2,2,4};
        HashSet<Integer> set = new HashSet<>();
        int answer =0;
        for (int i : nums){
            set.add(i);
        }
        if (nums.length/2>=set.size()){
            answer = set.size();
        }else{
            answer = nums.length/2;
        }

    }
}

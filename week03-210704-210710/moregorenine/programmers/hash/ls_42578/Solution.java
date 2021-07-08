package programmers.hash.ls_42578;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class Solution {
    @Test
    public void main() {
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Assert.assertEquals(5, solution(clothes));

        clothes = new String[][]{{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
        Assert.assertEquals(3, solution(clothes));
    }

    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (int value : hm.values()) {
            answer = answer * (value + 1);
        }

        return answer - 1;
    }

}

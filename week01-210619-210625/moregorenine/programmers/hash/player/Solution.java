package co.kr.programmers.hash.player;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class Solution {
    @Test
    public void main() {

        String[] participants = {"leo", "kiki", "eden"};
        String[] completions = {"eden", "kiki"};
        Assert.assertEquals("leo", solution(participants, completions));

        participants = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        completions = new String[]{"josipa", "filipa", "marina", "nikola"};
        Assert.assertEquals("vinko", solution(participants, completions));

        participants = new String[]{"mislav", "stanko", "mislav", "ana"};
        completions = new String[]{"stanko", "ana", "mislav"};
        Assert.assertEquals("mislav", solution(participants, completions));

    }

    public String solution(String[] participants, String[] completions) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String participant : participants) hm.put(participant, hm.getOrDefault(participant, 0) + 1);
        for (String completion : completions) hm.put(completion, hm.get(completion) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }

}

package programmers.hash.ls_42579;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    @Test
    public void main() {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        Assert.assertEquals(new int[]{4, 1, 3, 0}, solution(genres, plays));
    }

    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> hmGenres = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            hmGenres.put(genres[i], hmGenres.getOrDefault(genres[i], 0) + plays[i]);
        }

        SortedSet<Integer> values = new TreeSet<>(hmGenres.values()).descendingSet();
        for (Integer value : values) {
            // Sort by Value
        }

        System.out.println(5);

//        for (int value : hm.values()) {
//            answer = answer * (value + 1);
//        }

        return answer;
    }

}

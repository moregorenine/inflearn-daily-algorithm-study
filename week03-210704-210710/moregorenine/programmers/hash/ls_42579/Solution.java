package programmers.hash.ls_42579;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    @Test
    public void main() {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        Assert.assertEquals(new int[]{4, 1, 3, 0}, solution(genres, plays));
    }

    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> factorySumPlaysByGenres = factorySumPlaysByGenres(genres, plays);
        HashMap<String, Integer> sortedSumPlaysByGenres = sortByValue(factorySumPlaysByGenres);
        

        return answer;
    }

    private HashMap<String, Integer> factorySumPlaysByGenres(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        return map;
    }

    private HashMap<String, Integer> sortByValue(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed());
        HashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

}

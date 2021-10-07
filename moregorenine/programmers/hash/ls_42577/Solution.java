package programmers.hash.ls_42577;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    @Test
    public void main() {
        String[] phone_book = {"119", "97674223", "1195524421"};
        Assert.assertEquals(false, solution(phone_book));

        phone_book = new String[]{"123", "456", "789"};
        Assert.assertEquals(true, solution(phone_book));

        phone_book = new String[]{"12", "123", "1235", "567", "88"};
        Assert.assertEquals(false, solution(phone_book));
    }

    public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);
        HashMap<Integer, String> hm = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            hm.put(i, phone_book[i]);
        }

        for (int i = 0; i < hm.size() - 1; i++) {
            if (hm.get(i + 1).startsWith(hm.get(i))) {
                return false;
            }
        }

        return true;
    }

}

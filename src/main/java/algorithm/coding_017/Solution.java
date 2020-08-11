package coding_017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    static Map<Character, List<Character>> map = new HashMap<>();

    static {
        for (int i = '2' - '0'; i <= '6' - '0'; i++) {
            char start = (char) ('a' + 3 * (i - 2));
            List<Character> list = new ArrayList<>();
            list.add(start);
            list.add((char) (start + 1));
            list.add((char) (start + 2));
            map.put((char) (i + '0'), list);
        }

        List<Character> list_7 = new ArrayList<>();
        list_7.add('p');
        list_7.add((char) ('p' + 1));
        list_7.add((char) ('p' + 2));
        list_7.add((char) ('p' + 3));
        map.put('7', list_7);

        List<Character> list_8 = new ArrayList<>();
        list_8.add('t');
        list_8.add((char) ('t' + 1));
        list_8.add((char) ('t' + 2));
        map.put('8', list_8);

        char start = 'w';
        List<Character> list_9 = new ArrayList<>();
        list_9.add('w');
        list_9.add((char) (start + 1));
        list_9.add((char) (start + 2));
        list_9.add((char) (start + 3));
        map.put('9', list_9);
    }

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        doCombination(digits, 0, list);
        return list;
    }

    public void doCombination(String digits, int index, List<String> list) {
        if (index == digits.length()) {
            return;
        }

        List<String> newList = new ArrayList<>();

        if (list.isEmpty()) {
            for (char tmpChar : map.get(digits.charAt(index))) {
                newList.add(new StringBuilder().append(tmpChar).toString());
            }
        } else {
            for (String tmp : list) {
                for (char tmpChar : map.get(digits.charAt(index))) {
                    newList.add(new StringBuilder(tmp).append(tmpChar).toString());
                }
            }
        }
        list.clear();

        list.addAll(newList);

        doCombination(digits, index + 1, list);
    }


}

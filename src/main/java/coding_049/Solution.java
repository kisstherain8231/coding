package coding_049;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<List<String>>();

        Map<String, List<String>> resultMap = new HashMap<String, List<String>>();

        for (String e : strs) {
            char[] tmpArray = e.toCharArray();

            List<Character> resultList = new ArrayList<Character>(tmpArray.length);

            for (char tmp : tmpArray) {
                resultList.add(tmp);
            }

            Collections.sort(resultList);
            StringBuilder stringBuilder = new StringBuilder();
            for (Character tmpChar : resultList) {

                stringBuilder.append(tmpChar);
            }
            String key = stringBuilder.toString();

            List<String> valueList = resultMap.get(key);
            if (valueList == null) {
                valueList = new ArrayList<String>();
                valueList.add(e);
                resultMap.put(key, valueList);
            } else {
                valueList.add(e);
            }

        }

        for (List<String> list : resultMap.values()) {
            result.add(list);
        }


        return result;
    }
}

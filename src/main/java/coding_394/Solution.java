package coding_394;

import java.util.Stack;

public class Solution {

    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();

        Stack<Integer> indexStack = new Stack<>();

        String tmp = s + "]";
        result.append(tmp);

        indexStack.push(-1);

        int index = 0;
        while (!indexStack.isEmpty()) {
            char tmpChar = result.charAt(index);

            if (tmpChar == '[') {
                indexStack.push(index);
                index++;
            } else if (tmpChar == ']') {
                int innerIndex = indexStack.pop();
                if (innerIndex == -1) {
                    break;
                }

                String strRepeat = result.substring(innerIndex + 1, index);
                //重复次数
                int beginIndex = innerIndex - 1;
                while (  beginIndex >= 0  && (result.charAt(beginIndex) >= '0'
                    && result.charAt(beginIndex) <= '9') ) {
                    beginIndex --;
                }
                beginIndex++;
                String strCount = result.substring(beginIndex, innerIndex);

                int intCount = Integer.parseInt(strCount);

                String strLeft = "";
                if (innerIndex == 1) {
                    strLeft = "";
                } else {
                    strLeft = result.substring(0, beginIndex);
                }

                String strRight = result.substring(index + 1, result.length());

                int count = result.charAt(innerIndex - 1) - '0';

                StringBuilder repeatString = new StringBuilder();

                for (int i = 0; i < intCount; i++) {
                    repeatString.append(strRepeat);
                }

                StringBuilder tmpResult = new StringBuilder();
                tmpResult.append(strLeft);
                tmpResult.append(repeatString);
                tmpResult.append(strRight);

                result = tmpResult;
                index = strLeft.length() + repeatString.length() - 1;
            } else {
                index++;
            }
        }

        return result.substring(0, result.length() -1);
    }
}

package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> res = new HashMap<>();

        for(String str : collection1) {
            String pattern1 = ".-.";
            String pattern2 = ".:.";
            String pattern3 = ".\\[.*\\]";

            String key = str;
            int value = 1;

            if(Pattern.matches(pattern1, str)) {
                String[] strs = str.split("-");
                key = strs[0];
                value = Integer.parseInt(strs[1]);
            } else if(Pattern.matches(pattern2, str)) {
                String[] strs = str.split(":");
                key = strs[0];
                value = Integer.parseInt(strs[1]);
            } else if(Pattern.matches(pattern3, str)) {
                String[] strs = str.split("\\[");
                key = strs[0];
                value = Integer.parseInt(strs[1].substring(0, strs[1].length()-1));
            }

            if(res.containsKey(key)) {
                int time = res.get(key);
                res.put(key, value + time);
            } else {
                res.put(key, value);
            }
        }

        return res;
    }
}

package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> res = new HashMap<>();

        for(String str : collection1) {
            if(str.contains("-")) {
                String[] strs = str.split("-");
                res.put(strs[0], Integer.parseInt(strs[1]));
            } else {
                if(res.containsKey(str)) {
                    int time = res.get(str);
                    res.put(str, ++time);
                } else {
                    res.put(str, 1);
                }
            }
        }

        return res;
    }
}

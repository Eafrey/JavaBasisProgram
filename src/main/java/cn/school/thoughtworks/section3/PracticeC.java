package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<>();

        for(String str : collectionA) {
            if(map.containsKey(str)) {
                int time = map.get(str);
                map.put(str, ++time);
            } else {
                map.put(str, 1);
            }
        }
        Map<String, Integer> res = new HashMap<>();

        List<String> list2 = object.get("value");
        for(String str : map.keySet()) {
            if(list2.contains(str)) {
                res.put(str, map.get(str) - map.get(str)/3);
            } else {
                res.put(str, map.get(str));
            }
        }
        return res;
    }
}

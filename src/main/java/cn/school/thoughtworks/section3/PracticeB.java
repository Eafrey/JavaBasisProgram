package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> res = new HashMap<>();

        List<String> list2 = object.get("value");
        for(String str : collectionA.keySet()) {
            if(list2.contains(str)) {
                res.put(str, collectionA.get(str) - collectionA.get(str)/3);
            } else {
                res.put(str, collectionA.get(str));
            }
        }
        return res;
    }
}

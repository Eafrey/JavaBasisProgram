package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> res = new ArrayList<>();

        List<String> col2 = new ArrayList<>();
        for(List<String> list : collection2) {
            col2.addAll(list);
        }

        for(String str : collection1) {
            if(col2.contains(str)) {
                res.add(str);
            }
        }
        return res;
    }
}

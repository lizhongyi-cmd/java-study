package demo.study.day1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        //第一种遍历方式

        for (String key : map.keySet()) {
            System.out.println("key = " + key + " and value = " + map.get(key));
        }

        //第二种遍历方式

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        String s = new String();
        String s1 = new String();



    }
}

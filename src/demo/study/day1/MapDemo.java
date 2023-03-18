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

        //第一种遍历方式，先拿到key的集合，再get出来

        for (String key : map.keySet()) {
            System.out.println("key = " + key + " and value = " + map.get(key));
        }

        //第二种遍历方式

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key= " + entry.getKey() + "and value =" + entry.getKey()) ;
        }

        //第三种：推荐，尤其是容量大的时候
         for(Map.Entry<String,String> entry:map.entrySet()){
             System.out.println("key = " + entry.getKey() + " value =" + entry.getValue());
         }

         //第四种
         for (String v : map.values()){
             System.out.println("values = " + v);
         }

         map.compute("shoes",(key,value) ->  value + "aa");




    }
}

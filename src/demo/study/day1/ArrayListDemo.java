package demo.study.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("hhhhhh");
        for(String str :list){
            System.out.println(str);
        }

        String[] StrArray = new String[list.size()];

        list.toArray(StrArray);
        for(String str : StrArray){
            System.out.println(str);
        }


        Iterator<String> ite = list.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}

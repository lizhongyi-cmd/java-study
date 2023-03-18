package demo.study.day1;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String>  sites = new HashSet<>();
        sites.add("taobao");
        sites.add("pinduoduo");

        System.out.println(sites.contains("taobao"));
        sites.clear();




    }
}

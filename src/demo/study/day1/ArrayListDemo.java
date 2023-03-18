package demo.study.day1;

import java.util.*;

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


        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobo");
        System.out.println(sites);

        System.out.println("获取第2个元素:" + sites.get(2));
        //修改元素
        sites.set(2,"pinduoduo");
        System.out.println(sites.get(2));
        String res = sites.remove(2);
        System.out.println("移除元素:" + res);
        //计算大小
        System.out.println(sites.size());
        System.out.println(sites);

        //遍历元素
        for(int i = 0; i < sites.size(); i++){
            System.out.println(sites.get(i));
        }

        for(String i:sites){
            System.out.println(i);
        }

        //排序
        System.out.println(sites);
        Collections.sort(sites);
        System.out.println(sites);
        sites.removeIf(e -> e.contains("G"));
        System.out.println(sites);
        sites.forEach((e) ->{
            e = e + "aaa";
        });

        System.out.println(sites);

        LinkedList<String> site = new LinkedList<String>();

        site.add("1");
        site.addFirst("2");
        System.out.println(site);



    }
}

package demo.study.practise;

import com.sun.deploy.util.StringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println(1111);
        String str = "hello world hello bob";
        //查找最后一次出现的位置
        int lastIndex = str.lastIndexOf("bob");
         if(lastIndex == -1 ){
             System.out.println("没有找打字符串 bob");
         }else {
             System.out.println("最后一次出现的位置为：" + lastIndex);
         }
         int arr[] = {2,4,5,6,7};
        Arrays.sort(arr);
        System.out.println(arr);

        //java数据结构初始化

        //定长数组数组
        int[] arr1 = {1, 2,3, 4, 6};
        int[] arr2 = new int[5];
        String  sss = "aaaa";
        String kk = "ddd";
        //动态数组
        List<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);


    }
}

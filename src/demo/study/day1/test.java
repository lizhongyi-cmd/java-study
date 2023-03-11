package demo.study.day1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner reader = new Scanner(System.in);
        System.out.println("please input password");
        int num = reader.nextInt();
        System.out.println("您输入的密码为： " + num);

        int[] arr = {1,2,3,4,5};
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        for(int e:arr){
            System.out.println(e);
        }

    }
}

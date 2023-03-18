package demo.study.day1;

import java.util.List;

public class GenericMethodDemo {

    public static <E> void printArray(E[] inputArray){
        for(E element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    //类型通配符
    public static void getData(List<?> data){
        System.out.println("data :" + data.get(0));
    }

    public static void main(String[] args) {
    //泛型的使用练习
    //创建不同类型的数组
    Integer[] intArray = {1,2,3,4,5};
    Double[] doubleArray = { 1.1,1.2,1.3};
    Character[] charArray = {'a','b','c'};

    printArray(intArray);

    printArray(doubleArray);

    printArray(charArray);



    }
}

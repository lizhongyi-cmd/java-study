package demo.study.javaApi;

import java.util.Random;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println("计算绝对值：" + Math.abs(-1));
        System.out.println("求大于参数的最小整数：" + Math.ceil(5.6));
        System.out.println("求小于参数的最大整数：" + Math.floor(-4.6));
        System.out.println("求两个数较大的值：" + Math.max(2.1, 2.2));
        System.out.println("求两个数较小的值：" + Math.min(2.1,2.2));
        System.out.println("生成0到1的随机数：" + Math.random());
        double r = Math.random();

        Random random = new Random(); //加入种子后能够保证每次生成的随机数相同
        for(int i = 0; i < 10; i++){
            System.out.println(random.nextInt(10)); //生成0-10的随机数
        }

    }
}

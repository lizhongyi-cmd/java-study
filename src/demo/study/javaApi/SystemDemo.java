package demo.study.javaApi;

import java.util.Enumeration;
import java.util.Properties;

public class SystemDemo {
    public static void main(String[] args) throws Exception{
        System.out.println("1111");
        Properties properties = System.getProperties();
        System.out.println(properties.getClass().toString());

        Enumeration<?> propertyNames = properties.propertyNames();
        System.out.println(propertyNames.getClass());
        while( propertyNames.hasMoreElements()){
            String key = (String) propertyNames.nextElement();
            String value = System.getProperty(key);
            System.out.println( "key:" + key + "----->" + value);
        }

        long startTime = System.currentTimeMillis();
        int sum = 0;
        for(int i = 0; i < 100000; i++){
            sum += 1;
        }
        Thread.sleep(100);
        long endTime = System.currentTimeMillis();

        Runtime rt = Runtime.getRuntime();

        System.out.println("处理器的个数为：" + rt.availableProcessors() + "个");
        System.out.println("空闲内存数量：" + rt.freeMemory()/1024/1024 + "M");
        System.out.println("最大可用内存数量:" + rt.maxMemory()/1024/1024 + "M");

        Process process = rt.exec("D:\\douyin\\douyin.exe");//相当于执行一个dos命令

//        Thread.sleep(80000);
//        process.destroy();


    }
}

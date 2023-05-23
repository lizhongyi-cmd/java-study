package demo.study.javaApi;

public class BaoZhuangDemo {
    public static void main(String[] args) {
        int a = 20;
        Integer in = new Integer(a);
        System.out.println(in.intValue());
        System.out.println(args.toString());
        int w = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);

        System.out.println("宽为：" + w);
        System.out.println("长为：" + h);

        for (int i = 0; i < h; i ++){
            StringBuffer sb = new StringBuffer();
            for(int j = 0; j < w; j++){
                sb.append("*");
            }
            System.out.println(sb);
        }


    }
}

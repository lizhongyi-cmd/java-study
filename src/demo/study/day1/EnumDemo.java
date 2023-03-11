package demo.study.day1;

public class EnumDemo {
    enum Color {
        RED,GREEN,BLUE;

        private Color(){
            System.out.println("Constructor called for:" + this.toString());
        }

        public void colorInfo(){
            System.out.println("Universal Color");
        }

    }
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();
        for(Color myVar:Color.values()){
            System.out.println(myVar);
            System.out.println("`````````");
            //查看索引
            System.out.println(myVar + "at index:" + myVar.ordinal());
        }
        switch (c1){
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;

        }
    }
}

package demo.study.desinePattern;

//单例模式
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }


}

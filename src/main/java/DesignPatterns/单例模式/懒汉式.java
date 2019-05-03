package DesignPatterns.单例模式;
/**
 * 获取对象时，才会创建对象
 * 线程安全
 */
class Singleton{
    private static Singleton instance;
    private Singleton (){}
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class 懒汉式 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }

}

